package app.demo.domain.security;

public class Payload {
	private String idSesion;
	private String tokenApp;
	private String ipCliente;
	private String tipoIdentificacion;
	private String numeroIdentificacion;

	//Default Constructor
	public Payload() {
	}

	//Test constructor
	public Payload(String idSesion, String tokenApp, String ipCliente) {
		this.idSesion = idSesion;
		this.tokenApp = tokenApp;
		this.ipCliente = ipCliente;
	}
	
	//Full Constructor
	public Payload(String idSesion, String tokenApp, String ipCliente,
			String tipoIdentificacion, String numeroIdentificacion) {
		this.idSesion = idSesion;
		this.tokenApp = tokenApp;
		this.ipCliente = ipCliente;
		this.tipoIdentificacion = tipoIdentificacion;
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getIdSesion() {
		return idSesion;
	}

	public void setIdSesion(String idSesion) {
		this.idSesion = idSesion;
	}

	public String getTokenApp() {
		return tokenApp;
	}

	public void setTokenApp(String tokenApp) {
		this.tokenApp = tokenApp;
	}

	public String getIpCliente() {
		return ipCliente;
	}

	public void setIpCliente(String ipCliente) {
		this.ipCliente = ipCliente;
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

	@Override
	public String toString() {
		return "Payload [idSesion=" + idSesion + ", numeroIdentificacion=" + numeroIdentificacion + "]";
	}
	
}