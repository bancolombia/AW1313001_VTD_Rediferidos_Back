package app.demo.domain;

import java.util.Date;

public class InformacionTransaccion {
	
	private Date fechaActual;
	private String fechaActualString;
	private Date fechaUltimoIngreso;
	private String fechaUltimoIngresoString;
	private String idSesion;
	private String ipConexion;
	private String pasoFuncional;
	
	/**
	 * Default constructor
	 */
	public InformacionTransaccion() {
		super();
	}

	/**
	 * Full Constructor
	 * @param fechaActual
	 * @param fechaActualString
	 * @param fechaUltimoIngreso
	 * @param fechaUltimoIngresoString
	 * @param ipConexion
	 * @param idSesion
	 */
	public InformacionTransaccion(Date fechaActual, String fechaActualString, Date fechaUltimoIngreso,
			String fechaUltimoIngresoString, String ipConexion, String idSesion) {
		super();
		this.fechaActual = fechaActual;
		this.fechaActualString = fechaActualString;
		this.fechaUltimoIngreso = fechaUltimoIngreso;
		this.fechaUltimoIngresoString = fechaUltimoIngresoString;
		this.ipConexion = ipConexion;
		this.idSesion = idSesion;
	}

	public Date getFechaActual() {
		return fechaActual;
	}

	public void setFechaActual(Date fechaActual) {
		this.fechaActual = fechaActual;
	}

	public String getFechaActualString() {
		return fechaActualString;
	}

	public void setFechaActualString(String fechaActualString) {
		this.fechaActualString = fechaActualString;
	}

	public Date getFechaUltimoIngreso() {
		return fechaUltimoIngreso;
	}

	public void setFechaUltimoIngreso(Date fechaUltimoIngreso) {
		this.fechaUltimoIngreso = fechaUltimoIngreso;
	}

	public String getFechaUltimoIngresoString() {
		return fechaUltimoIngresoString;
	}

	public void setFechaUltimoIngresoString(String fechaUltimoIngresoString) {
		this.fechaUltimoIngresoString = fechaUltimoIngresoString;
	}

	public String getIpConexion() {
		return ipConexion;
	}

	public void setIpConexion(String ipConexion) {
		this.ipConexion = ipConexion;
	}

	public String getIdSesion() {
		return idSesion;
	}

	public void setIdSesion(String idSesion) {
		this.idSesion = idSesion;
	}

	public String getPasoFuncional() {
		return pasoFuncional;
	}

	public void setPasoFuncional(String pasoFuncional) {
		this.pasoFuncional = pasoFuncional;
	}

	@Override
	public String toString() {
		return "InformacionTransaccion [fechaActual=" + fechaActual + ", fechaActualString=" + fechaActualString
				+ ", fechaUltimoIngreso=" + fechaUltimoIngreso + ", fechaUltimoIngresoString="
				+ fechaUltimoIngresoString + ", idSesion=" + idSesion + ", ipConexion=" + ipConexion
				+ ", pasoFuncional=" + pasoFuncional + "]";
	}
}