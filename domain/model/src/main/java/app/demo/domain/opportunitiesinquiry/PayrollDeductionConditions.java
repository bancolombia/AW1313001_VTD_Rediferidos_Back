package app.demo.domain.opportunitiesinquiry;

public class PayrollDeductionConditions {
    private Long agreementCode = null;
    private Long alternativeMinimumTerm = null;
    private Long alternativeMaximumTerm = null;

    public PayrollDeductionConditions() {
    }

    public Long getAgreementCode() {
        return agreementCode;
    }

    public void setAgreementCode(Long agreementCode) {
        this.agreementCode = agreementCode;
    }

    public Long getAlternativeMinimumTerm() {
        return alternativeMinimumTerm;
    }

    public void setAlternativeMinimumTerm(Long alternativeMinimumTerm) {
        this.alternativeMinimumTerm = alternativeMinimumTerm;
    }

    public Long getAlternativeMaximumTerm() {
        return alternativeMaximumTerm;
    }

    public void setAlternativeMaximumTerm(Long alternativeMaximumTerm) {
        this.alternativeMaximumTerm = alternativeMaximumTerm;
    }
}
