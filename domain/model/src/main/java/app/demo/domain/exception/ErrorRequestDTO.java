package app.demo.domain.exception;

import java.io.Serializable;

public class ErrorRequestDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9101496626393260762L;
	private Header header;
	private String idAplicacion;
	private String codigoInterno;

	public ErrorRequestDTO() {
	}

	public ErrorRequestDTO(Header header, String idAplicacion, String codigoInterno) {
		super();
		this.header = header;
		this.idAplicacion = idAplicacion;
		this.codigoInterno = codigoInterno;
	}

	public ErrorRequestDTO(String idAplicacion, String codigoInterno) {
		super();
		this.idAplicacion = idAplicacion;
		this.codigoInterno = codigoInterno;
	}

	public String getIdAplicacion() {
		return idAplicacion;
	}

	public void setIdAplicacion(String idAplicacion) {
		this.idAplicacion = idAplicacion;
	}

	public String getCodigoInterno() {
		return codigoInterno;
	}

	public void setCodigoInterno(String codigoInterno) {
		this.codigoInterno = codigoInterno;
	}

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	@Override
	public String toString() {
		return "ErrorRequestDTO [idAplicacion=" + idAplicacion + ", codigoInterno=" + codigoInterno + "]";
	}
}