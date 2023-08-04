package app.demo.rest.sendmail;

import app.demo.domain.Parametro;
import app.demo.domain.constantes.Parameter;
import app.demo.domain.gateway.rest.GatewayEnvioCorreoServiceRest;
import app.demo.domain.sendmail.CartaBienvenidaMailDTO;
import app.demo.domain.sendmail.RespuestaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class SendMailServiceRest implements GatewayEnvioCorreoServiceRest {
	
	private ParameterRestService parameterRestService;
	private RestTemplate restTemplate;
	
	@Autowired
	public SendMailServiceRest(ParameterRestService parameterRestService) {
		this.parameterRestService = parameterRestService;
	}
	
	public void inizializeRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public boolean sendMail(CartaBienvenidaMailDTO mailDTO, String pasoFuncional, String idSesion) {
		Boolean responseConsumer = false;
		try {
			RediferidosLog.logInfoMessageCharacters(getClass(),
					"INICIO: SendMailServiceRest.sendMail con idSesion: " + idSesion);
			
			RespuestaServicio respuestaServicio = new RespuestaServicio();
			respuestaServicio.setCodigo("500");
			
			/**RestTemplate restTemplate = new RestTemplate();*/
			if (restTemplate == null) {
				restTemplate = new RestTemplate();
			}
	
			String url = parameterRestService.getParametersMailService()
					.get(Parameter.URL_API_ENVIO_CORREO);
	
			RediferidosLog.logInfoMessage(getClass(),"Se consumira el API EnvioCorreo en la siguiente URL por REST: " + url );
			
			HttpEntity<List> entity = configureHttpEntity(mailDTO.getListParameters());
			
			RediferidosLog.logInfoMessageCharactersWithObject(getClass(), 
					"Se configura peticion parametros a enviar: ", mailDTO.getListParameters());
			
			// Hago el llamado con el nuevo objeto como parametro
			ResponseEntity<RespuestaServicio> response = restTemplate.postForEntity(url, entity, RespuestaServicio.class);

			if (response.getStatusCode().is2xxSuccessful()) {
				respuestaServicio = response.getBody();
				RediferidosLog.logInfoMessageCharacters(getClass(),
						"FINALIZO: SendMailServiceRest.sendMail con idSesion: " + idSesion);
				RediferidosLog.logInfoMessageCharactersWithObject(this.getClass(), 
						"FINALIZO: Api Responde 200 OK: ", respuestaServicio);
				responseConsumer = true;
			} else {
				RediferidosLog.logInfoMessage(this.getClass(), "FINALIZO: Consumo API Correo con status 500");
			}
				
		} catch (RestClientException e) {
			RediferidosLog.logErrorMessage(getClass(), "calling SendMailServiceRest.sendMail "+e.getMessage(), e);
		}
		return responseConsumer;
	}

	/**
	 * 
	 * @param parameterList
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	private HttpEntity<List> configureHttpEntity(List<Parametro> parameterList) {
		HttpHeaders headers = configureHttpHeaders();
		return new HttpEntity<>(parameterList, headers);
	}

	
	/**
	 * 
	 * @return
	 */
	private HttpHeaders configureHttpHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.setContentType(MediaType.APPLICATION_JSON);
		return headers;
	}
}