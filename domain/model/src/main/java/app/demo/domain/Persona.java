package app.demo.domain;

public class Persona {

	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private String nombreCompleto;
	private String numeroDocumento;
	private String tipoDocumento;
	private String correoElectronico;
	private String correoElectronicoMask;
    private String telefonoMask;
    private String telefono;


	public Persona() {
		super();
	}

	public String getTelefonoMask() {
        return telefonoMask;
    }

    public void setTelefonoMask(String telefonoMask) {
        this.telefonoMask = telefonoMask;
    }

    /**
	 * Full Constructor
	 *
	 * @param primerNombre
	 * @param segundoNombre
	 * @param primerApellido
	 * @param segundoApellido
	 * @param nombreCompleto
	 * @param numeroDocumento
	 * @param tipoDocumento
	 * @param correoElectronico
	 */
	public Persona(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
			String nombreCompleto, String numeroDocumento, String tipoDocumento, String correoElectronico) {
		super();
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.nombreCompleto = nombreCompleto;
		this.numeroDocumento = numeroDocumento;
		this.tipoDocumento = tipoDocumento;
		this.correoElectronico = correoElectronico;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getSegundoNombre() {
		return segundoNombre;
	}
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getCorreoElectronicoMask() {
		return correoElectronicoMask;
	}

	public void setCorreoElectronicoMask(String correoElectronicoMask) {
		this.correoElectronicoMask = correoElectronicoMask;
	}
	
	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
