package app.demo.domain.gateway.rest;

import app.demo.domain.security.Payload;

import java.io.File;

public interface GatewayGestionInternaDocRest {

     void sendFile(File pdfTrazabilidad, Payload payload, String stepAceptaCambioCuotas, String string);

}
