package app.demo.api.rest.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Map;
import java.util.logging.Logger;

public class CargadorPropiedades {
	private static final Logger logger = Logger.getLogger(CargadorPropiedades.class.getName());
	private static CargadorPropiedades instance;
	private Map<String, String> propiedades;
	private Map<String, String> propiedadesSeguridad;

	public Map<String, String> getPropiedades() {
		return propiedades;
	}

	public void setPropiedades(Map<String, String> propiedades) {
		this.propiedades = propiedades;
	}

	public Map<String, String> getPropiedadesSeguridad() {
		return propiedadesSeguridad;
	}

	public void setPropiedadesSeguridad(Map<String, String> propiedadesSeguridad) {
		this.propiedadesSeguridad = propiedadesSeguridad;
	}
	
	public static Map<String, String> readJsonFile(String path) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(new File(path), new TypeReference<Map<String, String>>() {
		});
	}

	public static CargadorPropiedades getInstance() {
		if (instance == null) {
			instance = new CargadorPropiedades(LogUtil.rutaVariables());
		}
		return instance;
	}

	private CargadorPropiedades(String path) {

			propiedades = readJsonFile(path);
			propiedadesSeguridad=readJsonFile(LogUtil.rutaVariablesSeguridad());

	}

	public String getValue(String key) {
		return propiedades.get(key);
	}

	public boolean containsKey(String key) {
		return propiedades.containsKey(key);
	}

	public String getValueSeguridad(String key) {
		return propiedadesSeguridad.get(key);
	}

	public boolean containsKeySeguridad(String key) {
		return propiedadesSeguridad.containsKey(key);
	}

}
