package app.demo.domain.gateway.soap;

import app.demo.domain.InformacionRediferido;
import app.demo.domain.UseCaseGroupedParams;
import app.demo.domain.security.Payload;

public interface GatewayBusinessOpportunities {
	InformacionRediferido fillInfoRediferidoByBusinessOpportunities(Payload payload);
	boolean gestionRediferidoByBusinessOpportunities(UseCaseGroupedParams groupedParams, Long stateCode, Long subStateCode);
}
