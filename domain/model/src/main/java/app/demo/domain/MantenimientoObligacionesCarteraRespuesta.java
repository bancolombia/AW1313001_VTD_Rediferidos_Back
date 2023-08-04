package app.demo.domain;

public class MantenimientoObligacionesCarteraRespuesta {

    private Long idObligacion;
    private Long numeroParticipacion;
    private String idNovedad;
    private Long consecutivoNovedad;
    private String idEstadoNovedad;
    private String descripcionEstadoNovedad;
	
    public MantenimientoObligacionesCarteraRespuesta() {
		super();
	}

    /**
     * 
     * @param idObligacion
     * @param numeroParticipacion
     * @param idNovedad
     * @param consecutivoNovedad
     * @param idEstadoNovedad
     * @param descripcionEstadoNovedad
     */
	public MantenimientoObligacionesCarteraRespuesta(Long idObligacion, Long numeroParticipacion, String idNovedad,
			Long consecutivoNovedad, String idEstadoNovedad, String descripcionEstadoNovedad) {
		super();
		this.idObligacion = idObligacion;
		this.numeroParticipacion = numeroParticipacion;
		this.idNovedad = idNovedad;
		this.consecutivoNovedad = consecutivoNovedad;
		this.idEstadoNovedad = idEstadoNovedad;
		this.descripcionEstadoNovedad = descripcionEstadoNovedad;
	}

	public Long getIdObligacion() {
		return idObligacion;
	}

	public Long getNumeroParticipacion() {
		return numeroParticipacion;
	}

	public String getIdNovedad() {
		return idNovedad;
	}

	public Long getConsecutivoNovedad() {
		return consecutivoNovedad;
	}

	public String getIdEstadoNovedad() {
		return idEstadoNovedad;
	}

	public String getDescripcionEstadoNovedad() {
		return descripcionEstadoNovedad;
	}

	public void setIdObligacion(Long idObligacion) {
		this.idObligacion = idObligacion;
	}

	public void setNumeroParticipacion(Long numeroParticipacion) {
		this.numeroParticipacion = numeroParticipacion;
	}

	public void setIdNovedad(String idNovedad) {
		this.idNovedad = idNovedad;
	}

	public void setConsecutivoNovedad(Long consecutivoNovedad) {
		this.consecutivoNovedad = consecutivoNovedad;
	}

	public void setIdEstadoNovedad(String idEstadoNovedad) {
		this.idEstadoNovedad = idEstadoNovedad;
	}

	public void setDescripcionEstadoNovedad(String descripcionEstadoNovedad) {
		this.descripcionEstadoNovedad = descripcionEstadoNovedad;
	} 
}