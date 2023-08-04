package app.demo.usecase.exception;

import app.demo.domain.exception.ErrorAplicationException;
import app.demo.domain.exception.ErrorResponseDTO;
import app.demo.domain.exception.ExcepcionServicio;

public class ExcepcionWrapper {

	/**
	 * 
	 * @param exception
	 * @param errorResponseDTO
	 * @return ExcepcionServicio
	 */
	public ExcepcionServicio createExcepcionServicio(ErrorAplicationException exception,
			ErrorResponseDTO errorResponseDTO) {

		ExcepcionServicio excepcionServicio = new ExcepcionServicio();
		excepcionServicio.setCodigo(errorResponseDTO.getCodigoError());
		excepcionServicio.setDescripcion(exception.getMessage());
		excepcionServicio.setDetalle(exception.getMessage());
		return excepcionServicio;
	}
}