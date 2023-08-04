package app.demo.domain.gateway.jpa;

import app.demo.domain.Encuesta;
import app.demo.domain.security.Payload;

public interface GatewayEncuestaJPA {

	/**
	 * 
	 * @param encuesta
	 * @param payload
	 */
	public void calificarEncuestaExperiencia(Encuesta encuesta, Payload payload);
}