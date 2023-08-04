package app.demo.rest.sendmail;

import app.demo.domain.constantes.ConstantesRediferidos;
import app.demo.domain.exception.ErrorAplicationException;
import app.demo.domain.exception.ErrorRequestDTO;
import app.demo.domain.gateway.plantillasutil.GatewayPlantillasUtil;
import app.demo.domain.sendmail.CartaBienvenidaPdfDTO;
import app.demo.domain.sendmail.RespuestaServicioPlantillasUtil;
import app.demo.rest.util.PlantillasUtil;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.Map;

@Component
public class PlantillasUtilService implements GatewayPlantillasUtil {

	//003
	/**
	 * 
	 */
	@Override
	public File obtenerCartaBienvenida(CartaBienvenidaPdfDTO pdfDto, Map<String, String> parametrosConfiguraciones, 
			String pasoFuncional, String idSesion) {

		try {

			
			File cartaBienvenida = null;

			RespuestaServicioPlantillasUtil respuestaServicioPlantillasUtil = null;

			PlantillasUtil plantillasUtil = new PlantillasUtil(pdfDto.getListParameters(), parametrosConfiguraciones);

			plantillasUtil.createFile();

			respuestaServicioPlantillasUtil = plantillasUtil.getRespuestaServicioPlantillasUtil();

			if (respuestaServicioPlantillasUtil.getEstadoRespuesta()) {
				respuestaServicioPlantillasUtil.setObjetoRespuesta(plantillasUtil.getFilePdf());
			}

			if (respuestaServicioPlantillasUtil.getEstadoRespuesta()) {
				cartaBienvenida = (File) respuestaServicioPlantillasUtil.getObjetoRespuesta();

			}

			return cartaBienvenida;
		} catch (Exception e) {
			RediferidosLog.logErrorMessage(getClass(), e.getMessage(), e);
			throw new ErrorAplicationException("calling PlantillasUtilService.obtenerCartaBienvenida",
					new ErrorRequestDTO(ConstantesRediferidos.ID_APP_REDIFERIDOS,
							ConstantesRediferidos.ID_APP_REDIFERIDOS + "-PLANTILLASUTIL01"),
					idSesion, pasoFuncional);
		}
	}
}