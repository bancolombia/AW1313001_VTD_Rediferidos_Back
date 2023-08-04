package app.demo.domain.gateway.soap;

import app.demo.domain.InformacionCreditoActual;
import app.demo.domain.InformacionRediferido;
import app.demo.domain.security.Payload;

public interface GatewayInfoCreditoActual {

	public InformacionCreditoActual consultarInformacionCreditoActual(InformacionRediferido informacionRediferido,
			int sucursal, Payload payload, String pasoFuncional);
}
