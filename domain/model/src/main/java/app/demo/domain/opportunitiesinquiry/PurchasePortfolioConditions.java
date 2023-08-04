package app.demo.domain.opportunitiesinquiry;

import java.math.BigDecimal;

public class PurchasePortfolioConditions {
    private String entity = null;
    private Long currentBalance = null;
    private Long initialValue = null;
    private Long currentPaymentFee = null;
    private Long newPaymentFee = null;
    private BigDecimal currentFee = null;
    private BigDecimal newFee = null;

    public PurchasePortfolioConditions() {
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public Long getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Long currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Long getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(Long initialValue) {
        this.initialValue = initialValue;
    }

    public Long getCurrentPaymentFee() {
        return currentPaymentFee;
    }

    public void setCurrentPaymentFee(Long currentPaymentFee) {
        this.currentPaymentFee = currentPaymentFee;
    }

    public Long getNewPaymentFee() {
        return newPaymentFee;
    }

    public void setNewPaymentFee(Long newPaymentFee) {
        this.newPaymentFee = newPaymentFee;
    }

    public BigDecimal getCurrentFee() {
        return currentFee;
    }

    public void setCurrentFee(BigDecimal currentFee) {
        this.currentFee = currentFee;
    }

    public BigDecimal getNewFee() {
        return newFee;
    }

    public void setNewFee(BigDecimal newFee) {
        this.newFee = newFee;
    }
}
