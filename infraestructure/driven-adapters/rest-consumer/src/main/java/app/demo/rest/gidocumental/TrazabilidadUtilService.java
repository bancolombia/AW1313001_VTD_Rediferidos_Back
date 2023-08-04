package app.demo.rest.gidocumental;

import app.demo.domain.*;
import app.demo.domain.constantes.ConstantesRediferidos;
import app.demo.domain.exception.ErrorAplicationException;
import app.demo.domain.exception.ErrorRequestDTO;
import app.demo.domain.gateway.soap.TrazabilityLogDTO;
import app.demo.domain.gateway.trazabilidadutil.GatewayTrazabilidadUtil;
import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class TrazabilidadUtilService implements GatewayTrazabilidadUtil {

	private ParameterRestService parameterRestService;


	private String idSesion;

	private String pasoFuncional;

	private String tipoProducto;

	@Autowired
	public TrazabilidadUtilService(ParameterRestService parameterRestService) {
		this.parameterRestService = parameterRestService;
	}

	@Override
	public File generateLog(InformacionCreditoActual informacionCreditoActual,
			InformacionCreditoRediferido informacionCreditoRediferido, Producto producto, Rescatame rescatame,
			List<InformacionTransaccion> itList, Long estadoMantenimientoCartera, String pasoFuncional, String idSesion,
			InformacionTransaccionAuth auth) {



		TrazabilityLogDTO trazabilityLogDTO = new TrazabilityLogDTO();

		try {
			this.idSesion = idSesion;
			this.pasoFuncional = pasoFuncional;
			this.tipoProducto = producto.getTipoProducto();
			trazabilityLogDTO = obtenerFechasInformacionTransaccion(trazabilityLogDTO, itList);
			trazabilityLogDTO.setNombreProducto(producto.getNombreProducto());
			trazabilityLogDTO = obtenerDatosInfoCreditoActual(trazabilityLogDTO, informacionCreditoActual);
			trazabilityLogDTO = obtenerDatosInformacionCreditoRediferido(trazabilityLogDTO,
					informacionCreditoRediferido, estadoMantenimientoCartera);
			trazabilityLogDTO = obtenerInfoAutenticacion(trazabilityLogDTO, auth);
			if (rescatame != null) { 				
				trazabilityLogDTO = obtenerInfoRescatame(trazabilityLogDTO, rescatame);
			}

			return generateDocument(trazabilityLogDTO);
		} catch (Exception e) {

			throw new ErrorAplicationException("calling TrazabilidadUtilService.generateLog",
					new ErrorRequestDTO(ConstantesRediferidos.ID_APP_REDIFERIDOS,
							ConstantesRediferidos.ID_APP_REDIFERIDOS + "-TRAZUTIL001"),
					idSesion, pasoFuncional);
		}
	}

	/**
	 * Metodo para mapear los datos de autenticacion del a transaccion
	 * 
	 * @param trazabilityLogDTO objeto al que se le llena la informacion
	 * @param auth              datos de la autenticacion
	 * @return objeto recibido con los datos mapeados
	 */
	private TrazabilityLogDTO obtenerInfoAutenticacion(TrazabilityLogDTO trazabilityLogDTO,
			InformacionTransaccionAuth auth) {
		trazabilityLogDTO.setFechaAuth(auth.getFechaHoraTransaccion());
		trazabilityLogDTO.setIdSesion(auth.getIdSesion());
		return trazabilityLogDTO;
	}
	
	/**
	 * Metodo para mapear los datos de autenticacion del a transaccion
	 * 
	 * @param trazabilityLogDTO objeto al que se le llena la informacion
	 * @param auth              datos de la autenticacion
	 * @return objeto recibido con los datos mapeados
	 */
	private TrazabilityLogDTO obtenerInfoRescatame(TrazabilityLogDTO trazabilityLogDTO,
			Rescatame rescatame) {
		trazabilityLogDTO.setCelular(rescatame.getNumeroCelularAlmacenado());
		trazabilityLogDTO.setNuevoCelular(rescatame.getNumeroCelular());
		return trazabilityLogDTO;
	}

	/**
	 * 
	 * @param trazabilityLogDTO
	 * @param informacionCreditoRediferido
	 * @param estadoMantenimientoCartera
	 * @return
	 */
	private TrazabilityLogDTO obtenerDatosInformacionCreditoRediferido(TrazabilityLogDTO trazabilityLogDTO,
			InformacionCreditoRediferido informacionCreditoRediferido, Long estadoMantenimientoCartera) {

		SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
		DecimalFormat decimalFormatNumber = new DecimalFormat("###,###.###");

		trazabilityLogDTO.setFechaInicioNuevo(parser.format(informacionCreditoRediferido.getComienzasAPagar()));
		trazabilityLogDTO.setFechaFinalNuevo(parser.format(informacionCreditoRediferido.getTerminasDePagar()));

		trazabilityLogDTO.setFechaUno(informacionCreditoRediferido.getMesesTranscurridosObligacion().toString());
		trazabilityLogDTO.setFechaDos(informacionCreditoRediferido.getPlazoDeseado().toString());
		trazabilityLogDTO.setFechaTres(informacionCreditoRediferido.getPlazoTotalCredito().toString());

		return trazabilityLogDTO;
	}

	/**
	 * 
	 * @param trazabilityLogDTO
	 * @param informacionCreditoActual
	 * @return
	 */



	/**
	 * 
	 * @param trazabilityLogDTO
	 * @return
	 */
	private File generateDocument(TrazabilityLogDTO trazabilityLogDTO) {

		RediferidosLog.logInfoMessageCharacters(getClass(),
				"INICIO: TrazabilidadUtilService.generateDocument con idSession: " + trazabilityLogDTO.getIdSesion());

		String strTraceabilityTemplateLog = "";
		boolean rescatame = false;
		
		if (trazabilityLogDTO.getCelular() != null) {
			rescatame = true;
		}
		strTraceabilityTemplateLog = parameterRestService.getTraceabilityTemplateString(tipoProducto, rescatame);

		Map<String, String> tokens = trazabilityLogDTO.generateMapData();

		// Create pattern of the format "%(cat|beverage)%"
		String patternString = "%(" + String.join("|", tokens.keySet()) + ")%";
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(strTraceabilityTemplateLog);

		StringBuffer sb = new StringBuffer();
		while (matcher.find()) {
			try {
				matcher.appendReplacement(sb, tokens.get(matcher.group(1)));
			} catch (Exception e) {
				RediferidosLog.logErrorMessage(this.getClass(), e.getMessage(), e);
			}
		}
		matcher.appendTail(sb);
		RediferidosLog.logInfoMessageCharacters(getClass(),
				"FINALIZO: TrazabilidadUtilService.generateDocument con idSession: " + trazabilityLogDTO.getIdSesion());
		return createFile(sb.toString());
	}

	/**
	 * 
	 * @param content
	 * @return
	 */
	private File createFile(String content) {
		File filePdf = null;
		Path file = null;
		try {
			RediferidosLog.logInfoMessageCharacters(getClass(), "INICIO: TrazabilidadUtilService.createFile");

			file = createTemporalFile();

			filePdf = file.toFile();

			Document document = new Document();
			document.setPageSize(PageSize.LETTER);
			PdfWriter pdfWriter = null;
			pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(filePdf.getPath()));
			document.open();
			document.newPage();
			document.add(new Paragraph(content));
			document.close();
			pdfWriter.close();
		} catch (Exception e) {
			RediferidosLog.logErrorMessage(getClass(), e.getMessage(), e);
			throw new ErrorAplicationException("calling SendMailServiceRest.sendMail",
					new ErrorRequestDTO(ConstantesRediferidos.ID_APP_REDIFERIDOS,
							ConstantesRediferidos.ID_APP_REDIFERIDOS + "-TRAZUTIL002"),
					idSesion, pasoFuncional);
		}
		RediferidosLog.logInfoMessageCharacters(getClass(), "FINALIZO: TrazabilidadUtilService.createFile");
		return filePdf;
	}

	private Path createTemporalFile() throws IOException {
		FileAttribute<Set<PosixFilePermission>> attributes = PosixFilePermissions.asFileAttribute(
				new HashSet<>(Arrays.asList(PosixFilePermission.OWNER_WRITE, PosixFilePermission.OWNER_READ)));

		String sistemaOperativo = System.getProperty("os.name").toUpperCase();
		if (sistemaOperativo.contains("WINDOWS")) {
			return Files.createTempFile("tmp", ".".concat("pdf"));
		} else {
			return Files.createTempFile("tmp", ".".concat("pdf"), attributes);
		}
	}


}