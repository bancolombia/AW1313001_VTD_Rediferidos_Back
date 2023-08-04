package app.demo.domain.opportunitiesinquiry;

public class GeneralConditions {
    private Long creditCardMaximumCapacity = null;
    private String creditCardBenefit = null;
    private Long overdraftMaximunCapacity = null;
    private Long freeInvestmentMaximunCapacity;
    private String repaymentLoanNumber = null;

    public GeneralConditions() {
        //Do nothing
    }

    public Long getCreditCardMaximumCapacity() {
        return creditCardMaximumCapacity;
    }

    public void setCreditCardMaximumCapacity(Long creditCardMaximumCapacity) {
        this.creditCardMaximumCapacity = creditCardMaximumCapacity;
    }

    public String getCreditCardBenefit() {
        return creditCardBenefit;
    }

    public void setCreditCardBenefit(String creditCardBenefit) {
        this.creditCardBenefit = creditCardBenefit;
    }

    public Long getOverdraftMaximunCapacity() {
        return overdraftMaximunCapacity;
    }

    public void setOverdraftMaximunCapacity(Long overdraftMaximunCapacity) {
        this.overdraftMaximunCapacity = overdraftMaximunCapacity;
    }

    public Long getFreeInvestmentMaximunCapacity() {
        return freeInvestmentMaximunCapacity;
    }

    public void setFreeInvestmentMaximunCapacity(Long freeInvestmentMaximunCapacity) {
        this.freeInvestmentMaximunCapacity = freeInvestmentMaximunCapacity;
    }

    public String getRepaymentLoanNumber() {
        return repaymentLoanNumber;
    }

    public void setRepaymentLoanNumber(String repaymentLoanNumber) {
        this.repaymentLoanNumber = repaymentLoanNumber;
    }
}
