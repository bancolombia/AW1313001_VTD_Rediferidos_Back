package app.demo.usecase.factory;

import app.demo.domain.TrazaServicios;
import app.demo.domain.security.Payload;

import java.util.Date;

public class TrazaServiciosFactory {

	/**
	 * 
	 * @param payload
	 * @return
	 */
	public TrazaServicios create(Payload payload) {
		TrazaServicios trazaServicios = new TrazaServicios();
		trazaServicios.setIdSession(payload.getIdSesion());
		trazaServicios.setFechaCreacion(new Date());
		return trazaServicios;
	}
}