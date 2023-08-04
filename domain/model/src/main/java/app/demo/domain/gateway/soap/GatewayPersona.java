package app.demo.domain.gateway.soap;

import app.demo.domain.Persona;
import app.demo.domain.security.Payload;

public interface GatewayPersona {

	public Persona getPersonaByTipoIdAndIdentificacion(String tipoIdentificacion, String numeroIdentificacion, Payload payload);

}
