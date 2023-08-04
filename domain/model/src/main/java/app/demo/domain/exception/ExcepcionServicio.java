package app.demo.domain.exception;

import java.io.Serializable;

/**
 * <b>IBM. Global Bussiness Services AMS Colombia.</b>
 *
 * <p>
 * Description: Clase que contiene las caraterísticas de la excepción que es
 * almacenada en base de datos y está asociado a la informacion de la
 * transacción.
 * </p>
 *
 * @author <A HREF="mailto:ajpulido@co.ibm.com">Andrés Pulido</A>
 *         <p>
 *         <b>Fecha de creación(dd/mmm/aaaa): </b> [Aug 24, 2017]
 *
 * @version [1.0, Aug 24, 2017]
 *
 */
public class ExcepcionServicio implements Serializable {

	private static final long serialVersionUID = -4981108431373060879L;
	private String codigo;
	private String descripcion;
	private String detalle;
	private String codigoFuncional;
	private String detalleFuncional;
	private String tipoExcepcion;
	private String servicio;
	private String operacionServicio;
	
	public ExcepcionServicio() {
		super();
	}
	
	public ExcepcionServicio(String codigo, String descripcion) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public ExcepcionServicio(String codigo, String descripcion, String detalle) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.detalle = detalle;
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

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getCodigoFuncional() {
		return codigoFuncional;
	}

	public void setCodigoFuncional(String codigoFuncional) {
		this.codigoFuncional = codigoFuncional;
	}

	public String getDetalleFuncional() {
		return detalleFuncional;
	}

	public void setDetalleFuncional(String detalleFuncional) {
		this.detalleFuncional = detalleFuncional;
	}

	
	public String getTipoExcepcion() {
		return tipoExcepcion;
	}

	public void setTipoExcepcion(String tipoExcepcion) {
		this.tipoExcepcion = tipoExcepcion;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public String getOperacionServicio() {
		return operacionServicio;
	}

	public void setOperacionServicio(String operacionServicio) {
		this.operacionServicio = operacionServicio;
	}
}