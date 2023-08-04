package app.demo.domain.gateway.soap;

import app.demo.domain.InformacionCreditoRediferido;
import app.demo.domain.security.Payload;

public interface GatewayInformacionCreditoRediferido {
	
	public InformacionCreditoRediferido reconsultarInfoCreditoRediferidoPantallaResumen(String tipoIdentificacion,
			String numeroIdentificacion, Long plazoSeleccionado, Payload payload, String pasoFuncional);

}