package app.demo.domain;

import app.demo.domain.security.Payload;

public class SendLogTrazabilidadGroupedParams {

	private InformacionCreditoActual informacionCreditoActual;
	private InformacionCreditoRediferido informacionCreditoRediferido;
	private Producto producto;
	private Long estadoMantenimientoCartera;
	private Payload payload;
	private String idTrazaServicios;
	private Rescatame rescatame;

	public SendLogTrazabilidadGroupedParams() {
	}

	public SendLogTrazabilidadGroupedParams(InformacionCreditoActual informacionCreditoActual,
			InformacionCreditoRediferido informacionCreditoRediferido, Producto producto,
			Long estadoMantenimientoCartera, Payload payload, String idTrazaServicios, Rescatame rescatame) {
		this.informacionCreditoActual = informacionCreditoActual;
		this.informacionCreditoRediferido = informacionCreditoRediferido;
		this.producto = producto;
		this.estadoMantenimientoCartera = estadoMantenimientoCartera;
		this.payload = payload;
		this.idTrazaServicios = idTrazaServicios;
		this.rescatame = rescatame;
	}

	public InformacionCreditoActual getInformacionCreditoActual() {
		return informacionCreditoActual;
	}

	public void setInformacionCreditoActual(InformacionCreditoActual informacionCreditoActual) {
		this.informacionCreditoActual = informacionCreditoActual;
	}

	public InformacionCreditoRediferido getInformacionCreditoRediferido() {
		return informacionCreditoRediferido;
	}

	public void setInformacionCreditoRediferido(InformacionCreditoRediferido informacionCreditoRediferido) {
		this.informacionCreditoRediferido = informacionCreditoRediferido;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Long getEstadoMantenimientoCartera() {
		return estadoMantenimientoCartera;
	}

	public void setEstadoMantenimientoCartera(Long estadoMantenimientoCartera) {
		this.estadoMantenimientoCartera = estadoMantenimientoCartera;
	}

	public Payload getPayload() {
		return payload;
	}

	public void setPayload(Payload payload) {
		this.payload = payload;
	}

	public String getIdTrazaServicios() {
		return idTrazaServicios;
	}

	public void setIdTrazaServicios(String idTrazaServicios) {
		this.idTrazaServicios = idTrazaServicios;
	}
	
	public Rescatame getRescatame() {
		return rescatame;
	}

	public void setRescatame(Rescatame rescatame) {
		this.rescatame = rescatame;
	}

}
