package app.demo.domain.security;

import java.io.Serializable;

public class PayloadAuth implements Serializable{

	private static final long serialVersionUID = -4842040803372696937L;
	private String tipoDocumento;
	private String documento;
	private String tokenUsuario;
	
	public PayloadAuth() {
	}
	
	public PayloadAuth(String tipoDocumento, String documento, String tokenUsuario) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.documento = documento;
		this.tokenUsuario = tokenUsuario;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getTokenUsuario() {
		return tokenUsuario;
	}
	public void setTokenUsuario(String tokenUsuario) {
		this.tokenUsuario = tokenUsuario;
	}
}