package app.demo.domain;

import app.demo.domain.security.Payload;

public class RegistrarVentaRequestParams {

	private String tipoDocumento;
	private String numeroDocumento;
	private Long numeroPrestamo;
	private Long numeroRedescuento;
	private Payload payload;
	
	public RegistrarVentaRequestParams() {
		super();
	}
	
	public RegistrarVentaRequestParams(String tipoDocumento, String numeroDocumento, Long numeroPrestamo,
			Long numeroRedescuento, Payload payload) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.numeroPrestamo = numeroPrestamo;
		this.numeroRedescuento = numeroRedescuento;
		this.payload = payload;
	}
	
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public Long getNumeroPrestamo() {
		return numeroPrestamo;
	}
	public Long getNumeroRedescuento() {
		return numeroRedescuento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public void setNumeroPrestamo(Long numeroPrestamo) {
		this.numeroPrestamo = numeroPrestamo;
	}
	public void setNumeroRedescuento(Long numeroRedescuento) {
		this.numeroRedescuento = numeroRedescuento;
	}
	
	public Payload getPayload() {
		return payload;
	}

	public void setPayload(Payload payload) {
		this.payload = payload;
	}

	@Override
	public String toString() {
		return "RegistrarVentaRequestParams [tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento
				+ ", numeroPrestamo=" + numeroPrestamo + ", numeroRedescuento=" + numeroRedescuento + ", payload="
				+ payload + "]";
	}
}