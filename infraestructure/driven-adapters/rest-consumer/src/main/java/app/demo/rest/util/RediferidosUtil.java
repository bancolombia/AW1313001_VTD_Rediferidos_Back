package app.demo.rest.util;

import app.demo.domain.Parametro;
import app.demo.domain.exception.ErrorResponse;
import app.demo.domain.exception.ErrorResponseDTO;
import app.demo.domain.exception.MensajeFuncionalDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class RediferidosUtil {

	private RediferidosUtil() {}

	public static boolean isNullorEmpty(String str) {
		return null == str || "".equals(str);
	}
	
	public static ErrorResponse defaultErrorResponse() {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setStatusCode("DEFAULT-LB");
		errorResponse.setStatusDesc(
				"�Espera! Tenemos inconvenientes con el sistema, pero estamos trabajando para darte una solucion. "
						+ "Podras realizar el proceso mas tarde. Gracias.");
		return errorResponse;

	}

	public  static Boolean FileNullOrEmpy(File file) {

		Boolean inValid = false;
		String fileTemporal = file.toString();

		if(file != null || isNullorEmpty(fileTemporal)){
			inValid = true;
		}

		return inValid;
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
	 * @param account
	 * @return
	 */
	public static String maskAccount(String account) {
		account = account.trim();
		String numerosAEnmascarar = account.substring(account.length() - 4, account.length());
		return "*******" + numerosAEnmascarar;
	}

	/**
	 * Funcion que convierte un archivo tipo File a un String Base 64
	 * @param file archivo a convertir
	 * @return archivo en Base64
	 */
	public static String fileToB64String(File file) {
		byte[] encoded;
		try {
			encoded = Base64.getEncoder().encode(Files.readAllBytes(file.toPath()));
			return new String(encoded, StandardCharsets.US_ASCII);
		} catch (IOException e) {
			RediferidosLog.logErrorMessage(RediferidosUtil.class, "Error fileToB64String: " 
					+ e.getMessage(), e);
			return null;
		}
	}

	/**
	 * Retorna el contenido de un archivo
	 * @param fileName ruta del archivo
	 * @return contenido
	 */
	public static String getFileContent(String fileName) {
		String content = "";
		try {
			content = new String(Files.readAllBytes(Paths.get(fileName)));
		} catch (IOException e) {
			RediferidosLog.logErrorMessage(RediferidosLog.class, e.getMessage());
		}
		return content;
	}

	/**
	 *
	 * @param parameterList
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static HttpEntity<List> configureHttpEntity(List<Parametro> parameterList) {
		HttpHeaders headers = configureHttpHeaders();
		return new HttpEntity<>(parameterList, headers);
	}


	/**
	 *
	 * @return
	 */
	public static HttpHeaders configureHttpHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.setContentType(MediaType.APPLICATION_JSON);
		return headers;
	}

}
