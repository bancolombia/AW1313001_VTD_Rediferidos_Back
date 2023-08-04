package app.demo.domain;

public class InformacionRediferido {

	private String opportunityId;
	private String tipoIdentificacion;
	private String numeroIdentificacion;
	private Long numeroPrestamo;
	private Long numeroRedescuento;
	private Long plazoMinimo;
	private Long plazoMaximo;
	private String conceptos;
	private String estado;

	/**
	 * Default Constructor
	 */
	public InformacionRediferido() {
		super();
	}

	/**
	 * Full Constructor
	 * 
	 * @param tipoIdentificacion
	 * @param numeroIdentificacion
	 * @param numeroPrestamo
	 * @param numeroRedescuento
	 * @param plazoMinimo
	 * @param plazoMaximo
	 * @param conceptos
	 */
	public InformacionRediferido(String opportunityId, String tipoIdentificacion, String numeroIdentificacion, Long numeroPrestamo,
			Long numeroRedescuento, Long plazoMinimo, Long plazoMaximo, String conceptos) {
		super();
		this.opportunityId = opportunityId;
		this.tipoIdentificacion = tipoIdentificacion;
		this.numeroIdentificacion = numeroIdentificacion;
		this.numeroPrestamo = numeroPrestamo;
		this.numeroRedescuento = numeroRedescuento;
		this.plazoMinimo = plazoMinimo;
		this.plazoMaximo = plazoMaximo;
		this.conceptos = conceptos;
	}

	public String getOpportunityId() {
		return opportunityId;
	}

	public void setOpportunityId(String opportunityId) {
		this.opportunityId = opportunityId;
	}

	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public Long getNumeroPrestamo() {
		return numeroPrestamo;
	}

	public void setNumeroPrestamo(Long numeroPrestamo) {
		this.numeroPrestamo = numeroPrestamo;
	}

	public Long getNumeroRedescuento() {
		return numeroRedescuento;
	}

	public void setNumeroRedescuento(Long numeroRedescuento) {
		this.numeroRedescuento = numeroRedescuento;
	}

	public Long getPlazoMinimo() {
		return plazoMinimo;
	}

	public void setPlazoMinimo(Long plazoMinimo) {
		this.plazoMinimo = plazoMinimo;
	}

	public Long getPlazoMaximo() {
		return plazoMaximo;
	}

	public void setPlazoMaximo(Long plazoMaximo) {
		this.plazoMaximo = plazoMaximo;
	}

	public String getConceptos() {
		return conceptos;
	}

	public void setConceptos(String conceptos) {
		this.conceptos = conceptos;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "InformacionRediferido [tipoIdentificacion=" + tipoIdentificacion + ", numeroIdentificacion="
				+ numeroIdentificacion + ", numeroPrestamo=" + numeroPrestamo + ", numeroRedescuento="
				+ numeroRedescuento + ", plazoMinimo=" + plazoMinimo + ", plazoMaximo=" + plazoMaximo + ", conceptos="
				+ conceptos + ", estado=" + estado + "]";
	}
}