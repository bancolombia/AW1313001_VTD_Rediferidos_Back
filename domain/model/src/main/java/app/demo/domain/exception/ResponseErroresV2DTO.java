package app.demo.domain.exception;

import java.io.Serializable;
import java.util.List;

public class ResponseErroresV2DTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4160904563737691293L;
	private Header header;
	private List<ErrorResponseDTO> mensajeError;

	public ResponseErroresV2DTO() {
		super();
	}

	public ResponseErroresV2DTO(Header header, List<ErrorResponseDTO> mensajeError) {
		super();
		this.header = header;
		this.mensajeError = mensajeError;
	}

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public List<ErrorResponseDTO> getMensajeError() {
		return mensajeError;
	}

	public void setMensajeError(List<ErrorResponseDTO> mensajeError) {
		this.mensajeError = mensajeError;
	}
}