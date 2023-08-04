package app.demo.usecase.factory;

import app.demo.domain.InformacionTransaccion;
import app.demo.domain.security.Payload;

import java.util.Date;

/**
 * Factory de InformacionTransaccion
 * @author 1724147
 *
 */
public class InformacionTransaccionFactory {

	/**
	 * 
	 * @param payload
	 * @param pasoFuncional
	 * @return
	 */
	public InformacionTransaccion create(Payload payload, String pasoFuncional) {
		Date fechaActual = new Date();
		InformacionTransaccion informacionTransaccion = new InformacionTransaccion();
		return informacionTransaccion;
	}
}