package app.demo.domain.gestioninternadocumental;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "message")
public class MessageDTO implements Serializable {
	
	private static final long serialVersionUID = 5377304009164941349L;
	private HeaderDTO header;
	private PayloadGID payload;
	
	public MessageDTO() {
	}
	
	public MessageDTO(HeaderDTO header, PayloadGID payload) {
		this.header = header;
		this.payload = payload;
	}

	public HeaderDTO getHeader() {
		return header;
	}



	public void setHeader(HeaderDTO header) {
		this.header = header;
	}

	public PayloadGID getPayload() {
		return payload;
	}


	public void setPayload(PayloadGID payload) {
		this.payload = payload;
	}

	@Override
	public String toString() {
		return "MessageDTO{" +
				"header=" + header +
				", payload=" + payload +
				'}';
	}
}
