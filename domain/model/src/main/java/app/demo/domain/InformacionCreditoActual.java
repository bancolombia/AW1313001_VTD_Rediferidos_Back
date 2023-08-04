package app.demo.domain;

import java.util.Date;
import java.util.List;

public class InformacionCreditoActual {

	private Persona persona;
	private String idPlan;
	private String nombreProducto;
	private String numeroPrestamo;
	private String numeroPrestamoMask;
	private Long cuotaMensual;
	private Long cuotaActual;
	private Long deudaALaFecha;
	private Long mesesFaltantesPorPagar;
	private Date fechaTerminasDePagar;
	private String fechaTerminasDePagarString;
	private Double tasaFijaInteres;
	private List<String> listSegurosIncluidos;
	private Double tasaSeguroVida;
	private Long valorInicialDelPrestamo;
	private Double cuotaSeguroVida;
	private Double cuotaSeguroDesempleo;
	private Date fechaProximoPago;
	private String fechaProximoPagoString;
	private Date fechaVencimientoFinal;
	private String fechaVencimientoFinalString;
	private InformacionTransaccion informacionTransaccion;
	private InformacionRediferido informacionRediferido;
	private Date fechaAperturaCredito;
	private Long mesesHasPagado;
	
	//Booleanos nuevos para saber que incluye
	private boolean cuotaIncluyeSeguroVida;
	private boolean cuotaIncluyeSeguroDesempleo;
	private boolean distribucionTieneSeguroVida;
	private boolean distribucionTieneSeguroDesempleo;
	
	//Nuevos campos que ahora se obtienen del servicios ConsultarDetallePRestamos
	private String tipoSeguro;
	private Long saldoCapitalVigente;
	
