package app.demo.domain.exception;

import java.io.Serializable;
import java.util.List;

public class RequestErroresV2DTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 592476480056601800L;
	/**
	 * 
	 */

	private List<ErrorRequestDTO> data;

	public RequestErroresV2DTO() {
		super();
	}

	public RequestErroresV2DTO(List<ErrorRequestDTO> data) {
		super();
		this.data = data;
	}

	public List<ErrorRequestDTO> getData() {
		return data;
	}

	public void setData(List<ErrorRequestDTO> data) {
		this.data = data;
	}
}