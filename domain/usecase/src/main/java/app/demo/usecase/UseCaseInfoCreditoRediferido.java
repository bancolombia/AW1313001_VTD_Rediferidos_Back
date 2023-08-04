package app.demo.usecase;

import app.demo.domain.*;
import app.demo.domain.constantes.ConstantesRediferidos;
import app.demo.domain.constantes.Parameter;
import app.demo.domain.gateway.jpa.GatewayRediferidosJPA;
import app.demo.domain.gateway.plantillasutil.GatewayPlantillasUtil;
import app.demo.domain.gateway.rest.GatewayEnvioCorreoServiceRest;
import app.demo.domain.gateway.rest.GatewayGestionInternaDocRest;
import app.demo.domain.gateway.soap.*;
import app.demo.domain.gateway.trazabilidadutil.GatewayTrazabilidadUtil;
import app.demo.domain.security.Payload;
import app.demo.domain.sendmail.CartaBienvenidaMailDTO;
import app.demo.domain.sendmail.CartaBienvenidaPdfDTO;
import app.demo.usecase.factory.InformacionTransaccionFactory;
import app.demo.usecase.factory.MailDtoFactory;
import app.demo.usecase.factory.TrazaServiciosFactory;
import app.demo.usecase.util.RediferidosLog;
import org.springframework.scheduling.annotation.Scheduled;

import java.io.File;
import java.util.List;
import java.util.Map;

public class UseCaseInfoCreditoRediferido {

	private GatewayRediferidosJPA gatewayRediferidosJPA;
	private GatewayInformacionRediferido gatewayInformacionRediferido;
	private GatewayEnvioCorreoServiceRest gatewayEnvioCorreoServiceRest;
	private GatewayPlantillasUtil gatewayPlantillasUtil;
	private GatewayTrazabilidadUtil gatewayTrazabilidadUtil;
	private GatewayGestionInternaDocRest gatewayGestionInternaDocumentalRest;
	private UseCaseInfoCreditoActual useCaseInfoCreditoActual;

	/**
	 * Constructor del Caso de Uso de InfoCredito Rediferido
	 * 
	 * @param gatewayRediferidosJPA
	 * @param gatewayInformacionRediferido
	 * @param gatewayInformacionCreditoRediferido
	 * @param gatewayMantenimientoObligacionesCartera
	 * @param gatewayPlantillasUtil
	 * @param gatewayEnvioCorreoServiceRest
	 * @param gatewayTrazabilidadUtil
	 * @param gatewayGestionInternaDocumentalRest
	 * @param gatewayInfoCreditoActual
	 * @param gatewayPersona
	 * @param useCaseInfoCreditoActual
	 */
	public UseCaseInfoCreditoRediferido(GatewayRediferidosJPA gatewayRediferidosJPA,
			GatewayInformacionRediferido gatewayInformacionRediferido,
			GatewayInformacionCreditoRediferido gatewayInformacionCreditoRediferido,
			GatewayMantenimientoObligacionesCartera gatewayMantenimientoObligacionesCartera,
			GatewayPlantillasUtil gatewayPlantillasUtil, GatewayEnvioCorreoServiceRest gatewayEnvioCorreoServiceRest,
			GatewayTrazabilidadUtil gatewayTrazabilidadUtil, GatewayGestionInternaDocRest gatewayGestionInternaDocumentalRest,
			GatewayInfoCreditoActual gatewayInfoCreditoActual,
			GatewayPersona gatewayPersona, UseCaseInfoCreditoActual useCaseInfoCreditoActual,
										GatewayBusinessOpportunities gatewayBusinessOpportunities) {
		this.gatewayRediferidosJPA = gatewayRediferidosJPA;
		this.gatewayInformacionRediferido = gatewayInformacionRediferido;
		this.gatewayPlantillasUtil = gatewayPlantillasUtil;
		this.gatewayEnvioCorreoServiceRest = gatewayEnvioCorreoServiceRest;
		this.gatewayTrazabilidadUtil = gatewayTrazabilidadUtil;
		this.gatewayGestionInternaDocumentalRest = gatewayGestionInternaDocumentalRest;
		this.useCaseInfoCreditoActual = useCaseInfoCreditoActual;
	}


	public InformacionCreditoRediferido aceptarCambioCuotas( InformacionDispositivo informacionDispositivo) {


			// Guardo en la tabla de Trazabilidad de Servicios
			TrazaServicios trazaServicios = new TrazaServiciosFactory().create(null);

			// Creo el objeto principal
			UseCaseGroupedParams groupedParams = new UseCaseGroupedParams(informacionDispositivo);

			boolean carteraPendiente = false;
			boolean correoEnviado = true;

			InformacionCreditoRediferido creditoRediferidoReconsultado = new InformacionCreditoRediferido();


			Producto producto = gatewayRediferidosJPA
					.consultarProductoByIdPlan("00");

			callTransmisionContenidoService(groupedParams,
					trazaServicios,
					producto,
					Parameter.STEP_ACEPTA_CAMBIO_CUOTAS);

			correoEnviado = sendMailService(groupedParams, carteraPendiente, producto);

			return creditoRediferidoReconsultado;
	}



