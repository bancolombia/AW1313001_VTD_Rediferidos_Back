package app.demo.api.rest.service;

import java.util.Map;


/**
 * Descripcion: Interfaz de la clase de Parameters
 * @author 1724147
 *
 */
public interface IParameterControllerService {

	public Map<String, String> getParametersSecurityPrhase();
	
	public Map<String, String> getParametersIdProduct();

	public Map<String, String> getParametersFunctionalStep();
	
	public Map<String, String> getParametersPathJWT();

	Map<String, String> getParameters();
}