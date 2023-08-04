package app.demo.domain.opportunitiesinquiry;

import java.util.ArrayList;

public class LastManagement {
    private Long stateCode;
    private String stateName;
    private Long subStateCode;
    private String subStateName;
    private String salesCodeUser;
    private String visitDate;
    private String managementDate;
    private Long contactTypeCode;
    private String contactTypeName;
    private Long contactPurposeCode;
    private String contactPurposeName;
    private Long businessValue;
    private Long currencyCode;
    private String currencyName;
    private String nextContactDate;
    private Long preapprovedChangeFlag;
    private Long globalQuoteFlag;
    private String salesCodeDelegatedUser;
    private Long contactChannelCode;
    private String contactChannelName;
    private String managementUserCode;
    private String delegatedManagementUserCode;
    private String observations;
    ArrayList<PreaprovedDistribution> preaprovedDistribution;

    public LastManagement() {
        //Do nothing
    }

    public Long getStateCode() {
        return stateCode;
    }

    public void setStateCode(Long stateCode) {
        this.stateCode = stateCode;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Long getSubStateCode() {
        return subStateCode;
    }

    public void setSubStateCode(Long subStateCode) {
        this.subStateCode = subStateCode;
    }

    public String getSubStateName() {
        return subStateName;
    }

    public void setSubStateName(String subStateName) {
        this.subStateName = subStateName;
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

    public String getManagementDate() {
        return managementDate;
    }

    public void setManagementDate(String managementDate) {
        this.managementDate = managementDate;
    }

    public Long getContactTypeCode() {
        return contactTypeCode;
    }

    public void setContactTypeCode(Long contactTypeCode) {
        this.contactTypeCode = contactTypeCode;
    }

    public String getContactTypeName() {
        return contactTypeName;
    }

    public void setContactTypeName(String contactTypeName) {
        this.contactTypeName = contactTypeName;
    }

    public Long getContactPurposeCode() {
        return contactPurposeCode;
    }

    public void setContactPurposeCode(Long contactPurposeCode) {
        this.contactPurposeCode = contactPurposeCode;
    }

    public String getContactPurposeName() {
        return contactPurposeName;
    }

    public void setContactPurposeName(String contactPurposeName) {
        this.contactPurposeName = contactPurposeName;
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

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
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

    public String getContactChannelName() {
        return contactChannelName;
    }

    public void setContactChannelName(String contactChannelName) {
        this.contactChannelName = contactChannelName;
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

    public ArrayList<PreaprovedDistribution> getPreaprovedDistribution() {
        return preaprovedDistribution;
    }

    public void setPreaprovedDistribution(ArrayList<PreaprovedDistribution> preaprovedDistribution) {
        this.preaprovedDistribution = preaprovedDistribution;
    }
}
