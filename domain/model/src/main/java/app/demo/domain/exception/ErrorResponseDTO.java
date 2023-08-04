package app.demo.domain.exception;

import java.io.Serializable;
import java.util.List;

public class ErrorResponseDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String idAplicacion;
	private String codigoInterno;
	private String servicio;
	private String operacion;
	private String codigoError;
	private String tipoExcepcion;
	private String descripcionTecnica;
	private List<MensajeFuncionalDTO> mensajeFuncional;

	public ErrorResponseDTO() {
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public String getCodigoError() {
		return codigoError;
	}

	public void setCodigoError(String codigoError) {
		this.codigoError = codigoError;
	}

	public String getTipoExcepcion() {
		return tipoExcepcion;
	}

	public void setTipoExcepcion(String tipoExcepcion) {
		this.tipoExcepcion = tipoExcepcion;
	}

	public List<MensajeFuncionalDTO> getMensajeFuncional() {
		return mensajeFuncional;
	}

	public void setMensajeFuncional(List<MensajeFuncionalDTO> mensajeFuncional) {
		this.mensajeFuncional = mensajeFuncional;
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

	public String getDescripcionTecnica() {
		return descripcionTecnica;
	}

	public void setDescripcionTecnica(String descripcionTecnica) {
		this.descripcionTecnica = descripcionTecnica;
	}
}
