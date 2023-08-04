package app.demo.domain;

import app.demo.domain.holder.HolderInfoCreditos;

/**
 * 
 * @author ANDAREVA
 *
 */
public class Rescatame {

	private Long idRescatame;
	private String continuarProcesoRescatame;
	private String numeroCelular;
	private InformacionTransaccion informacionTransaccion;
	private String numeroCelularAlmacenado;
	private HolderInfoCreditos holderInfoCreditos;

	/**
	 * Constructor vac�o
	 */
	public Rescatame() {
		super();
	}

	/**
	 * @param idRescatame
	 * @param continuarProcesoRescatame
	 * @param numeroCelular
	 * @param informacionTransaccion
	 */
	public Rescatame(Long idRescatame, String continuarProcesoRescatame, String numeroCelular,
			InformacionTransaccion informacionTransaccion, String numeroCelularAlmacenado, HolderInfoCreditos holderInfoCreditos) {
		super();
		this.idRescatame = idRescatame;
		this.continuarProcesoRescatame = continuarProcesoRescatame;
		this.numeroCelular = numeroCelular;
		this.informacionTransaccion = informacionTransaccion;
		this.numeroCelularAlmacenado = numeroCelularAlmacenado;
		this.holderInfoCreditos = holderInfoCreditos;
	}

	/**
	 * @return the idRescatame
	 */
	public Long getIdRescatame() {
		return idRescatame;
	}

	/**
	 * @param idRescatame the idRescatame to set
	 */
	public void setIdRescatame(Long idRescatame) {
		this.idRescatame = idRescatame;
	}

	/**
	 * @return the continuarProcesoRescatame
	 */
	public String getContinuarProcesoRescatame() {
		return continuarProcesoRescatame;
	}

	/**
	 * @param continuarProcesoRescatame the continuarProcesoRescatame to set
	 */
	public void setContinuarProcesoRescatame(String continuarProcesoRescatame) {
		this.continuarProcesoRescatame = continuarProcesoRescatame;
	}

	/**
	 * @return the numeroCelular
	 */
	public String getNumeroCelular() {
		return numeroCelular;
	}

	/**
	 * @param numeroCelular the numeroCelular to set
	 */
	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	/**
	 * @return the informacionTransaccion
	 */
	public InformacionTransaccion getInformacionTransaccion() {
		return informacionTransaccion;
	}

	/**
	 * @param informacionTransaccion the informacionTransaccion to set
	 */
	public void setInformacionTransaccion(InformacionTransaccion informacionTransaccion) {
		this.informacionTransaccion = informacionTransaccion;
	}
	
	/**
	 * @return the numeroCelularAlmacenado
	 */
	public String getNumeroCelularAlmacenado() {
		return numeroCelularAlmacenado;
	}

	/**
	 * @param numeroCelularAlmacenado the numeroCelularAlmacenado to set
	 */
	public void setNumeroCelularAlmacenado(String numeroCelularAlmacenado) {
		this.numeroCelularAlmacenado = numeroCelularAlmacenado;
	}

	public void validateEmptyPhoneNumber(String phoneNumber) {
		this.numeroCelular = RediferidosUtil.isNullorEmpty(this.numeroCelular)?
				phoneNumber : this.numeroCelular;		
	}
	
	public HolderInfoCreditos getHolderInfoCreditos() {
		return holderInfoCreditos;
	}

	public void setHolderInfoCreditos(HolderInfoCreditos holderInfoCreditos) {
		this.holderInfoCreditos = holderInfoCreditos;
	}

}
