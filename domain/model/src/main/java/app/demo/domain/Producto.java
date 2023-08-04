package app.demo.domain;

import java.util.Date;

public class Producto {

	private long idProducto;
	private String idPlan;
	private String nombreProducto;
	private Date fechaCreacion;
	private String estadoRegistro;
	private String tipoProducto;
	
	public Producto() {
	}

	public Producto(Integer idProducto, String idPlan, String nombreProducto, Date fechaCreacion, String estadoRegistro,
			String tipoProducto) {
		this.idProducto = idProducto;
		this.idPlan = idPlan;
		this.nombreProducto = nombreProducto;
		this.fechaCreacion = fechaCreacion;
		this.estadoRegistro = estadoRegistro;
		this.tipoProducto = tipoProducto;
	}

	public long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(long idProducto) {
		this.idProducto = idProducto;
	}

	public String getIdPlan() {
		return idPlan;
	}

	public void setIdPlan(String idPlan) {
		this.idPlan = idPlan;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getEstadoRegistro() {
		return estadoRegistro;
	}

	public void setEstadoRegistro(String estadoRegistro) {
		this.estadoRegistro = estadoRegistro;
	}

	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

}
