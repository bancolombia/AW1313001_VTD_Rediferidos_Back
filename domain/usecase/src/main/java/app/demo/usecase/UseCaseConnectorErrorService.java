package app.demo.usecase;

import app.demo.domain.exception.ErrorRequestDTO;
import app.demo.domain.exception.ErrorResponseDTO;
import app.demo.domain.exception.ExcepcionServicio;
import app.demo.domain.gateway.jpa.GatewayConnectorErrorServiceJPA;
import app.demo.domain.gateway.rest.GatewayConnectorErrorServiceRest;

public class UseCaseConnectorErrorService {

	private GatewayConnectorErrorServiceRest gatewayConnectorErrorServiceRest;
	private GatewayConnectorErrorServiceJPA gatewayConnectorErrorServiceJPA;

	/**
	 * Constructor que inyecta los gateWay
	 * 
	 * @param gatewayConnectorErrorServiceRest
	 * @param gatewayConnectorErrorServiceJPA
	 */
	public UseCaseConnectorErrorService(GatewayConnectorErrorServiceRest gatewayConnectorErrorServiceRest,
			GatewayConnectorErrorServiceJPA gatewayConnectorErrorServiceJPA) {
		this.gatewayConnectorErrorServiceRest = gatewayConnectorErrorServiceRest;
		this.gatewayConnectorErrorServiceJPA = gatewayConnectorErrorServiceJPA;
	}
	
	// Rest Service
	public ErrorResponseDTO errorService(ErrorRequestDTO errorRequestDTO,
			String pasoFuncional, String idSession) throws Exception {
		return gatewayConnectorErrorServiceRest.errorService(errorRequestDTO, pasoFuncional, idSession);
	}

	// Jpa
	public void persistirExcepcionRediferidos(String idSesion, ExcepcionServicio excepcionServicio,
			boolean isPreviewEncripted, String pasoFuncional) {
		gatewayConnectorErrorServiceJPA.persistirExcepcionRediferidos(idSesion, excepcionServicio,
				isPreviewEncripted, pasoFuncional);
	}
}