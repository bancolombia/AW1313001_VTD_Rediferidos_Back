package app.demo.domain.exception;

/**
 * 
 * <b>IBM. Colombia.</b>
 *
 * <p>
 * Description:
 * </p>
 *
 * @author <A HREF="mailto:duvacano@co.ibm.com">Duban Cano</A>
 *
 * @version Aug 20, 2018
 */
public class ErrorAplicationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final ErrorRequestDTO errorRequestDTO;
	private final String idSesion;
	private final String pasoFuncional;

	/**
	 * Constructor encargado de enriquecer el objeto ErrorAplicationException
	 * 
	 * @param message message
	 * @param errorRequestDTO errorRequestDTO
	 * @param idSesion idSesion
	 * @param pasoFuncional pasoFuncional
	 */
	public ErrorAplicationException(String message, ErrorRequestDTO errorRequestDTO, String idSesion,
			String pasoFuncional) {
		super(message);
		this.errorRequestDTO = errorRequestDTO;
		this.idSesion = idSesion;
		this.pasoFuncional = pasoFuncional;
	}

	public ErrorRequestDTO getErrorRequestDTO() {
		return errorRequestDTO;
	}

	public String getIdSesion() {
		return idSesion;
	}

	public String getPasoFuncional() {
		return pasoFuncional;
	}
}