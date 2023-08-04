package app.demo.domain;

import app.demo.domain.security.Payload;

public class UseCaseGroupedParams {

	private InformacionCreditoActual informacionCreditoActual;
	private InformacionCreditoRediferido informacionCreditoRediferido; 
	private InformacionDispositivo informacionDispositivo;
	private Payload payload;
	private Rescatame rescatame;

	public UseCaseGroupedParams() {
		super();
	}
	
	public UseCaseGroupedParams(InformacionDispositivo informacionDispositivo) {
		super();
		this.informacionDispositivo = informacionDispositivo;
	}

	public InformacionCreditoActual getInformacionCreditoActual() {
		return informacionCreditoActual;
	}
	public InformacionCreditoRediferido getInformacionCreditoRediferido() {
		return informacionCreditoRediferido;
	}
	public InformacionDispositivo getInformacionDispositivo() {
		return informacionDispositivo;
	}
	public Payload getPayload() {
		return payload;
	}
	public void setInformacionCreditoActual(InformacionCreditoActual informacionCreditoActual) {
		this.informacionCreditoActual = informacionCreditoActual;
	}
	public void setInformacionCreditoRediferido(InformacionCreditoRediferido informacionCreditoRediferido) {
		this.informacionCreditoRediferido = informacionCreditoRediferido;
	}
	public void setInformacionDispositivo(InformacionDispositivo informacionDispositivo) {
		this.informacionDispositivo = informacionDispositivo;
	}
	public void setPayload(Payload payload) {
		this.payload = payload;
	}
	public Rescatame getRescatame() {
		return rescatame;
	}
	public void setRescatame(Rescatame rescatame) {
		this.rescatame = rescatame;
	}
}