package app.demo.domain.opportunitiesmanagement;

import java.util.ArrayList;

public class ManagementGralInfo {
    private String opportunityId;
    private Long stateCode;
    private Long subStateCode;
    private String salesCodeUser;
    private String visitDate;
    private Long contactTypeCode;
    private Long contactPurposeCode;
    private Long businessValue;
    private Long currencyCode;
    private String nextContactDate;
    private Long preapprovedChangeFlag;
    private Long globalQuoteFlag;
    private ArrayList<ManagementPreapprovedDistribution> preapprovedDistribution;
    private String salesCodeDelegatedUser;
    private Long contactChannelCode;
    private String managementUserCode;
    private String delegatedManagementUserCode;
    private String observations;

    public ManagementGralInfo() {
    }

    public ManagementGralInfo(String opportunityId, Long stateCode, Long subStateCode, String salesCodeUser,
                              String visitDate, Long contactTypeCode, Long contactPurposeCode, Long businessValue,
                              Long currencyCode, String nextContactDate, Long preapprovedChangeFlag,
                              Long globalQuoteFlag, ArrayList<ManagementPreapprovedDistribution> preapprovedDistribution,
                              String salesCodeDelegatedUser, Long contactChannelCode, String managementUserCode,
                              String delegatedManagementUserCode, String observations) {
        this.opportunityId = opportunityId;
        this.stateCode = stateCode;
        this.subStateCode = subStateCode;
        this.salesCodeUser = salesCodeUser;
        this.visitDate = visitDate;
        this.contactTypeCode = contactTypeCode;
        this.contactPurposeCode = contactPurposeCode;
        this.businessValue = businessValue;
        this.currencyCode = currencyCode;
        this.nextContactDate = nextContactDate;
        this.preapprovedChangeFlag = preapprovedChangeFlag;
        this.globalQuoteFlag = globalQuoteFlag;
        this.preapprovedDistribution = preapprovedDistribution;
        this.salesCodeDelegatedUser = salesCodeDelegatedUser;
        this.contactChannelCode = contactChannelCode;
        this.managementUserCode = managementUserCode;
        this.delegatedManagementUserCode = delegatedManagementUserCode;
        this.observations = observations;
    }

    public String getOpportunityId() {
        return opportunityId;
    }

    public void setOpportunityId(String opportunityId) {
        this.opportunityId = opportunityId;
    }

    public Long getStateCode() {
        return stateCode;
    }

    public void setStateCode(Long stateCode) {
        this.stateCode = stateCode;
    }

    public Long getSubStateCode() {
        return subStateCode;
    }

    public void setSubStateCode(Long subStateCode) {
        this.subStateCode = subStateCode;
    }

    public String getSalesCodeUser() {
        return salesCodeUser;
    }

    public void setSalesCodeUser(String salesCodeUser) {
        this.salesCodeUser = salesCodeUser;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public Long getContactTypeCode() {
        return contactTypeCode;
    }

    public void setContactTypeCode(Long contactTypeCode) {
        this.contactTypeCode = contactTypeCode;
    }

    public Long getContactPurposeCode() {
        return contactPurposeCode;
    }

    public void setContactPurposeCode(Long contactPurposeCode) {
        this.contactPurposeCode = contactPurposeCode;
    }

    public Long getBusinessValue() {
        return businessValue;
    }

    public void setBusinessValue(Long businessValue) {
        this.businessValue = businessValue;
    }

    public Long getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(Long currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getNextContactDate() {
        return nextContactDate;
    }

    public void setNextContactDate(String nextContactDate) {
        this.nextContactDate = nextContactDate;
    }

    public Long getPreapprovedChangeFlag() {
        return preapprovedChangeFlag;
    }

    public void setPreapprovedChangeFlag(Long preapprovedChangeFlag) {
        this.preapprovedChangeFlag = preapprovedChangeFlag;
    }

    public Long getGlobalQuoteFlag() {
        return globalQuoteFlag;
    }

    public void setGlobalQuoteFlag(Long globalQuoteFlag) {
        this.globalQuoteFlag = globalQuoteFlag;
    }

    public ArrayList<ManagementPreapprovedDistribution> getPreapprovedDistribution() {
        return preapprovedDistribution;
    }

    public void setPreapprovedDistribution(ArrayList<ManagementPreapprovedDistribution> preapprovedDistribution) {
        this.preapprovedDistribution = preapprovedDistribution;
    }

    public String getSalesCodeDelegatedUser() {
        return salesCodeDelegatedUser;
    }

    public void setSalesCodeDelegatedUser(String salesCodeDelegatedUser) {
        this.salesCodeDelegatedUser = salesCodeDelegatedUser;
    }

    public Long getContactChannelCode() {
        return contactChannelCode;
    }

    public void setContactChannelCode(Long contactChannelCode) {
        this.contactChannelCode = contactChannelCode;
    }

    public String getManagementUserCode() {
        return managementUserCode;
    }

    public void setManagementUserCode(String managementUserCode) {
        this.managementUserCode = managementUserCode;
    }

    public String getDelegatedManagementUserCode() {
        return delegatedManagementUserCode;
    }

    public void setDelegatedManagementUserCode(String delegatedManagementUserCode) {
        this.delegatedManagementUserCode = delegatedManagementUserCode;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }
}
