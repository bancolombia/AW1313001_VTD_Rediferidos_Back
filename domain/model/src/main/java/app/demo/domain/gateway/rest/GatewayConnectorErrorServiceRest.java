package app.demo.domain.gateway.rest;

import app.demo.domain.exception.ErrorRequestDTO;
import app.demo.domain.exception.ErrorResponseDTO;

public interface GatewayConnectorErrorServiceRest {

	ErrorResponseDTO errorService(ErrorRequestDTO errorRequestDTO, String pasoFuncional, String idSession);
}