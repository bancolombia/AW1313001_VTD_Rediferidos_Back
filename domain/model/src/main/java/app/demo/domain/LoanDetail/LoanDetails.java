package app.demo.domain.LoanDetail;

import java.math.BigDecimal;
import java.util.ArrayList;

public class LoanDetails {
    public LoanDetails() {
    }
    private static final long serialVersionUID = 1635739101242542111L;
    private String loanId;
    private String state;
    private String creditPlan;
    private String loanTypeCode;
    private float initialCapital;
    private float totalBalance;
    private float principalBalance;
    private float currentPrincipalBalance;
    private float outstandingBalance;
    private float outstandingPrincipalBalance;
    private float outstandingInterestBalance;
    private float interestBalance;
    private float arrearsInterestBalance;
    private float arrearsInterestSuspensionBalance;
    private float interestSuspensionBalance;
    private float lifeInsuranceBalance;
    private String disbursementDate;
    private String expirationDate;
    private String nextPaymentDate;
    private float paymentDay;
    private float term;
    private String termUnits;
    private float regularInstallment;
    private float fixedInstallment;
    private String currency;
    private String annualNominalInterestRate;
    private BigDecimal initialInterestRate;
    private String interestRateType;
    private String basisPoints;
    private float daysInArrears;
    private String arrearsBeginningDate;
    private String lifeInsuranceArrerasInterest;
    private String originBranch;
    private String businessAgreementCode;
    Payments payments;
    ArrayList<Insurance> insurances = new ArrayList <> ();
    ArrayList <PaymentsDistribution> paymentsDistribution = new ArrayList <> ();
    ArrayList <Commission> commissions = new ArrayList <> ();

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCreditPlan() {
        return creditPlan;
    }

    public void setCreditPlan(String creditPlan) {
        this.creditPlan = creditPlan;
    }

    public String getLoanTypeCode() {
        return loanTypeCode;
    }

    public void setLoanTypeCode(String loanTypeCode) {
        this.loanTypeCode = loanTypeCode;
    }

    public float getInitialCapital() {
        return initialCapital;
    }

    public void setInitialCapital(float initialCapital) {
        this.initialCapital = initialCapital;
    }

    public float getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(float totalBalance) {
        this.totalBalance = totalBalance;
    }

    public float getPrincipalBalance() {
        return principalBalance;
    }

    public void setPrincipalBalance(float principalBalance) {
        this.principalBalance = principalBalance;
    }

    public float getCurrentPrincipalBalance() {
        return currentPrincipalBalance;
    }

    public void setCurrentPrincipalBalance(float currentPrincipalBalance) {
        this.currentPrincipalBalance = currentPrincipalBalance;
    }

    public float getOutstandingBalance() {
        return outstandingBalance;
    }

    public void setOutstandingBalance(float outstandingBalance) {
        this.outstandingBalance = outstandingBalance;
    }

    public float getOutstandingPrincipalBalance() {
        return outstandingPrincipalBalance;
    }

    public void setOutstandingPrincipalBalance(float outstandingPrincipalBalance) {
        this.outstandingPrincipalBalance = outstandingPrincipalBalance;
    }

    public float getOutstandingInterestBalance() {
        return outstandingInterestBalance;
    }

    public void setOutstandingInterestBalance(float outstandingInterestBalance) {
        this.outstandingInterestBalance = outstandingInterestBalance;
    }

    public float getInterestBalance() {
        return interestBalance;
    }

    public void setInterestBalance(float interestBalance) {
        this.interestBalance = interestBalance;
    }

    public float getArrearsInterestBalance() {
        return arrearsInterestBalance;
    }

    public void setArrearsInterestBalance(float arrearsInterestBalance) {
        this.arrearsInterestBalance = arrearsInterestBalance;
    }

    public float getArrearsInterestSuspensionBalance() {
        return arrearsInterestSuspensionBalance;
    }

    public void setArrearsInterestSuspensionBalance(float arrearsInterestSuspensionBalance) {
        this.arrearsInterestSuspensionBalance = arrearsInterestSuspensionBalance;
    }

    public float getInterestSuspensionBalance() {
        return interestSuspensionBalance;
    }

