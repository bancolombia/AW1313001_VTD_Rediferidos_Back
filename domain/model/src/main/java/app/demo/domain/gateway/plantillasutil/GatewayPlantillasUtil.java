package app.demo.domain.gateway.plantillasutil;

import app.demo.domain.sendmail.CartaBienvenidaPdfDTO;

import java.io.File;
import java.util.Map;

public interface GatewayPlantillasUtil {
//004
	File obtenerCartaBienvenida(CartaBienvenidaPdfDTO pdfDto, Map<String, String> parametrosConfiguraciones, String pasoFuncional,
			String idSesion);
}
