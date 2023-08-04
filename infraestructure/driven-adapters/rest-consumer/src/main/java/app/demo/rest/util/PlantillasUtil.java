package app.demo.rest.util;

import app.demo.domain.Parametro;
import app.demo.domain.constantes.CodigosRespuestaPlantillasUtil;
import app.demo.domain.constantes.ConstantesGeneracionPDF;
import app.demo.domain.sendmail.RespuestaServicioPlantillasUtil;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.*;

/***
 * Clase de utilidades para la api de envio de correo
 */
public class PlantillasUtil {

	private Map<String, String> parametrosConfiguraciones;
	/***
	 * Lista de Parametros para agregar a la plantilla
	 */
	private List<Parametro> listaParametros = new ArrayList<>();

	private String rutaplantilla = null;
	private String plantilla = null;

	private String asuntoCorreo = null;
	private String deCorreo = null;
	private String paraCorreo = null;

	private List<String> imagenTargeta = null;

	private String numeroIdentificacion = null;

	private VelocityEngine velocityEngine = null;
	private VelocityContext context = null;
	private Template template = null;
	private StringWriter writer = null;

	private String nombreArchivo1 = null;
	private String contenidoArchivo1 = null;
	private byte[] archivoDecodificado = null;
	private ByteArrayInputStream bis = null;
	private byte[] archivoAdjunto = null;
	private PDDocument pdfDoc;

	private ByteArrayOutputStream out = null;
	private InputStream is = null;

	private String usuarioSL = null;
	private String claveSL = null;

	private String imagenes[] = null;

	private File filePdf;

	private RespuestaServicioPlantillasUtil respuestaServicioPlantillasUtil;

	public PlantillasUtil(List<Parametro> listaParametros, Map<String, String> parametrosConfiguraciones) {

		this.listaParametros = listaParametros;
		this.parametrosConfiguraciones = parametrosConfiguraciones;
		respuestaServicioPlantillasUtil = new RespuestaServicioPlantillasUtil();
		respuestaServicioPlantillasUtil.setEstadoRespuesta(true);

	}

