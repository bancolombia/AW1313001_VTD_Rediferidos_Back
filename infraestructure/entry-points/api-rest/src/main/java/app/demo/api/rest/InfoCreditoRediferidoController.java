package app.demo.api.rest;

import app.demo.api.rest.service.SessionService;
import app.demo.api.rest.util.RediferidosLog;
import app.demo.domain.InformacionCreditoRediferido;
import app.demo.domain.UseCaseGroupedParams;
import app.demo.domain.constantes.Parameter;
import app.demo.domain.holder.HolderInfoCreditos;
import app.demo.domain.security.Payload;
import app.demo.usecase.UseCaseInfoCreditoRediferido;
import app.demo.usecase.UseCaseSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import java.io.File;

@SuppressWarnings("rawtypes")
@CrossOrigin("*")
@RestController
@RequestMapping(value = "/creditoRediferido", produces = MediaType.APPLICATION_JSON_VALUE)
public class InfoCreditoRediferidoController {

	@Autowired
	private UseCaseInfoCreditoRediferido useCaseInfoCreditoRediferido;
	
	private UseCaseSession useCaseSession;

	@Autowired
	private SessionService sessionService;

	@Autowired
	private ParameterControllerService parameterControllerService;

	/**
	 * 
	 * @param useCaseInfoCreditoRediferido
	 * @param useCaseSession
	 */
	public InfoCreditoRediferidoController(UseCaseInfoCreditoRediferido useCaseInfoCreditoRediferido, UseCaseSession useCaseSession) {
		this.useCaseInfoCreditoRediferido = useCaseInfoCreditoRediferido;
		this.useCaseSession = useCaseSession;
	}

	/**
	 * Confirma el cambio de cuotas Llama al servicio de TASAS para actualizar
	 * valores Envia correo electronico Construyo el PDF - Log de trazabilidad en
	 * Oracle Custodio el PDF - Log de trazabilidad en Oracle Actualizo el servicio
	 * de rediferidos con estado GESTIONADO (celula maestra)
	 * 
	 * @param authorization
	 * @param holderInfoCreditos
	 * @return
	 */
	@PostMapping(path = "/aceptarCambioCuotas", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity aceptarCambioCuotas(@RequestHeader("Authorization") String authorization,
			@RequestBody HolderInfoCreditos holderInfoCreditos) {

		InformacionCreditoRediferido informacionRediferidoPantallaResumen = useCaseInfoCreditoRediferido
				.aceptarCambioCuotas(
						holderInfoCreditos.getInformacionDispositivo());
		RediferidosLog.logInfoMessageCharacters(getClass(), "creditoRediferidoReconsultado en AceptarCambioCuotas: "
				+ informacionRediferidoPantallaResumen.toString());
		return new ResponseEntity<>(informacionRediferidoPantallaResumen, HttpStatus.OK);
	}



	@PostMapping(path = "/descargarDocumento", produces = MediaType.APPLICATION_PDF_VALUE)
	public ResponseEntity descargarDocumento(@RequestHeader("Authorization") String authorization,
			@RequestBody HolderInfoCreditos holderInfoCreditos, HttpServletRequest request) {
		// Valido el JWT
		Payload payload = sessionService.getPayload(authorization,
				parameterControllerService.getParametersFunctionalStep().get(Parameter.STEP_DOCUMENTO_DESCARGADO));

		
		UseCaseGroupedParams groupedParams = new UseCaseGroupedParams();
		groupedParams.setInformacionCreditoActual(holderInfoCreditos.getInformacionCreditoActual());
		groupedParams.setInformacionCreditoRediferido(holderInfoCreditos.getInformacionCreditoRediferido());
		groupedParams.setInformacionDispositivo(holderInfoCreditos.getInformacionDispositivo());

		File documento = useCaseInfoCreditoRediferido.descargarDocumento(groupedParams,
				parameterControllerService.getParameters(), payload);

		String contentType = null;
		contentType = request.getServletContext().getMimeType(documento.getAbsolutePath());



		return ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType))
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + "carta_bienvenida" + ".pdf\"")
				.body(new FileSystemResource(documento));
	}


}