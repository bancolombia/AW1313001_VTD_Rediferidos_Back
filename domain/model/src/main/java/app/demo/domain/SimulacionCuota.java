package app.demo.domain;

import java.util.Date;

/**
 * Dominio para entidad SIMULACION_CUOTA
 * 
 * @author jefersson.galvez
 *
 */
public class SimulacionCuota {

	private Long cuotaMensualSimulada;
	private Date terminasPagarSimulada;
	private Long saldoCapitalVigente;
	private String codBaseCalculoSeguroVida;
	private Double tasaSeguroVida;

	/**
	 * Constructor vacío
	 */
	public SimulacionCuota() {
		super();
	}

	/**
	 * Constructor con campos
	 * 
	 * @param cuotaMensualSimulada
	 * @param terminasPagarSimulada
	 * @param saldoCapitalVigente
	 * @param codBaseCalculoSeguroVida
	 * @param tasaSeguroVida
	 */
	public SimulacionCuota(Long cuotaMensualSimulada, Date terminasPagarSimulada, Long saldoCapitalVigente,
			String codBaseCalculoSeguroVida, Double tasaSeguroVida) {
		super();
		this.cuotaMensualSimulada = cuotaMensualSimulada;
		this.terminasPagarSimulada = terminasPagarSimulada;
		this.saldoCapitalVigente = saldoCapitalVigente;
		this.codBaseCalculoSeguroVida = codBaseCalculoSeguroVida;
		this.tasaSeguroVida = tasaSeguroVida;
	}

	// GETTERS && SETTERS
	public Long getCuotaMensualSimulada() {
		return cuotaMensualSimulada;
	}

	public void setCuotaMensualSimulada(Long cuotaMensualSimulada) {
		this.cuotaMensualSimulada = cuotaMensualSimulada;
	}

	public Date getTerminasPagarSimulada() {
		return terminasPagarSimulada;
	}

	public void setTerminasPagarSimulada(Date terminasPagarSimulada) {
		this.terminasPagarSimulada = terminasPagarSimulada;
	}

	public Long getSaldoCapitalVigente() {
		return saldoCapitalVigente;
	}

	public void setSaldoCapitalVigente(Long saldoCapitalVigente) {
		this.saldoCapitalVigente = saldoCapitalVigente;
	}

	public String getCodBaseCalculoSeguroVida() {
		return codBaseCalculoSeguroVida;
	}

	public void setCodBaseCalculoSeguroVida(String codBaseCalculoSeguroVida) {
		this.codBaseCalculoSeguroVida = codBaseCalculoSeguroVida;
	}

	public Double getTasaSeguroVida() {
		return tasaSeguroVida;
	}

	public void setTasaSeguroVida(Double tasaSeguroVida) {
		this.tasaSeguroVida = tasaSeguroVida;
	}

	@Override
	public String toString() {
		return "SimulacionCuota [cuotaMensualSimulada=" + cuotaMensualSimulada + ", terminasPagarSimulada="
				+ terminasPagarSimulada + ", saldoCapitalVigente=" + saldoCapitalVigente + ", codBaseCalculoSeguroVida="
				+ codBaseCalculoSeguroVida + ", tasaSeguroVida=" + tasaSeguroVida + "]";
	}

}
