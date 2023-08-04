package app.demo.domain.gateway.soap;

public interface GatewaySessionSOAP {
	
	public void validateSesion(String idSesion, String ipcliente, String tokenUsuario, String actualPage, String documentType, String documentNumber);
	
	public void cerrarSesion(String idSesion, String ipcliente, String tokenUsuario, String actualPage, String documentType, String documentNumber);
}
