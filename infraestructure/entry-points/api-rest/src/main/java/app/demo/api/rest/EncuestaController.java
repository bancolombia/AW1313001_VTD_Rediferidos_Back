package app.demo.api.rest;

import app.demo.api.rest.service.SessionService;
import app.demo.domain.Parametro;
import app.demo.domain.constantes.Parameter;
import app.demo.domain.security.Payload;
import app.demo.usecase.UseCaseEncuesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SuppressWarnings("rawtypes")
@CrossOrigin("*")
@RestController
@RequestMapping(value = "/encuesta", produces = MediaType.APPLICATION_JSON_VALUE)
public class EncuestaController {

	private UseCaseEncuesta useCaseEncuesta;
	
	@Autowired
	private SessionService sessionService;
	
	@Autowired
	private ParameterControllerService parameterControllerService;

	
	/**
	 * 
	 * @param useCaseEncuesta
	 */
	public EncuestaController(UseCaseEncuesta useCaseEncuesta) {
		this.useCaseEncuesta = useCaseEncuesta;
	}

	/**
	 * Califica la experiencia
	 * 
	 * @param authorization
	 * @param holderEncuesta
	 * @return
	 */
	@PostMapping(path = "/calificar", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity calificarExperiencia(@RequestHeader("Authorization") String authorization,
			@RequestBody List<Parametro> parametros) {
		// Valido el JWT
		Payload payload = sessionService.getPayload(authorization,
				parameterControllerService.getParametersFunctionalStep().get(Parameter.STEP_ENCUESTA_EXPERIENCIA));

		useCaseEncuesta.calificarExperiencia(parametros, payload);
		return new ResponseEntity<Integer>(HttpStatus.OK.value(), HttpStatus.OK);
	}
}