	/**
	 * Default Constructor
	 */
	public InformacionCreditoActual() {
		super();
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getNumeroPrestamo() {
		return numeroPrestamo;
	}

	public void setNumeroPrestamo(String numeroPrestamo) {
		this.numeroPrestamo = numeroPrestamo;
	}

	public String getNumeroPrestamoMask() {
		return numeroPrestamoMask;
	}

	public void setNumeroPrestamoMask(String numeroPrestamoMask) {
		this.numeroPrestamoMask = numeroPrestamoMask;
	}

	public Long getCuotaActual() {
		return cuotaActual;
	}

	public void setCuotaActual(Long cuotaActual) {
		this.cuotaActual = cuotaActual;
	}

	public Long getDeudaALaFecha() {
		return deudaALaFecha;
	}

	public void setDeudaALaFecha(Long deudaALaFecha) {
		this.deudaALaFecha = deudaALaFecha;
	}

	public Long getMesesFaltantesPorPagar() {
		return mesesFaltantesPorPagar;
	}

	public void setMesesFaltantesPorPagar(Long mesesFaltantesPorPagar) {
		this.mesesFaltantesPorPagar = mesesFaltantesPorPagar;
	}

	public Date getFechaTerminasDePagar() {
		return fechaTerminasDePagar;
	}

	public void setFechaTerminasDePagar(Date fechaTerminasDePagar) {
		this.fechaTerminasDePagar = fechaTerminasDePagar;
	}

	public String getFechaTerminasDePagarString() {
		return fechaTerminasDePagarString;
	}

	public void setFechaTerminasDePagarString(String fechaTerminasDePagarString) {
		this.fechaTerminasDePagarString = fechaTerminasDePagarString;
	}

	public Double getTasaFijaInteres() {
		return tasaFijaInteres;
	}

	public void setTasaFijaInteres(Double tasaFijaInteres) {
		this.tasaFijaInteres = tasaFijaInteres;
	}

	public List<String> getListSegurosIncluidos() {
		return listSegurosIncluidos;
	}

	public void setListSegurosIncluidos(List<String> listSegurosIncluidos) {
		this.listSegurosIncluidos = listSegurosIncluidos;
	}

	public InformacionTransaccion getInformacionTransaccion() {
		return informacionTransaccion;
	}

	public void setInformacionTransaccion(InformacionTransaccion informacionTransaccion) {
		this.informacionTransaccion = informacionTransaccion;
	}

	public String getIdPlan() {
		return idPlan;
	}

	public void setIdPlan(String idPlan) {
		this.idPlan = idPlan;
	}

	public Long getCuotaMensual() {
		return cuotaMensual;
	}

	public void setCuotaMensual(Long cuotaMensual) {
		this.cuotaMensual = cuotaMensual;
	}

	public Double getTasaSeguroVida() {
		return tasaSeguroVida;
	}

	public void setTasaSeguroVida(Double tasaSeguroVida) {
		this.tasaSeguroVida = tasaSeguroVida;
	}

	public Long getValorInicialDelPrestamo() {
		return valorInicialDelPrestamo;
	}

	public void setValorInicialDelPrestamo(Long valorInicialDelPrestamo) {
		this.valorInicialDelPrestamo = valorInicialDelPrestamo;
	}

	public Double getCuotaSeguroDesempleo() {
		return cuotaSeguroDesempleo;
	}

	public void setCuotaSeguroDesempleo(Double cuotaSeguroDesempleo) {
		this.cuotaSeguroDesempleo = cuotaSeguroDesempleo;
	}

	public Date getFechaProximoPago() {
		return fechaProximoPago;
	}

	public void setFechaProximoPago(Date fechaProximoPago) {
		this.fechaProximoPago = fechaProximoPago;
	}

	public String getFechaProximoPagoString() {
		return fechaProximoPagoString;
	}

	public void setFechaProximoPagoString(String fechaProximoPagoString) {
		this.fechaProximoPagoString = fechaProximoPagoString;
	}

	public Date getFechaVencimientoFinal() {
		return fechaVencimientoFinal;
	}

	public void setFechaVencimientoFinal(Date fechaVencimientoFinal) {
		this.fechaVencimientoFinal = fechaVencimientoFinal;
	}

	public String getFechaVencimientoFinalString() {
		return fechaVencimientoFinalString;
	}

	public void setFechaVencimientoFinalString(String fechaVencimientoFinalString) {
		this.fechaVencimientoFinalString = fechaVencimientoFinalString;
	}

	public InformacionRediferido getInformacionRediferido() {
		return informacionRediferido;
	}

	public void setInformacionRediferido(InformacionRediferido informacionRediferido) {
		this.informacionRediferido = informacionRediferido;
	}

	public Date getFechaAperturaCredito() {
		return fechaAperturaCredito;
	}

	public void setFechaAperturaCredito(Date fechaAperturaCredito) {
		this.fechaAperturaCredito = fechaAperturaCredito;
	}

	public Long getMesesHasPagado() {
		return mesesHasPagado;
	}

	public void setMesesHasPagado(Long mesesHasPagado) {
		this.mesesHasPagado = mesesHasPagado;
	}

	public Double getCuotaSeguroVida() {
		return cuotaSeguroVida;
	}

	public void setCuotaSeguroVida(Double cuotaSeguroVida) {
		this.cuotaSeguroVida = cuotaSeguroVida;
	}

	public boolean isCuotaIncluyeSeguroVida() {
		return cuotaIncluyeSeguroVida;
	}

	public boolean isCuotaIncluyeSeguroDesempleo() {
		return cuotaIncluyeSeguroDesempleo;
	}

	public void setCuotaIncluyeSeguroVida(boolean cuotaIncluyeSeguroVida) {
		this.cuotaIncluyeSeguroVida = cuotaIncluyeSeguroVida;
	}

	public void setCuotaIncluyeSeguroDesempleo(boolean cuotaIncluyeSeguroDesempleo) {
		this.cuotaIncluyeSeguroDesempleo = cuotaIncluyeSeguroDesempleo;
	}

	public boolean isDistribucionTieneSeguroVida() {
		return distribucionTieneSeguroVida;
	}

	public boolean isDistribucionTieneSeguroDesempleo() {
		return distribucionTieneSeguroDesempleo;
	}

	public void setDistribucionTieneSeguroVida(boolean distribucionTieneSeguroVida) {
		this.distribucionTieneSeguroVida = distribucionTieneSeguroVida;
	}

	public void setDistribucionTieneSeguroDesempleo(boolean distribucionTieneSeguroDesempleo) {
		this.distribucionTieneSeguroDesempleo = distribucionTieneSeguroDesempleo;
	}

	public String getTipoSeguro() {
		return tipoSeguro;
	}

	public void setTipoSeguro(String tipoSeguro) {
		this.tipoSeguro = tipoSeguro;
	}

	public Long getSaldoCapitalVigente() {
		return saldoCapitalVigente;
	}

	public void setSaldoCapitalVigente(Long saldoCapitalVigente) {
		this.saldoCapitalVigente = saldoCapitalVigente;
	}
}