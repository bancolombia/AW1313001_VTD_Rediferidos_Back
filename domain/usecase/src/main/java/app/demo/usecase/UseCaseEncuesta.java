package app.demo.usecase;

import app.demo.domain.Encuesta;
import app.demo.domain.Parametro;
import app.demo.domain.gateway.jpa.GatewayEncuestaJPA;
import app.demo.domain.security.Payload;
import app.demo.usecase.util.RediferidosLog;

import java.util.HashMap;
import java.util.List;

public class UseCaseEncuesta {

	private GatewayEncuestaJPA gatewayEncuestaJPA;

	/**
	 * Inyecto el gatewayEncuestaJPA
	 * 
	 * @param gatewayEncuestaJPA
	 */
	public UseCaseEncuesta(GatewayEncuestaJPA gatewayEncuestaJPA) {
		this.gatewayEncuestaJPA = gatewayEncuestaJPA;
	}

	/**
	 * Califica la experiencia
	 * 
	 * @param calificacion
	 * @param payload
	 */
	public void calificarExperiencia(List<Parametro> calificacion, Payload payload) {
		RediferidosLog.logInfoMessageCharacters(getClass(),
				"INICIO: UseCaseEncuesta.calificarExperiencia con Payload:" + payload.toString());
		Encuesta encuesta = fillEncuesta(calificacion, payload);
		gatewayEncuestaJPA.calificarEncuestaExperiencia(encuesta, payload);
		RediferidosLog.logInfoMessageCharacters(getClass(),
				"FINALIZO: UseCaseEncuesta.calificarExperiencia para Payload: " + payload.toString());
	}

	/**
	 * LLena el objeto encuesta
	 * 
	 * @param calificacion
	 * @param payload
	 * @return
	 */
	private Encuesta fillEncuesta(List<Parametro> calificacion, Payload payload) {
		
		HashMap<String, String> preguntas = new HashMap<>();
		Encuesta encuesta = new Encuesta();
		return encuesta;
	}
}