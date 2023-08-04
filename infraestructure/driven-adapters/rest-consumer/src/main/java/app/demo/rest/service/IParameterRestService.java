package app.demo.rest.service;

import java.util.Map;

public interface IParameterRestService {

	Map<String, String> getParametersConnectorErrorService();

	Map<String, String> getParametersGestionInternaDocumental();

	Map<String, String> getParametersTransmisionContenido();

	Map<String, String> getParametersMailService();

	String getUrlAPIGestionInternaDocumental();

	Map<String, String> getParametersLoanDetails();

	Map<String, String> getParametersBusinessOpportunities();

}