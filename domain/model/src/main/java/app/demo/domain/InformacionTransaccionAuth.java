package app.demo.domain;

import java.util.Date;

public class InformacionTransaccionAuth {

	private String id;
	private String idSesion;
	private String ipCliente;
	private Date fechaHoraTransaccion;
	private String pasoFuncional;
	private String canal;
	private String tokenUsuario;
	private String idAplicacion;
	private String usuario;
	private String fechaYHoraUltimaVisita;
	private String fechaYHoraActual;
	private String sessionKey;
	private String idAppSecundario;
	private String tokenApp;
	
	/**
	 * 
	 */
	public InformacionTransaccionAuth() {
		super();
	}

	/**
	 * 
	 * @param id
	 * @param idSesion
	 * @param ipCliente
	 * @param fechaHoraTransaccion
	 * @param pasoFuncional
	 * @param canal
	 * @param tokenUsuario
	 * @param idAplicacion
	 * @param usuario
	 * @param fechaYHoraUltimaVisita
	 * @param fechaYHoraActual
	 * @param sessionKey
	 * @param idAppSecundario
	 * @param tokenApp
	 */
	public InformacionTransaccionAuth(String id, String idSesion, String ipCliente, Date fechaHoraTransaccion,
			String pasoFuncional, String canal, String tokenUsuario, String idAplicacion, String usuario,
			String fechaYHoraUltimaVisita, String fechaYHoraActual, String sessionKey, String idAppSecundario,
			String tokenApp) {
		super();
		this.id = id;
		this.idSesion = idSesion;
		this.ipCliente = ipCliente;
		this.fechaHoraTransaccion = fechaHoraTransaccion;
		this.pasoFuncional = pasoFuncional;
		this.canal = canal;
		this.tokenUsuario = tokenUsuario;
		this.idAplicacion = idAplicacion;
		this.usuario = usuario;
		this.fechaYHoraUltimaVisita = fechaYHoraUltimaVisita;
		this.fechaYHoraActual = fechaYHoraActual;
		this.sessionKey = sessionKey;
		this.idAppSecundario = idAppSecundario;
		this.tokenApp = tokenApp;
	}

	public String getId() {
		return id;
	}

	public String getIdSesion() {
		return idSesion;
	}

	public String getIpCliente() {
		return ipCliente;
	}

	public Date getFechaHoraTransaccion() {
		return fechaHoraTransaccion;
	}

	public String getPasoFuncional() {
		return pasoFuncional;
	}

	public String getCanal() {
		return canal;
	}

	public String getTokenUsuario() {
		return tokenUsuario;
	}

	public String getIdAplicacion() {
		return idAplicacion;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getFechaYHoraUltimaVisita() {
		return fechaYHoraUltimaVisita;
	}

	public String getFechaYHoraActual() {
		return fechaYHoraActual;
	}

	public String getSessionKey() {
		return sessionKey;
	}

	public String getIdAppSecundario() {
		return idAppSecundario;
	}

	public String getTokenApp() {
		return tokenApp;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIdSesion(String idSesion) {
		this.idSesion = idSesion;
	}

	public void setIpCliente(String ipCliente) {
		this.ipCliente = ipCliente;
	}

	public void setFechaHoraTransaccion(Date fechaHoraTransaccion) {
		this.fechaHoraTransaccion = fechaHoraTransaccion;
	}

	public void setPasoFuncional(String pasoFuncional) {
		this.pasoFuncional = pasoFuncional;
	}

	public void setCanal(String canal) {
		this.canal = canal;
	}

	public void setTokenUsuario(String tokenUsuario) {
		this.tokenUsuario = tokenUsuario;
	}

	public void setIdAplicacion(String idAplicacion) {
		this.idAplicacion = idAplicacion;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setFechaYHoraUltimaVisita(String fechaYHoraUltimaVisita) {
		this.fechaYHoraUltimaVisita = fechaYHoraUltimaVisita;
	}

	public void setFechaYHoraActual(String fechaYHoraActual) {
		this.fechaYHoraActual = fechaYHoraActual;
	}

	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}

	public void setIdAppSecundario(String idAppSecundario) {
		this.idAppSecundario = idAppSecundario;
	}

	public void setTokenApp(String tokenApp) {
		this.tokenApp = tokenApp;
	}

	@Override
	public String toString() {
		return "InformacionTransaccionAuth [id=" + id + ", idSesion=" + idSesion + ", ipCliente=" + ipCliente
				+ ", fechaHoraTransaccion=" + fechaHoraTransaccion + ", pasoFuncional=" + pasoFuncional + ", canal="
				+ canal + ", tokenUsuario=" + tokenUsuario + ", idAplicacion=" + idAplicacion + ", usuario=" + usuario
				+ ", fechaYHoraUltimaVisita=" + fechaYHoraUltimaVisita + ", fechaYHoraActual=" + fechaYHoraActual
				+ ", sessionKey=" + sessionKey + ", idAppSecundario=" + idAppSecundario + ", tokenApp=" + tokenApp
				+ "]";
	}
}