package app.demo.usecase.exception;

import app.demo.domain.exception.ErrorAplicationException;
import app.demo.domain.exception.ErrorResponse;
import app.demo.domain.exception.ErrorResponseDTO;
import app.demo.usecase.UseCaseConnectorErrorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorAplicationAdvice {
	
	private UseCaseConnectorErrorService usecaseConnectorErrorService;
	
	/**
	 * Constructor para inyectar dependencia
	 * 
	 * @param usecaseConnectorErrorService
	 */
	public ErrorAplicationAdvice(UseCaseConnectorErrorService usecaseConnectorErrorService) {
		this.usecaseConnectorErrorService = usecaseConnectorErrorService;
	}
	
	/**
	 * 
	 * @param exception
	 * @return
	 */
    @ExceptionHandler({ErrorAplicationException.class})
    public ResponseEntity<ErrorResponse> handleErrorAplicationException(ErrorAplicationException exception){
    	
		ErrorResponse errorResponse = null;
		ErrorResponseDTO errorResponseDTO = null;



        return error(HttpStatus.INTERNAL_SERVER_ERROR, errorResponse);
    }
    
    /**
     * 
     * @param status
     * @param errorResponse
     * @return
     */
    private ResponseEntity<ErrorResponse> error(HttpStatus status, ErrorResponse errorResponse) {
        return ResponseEntity.status(status).body(errorResponse);
    }
}
