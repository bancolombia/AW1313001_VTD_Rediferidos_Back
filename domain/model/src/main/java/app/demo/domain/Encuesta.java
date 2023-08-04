package app.demo.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Encuesta implements Serializable {

	private static final long serialVersionUID = 2278566480107601156L;

	private String idSesion;
	private Map<String, String> preguntas = new HashMap<>();

	/**
	 * Default Constructor
	 */
	public Encuesta() {
		super();
	}

	public String getIdSesion() {
		return idSesion;
	}

	public void setIdSesion(String idSesion) {
		this.idSesion = idSesion;
	}

	public Map<String, String> getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(Map<String, String> preguntas) {
		this.preguntas = preguntas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Encuesta [idSesion=" + idSesion + ", preguntas=" + preguntas + "]";
	}
}