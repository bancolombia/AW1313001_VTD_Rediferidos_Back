package app.demo.domain.exception;

public class EncuestaException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5520172219950556589L;
	private String msg;

	public EncuestaException() {
		super();
	}

	public EncuestaException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
