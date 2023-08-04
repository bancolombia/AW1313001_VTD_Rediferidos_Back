package app.demo.usecase;

import app.demo.domain.InformacionTransaccionAuth;
import app.demo.domain.gateway.jpa.GatewayRediferidosJPA;
import app.demo.domain.gateway.soap.GatewaySessionSOAP;
import app.demo.domain.security.Payload;

public class UseCaseSession {

	private GatewaySessionSOAP gatewaySessionSOAP;
	private GatewayRediferidosJPA gatewayRediferidosJPA;
	
	/**
	 * Constructor encargado de la inyeccion de dependencias
	 * @param gatewaySessionSOAP
	 * @param gatewayRediferidosJPA
	 */
	public UseCaseSession(GatewaySessionSOAP gatewaySessionSOAP, GatewayRediferidosJPA gatewayRediferidosJPA) {
		this.gatewaySessionSOAP = gatewaySessionSOAP;
		this.gatewayRediferidosJPA = gatewayRediferidosJPA;
	}
	
	
	/**
	 * 
	 * @param idSesion
	 * @param ipcliente
	 * @param tokenUsuario
	 * @param actualPage
	 */
	public void validateSesion(String idSesion, String ipcliente, String tokenUsuario,
							   String actualPage, String documentType, String documentNumber) {
		gatewaySessionSOAP.validateSesion(idSesion, ipcliente, tokenUsuario, actualPage, documentType, documentNumber);
	}

	/**
	 * 
	 * @param idSesion
	 * @param pageAuth
	 * @param pageAuth3sa
	 * @return
	 */
	public InformacionTransaccionAuth findInfoTransaccionAuthByIdSession(String idSesion, String pageAuth,
			String pageAuth3sa) {
		return gatewayRediferidosJPA.findInfoTransaccionAuthByIdSession(idSesion, pageAuth, pageAuth3sa);
	}
	
	
	/**
	 * 
	 * @param payload
	 * @param tokenUsuario
	 * @param actualPage
	 */
	public void cerrarSesion(Payload payload, String tokenUsuario, String actualPage) {
		gatewaySessionSOAP.cerrarSesion(payload.getIdSesion(),
				payload.getIpCliente(),
				tokenUsuario,
				actualPage,
				payload.getTipoIdentificacion(),
				payload.getNumeroIdentificacion());
	}
}