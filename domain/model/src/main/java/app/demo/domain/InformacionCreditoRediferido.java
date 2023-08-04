package app.demo.domain;

import java.util.Date;
//
public class InformacionCreditoRediferido {

	private Long valorNuevaCuota;
	private Date comienzasAPagar;
	private Date terminasDePagar;
	private Long mesesTranscurridosObligacion;
	private Long plazoDeseado;
	private Long plazoTotalCredito;
	private boolean isInformacionReconsultada;
	private boolean correoEnviado;
	private boolean carteraPendiente;
	private String JWT;
	

	public InformacionCreditoRediferido() {
		super();
	}

	public InformacionCreditoRediferido(Long valorNuevaCuota, Date comienzasAPagar, Date terminasDePagar,
			Long mesesTranscurridosObligacion, Long plazoDeseado, Long plazoTotalCredito) {
		super();
		this.valorNuevaCuota = valorNuevaCuota;
		this.comienzasAPagar = comienzasAPagar;
		this.terminasDePagar = terminasDePagar;
		this.mesesTranscurridosObligacion = mesesTranscurridosObligacion;
		this.plazoDeseado = plazoDeseado;
		this.plazoTotalCredito = plazoTotalCredito;
	}

	public Long getValorNuevaCuota() {
		return valorNuevaCuota;
	}

	public void setValorNuevaCuota(Long valorNuevaCuota) {
		this.valorNuevaCuota = valorNuevaCuota;
	}

	public Date getComienzasAPagar() {
		return comienzasAPagar;
	}

	public void setComienzasAPagar(Date comienzasAPagar) {
		this.comienzasAPagar = comienzasAPagar;
	}

	public Date getTerminasDePagar() {
		return terminasDePagar;
	}

	public void setTerminasDePagar(Date terminasDePagar) {
		this.terminasDePagar = terminasDePagar;
	}

	public Long getMesesTranscurridosObligacion() {
		return mesesTranscurridosObligacion;
	}

	public void setMesesTranscurridosObligacion(Long mesesTranscurridosObligacion) {
		this.mesesTranscurridosObligacion = mesesTranscurridosObligacion;
	}

	public Long getPlazoDeseado() {
		return plazoDeseado;
	}

	public void setPlazoDeseado(Long plazoDeseado) {
		this.plazoDeseado = plazoDeseado;
	}

	public Long getPlazoTotalCredito() {
		return plazoTotalCredito;
	}

	public void setPlazoTotalCredito(Long plazoTotalCredito) {
		this.plazoTotalCredito = plazoTotalCredito;
	}
	
	public boolean isInformacionReconsultada() {
		return isInformacionReconsultada;
	}

	public void setInformacionReconsultada(boolean isInformacionReconsultada) {
		this.isInformacionReconsultada = isInformacionReconsultada;
	}
	
	public boolean isCorreoEnviado() {
		return correoEnviado;
	}

	public void setCorreoEnviado(boolean correoEnviado) {
		this.correoEnviado = correoEnviado;
	}
	

	public boolean isCarteraPendiente() {
		return carteraPendiente;
	}

	public void setCarteraPendiente(boolean carteraPendiente) {
		this.carteraPendiente = carteraPendiente;
	}
	
	

	/**
	 * @return the jWT
	 */
	public String getJWT() {
		return JWT;
	}

	/**
	 * @param jWT the jWT to set
	 */
	public void setJWT(String jWT) {
		JWT = jWT;
	}

	@Override
	public String toString() {
		return "InformacionCreditoRediferido [valorNuevaCuota=" + valorNuevaCuota + ", comienzasAPagar="
				+ comienzasAPagar + ", terminasDePagar=" + terminasDePagar + ", mesesTranscurridosObligacion="
				+ mesesTranscurridosObligacion + ", plazoDeseado=" + plazoDeseado + ", plazoTotalCredito="
				+ plazoTotalCredito + ", isInformacionReconsultada=" + isInformacionReconsultada + ", correoEnviado="
				+ correoEnviado + ", carteraPendiente=" + carteraPendiente + "]";
	}
}