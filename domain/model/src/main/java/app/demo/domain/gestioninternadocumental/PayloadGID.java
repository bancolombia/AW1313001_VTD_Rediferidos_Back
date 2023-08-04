package app.demo.domain.gestioninternadocumental;

import java.io.Serializable;


public class PayloadGID implements Serializable {

	private static final long serialVersionUID = -4469722775926353300L;
	private TransmitirDocumentoDTO transmitirDocumento;

	public PayloadGID() {
		transmitirDocumento = new TransmitirDocumentoDTO();
	}

	public PayloadGID(TransmitirDocumentoDTO transmitirDocumento) {
		this.transmitirDocumento = transmitirDocumento;
	}


	public TransmitirDocumentoDTO getTransmitirDocumento() {
		return transmitirDocumento;
	}


	public void setTransmitirDocumento(TransmitirDocumentoDTO transmitirDocumento) {
		this.transmitirDocumento = transmitirDocumento;
	}

	@Override
	public String toString() {
		return "PayloadGID{" +
				"transmitirDocumento=" + transmitirDocumento +
				'}';
	}
}
