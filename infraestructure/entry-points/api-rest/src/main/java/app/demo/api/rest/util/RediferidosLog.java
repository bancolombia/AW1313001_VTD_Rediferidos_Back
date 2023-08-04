package app.demo.api.rest.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.Enumeration;

/**
 * Clase centralizada para manejo de logs <b>IBM. Global Bussiness Services GBS
 * Colombia.</b>
 * 
 * @author juancard - Juan Carlos Cardona - IBM
 * @since 16/6/2017
 */
public class RediferidosLog implements Serializable {

	/** serialVersionUID **/
	private static final long serialVersionUID = 8508423458440566372L;

	/**
	 * Method que permite la escritura de errores en el log.
	 *
	 * @param thisClass    Clase en la que se genera el error.
	 * @param errorMessage Mensaje de error.
	 * @param exception    Excepción.
	 */
	private static final Logger logger = LogManager.getLogger(RediferidosLog.class);

	private static final String INICIANDO = "Iniciando metodo: ";
	private static final String FINALIZANDO = "Finalizando metodo: ";

	public static void logErrorMessage(final Class<?> thisClass, final String srcErrorMessage) {
		logErrorMessage(thisClass, srcErrorMessage, null);
	}

	/**
	 * Log Error
	 * 
	 * @param thisClass
	 * @param srcErrorMessage
	 * @param srcException
	 */
	public static void logErrorMessage(final Class<?> thisClass, final String srcErrorMessage,
			final Throwable srcException) {

		String errorMessage = "Error en [" + thisClass.getCanonicalName() + "]";
		if (srcErrorMessage != null) {
			errorMessage = errorMessage + " " + srcErrorMessage;
		}
		Exception exception;
		if (srcException == null) {
			logger.error(errorMessage);
			exception = new Exception(errorMessage);
		} else {
			exception = new Exception(errorMessage, srcException);
			logger.error(errorMessage, exception);
		}
	}

	/**
	 * Method que permite ingresar un mensaje informativo al log.
	 *
	 * @param thisClass   Clase en la que se genera el error.
	 * @param infoMessage Mensaje.
	 */
	public static void logInfoMessage(final Class<?> thisClass, final String infoMessage) {
		String message = "INFO en [" + thisClass.getCanonicalName() + "]";
		if (infoMessage != null) {
			message = message + " " + infoMessage;
		}
		logger.info(message);
	}

	/**
	 * Method que permite ingresar un mensaje informativo al log.
	 *
	 * @param thisClass   Clase en la que se genera el error.
	 * @param infoMessage Mensaje.
	 */
	public static void debugInfoMessage(final Class<?> thisClass, final String infoMessage) {
		String message = "DEBUG en [" + thisClass.getCanonicalName() + "]";
		if (infoMessage != null) {
			message = message + " " + infoMessage;
		}
		logger.info(message);
	}

	/**
	 * Method que permite ingresar un mensaje informativo al log.
	 *
	 * @param thisClass   Clase en la que se genera el error.
	 * @param infoMessage Mensaje.
	 */
	public static void logInfoMessageCharacters(final Class<?> thisClass, final String infoMessage) {
		String message = "INFO en [" + thisClass.getCanonicalName() + "]";
		if (infoMessage != null) {
			message = message + "\n\n################## " + infoMessage + " ####################\n\n";
		}
		logger.info(message);
	}

	/**
	 * Metodo que permite ingresar un mensaje informativo al log.
	 * 
	 * @param thisClass   Clase en la que se genera el error.
	 * @param infoMessage Mensaje.
	 * @param items       Objeto a imprimir en texto.
	 */
	public static void logInfoMessageCharactersWithObject(final Class<?> thisClass, final String infoMessage,
			final Object items) {
		String message = "DEBUG en [" + thisClass.getCanonicalName() + "]";
		if (infoMessage != null) {
			message = message + "\n\n################## " + infoMessage + "\n";
		}
		if (items != null) {
			try {
				ObjectMapper mapper = new ObjectMapper();
				String itemsString = mapper.writeValueAsString(items);
				message = message + "################## " + itemsString + " ####################\n\n";
			} catch (Exception e) {
				logger.error(e.getMessage());
			}
		}
		logger.info(message);
	}

	/**
	 * Method que permite ingresar un mensaje informativo al log.
	 *
	 * @param thisClass   Clase en la que se genera el error.
	 * @param iniciando   Bandera para verificar si se esta iniciando o finalizando
	 *                    el metodo.
	 * @param infoMessage Objeto a imprimir en texto.
	 */
	public static void logInfoMessageCharactersInit(final Class<?> thisClass, String infoMessage,
			final boolean iniciando) {
		String message = "INFO en [" + thisClass.getCanonicalName() + "]";

		if (infoMessage != null) {
			infoMessage = iniciando ? INICIANDO + infoMessage : FINALIZANDO + infoMessage;
			message = message + "\n\n################## " + infoMessage + " ####################\n\n";
		}

		logger.info(message);
	}

	/**
	 * Method que permite ingresar un mensaje informativo al log.
	 *
	 * @param thisClass   Clase en la que se genera el error.
	 * @param infoMessage Mensaje en texto para denotar el request.
	 * @param request     Objeto a imprimir en texto.
	 */
	public static void logInfoMessageCharactersRequest(final Class<?> thisClass, String infoMessage,
			final HttpServletRequest request) {
		String message = "INFO en [" + thisClass.getCanonicalName() + "]" + infoMessage;

		Enumeration<String> headerNames = request.getHeaderNames();
		if (headerNames != null) {
			while (headerNames.hasMoreElements()) {
				message = message + "\nHeader: " + request.getHeader(headerNames.nextElement());
			}

			logger.debug(message);
		}
	}
}