package app.demo.usecase.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.Serializable;

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

	/**
	 * 
	 * @param thisClass
	 * @param srcErrorMessage
	 */
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

		Exception exception;
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
				}
		logger.info(message);
	}
}