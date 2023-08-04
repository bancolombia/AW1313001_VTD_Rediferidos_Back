package app.demo.domain.exception;

import java.io.Serializable;

public class MensajeFuncionalDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codigoFuncional;
	private String descripcionFuncional;

	public MensajeFuncionalDTO() {

	}

	public MensajeFuncionalDTO(String codigoFuncional, String descripcionFuncional) {
		super();
		this.codigoFuncional = codigoFuncional;
		this.descripcionFuncional = descripcionFuncional;
	}

	public String getCodigoFuncional() {
		return codigoFuncional;
	}

	public void setCodigoFuncional(String codigoFuncional) {
		this.codigoFuncional = codigoFuncional;
	}

	public String getDescripcionFuncional() {
		return descripcionFuncional;
	}

	public void setDescripcionFuncional(String descripcionFuncional) {
		this.descripcionFuncional = descripcionFuncional;
	}

}