	/**
	 * 
	 * @param groupedParams
	 * @param trazaServicios
	 * @param producto
	 */
	private void callTransmisionContenidoService(UseCaseGroupedParams groupedParams, TrazaServicios trazaServicios, 
			Producto producto, String pasoFuncional) {
		try {

			List<InformacionTransaccion> itList = gatewayRediferidosJPA
					.listInformacionTransaccion(groupedParams.getPayload().getIdSesion());

			InformacionTransaccionAuth auth = gatewayRediferidosJPA.findInfoTransaccionAuthByIdSession(
					groupedParams.getPayload().getIdSesion(), ConstantesRediferidos.PAGE_AUTH,
					ConstantesRediferidos.PAGE_AUTH3SA);
			
			// Construyo el PDF - Log de trazabilidad en Oracle
			File pdfTrazabilidad = gatewayTrazabilidadUtil.generateLog(groupedParams.getInformacionCreditoActual(),
					groupedParams.getInformacionCreditoRediferido(), producto, groupedParams.getRescatame(), itList,
					trazaServicios.getEstadoMantenimientoCartera(), pasoFuncional,
					groupedParams.getPayload().getIdSesion(), auth);

			// Custodio el PDF - Log de trazabilidad en Oracle
			gatewayGestionInternaDocumentalRest.sendFile(pdfTrazabilidad, groupedParams.getPayload(),
					pasoFuncional, trazaServicios.getIdTrazaServicio().toString());

			// Actualizo el registro con estado de Servicio de Transmition de contenido
			// Exitoso (1)
			trazaServicios.setEstadoTransmisionContenido(ConstantesRediferidos.ESTADO_TRANSMISION_CONTENIDO_EXITOSO);

			gatewayRediferidosJPA.persistirTrazaServicios(trazaServicios, groupedParams.getPayload());
		} catch (Exception e) {
			RediferidosLog.logErrorMessage(getClass(),
					"No fue posible consumir el API de Gestion Externa Documental, la experiencia continuara su flujo normal "
							+ e.getMessage(), e);
		}
		RediferidosLog.logInfoMessageCharacters(getClass(),
				"FINALIZO: UseCaseInfoCreditoRediferido.callTransmisionContenidoService con Payload: "
						+ groupedParams.getPayload().toString());
	}

	/**
	 * 
	 * @param groupedParams
	 * @param carteraPendiente
	 * @param producto
	 * @return
	 */
	private boolean sendMailService(UseCaseGroupedParams groupedParams, boolean carteraPendiente, Producto producto) {

		boolean correoEnviado = false;

		RediferidosLog.logInfoMessageCharacters(getClass(), "INICIO: UseCaseInfoCreditoRediferido.sendMailService "
				+ "con Payload: "+  groupedParams.getPayload().toString());

		if (!carteraPendiente) {
			try {
				InformacionTransaccion informacionTransaccionEnvioCorreo = new InformacionTransaccionFactory()
						.create(groupedParams.getPayload(), Parameter.STEP_CORREO_ELECTRONICO_ENVIADO);
				groupedParams.getInformacionCreditoActual()
						.setInformacionTransaccion(informacionTransaccionEnvioCorreo);

				// Genero la carta de bienvenida
				CartaBienvenidaMailDTO mailDto = new MailDtoFactory().createMailDTO(groupedParams.
						getInformacionCreditoRediferido(), groupedParams.getInformacionCreditoActual(), producto);

				// Envio el correo
				gatewayEnvioCorreoServiceRest.sendMail(mailDto, Parameter.STEP_CORREO_ELECTRONICO_ENVIADO,
						groupedParams.getPayload().getIdSesion());

				correoEnviado = true;
			} catch (Exception e) {
				RediferidosLog.logErrorMessage(getClass(),
						"No fue posible consumir el API de Correo Electronico para el envio de la carta, "
								+ "la experiencia continuara su flujo normal " + e.getMessage(), e);
				correoEnviado = false;
			}
		}
		RediferidosLog.logInfoMessageCharacters(getClass(),
				"FINALIZO: UseCaseInfoCreditoRediferido.sendMailService con Payload: "
						+ groupedParams.getPayload().toString());
		return correoEnviado;
	}



