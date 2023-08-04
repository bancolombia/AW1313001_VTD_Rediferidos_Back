package app.demo.domain;

public class RequestRegistrarVentaParams {

	private String tipoDocumento;
	private String numeroDocumento;
	private Long numeroPrestamo;
	private Long numeroRedescuento;
	private String estado;
	
	public RequestRegistrarVentaParams() {
		super();
	}

	public RequestRegistrarVentaParams(String tipoDocumento, String numeroDocumento, Long numeroPrestamo,
			Long numeroRedescuento, String estado) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.numeroPrestamo = numeroPrestamo;
		this.numeroRedescuento = numeroRedescuento;
		this.estado = estado;
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

	public String getEstado() {
		return estado;
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

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "RequestRegistrarVentaParams [tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento
				+ ", numeroPrestamo=" + numeroPrestamo + ", numeroRedescuento=" + numeroRedescuento + ", estado="
				+ estado + "]";
	}
}