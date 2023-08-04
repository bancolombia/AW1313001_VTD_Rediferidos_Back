package app.demo.domain.sendmail;

import app.demo.domain.Parametro;
import app.demo.domain.constantes.Parameter;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class CartaBienvenidaMailDTO {

	protected String tipoCredito;
	
	protected String correoElectronico;

	protected String nombreCliente;

	protected String numeroCredito;

	protected String cuota;

	protected String plazo;

	protected String valor;

	protected String tasa;

	protected String fechaInicio;

	protected String fechaFinal;

	protected String fechaUno;

	protected String fechaDos;

	protected String fechaTres;

	protected String documentoPdf;

	public CartaBienvenidaMailDTO() {

	}

	public List<Parametro> getListParameters() {
		
		List<Parametro> listaParametros = new ArrayList<>();	
		
		if (tipoCredito.equalsIgnoreCase(Parameter.TIPO_LIBREINVERSION)) {

			listaParametros.add(new Parametro(Parameter.IMAGENES, Parameter.IMAGENES_CORREO_LIBREINVERSION));
			listaParametros
					.add(new Parametro(Parameter.RUTA_PLANTILLA_CORREO, Parameter.FWK_ENVIAR_CORREO_RUTA_PLANTILLA_REDIFERIDOS_LI));
			listaParametros.add(new Parametro(Parameter.ASUNTO_CORREO, Parameter.FWK_ENVIAR_CORREO_ASUNTO_REDIFERIDOS_LI));
			
			
		} else if (tipoCredito.equalsIgnoreCase(Parameter.TIPO_CREDIAGIL)) {

			listaParametros.add(new Parametro(Parameter.IMAGENES, Parameter.IMAGENES_CORREO_CREDIAGIL));
			listaParametros.add(new Parametro(Parameter.RUTA_PLANTILLA_CORREO, Parameter.FWK_ENVIAR_CORREO_RUTA_PLANTILLA_REDIFERIDOS_CA));
			listaParametros.add(new Parametro(Parameter.ASUNTO_CORREO, Parameter.FWK_ENVIAR_CORREO_ASUNTO_REDIFERIDOS_CA));
			
		}

		// email to
		listaParametros.add(new Parametro(Parameter.PARA_FWK, correoElectronico));

		// info
		
		String rawString = nombreCliente.split(" ")[0]+"!";
		byte[] bytes = rawString.getBytes(StandardCharsets.UTF_8);
		String utf8EncodedString = new String(bytes, StandardCharsets.UTF_8);
				
		listaParametros.add(new Parametro(Parameter.NOMBRE_CLIENTE,utf8EncodedString));
		listaParametros.add(new Parametro(Parameter.NUMERO_CREDITO, numeroCredito));
		listaParametros.add(new Parametro(Parameter.CUOTA,cuota));
		listaParametros.add(new Parametro(Parameter.PLAZO, plazo));
		listaParametros.add(new Parametro(Parameter.VALOR,valor));
		listaParametros.add(new Parametro(Parameter.TASA, tasa+" %"));
		listaParametros.add(new Parametro(Parameter.FECHA_INICIO, fechaInicio));
		listaParametros.add(new Parametro(Parameter.FECHA_FINAL, fechaFinal));
		listaParametros.add(new Parametro(Parameter.FECHA_UNO, fechaUno));
		listaParametros.add(new Parametro(Parameter.FECHA_DOS, fechaDos));
		listaParametros.add(new Parametro(Parameter.FECHA_TRES, fechaTres));

		// attachets
		if (documentoPdf!=null) {
			listaParametros.add(new Parametro(Parameter.ARCHIVO1_FWK, documentoPdf));
		}

		return listaParametros;
	}



	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getNumeroCredito() {
		return numeroCredito;
	}

	public void setNumeroCredito(String numeroCredito) {
		this.numeroCredito = numeroCredito;
	}

	public String getCuota() {
		return cuota;
	}

	public void setCuota(String cuota) {
		this.cuota = cuota;
	}

	public String getPlazo() {
		return plazo;
	}

	public void setPlazo(String plazo) {
		this.plazo = plazo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getTasa() {
		return tasa;
	}

	public void setTasa(String tasa) {
		this.tasa = tasa;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public String getFechaUno() {
		return fechaUno;
	}

	public void setFechaUno(String fechaUno) {
		this.fechaUno = fechaUno;
	}

	public String getFechaDos() {
		return fechaDos;
	}

	public void setFechaDos(String fechaDos) {
		this.fechaDos = fechaDos;
	}

	public String getFechaTres() {
		return fechaTres;
	}

	public void setFechaTres(String fechaTres) {
		this.fechaTres = fechaTres;
	}

	public String getDocumentoPdf() {
		return documentoPdf;
	}

	public void setDocumentoPdf(String documentoPdf) {
		this.documentoPdf = documentoPdf;
	}

	public String getTipoCredito() {
		return tipoCredito;
	}

	public void setTipoCredito(String tipoCredito) {
		this.tipoCredito = tipoCredito;
	}

}