	/***
	 * Procedimiento que mapea los parametros recibidos y crea el cuerpo html del
	 * correo
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public boolean createBodyHtml() {

		writer = new StringWriter();

		try {

			context = new VelocityContext();

			for (Parametro param : listaParametros) {

				context.put(param.getClave(), param.getValor());
				
				if (param.getObject() != null) {
					context.put(param.getClave(), param.getObject());
				}
				if (param.getClave().equals(ConstantesGeneracionPDF.PARA)) {
					paraCorreo = param.getObject().toString();
				}
				if (param.getClave().equals(ConstantesGeneracionPDF.ARCHIVO1)) {
					contenidoArchivo1 = param.getObject().toString();
				}
				if (param.getClave().equals(ConstantesGeneracionPDF.DOCUMENTO)) {
					numeroIdentificacion = param.getObject().toString();
				}
				if (param.getClave().equals(ConstantesGeneracionPDF.IMAGENES)) {
					imagenes = param.getValor() != null ? param.getValor().split(",")
							: param.getObject().toString().split(",");
				}
				if (param.getClave().equals(ConstantesGeneracionPDF.CODIGO_IMAGEN)) {
					imagenTargeta = ((ArrayList<String>) param.getObject());
				}
				if (param.getClave().equals(ConstantesGeneracionPDF.ASUNTO_CORREO)) {
					asuntoCorreo = param.getValor() != null ? parametrosConfiguraciones.get(param.getValor())
							: parametrosConfiguraciones.get(param.getObject().toString());
				}
				if (param.getClave().equals(ConstantesGeneracionPDF.RUTA_PLANTILLA_CORREO)) {
					rutaplantilla = param.getValor() != null ? parametrosConfiguraciones.get(param.getValor())
							: parametrosConfiguraciones.get(param.getObject().toString());
					context.put("RUTA_IMG", rutaplantilla);
				}
				if (param.getClave().equals(ConstantesGeneracionPDF.NOMBRE_PLANTILLA_PDF)) {
					plantilla = param.getValor() != null ? parametrosConfiguraciones.get(param.getValor()) : 
						parametrosConfiguraciones.get(param.getObject().toString());
				}

			}

			velocityEngine = new VelocityEngine();
			velocityEngine.setProperty("input.encoding", StandardCharsets.UTF_8.name());
			velocityEngine.setProperty("file.resource.loader.description", "Velocity File Resource Loader");
			velocityEngine.setProperty("file.resource.loader.class",
					"org.apache.velocity.runtime.resource.loader.FileResourceLoader");
			velocityEngine.setProperty("file.resource.loader.path", rutaplantilla);
			velocityEngine.setProperty("file.resource.loader.cache", "false");
			velocityEngine.setProperty("file.resource.loader.modificationCheckInterval", "2");
			velocityEngine.init();

			template = generateTemplate();

			mergeTemplate(context, writer);

			return true;

		} catch (Exception e) {
			RediferidosLog.logErrorMessage(getClass(), e.getMessage());
			respuestaServicioPlantillasUtil.setError(CodigosRespuestaPlantillasUtil.DDOC_005.getCodigo(),
					CodigosRespuestaPlantillasUtil.DDOC_005.getDescripcion());
			return false;
		}

	}
	
	
	private Template generateTemplate() {
		Template tempTemplate = null;
		try {
			tempTemplate = velocityEngine.getTemplate(plantilla);
		} catch (ResourceNotFoundException | ParseErrorException e) {
			RediferidosLog.logErrorMessage(getClass(), e.getMessage());
			respuestaServicioPlantillasUtil.setError(CodigosRespuestaPlantillasUtil.DDOC_002.getCodigo(),
					CodigosRespuestaPlantillasUtil.DDOC_002.getDescripcion());
		}
		return tempTemplate;
	}

	private void mergeTemplate(VelocityContext context, StringWriter writer) {
		try {
			template.merge(context, writer);
		} catch (ResourceNotFoundException | ParseErrorException | MethodInvocationException e) {
			RediferidosLog.logErrorMessage(getClass(), e.getMessage());
			respuestaServicioPlantillasUtil.setError(CodigosRespuestaPlantillasUtil.DDOC_002.getCodigo(),
					CodigosRespuestaPlantillasUtil.DDOC_002.getDescripcion());
		}
	}
	/***
	 * procedimiento que se encarga de convertir la plantilla html en un archivo PDF
	 */

