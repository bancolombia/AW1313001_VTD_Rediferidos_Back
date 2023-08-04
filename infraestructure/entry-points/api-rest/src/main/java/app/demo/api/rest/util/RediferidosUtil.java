package app.demo.api.rest.util;

import app.demo.domain.constantes.ConstantesRediferidos;
import app.demo.domain.exception.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.Base64.Decoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RediferidosUtil {

	private static final String METODO_ENCRIPTACION = "AES";
	private RediferidosUtil() {}

	public static boolean isNullorEmpty(String str) {
		return null == str || "".equals(str);
	}

	// Function to validate the IPs address.
	public static boolean isValidIPAddress(String ipclient)
	{
		if(isNullorEmpty(ipclient) || "(null)".equalsIgnoreCase(ipclient))
			return false;

		String ip = ipclient.contains(",") ? ipclient.split(",")[0] : ipclient;

		// If the IP address is empty
		// return false

		// Regex for digit from 0 to 255.
		String zeroTo255
				= "(\\d{1,2}|(0|1)\\"
				+ "d{2}|2[0-4]\\d|25[0-5])";

		// Regex for a digit from 0 to 255 and
		// followed by a dot, repeat 4 times.
		// this is the regex to validate an IP address.
		String regex
				= zeroTo255 + "\\."
				+ zeroTo255 + "\\."
				+ zeroTo255 + "\\."
				+ zeroTo255;

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);




		// Pattern class contains matcher() method
		// to find matching between given IP address
		// and regular expression.
		Matcher m = p.matcher(ip);

		// Return if the IP address
		// matched the ReGex
		return m.matches();
	}


	public static ErrorResponse defaultErrorResponse() {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setStatusCode("DEFAULT-LB");
		errorResponse.setStatusDesc(
				"�Espera! Tenemos inconvenientes con el sistema, pero estamos trabajando para darte una solucion. "
						+ "Podras realizar el proceso mas tarde. Gracias.");
		return errorResponse;

	}
	
	public static ErrorResponseDTO defaultErrorResponseDTO() {
		ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO();
		List<MensajeFuncionalDTO> mensajeFuncional = new ArrayList<>();
		MensajeFuncionalDTO mensajeFuncionalDefault = new MensajeFuncionalDTO("DEFAULT-LB",
				"Espera. Tenemos inconvenientes con el sistema pero estamos "
						+ "trabajando para darte una solucion. Podrias realizar el proceso mas tarde, Gracias.");
		mensajeFuncional.add(mensajeFuncionalDefault);
		errorResponseDTO.setServicio("ServicioDefault");
		errorResponseDTO.setOperacion("OperacionDefault");
		errorResponseDTO.setTipoExcepcion("failover");
		errorResponseDTO.setCodigoError("100");
		errorResponseDTO.setDescripcionTecnica("100 Error por defecto mientras se definen el resto de excepciones.");
		errorResponseDTO.setMensajeFuncional(mensajeFuncional);
		return errorResponseDTO;
	}
	
	public static Map<String, String> readJsonFile(String path) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(new File(path), new TypeReference<Map<String, String>>() {
		});
	}
	
	
	/**
	 * 
	 * <b>IBM. Colombia.</b>
	 *
	 * <p>
	 * Description: Method that return sub Map from parameters map based on list
	 * parameters
	 * </p>
	 *
	 * @author <A HREF="mailto:duvacano@co.ibm.com">Duban Cano</A>
	 *
	 * @param listParameters
	 * @param parameters
	 * @return Map<String, String>
	 */
	public static Map<String, String> map(List<String> listParameters, Map<String, String> parameters) {
		Map<String, String> map = new HashMap<>();
		for (String key : listParameters) {
			String strValue = parameters.get(key);
			if (isNullorEmpty(strValue)) {
				RediferidosLog.logErrorMessage(RediferidosUtil.class, "No se encontro propiedad:::" + key, null);
			} else {
				map.put(key, strValue);
			}
		}
		return map;
	}
	
	/**
	 * 
	 * @param request
	 * @param cookieName
	 * @return
	 */
	public static String getCookie(HttpServletRequest request, String cookieName) {
		Enumeration<String> headers = request.getHeaders("cookie");
        String cookieValue = null;
        if (headers != null) {
            String headerCookies = headers.nextElement();
            String[] cookies = headerCookies.split(";");
            for (String cookie : cookies) {
            	if (cookie != null && cookie.split("=").length == 2) {
            		if (cookieName.equals(cookie.split("=")[0].trim())) {
            			cookieValue = cookie.split("=")[1].trim();
            			break;
            		}
            	}
            }
        }
        return cookieValue;
	}
	
	/**
     * Metodo para decodificar datos sensibles del cliente
     *
     * @param encryptedString datos encriptados
     * @param phrase          llave desencripcion
     * @return dato desencriptado
     */
	public static String decode(String encryptedString, String phrase) {
		 String decrypted = "";
		try {
			Decoder decoder = Base64.getDecoder();
			Key aesKey = new SecretKeySpec(phrase.getBytes(), METODO_ENCRIPTACION);
			Cipher cipher = Cipher.getInstance(METODO_ENCRIPTACION);
			cipher.init(2, aesKey);
			decrypted = new String(cipher.doFinal(decoder.decode(encryptedString)));
		} catch (IllegalBlockSizeException | NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | BadPaddingException e) {
			RediferidosLog.logErrorMessage(RediferidosUtil.class, "Error decodificando datos del usuario:::" + e.getMessage(), null);
			throw new ErrorAplicationException("Error decodificando datos del usuario. ",
					new ErrorRequestDTO(ConstantesRediferidos.ID_APP_REDIFERIDOS,
							CodigosRespuestaSecurity.ERROR_DECODE_UTIL.getCodigo()),
					null, null);
		}
		return decrypted;
	}
}
