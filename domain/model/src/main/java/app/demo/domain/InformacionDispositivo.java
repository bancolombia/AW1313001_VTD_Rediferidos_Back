package app.demo.domain;

public class InformacionDispositivo{

	private String deviceBrowser;
	
	private String dispositivo;
	
	private String userAgent;
	
	private String sistemaOperativo;
	
	private String versionSistemaOperativo;
	
	public InformacionDispositivo() {
		super();
	}

	public String getDeviceBrowser() {
		return deviceBrowser;
	}

	public void setDeviceBrowser(String deviceBrowser) {
		this.deviceBrowser = deviceBrowser;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public String getVersionSistemaOperativo() {
		return versionSistemaOperativo;
	}

	public void setVersionSistemaOperativo(String versionSistemaOperativo) {
		this.versionSistemaOperativo = versionSistemaOperativo;
	}

	public String getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(String dispositivo) {
		this.dispositivo = dispositivo;
	}

	@Override
	public String toString() {
		return "InformacionDispositivo [deviceBrowser=" + deviceBrowser + ", userAgent="
				+ userAgent + ", sistemaOperativo=" + sistemaOperativo + ", versionSistemaOperativo="
				+ versionSistemaOperativo + ", dispositivo=" + dispositivo + "]";
	}
}
