package app.demo.domain.exception;

import java.io.Serializable;
import java.util.List;

public class ListErrorResponseDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8859705958355594934L;
	private List<ResponseErroresV2DTO> data;

	public ListErrorResponseDTO() {
	}

	public List<ResponseErroresV2DTO> getData() {
		return data;
	}

	public void setData(List<ResponseErroresV2DTO> data) {
		this.data = data;
	}
}