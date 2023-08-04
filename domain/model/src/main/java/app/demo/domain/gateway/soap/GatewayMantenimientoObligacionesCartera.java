package app.demo.domain.gateway.soap;


import app.demo.domain.MantenimientoObligacionesCarteraRespuesta;
import app.demo.domain.security.Payload;

public interface GatewayMantenimientoObligacionesCartera {

	public MantenimientoObligacionesCarteraRespuesta actualizarDatosObligacionCartera(Long codigoTransaccion, Long codigoRastreo, Long numeroPrestamo,
			Long numeroParticipacion, String idNovedad, Long fechaAplicacionYYYYMMDD, Long duracionPlazo,
			Payload payload) throws Exception;
}