package app.demo.domain;

import app.demo.domain.security.Payload;

public class LogTrazabilidadRequestParams {

	private InformacionCreditoRediferido informacionCreditoRediferido;
	private InformacionCreditoActual InformacionCreditoActual;
	private Payload payload;
	private Producto producto;
	private Rescatame rescatame;

	public LogTrazabilidadRequestParams() {
	}

	public LogTrazabilidadRequestParams(InformacionCreditoRediferido informacionCreditoRediferido,
			InformacionCreditoActual informacionCreditoActual, Payload payload, Producto producto, Rescatame rescatame) {
		this.informacionCreditoRediferido = informacionCreditoRediferido;
		InformacionCreditoActual = informacionCreditoActual;
		this.payload = payload;
		this.producto = producto;
		this.rescatame = rescatame;
	}

	public InformacionCreditoRediferido getInformacionCreditoRediferido() {
		return informacionCreditoRediferido;
	}

	public void setInformacionCreditoRediferido(InformacionCreditoRediferido informacionCreditoRediferido) {
		this.informacionCreditoRediferido = informacionCreditoRediferido;
	}

	public InformacionCreditoActual getInformacionCreditoActual() {
		return InformacionCreditoActual;
	}

	public void setInformacionCreditoActual(InformacionCreditoActual informacionCreditoActual) {
		InformacionCreditoActual = informacionCreditoActual;
	}

	public Payload getPayload() {
		return payload;
	}

	public void setPayload(Payload payload) {
		this.payload = payload;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Producto getProducto() {
		return producto;
	}
	
	public Rescatame getRescatame() {
		return rescatame;
	}

	public void setRescatame(Rescatame rescatame) {
		this.rescatame = rescatame;
	}
}
