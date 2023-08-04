package app.demo.domain.gateway.rest;

import app.demo.domain.opportunitiesinquiry.OpportunitiesInquiryData;
import app.demo.domain.opportunitiesinquiry.ResponseOpportunitiesInquiry;

public interface GatewayOpportunitiesInquiryRest {
    ResponseOpportunitiesInquiry opportunitiesInquiry(OpportunitiesInquiryData opportunitiesInquiryData);
}
