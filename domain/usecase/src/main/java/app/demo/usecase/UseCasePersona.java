package app.demo.usecase;

import app.demo.domain.Persona;
import app.demo.domain.gateway.soap.GatewayPersona;
import app.demo.domain.security.Payload;

public class UseCasePersona {
	
	private GatewayPersona gatewayPersona;
	
	public UseCasePersona(GatewayPersona gatewayPersona) {
		this.gatewayPersona = gatewayPersona;
	}

	public Persona getPersonaByTipoIdAndIdentificacion(String tipoIdentificacion, String numeroIdentificacion, 
			Payload payload) {
		return gatewayPersona.getPersonaByTipoIdAndIdentificacion(tipoIdentificacion, 
				numeroIdentificacion, payload);
	}
}