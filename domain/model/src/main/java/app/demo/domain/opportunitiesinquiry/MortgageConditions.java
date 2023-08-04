package app.demo.domain.opportunitiesinquiry;

import java.math.BigDecimal;

public class MortgageConditions {
    private BigDecimal expiredMonthFee = null;
    private BigDecimal annualEffectiveFee = null;
    private BigDecimal leasingFee = null;
    private BigDecimal annualEffectiveUvr = null;
    private BigDecimal expiredMonthUvr = null;
    private Long depositAfterAdjustedSpending = null;

    public MortgageConditions() {
        // Do nothing
    }

    public BigDecimal getExpiredMonthFee() {
        return expiredMonthFee;
    }

    public void setExpiredMonthFee(BigDecimal expiredMonthFee) {
        this.expiredMonthFee = expiredMonthFee;
    }

    public BigDecimal getAnnualEffectiveFee() {
        return annualEffectiveFee;
    }

    public void setAnnualEffectiveFee(BigDecimal annualEffectiveFee) {
        this.annualEffectiveFee = annualEffectiveFee;
    }

    public BigDecimal getLeasingFee() {
        return leasingFee;
    }

    public void setLeasingFee(BigDecimal leasingFee) {
        this.leasingFee = leasingFee;
    }

    public BigDecimal getAnnualEffectiveUvr() {
        return annualEffectiveUvr;
    }

    public void setAnnualEffectiveUvr(BigDecimal annualEffectiveUvr) {
        this.annualEffectiveUvr = annualEffectiveUvr;
    }

    public BigDecimal getExpiredMonthUvr() {
        return expiredMonthUvr;
    }

    public void setExpiredMonthUvr(BigDecimal expiredMonthUvr) {
        this.expiredMonthUvr = expiredMonthUvr;
    }

    public Long getDepositAfterAdjustedSpending() {
        return depositAfterAdjustedSpending;
    }

    public void setDepositAfterAdjustedSpending(Long depositAfterAdjustedSpending) {
        this.depositAfterAdjustedSpending = depositAfterAdjustedSpending;
    }
}
