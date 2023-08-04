package app.demo.domain.gateway.soap;

import app.demo.domain.InformacionRediferido;
import app.demo.domain.security.Payload;

public interface GatewayInformacionRediferido {

	InformacionRediferido consultarInformacionRediferido(String tipoDocumento, String numeroDocumento, Payload payload, String pasoFuncional);

	InformacionRediferido registrarVenta(String tipoDocumento, String numeroDocumento, Long numeroPrestamo,
			Long numeroRedescuento, String estado, Payload payload) throws Exception;
}
