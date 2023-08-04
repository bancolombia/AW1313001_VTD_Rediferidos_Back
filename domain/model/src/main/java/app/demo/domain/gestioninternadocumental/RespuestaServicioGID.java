package app.demo.domain.gestioninternadocumental;

import java.util.HashMap;
import java.util.Map;


public class RespuestaServicioGID {

	private String status;
	private Map<String, String> transmitirDocumentoResponse = new HashMap<String, String>();
	
	public RespuestaServicioGID() {
	}
	
	public RespuestaServicioGID(String status, Map<String, String> transmitirDocumentoResponse) {
		this.status = status;
		this.transmitirDocumentoResponse = transmitirDocumentoResponse;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Map<String, String> getTransmitirDocumentoResponse() {
		return transmitirDocumentoResponse;
	}


	public void setTransmitirDocumentoResponse(Map<String, String> transmitirDocumentoResponse) {
		this.transmitirDocumentoResponse = transmitirDocumentoResponse;
	}
	
	
}
