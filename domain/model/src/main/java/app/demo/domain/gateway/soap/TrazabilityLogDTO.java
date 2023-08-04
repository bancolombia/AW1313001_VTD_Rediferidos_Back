package app.demo.domain.gateway.soap;

import app.demo.domain.constantes.ConstantesRediferidos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TrazabilityLogDTO {

	// fechas
	private Date fechaInicioExperiencia;
	private Date fechaAceptaCambioCuotas;
	private Date fechaAceptaTerminos;
	private Date fechaAuth;
	private Date fechaRescatame;

	// Datos comunes
	private String idSesion;
	private String ipCliente;
	private String idCliente;
	private String idTypeClient;
	private String numeroCredito;
	private String nombreProducto;
	private String correoElectronico;

	// Credito actual
	private String cuotaActual;
	private String deudaALaFecha;
	private String fechaFinalActual;
	private String mesesFaltantesPorPagar;
	private String tasaMV;
	private String segurosIncluidos;
	private Long plazoActual;

	// Credito nuevo
	private String cuotaNueva;
	private String plazoNuevo;
	private String fechaInicioNuevo;
	private String fechaFinalNuevo;
	private String fechaUno;
	private String fechaDos;
	private String fechaTres;
	private Long estadoMantenimientoCartera;
	
	// Rescatame
	private String celular;
	private String nuevoCelular;

	public Date getFechaInicioExperiencia() {
		return fechaInicioExperiencia;
	}

	public void setFechaInicioExperiencia(Date fechaInicioExperiencia) {
		this.fechaInicioExperiencia = fechaInicioExperiencia;
	}

	public Date getFechaAceptaCambioCuotas() {
		return fechaAceptaCambioCuotas;
	}

	public void setFechaAceptaCambioCuotas(Date fechaAceptaCambioCuotas) {
		this.fechaAceptaCambioCuotas = fechaAceptaCambioCuotas;
	}

	public Date getFechaAceptaTerminos() {
		return fechaAceptaTerminos;
	}

	public void setFechaAceptaTerminos(Date fechaAceptaTerminos) {
		this.fechaAceptaTerminos = fechaAceptaTerminos;
	}
	
	public Date getFechaRescatame() {
		return fechaRescatame;
	}

	public void setFechaRescatame(Date fechaRescatame) {
		this.fechaRescatame = fechaRescatame;
	}

	public String getIdSesion() {
		return idSesion;
	}

	public void setIdSesion(String idSesion) {
		this.idSesion = idSesion;
	}

	public String getIpCliente() {
		return ipCliente;
	}

	public void setIpCliente(String ipCliente) {
		this.ipCliente = ipCliente;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getNumeroCredito() {
		return numeroCredito;
	}

	public void setNumeroCredito(String numeroCredito) {
		this.numeroCredito = numeroCredito;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getCuotaActual() {
		return cuotaActual;
	}

	public void setCuotaActual(String cuotaActual) {
		this.cuotaActual = cuotaActual;
	}

	public String getDeudaALaFecha() {
		return deudaALaFecha;
	}

	public void setDeudaALaFecha(String deudaALaFecha) {
		this.deudaALaFecha = deudaALaFecha;
	}

	public String getFechaFinalActual() {
		return fechaFinalActual;
	}

	public void setFechaFinalActual(String fechaFinalActual) {
		this.fechaFinalActual = fechaFinalActual;
	}

	public String getMesesFaltantesPorPagar() {
		return mesesFaltantesPorPagar;
	}

	public void setMesesFaltantesPorPagar(String mesesFaltantesPorPagar) {
		this.mesesFaltantesPorPagar = mesesFaltantesPorPagar;
	}

	public String getCuotaNueva() {
		return cuotaNueva;
	}

	public void setCuotaNueva(String cuotaNueva) {
		this.cuotaNueva = cuotaNueva;
	}

	public String getPlazoNuevo() {
		return plazoNuevo;
	}

	public void setPlazoNuevo(String plazoNuevo) {
		this.plazoNuevo = plazoNuevo;
	}

	public String getFechaInicioNuevo() {
		return fechaInicioNuevo;
	}

	public void setFechaInicioNuevo(String fechaInicioNuevo) {
		this.fechaInicioNuevo = fechaInicioNuevo;
	}

	public String getFechaFinalNuevo() {
		return fechaFinalNuevo;
	}

	public void setFechaFinalNuevo(String fechaFinalNuevo) {
		this.fechaFinalNuevo = fechaFinalNuevo;
	}

	public String getFechaUno() {
		return fechaUno;
	}

	public void setFechaUno(String fechaUno) {
		this.fechaUno = fechaUno;
	}

	public String getFechaDos() {
		return fechaDos;
	}

	public void setFechaDos(String fechaDos) {
		this.fechaDos = fechaDos;
	}

	public String getFechaTres() {
		return fechaTres;
	}

	public void setFechaTres(String fechaTres) {
		this.fechaTres = fechaTres;
	}

	public String getTasaMV() {
		return tasaMV;
	}

	public void setTasaMV(String tasaMV) {
		this.tasaMV = tasaMV;
	}

	public String getSegurosIncluidos() {
		return segurosIncluidos;
	}

	public void setSegurosIncluidos(String segurosIncluidos) {
		this.segurosIncluidos = segurosIncluidos;
	}

	public Long getEstadoMantenimientoCartera() {
		return estadoMantenimientoCartera;
	}

	public void setEstadoMantenimientoCartera(Long estadoMantenimientoCartera) {
		this.estadoMantenimientoCartera = estadoMantenimientoCartera;
	}

	public Date getFechaAuth() {
		return fechaAuth;
	}

	public void setFechaAuth(Date fechaAuth) {
		this.fechaAuth = fechaAuth;
	}

	public String getIdTypeClient() {
		return idTypeClient;
	}

	public void setIdTypeClient(String idTypeClient) {
		this.idTypeClient = idTypeClient;
	}
	
	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getNuevoCelular() {
		return nuevoCelular;
	}

	public void setNuevoCelular(String nuevoCelular) {
		this.nuevoCelular = nuevoCelular;
	}
	
	public Long getPlazoActual() {
		return plazoActual;
	}

	public void setPlazoActual(Long plazoActual) {
		this.plazoActual = plazoActual;
	}

	public Map<String, String> generateMapData() {

		Map<String, String> tokens = new HashMap<>();

		DateFormat dateFormat = new SimpleDateFormat(ConstantesRediferidos.FORMAT_DATE_YYYY_MM_DD_HH_MM_SS);

		// Fechas
		tokens.put("fechaInicioExperiencia", dateFormat.format(fechaInicioExperiencia));
		tokens.put("fechaAceptaCambioCuotas", dateFormat.format(fechaAceptaCambioCuotas));
		tokens.put("fechaAceptaTerminos", dateFormat.format(fechaAceptaTerminos));
		tokens.put("fechaPAut", dateFormat.format(fechaAuth));

		// Credito actual
		tokens.put("fechaFinalActual", fechaFinalActual);
		
		// Credito nuevo
		tokens.put("plazoNuevo", plazoNuevo);
		tokens.put("fechaInicioNuevo", fechaInicioNuevo);
		tokens.put("fechaFinalNuevo", fechaFinalNuevo);
		tokens.put("fechaUno", fechaUno);
		tokens.put("fechaDos", fechaDos);
		tokens.put("fechaTres", fechaTres);

		//USER STORY 1954459
		if (nuevoCelular != null) {
			// Rescatame
			tokens.put("celular", celular);
			tokens.put("nuevoCelular", nuevoCelular);
			
		}

		return tokens;

	}

}
