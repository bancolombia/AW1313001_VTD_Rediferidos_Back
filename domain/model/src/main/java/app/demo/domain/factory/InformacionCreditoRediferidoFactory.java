package app.demo.domain.factory;

import app.demo.domain.InformacionCreditoActual;
import app.demo.domain.InformacionCreditoRediferido;

import java.util.Date;

/**
 * Factory CalculoCuota
 * @author 1724147
 *
 */
public class InformacionCreditoRediferidoFactory {

	/**
	 * 
	 * @param informacionCreditoActual
	 * @param plazoSeleccionado
	 * @return
	 */
	public InformacionCreditoRediferido create(InformacionCreditoActual informacionCreditoActual,
			Long plazoSeleccionado, boolean esReconsultaServicio) {
	

		
		//Creo el objeto con valores
		InformacionCreditoRediferido informacionCreditoRediferidoTmp = new InformacionCreditoRediferido();

		return informacionCreditoRediferidoTmp;
	}

	/**
	 * 
	 * @param informacionCreditoActual
	 * @param plazoSeleccionado
	 * @param esReconsultaServicio
	 * @return
	 */
	private Date consultarFechaTerminasDePagar(InformacionCreditoActual informacionCreditoActual,
			Long plazoSeleccionado, boolean esReconsultaServicio) {

		Date fechaTerminasDePagarMenos30Dias;


		return fechaTerminasDePagarMenos30Dias;
	}
}