    public void setInterestSuspensionBalance(float interestSuspensionBalance) {
        this.interestSuspensionBalance = interestSuspensionBalance;
    }

    public float getLifeInsuranceBalance() {
        return lifeInsuranceBalance;
    }

    public void setLifeInsuranceBalance(float lifeInsuranceBalance) {
        this.lifeInsuranceBalance = lifeInsuranceBalance;
    }

    public String getDisbursementDate() {
        return disbursementDate;
    }

    public void setDisbursementDate(String disbursementDate) {
        this.disbursementDate = disbursementDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getNextPaymentDate() {
        return nextPaymentDate;
    }

    public void setNextPaymentDate(String nextPaymentDate) {
        this.nextPaymentDate = nextPaymentDate;
    }

    public float getPaymentDay() {
        return paymentDay;
    }

    public void setPaymentDay(float paymentDay) {
        this.paymentDay = paymentDay;
    }

    public float getTerm() {
        return term;
    }

    public void setTerm(float term) {
        this.term = term;
    }

    public String getTermUnits() {
        return termUnits;
    }

    public void setTermUnits(String termUnits) {
        this.termUnits = termUnits;
    }

    public float getRegularInstallment() {
        return regularInstallment;
    }

    public void setRegularInstallment(float regularInstallment) {
        this.regularInstallment = regularInstallment;
    }

    public float getFixedInstallment() {
        return fixedInstallment;
    }

    public void setFixedInstallment(float fixedInstallment) {
        this.fixedInstallment = fixedInstallment;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAnnualNominalInterestRate() {
        return annualNominalInterestRate;
    }

    public void setAnnualNominalInterestRate(String annualNominalInterestRate) {
        this.annualNominalInterestRate = annualNominalInterestRate;
    }

    public BigDecimal getInitialInterestRate() {
        return initialInterestRate;
    }

    public void setInitialInterestRate(BigDecimal initialInterestRate) {
        this.initialInterestRate = initialInterestRate;
    }

    public String getInterestRateType() {
        return interestRateType;
    }

    public void setInterestRateType(String interestRateType) {
        this.interestRateType = interestRateType;
    }

    public String getBasisPoints() {
        return basisPoints;
    }

    public void setBasisPoints(String basisPoints) {
        this.basisPoints = basisPoints;
    }

    public float getDaysInArrears() {
        return daysInArrears;
    }

    public void setDaysInArrears(float daysInArrears) {
        this.daysInArrears = daysInArrears;
    }

    public String getArrearsBeginningDate() {
        return arrearsBeginningDate;
    }

    public void setArrearsBeginningDate(String arrearsBeginningDate) {
        this.arrearsBeginningDate = arrearsBeginningDate;
    }

    public String getLifeInsuranceArrerasInterest() {
        return lifeInsuranceArrerasInterest;
    }

    public void setLifeInsuranceArrerasInterest(String lifeInsuranceArrerasInterest) {
        this.lifeInsuranceArrerasInterest = lifeInsuranceArrerasInterest;
    }

    public String getOriginBranch() {
        return originBranch;
    }

    public void setOriginBranch(String originBranch) {
        this.originBranch = originBranch;
    }

    public String getBusinessAgreementCode() {
        return businessAgreementCode;
    }

    public void setBusinessAgreementCode(String businessAgreementCode) {
        this.businessAgreementCode = businessAgreementCode;
    }

    public Payments getPayments() {
        return payments;
    }

    public void setPayments(Payments payments) {
        this.payments = payments;
    }

    public ArrayList<Insurance> getInsurances() {
        return insurances;
    }

    public void setInsurances(ArrayList<Insurance> insurances) {
        this.insurances = insurances;
    }

    public ArrayList<PaymentsDistribution> getPaymentsDistribution() {
        return paymentsDistribution;
    }

    public void setPaymentsDistribution(ArrayList<PaymentsDistribution> paymentsDistribution) {
        this.paymentsDistribution = paymentsDistribution;
    }

    public ArrayList<Commission> getCommissions() {
        return commissions;
    }

    public void setCommissions(ArrayList<Commission> commissions) {
        this.commissions = commissions;
    }
}