	/**
	 * Descarga de documento
	 * @param parametrosConfiguraciones
	 * @param payload
	 * @return
	 *
	 * 005
	 */
	public File descargarDocumento(UseCaseGroupedParams groupedParams, Map<String, String> parametrosConfiguraciones,
			Payload payload) {

		RediferidosLog.logInfoMessageCharacters(getClass(),
				"INICIO: UseCaseInfoCreditoRediferido.descargarDocumento con Payload: " + payload.toString());

		Producto producto = gatewayRediferidosJPA
				.consultarProductoByIdPlan(groupedParams.getInformacionCreditoActual().getIdPlan());

		CartaBienvenidaPdfDTO cartaBienvenidaPdfDTO = new MailDtoFactory().createPdfDto(
				groupedParams.getInformacionCreditoRediferido(), groupedParams.getInformacionCreditoActual(), producto);

		File documento = gatewayPlantillasUtil.obtenerCartaBienvenida(cartaBienvenidaPdfDTO, parametrosConfiguraciones,
				Parameter.STEP_DOCUMENTO_DESCARGADO, payload.getIdSesion());

		// Creo el Objeto InformacionTransaccion para el paso funcional nuevo
		InformacionTransaccion informacionTransaccion = new InformacionTransaccionFactory().create(payload,
				Parameter.STEP_DOCUMENTO_DESCARGADO);
		groupedParams.getInformacionCreditoActual().setInformacionTransaccion(informacionTransaccion);


		RediferidosLog.logInfoMessageCharacters(getClass(),
				"FINALIZO: UseCaseInfoCreditoRediferido.descargarDocumento con idSession:" + payload.getIdSesion());
		return documento;
	}

	/**
	 *
	 */
	@Scheduled(cron = "${cronexpression.transmisioncontenido}", zone = "America/Mexico_City")
	public void tareaProgramadaReintentarTransmisionContenido() {

		List<TrazaServicios> trazaServiciosList = gatewayRediferidosJPA
				.consultarTrazaServiciosTransmisionContenidoPendiente();

		if (trazaServiciosList != null && !trazaServiciosList.isEmpty()) {

			for (TrazaServicios trazaServicios : trazaServiciosList) {

				try {
					LogTrazabilidadRequestParams logTrazabilidadRequestParams = gatewayRediferidosJPA
							.consultarDatosInformacionCredito(trazaServicios.getIdSession());

					if (logTrazabilidadRequestParams != null) {



						callSendLogTrazabilidad(new SendLogTrazabilidadGroupedParams(
								logTrazabilidadRequestParams.getInformacionCreditoActual(),
								logTrazabilidadRequestParams.getInformacionCreditoRediferido(),
								logTrazabilidadRequestParams.getProducto(), trazaServicios.getEstadoMantenimientoCartera(),
								logTrazabilidadRequestParams.getPayload(), trazaServicios.getIdTrazaServicio().toString(),
								logTrazabilidadRequestParams.getRescatame()), trazaServicios.getIdSession());

						// Actualizo el registro con estado de Servicio de Transmition de contenido
						// Exitoso (1)
						trazaServicios.setEstadoTransmisionContenido(
								ConstantesRediferidos.ESTADO_TRANSMISION_CONTENIDO_EXITOSO);

						gatewayRediferidosJPA.persistirTrazaServicios(trazaServicios,logTrazabilidadRequestParams.getPayload());
					}
				} catch (Exception e) {
					RediferidosLog.logErrorMessage(getClass(),
							"No fue posible consumir el API de Gestion Externa Documental " + e.getMessage(), e);
				}
			}
		}
	}

	/**
	 * 
	 * @param sendLogTrazabilidadGroupedParams
	 * @param idSesion
	 */
	private void callSendLogTrazabilidad(SendLogTrazabilidadGroupedParams sendLogTrazabilidadGroupedParams,
			String idSesion) {

		RediferidosLog.logInfoMessageCharacters(getClass(),
				"INICIO: UseCaseInfoCreditoRediferido.callSendLogTrazabilidad con Payload: "
						+ sendLogTrazabilidadGroupedParams.getPayload().toString());

		List<InformacionTransaccion> itList = gatewayRediferidosJPA.listInformacionTransaccion(idSesion);

		InformacionTransaccionAuth auth = gatewayRediferidosJPA.findInfoTransaccionAuthByIdSession(
				sendLogTrazabilidadGroupedParams.getPayload().getIdSesion(), ConstantesRediferidos.PAGE_AUTH,
				ConstantesRediferidos.PAGE_AUTH3SA);
		
		String fuctionalStep = sendLogTrazabilidadGroupedParams.getInformacionCreditoActual()
				.getInformacionTransaccion().getPasoFuncional();
		
		// Construyo el PDF - Log de trazabilidad en Oracle
		File pdfTrazabilidad = gatewayTrazabilidadUtil.generateLog(
				sendLogTrazabilidadGroupedParams.getInformacionCreditoActual(),
				sendLogTrazabilidadGroupedParams.getInformacionCreditoRediferido(),
				sendLogTrazabilidadGroupedParams.getProducto(),
				sendLogTrazabilidadGroupedParams.getRescatame(), itList,
				sendLogTrazabilidadGroupedParams.getEstadoMantenimientoCartera(), fuctionalStep,
				idSesion, auth);

		// Custodio el PDF - Log de trazabilidad en Oracle
		gatewayGestionInternaDocumentalRest.sendFile(pdfTrazabilidad, sendLogTrazabilidadGroupedParams.getPayload(),
				fuctionalStep, sendLogTrazabilidadGroupedParams.getIdTrazaServicios());

		RediferidosLog.logInfoMessageCharacters(getClass(),
				"FINALIZO: UseCaseInfoCreditoRediferido.callSendLogTrazabilidad con Payload: "
						+ sendLogTrazabilidadGroupedParams.getPayload().toString());

	}




}