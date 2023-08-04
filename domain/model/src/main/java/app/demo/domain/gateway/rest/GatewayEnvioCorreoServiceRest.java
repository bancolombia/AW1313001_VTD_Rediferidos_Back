package app.demo.domain.gateway.rest;

import app.demo.domain.sendmail.CartaBienvenidaMailDTO;

public interface GatewayEnvioCorreoServiceRest {

	boolean sendMail(CartaBienvenidaMailDTO mailDTO, String pasoFuncional, String idSesion);
}
