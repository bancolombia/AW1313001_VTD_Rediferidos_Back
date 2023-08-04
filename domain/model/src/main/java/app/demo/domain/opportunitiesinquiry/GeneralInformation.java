package app.demo.domain.opportunitiesinquiry;

public class GeneralInformation {
    private String opportunityId;
    private String clientId;
    private Long clientIdTypeCode;
    private String clientIdTypeDescription;
    private Long needCode;
    private String needDescription;
    private Long productCode;
    private String productDescription;
    private String productDetailDescription;
    private String subProductCode = null;
    private Long actionCode;
    private String actionDescription;
    private String reason = null;
    private String benefit = null;
    private String riskGroupName = null;
    private Long categoryCode;
    private String categoryDescription;
    private Long priority;
    private Long rediscountNumber;
    private String proactiveExpirationDate = null;
    private String leasingFeeMV = null;
    PreapprovedDetail preapprovedDetail;
    GeneralConditions generalConditions;
    PayrollDeductionConditions payrollDeductionConditions;
    PurchasePortfolioConditions purchasePortfolioConditions;
    MortgageConditions mortgageConditions;
    AlternativeCapacity alternativeCapacities = null;
    LastManagement lastManagement = null;

    public GeneralInformation() {
        //Do nothing
    }

    public String getOpportunityId() {
        return opportunityId;
    }

    public void setOpportunityId(String opportunityId) {
        this.opportunityId = opportunityId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Long getClientIdTypeCode() {
        return clientIdTypeCode;
    }

    public void setClientIdTypeCode(Long clientIdTypeCode) {
        this.clientIdTypeCode = clientIdTypeCode;
    }

    public String getClientIdTypeDescription() {
        return clientIdTypeDescription;
    }

    public void setClientIdTypeDescription(String clientIdTypeDescription) {
        this.clientIdTypeDescription = clientIdTypeDescription;
    }

    public Long getNeedCode() {
        return needCode;
    }

    public void setNeedCode(Long needCode) {
        this.needCode = needCode;
    }

    public String getNeedDescription() {
        return needDescription;
    }

    public void setNeedDescription(String needDescription) {
        this.needDescription = needDescription;
    }

    public Long getProductCode() {
        return productCode;
    }

    public void setProductCode(Long productCode) {
        this.productCode = productCode;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductDetailDescription() {
        return productDetailDescription;
    }

    public void setProductDetailDescription(String productDetailDescription) {
        this.productDetailDescription = productDetailDescription;
    }

    public String getSubProductCode() {
        return subProductCode;
    }

    public void setSubProductCode(String subProductCode) {
        this.subProductCode = subProductCode;
    }

    public Long getActionCode() {
        return actionCode;
    }

    public void setActionCode(Long actionCode) {
        this.actionCode = actionCode;
    }

    public String getActionDescription() {
        return actionDescription;
    }

    public void setActionDescription(String actionDescription) {
        this.actionDescription = actionDescription;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }

    public String getRiskGroupName() {
        return riskGroupName;
    }

    public void setRiskGroupName(String riskGroupName) {
        this.riskGroupName = riskGroupName;
    }

    public Long getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(Long categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public Long getRediscountNumber() {
        return rediscountNumber;
    }

    public void setRediscountNumber(Long rediscountNumber) {
        this.rediscountNumber = rediscountNumber;
    }

    public String getProactiveExpirationDate() {
        return proactiveExpirationDate;
    }

    public void setProactiveExpirationDate(String proactiveExpirationDate) {
        this.proactiveExpirationDate = proactiveExpirationDate;
    }

    public String getLeasingFeeMV() {
        return leasingFeeMV;
    }

    public void setLeasingFeeMV(String leasingFeeMV) {
        this.leasingFeeMV = leasingFeeMV;
    }

    public PreapprovedDetail getPreapprovedDetail() {
        return preapprovedDetail;
    }

    public void setPreapprovedDetail(PreapprovedDetail preapprovedDetail) {
        this.preapprovedDetail = preapprovedDetail;
    }

    public GeneralConditions getGeneralConditions() {
        return generalConditions;
    }

    public void setGeneralConditions(GeneralConditions generalConditions) {
        this.generalConditions = generalConditions;
    }

    public PayrollDeductionConditions getPayrollDeductionConditions() {
        return payrollDeductionConditions;
    }

    public void setPayrollDeductionConditions(PayrollDeductionConditions payrollDeductionConditions) {
        this.payrollDeductionConditions = payrollDeductionConditions;
    }

    public PurchasePortfolioConditions getPurchasePortfolioConditions() {
        return purchasePortfolioConditions;
    }

    public void setPurchasePortfolioConditions(PurchasePortfolioConditions purchasePortfolioConditions) {
        this.purchasePortfolioConditions = purchasePortfolioConditions;
    }

    public MortgageConditions getMortgageConditions() {
        return mortgageConditions;
    }

    public void setMortgageConditions(MortgageConditions mortgageConditions) {
        this.mortgageConditions = mortgageConditions;
    }

    public AlternativeCapacity getAlternativeCapacities() {
        return alternativeCapacities;
    }

    public void setAlternativeCapacities(AlternativeCapacity alternativeCapacities) {
        this.alternativeCapacities = alternativeCapacities;
    }

    public LastManagement getLastManagement() {
        return lastManagement;
    }

    public void setLastManagement(LastManagement lastManagement) {
        this.lastManagement = lastManagement;
    }
}