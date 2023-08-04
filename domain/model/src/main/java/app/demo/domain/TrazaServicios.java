package app.demo.domain;

import java.util.Date;
//
public class TrazaServicios {
	
	private Long idTrazaServicio;
	private String idSession;
	private Long estadoTransmisionContenido;
	private Long estadoMantenimientoCartera;
	private Long estadoRegistrarVenta;
	private Date fechaCreacion;
	
	public TrazaServicios() {
		super();
	}
	
	public String getIdSession() {
		return idSession;
	}
	public void setIdSession(String idSession) {
		this.idSession = idSession;
	}
	public Long getEstadoTransmisionContenido() {
		return estadoTransmisionContenido;
	}
	public void setEstadoTransmisionContenido(Long estadoTransmisionContenido) {
		this.estadoTransmisionContenido = estadoTransmisionContenido;
	}
	public Long getEstadoMantenimientoCartera() {
		return estadoMantenimientoCartera;
	}
	public void setEstadoMantenimientoCartera(Long estadoMantenimientoCartera) {
		this.estadoMantenimientoCartera = estadoMantenimientoCartera;
	}
	public Long getEstadoRegistrarVenta() {
		return estadoRegistrarVenta;
	}
	public void setEstadoRegistrarVenta(Long estadoRegistrarVenta) {
		this.estadoRegistrarVenta = estadoRegistrarVenta;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Long getIdTrazaServicio() {
		return idTrazaServicio;
	}

	public void setIdTrazaServicio(Long idTrazaServicio) {
		this.idTrazaServicio = idTrazaServicio;
	}
}