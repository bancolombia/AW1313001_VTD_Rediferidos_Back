package app.demo.usecase.factory;

import app.demo.domain.exception.ErrorResponse;
import app.demo.domain.exception.ErrorResponseDTO;

public class ErrorResponseFactory {

	/**
	 * 
	 * @param errorResponseDTO
	 * @return ErrorResponse
	 */
	public ErrorResponse create(ErrorResponseDTO errorResponseDTO) {
		ErrorResponse errorResponse = new ErrorResponse();
		return errorResponse;
	}
}