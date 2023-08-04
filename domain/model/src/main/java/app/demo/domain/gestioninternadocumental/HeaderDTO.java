package app.demo.domain.gestioninternadocumental;

import app.demo.domain.gestioninternadocumental.transmitFile.transmitfilerequest.Propiedad;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class HeaderDTO implements Serializable {

	private static final long serialVersionUID = 5007576446290656239L;
	private String idSesion;
	private String username;
	private List<Propiedad> configuration = new ArrayList<Propiedad>();

	public HeaderDTO() {
	}

	public HeaderDTO(String idSesion, String username, List<Propiedad> configuration) {
		this.idSesion = idSesion;
		this.username = username;
		this.configuration = configuration;
	}


	public String getIdSesion() {
		return idSesion;
	}


	public void setIdSesion(String idSesion) {
		this.idSesion = idSesion;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public List<Propiedad> getConfiguration() {
		return configuration;
	}


	public void setConfiguration(List<Propiedad> configuration) {
		this.configuration = configuration;
	}

	@Override
	public String toString() {
		return "HeaderDTO{" +
				"idSesion='" + idSesion + '\'' +
				", username='" + username + '\'' +
				", configuration=" + configuration +
				'}';
	}
}
