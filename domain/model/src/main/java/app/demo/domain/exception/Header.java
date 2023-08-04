package app.demo.domain.exception;

import java.io.Serializable;

public class Header implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1568369537395533993L;
	private String id;
	private String type;

	public Header() {
		super();
	}

	public Header(String id, String type) {
		super();
		this.id = id;
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}