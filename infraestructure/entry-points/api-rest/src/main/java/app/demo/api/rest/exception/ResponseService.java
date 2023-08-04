package app.demo.api.rest.exception;

import java.io.Serializable;

/**
* Response of the Rest Service  <br>
* Creation Info:
* date 09/03/2018
* @author Edwin Gómez
**/
public class ResponseService implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 4809677345280267280L;
	private String status;
	private Object output;
	private String detail;

	public ResponseService() {
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Object getOutput() {
		return output;
	}

	public void setOutput(Object output) {
		this.output = output;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

}
