package app.demo.config;

import app.demo.domain.gateway.jpa.GatewayConnectorErrorServiceJPA;
import app.demo.domain.gateway.jpa.GatewayEncuestaJPA;
import app.demo.domain.gateway.jpa.GatewayRediferidosJPA;
import app.demo.domain.gateway.plantillasutil.GatewayPlantillasUtil;
import app.demo.domain.gateway.rest.GatewayConnectorErrorServiceRest;
import app.demo.domain.gateway.rest.GatewayEnvioCorreoServiceRest;
import app.demo.domain.gateway.rest.GatewayGestionInternaDocRest;
import app.demo.domain.gateway.rest.GatewayLoanDetailRest;
import app.demo.domain.gateway.soap.*;
import app.demo.domain.gateway.trazabilidadutil.GatewayTrazabilidadUtil;
import app.demo.usecase.UseCaseConnectorErrorService;
import app.demo.usecase.UseCaseEncuesta;
import app.demo.usecase.UseCaseInfoCreditoRediferido;
import app.demo.usecase.UseCaseSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

	@Bean
	public UseCaseInfoCreditoActual createUseCaseInfoCreditoActual(GatewayInfoCreditoActual gatewayInfoCreditoActual,
																   GatewayRediferidosJPA gatewayRediferidosJPA,
																   GatewayInformacionRediferido gatewayInformacionRediferido, GatewayPersona gatewayPersona,
																   GatewayLoanDetailRest gatewayLoanDetailRest,
																   GatewayBusinessOpportunities gatewayBusinessOpportunities) {
		return new UseCaseInfoCreditoActual(gatewayInfoCreditoActual, gatewayRediferidosJPA,
				gatewayInformacionRediferido, gatewayPersona, gatewayLoanDetailRest, gatewayBusinessOpportunities);
	}

	@Bean
	public UseCaseConnectorErrorService createUseCaseConnectorErrorService(
			GatewayConnectorErrorServiceRest gatewayConnectorErrorServiceRest,
			GatewayConnectorErrorServiceJPA gatewayConnectorErrorServiceJPA) {
		return new UseCaseConnectorErrorService(gatewayConnectorErrorServiceRest, gatewayConnectorErrorServiceJPA);
	}

	@Bean
	public UseCaseSession createUseCaseSession(GatewaySessionSOAP gatewaySessionSOAP, GatewayRediferidosJPA gatewayRediferidosJPA) {
		return new UseCaseSession(gatewaySessionSOAP, gatewayRediferidosJPA);
	}

	@Bean
	public UseCaseInfoCreditoRediferido createUseCaseInfoCreditoRediferido(GatewayRediferidosJPA gatewayRediferidosJPA,
			GatewayInformacionRediferido gatewayInformacionRediferido,
			GatewayInformacionCreditoRediferido gatewayInformacionCreditoRediferido,
			GatewayMantenimientoObligacionesCartera gatewayMantenimientoObligacionesCartera,
			GatewayPlantillasUtil gatewayPlantillasUtil,
			GatewayEnvioCorreoServiceRest gatewayEnvioCorreoServiceRest,
			GatewayTrazabilidadUtil gatewayTrazabilidadUtil,
			GatewayGestionInternaDocRest gatewayGestionInternaDocumental,
			GatewayInfoCreditoActual gatewayInfoCreditoActual,
			GatewayPersona gatewayPersona,
			UseCaseInfoCreditoActual useCaseInfoCreditoActual,
			GatewayBusinessOpportunities gatewayBusinessOpportunities) {
		return new UseCaseInfoCreditoRediferido(gatewayRediferidosJPA, gatewayInformacionRediferido,
				gatewayInformacionCreditoRediferido, gatewayMantenimientoObligacionesCartera,
				gatewayPlantillasUtil,
				gatewayEnvioCorreoServiceRest,
				gatewayTrazabilidadUtil,
                gatewayGestionInternaDocumental, gatewayInfoCreditoActual, gatewayPersona, useCaseInfoCreditoActual,
				gatewayBusinessOpportunities);
	}
	
	
	@Bean
	public UseCaseEncuesta createUseCaseEncuesta(GatewayEncuestaJPA gatewayEncuestaJPA) {
		return new UseCaseEncuesta(gatewayEncuestaJPA);
	}
}