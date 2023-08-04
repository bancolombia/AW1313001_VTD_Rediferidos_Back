package app.demo.api.rest.service;

import app.demo.domain.security.Payload;
import app.demo.domain.security.PayloadAuth;

public interface SessionService {

	public String generateJWT(String authorization, String idSesion, String actualPage);

	public String generateJWT(String idSesion, String tokenApp, String ipCliente, String actualPage,
			String tipoDocumento, String numeroDocumento);

	public Payload getPayload(String authorization, String actualPage);

	public PayloadAuth getPayloadAuth(String authorization, String actualPageInicioExperiencia);
}