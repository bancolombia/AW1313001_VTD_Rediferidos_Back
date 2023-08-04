package app.demo.domain.gateway.rest;

import app.demo.domain.opportunitiesmanagement.ManagementData;
import app.demo.domain.opportunitiesmanagement.ResponseOpportunitiesManagement;

public interface GatewayOpportunitiesManagementRest {

    ResponseOpportunitiesManagement opportunitiesManagement(ManagementData managementData);
}
