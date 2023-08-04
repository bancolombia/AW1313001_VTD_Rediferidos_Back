package app.demo.domain.sendmail;

import java.io.Serializable;

public class RespuestaServicio implements Serializable {

	private static final long serialVersionUID = 8327591046237236885L;

	private String codigo;

	private String descripcion;

	private String redirectUrl;

	public RespuestaServicio() {
	}

	public RespuestaServicio(String codigo, String descripcion, String redirectUrl) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.redirectUrl = redirectUrl;
	}
	
	public RespuestaServicio(String codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

}
