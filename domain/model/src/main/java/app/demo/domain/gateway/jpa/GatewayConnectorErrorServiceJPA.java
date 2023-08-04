package app.demo.domain.gateway.jpa;

import app.demo.domain.exception.ExcepcionServicio;

public interface GatewayConnectorErrorServiceJPA {

	public void persistirExcepcionRediferidos(String idSesion, ExcepcionServicio excepcionServicio,
			boolean isPreviewEncripted, String pasoFuncional);
	
}