	//01
	public void createFile() {

		filePdf = null;
		Path file = null;
		try {

			FileAttribute<Set<PosixFilePermission>> attributes = PosixFilePermissions.asFileAttribute(
					new HashSet<>(Arrays.asList(PosixFilePermission.OWNER_WRITE, PosixFilePermission.OWNER_READ)));
			String sistemaOperativo = System.getProperty("os.name").toUpperCase();
			
			if (sistemaOperativo.contains("WINDOWS")) {
				file = Files.createTempFile("tmp", ".".concat("pdf"));
			}

			filePdf = file.toFile();			

			Document document = new Document();

			document.setPageSize(PageSize.LETTER);

			PdfWriter pdfWriter = null;

			pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(filePdf.getPath()));

			document.open();

			createBodyHtml();

			if (respuestaServicioPlantillasUtil.getEstadoRespuesta()) {

				String content = this.writer.toString();

				XMLWorkerHelper.getInstance().parseXHtml(pdfWriter, document, new StringReader(content));

				document.close();

				pdfWriter.close();
				


			}

		} catch (IOException | DocumentException e) {
			RediferidosLog.logErrorMessage(getClass(), e.getMessage());
			respuestaServicioPlantillasUtil.setError(CodigosRespuestaPlantillasUtil.DDOC_003.getCodigo(),
					CodigosRespuestaPlantillasUtil.DDOC_003.getDescripcion());
		}

	}

	public File getFilePdf() {
		return this.filePdf;
	}

	public RespuestaServicioPlantillasUtil getRespuestaServicioPlantillasUtil() {
		return this.respuestaServicioPlantillasUtil;
	}

	public Map<String, String> getParametrosConfiguraciones() {
		return parametrosConfiguraciones;
	}

	public void setParametrosConfiguraciones(Map<String, String> parametrosConfiguraciones) {
		this.parametrosConfiguraciones = parametrosConfiguraciones;
	}

	public List<Parametro> getListaParametros() {
		return listaParametros;
	}

	public void setListaParametros(List<Parametro> listaParametros) {
		this.listaParametros = listaParametros;
	}

	public String getRutaplantilla() {
		return rutaplantilla;
	}

	public void setRutaplantilla(String rutaplantilla) {
		this.rutaplantilla = rutaplantilla;
	}

	public String getPlantilla() {
		return plantilla;
	}

	public void setPlantilla(String plantilla) {
		this.plantilla = plantilla;
	}

	public String getAsuntoCorreo() {
		return asuntoCorreo;
	}

	public void setAsuntoCorreo(String asuntoCorreo) {
		this.asuntoCorreo = asuntoCorreo;
	}

	public String getDeCorreo() {
		return deCorreo;
	}

	public void setDeCorreo(String deCorreo) {
		this.deCorreo = deCorreo;
	}

	public String getParaCorreo() {
		return paraCorreo;
	}

	public void setParaCorreo(String paraCorreo) {
		this.paraCorreo = paraCorreo;
	}

	public List<String> getImagenTarjeta() {
		return imagenTargeta;
	}

	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public VelocityEngine getVelocityEngine() {
		return velocityEngine;
	}

	public void setVelocityEngine(VelocityEngine velocityEngine) {
		this.velocityEngine = velocityEngine;
	}

	public VelocityContext getContext() {
		return context;
	}

	public void setContext(VelocityContext context) {
		this.context = context;
	}

	public Template getTemplate() {
		return template;
	}

	public void setTemplate(Template template) {
		this.template = template;
	}

	public StringWriter getWriter() {
		return writer;
	}

	public void setWriter(StringWriter writer) {
		this.writer = writer;
	}

	public String getNombreArchivo1() {
		return nombreArchivo1;
	}

	public void setNombreArchivo1(String nombreArchivo1) {
		this.nombreArchivo1 = nombreArchivo1;
	}

	public String getContenidoArchivo1() {
		return contenidoArchivo1;
	}

	public void setContenidoArchivo1(String contenidoArchivo1) {
		this.contenidoArchivo1 = contenidoArchivo1;
	}

	public byte[] getArchivoDecodificado() {
		return archivoDecodificado;
	}

	public void setArchivoDecodificado(byte[] archivoDecodificado) {
		this.archivoDecodificado = archivoDecodificado;
	}

	public ByteArrayInputStream getBis() {
		return bis;
	}

	public void setBis(ByteArrayInputStream bis) {
		this.bis = bis;
	}

	public byte[] getArchivoAdjunto() {
		return archivoAdjunto;
	}

	public void setArchivoAdjunto(byte[] archivoAdjunto) {
		this.archivoAdjunto = archivoAdjunto;
	}

	public PDDocument getPdfDoc() {
		return pdfDoc;
	}

	public void setPdfDoc(PDDocument pdfDoc) {
		this.pdfDoc = pdfDoc;
	}

	public ByteArrayOutputStream getOut() {
		return out;
	}

	public void setOut(ByteArrayOutputStream out) {
		this.out = out;
	}

	public InputStream getIs() {
		return is;
	}

	public void setIs(InputStream is) {
		this.is = is;
	}

	public String getUsuarioSL() {
		return usuarioSL;
	}

	public void setUsuarioSL(String usuarioSL) {
		this.usuarioSL = usuarioSL;
	}

	public String getClaveSL() {
		return claveSL;
	}

	public void setClaveSL(String claveSL) {
		this.claveSL = claveSL;
	}

	public String[] getImagenes() {
		return imagenes;
	}

	public void setImagenes(String[] imagenes) {
		this.imagenes = imagenes;
	}

	public void setFilePdf(File filePdf) {
		this.filePdf = filePdf;
	}

	public void setRespuestaServicioPlantillasUtil(RespuestaServicioPlantillasUtil respuestaServicioPlantillasUtil) {
		this.respuestaServicioPlantillasUtil = respuestaServicioPlantillasUtil;
	}
	
	
}
