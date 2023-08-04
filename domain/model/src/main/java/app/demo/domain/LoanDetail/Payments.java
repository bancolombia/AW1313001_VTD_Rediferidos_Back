package app.demo.domain.LoanDetail;

public class Payments {
    private static final long serialVersionUID = -3757652557884019870L;
    private String irregularPayments;
    private float paymentFrequency;
    private String paymentFrequencyUnits;
    private String lastPaymentDate;
    private float numberOfPayments;
    private float duePayments;
    private String nextPaymentProjectedDate;

    public Payments() {
    }

    public Payments(String irregularPayments, float paymentFrequency, String paymentFrequencyUnits, String lastPaymentDate,
                    float numberOfPayments, float duePayments, String nextPaymentProjectedDate) {
        this.irregularPayments = irregularPayments;
        this.paymentFrequency = paymentFrequency;
        this.paymentFrequencyUnits = paymentFrequencyUnits;
        this.lastPaymentDate = lastPaymentDate;
        this.numberOfPayments = numberOfPayments;
        this.duePayments = duePayments;
        this.nextPaymentProjectedDate = nextPaymentProjectedDate;
    }

    public String getIrregularPayments() {
        return irregularPayments;
    }

    public void setIrregularPayments(String irregularPayments) {
        this.irregularPayments = irregularPayments;
    }

    public float getPaymentFrequency() {
        return paymentFrequency;
    }

    public void setPaymentFrequency(float paymentFrequency) {
        this.paymentFrequency = paymentFrequency;
    }

    public String getPaymentFrequencyUnits() {
        return paymentFrequencyUnits;
    }

    public void setPaymentFrequencyUnits(String paymentFrequencyUnits) {
        this.paymentFrequencyUnits = paymentFrequencyUnits;
    }

    public String getLastPaymentDate() {
        return lastPaymentDate;
    }

    public void setLastPaymentDate(String lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
    }

    public float getNumberOfPayments() {
        return numberOfPayments;
    }

    public void setNumberOfPayments(float numberOfPayments) {
        this.numberOfPayments = numberOfPayments;
    }

    public float getDuePayments() {
        return duePayments;
    }

    public void setDuePayments(float duePayments) {
        this.duePayments = duePayments;
    }

    public String getNextPaymentProjectedDate() {
        return nextPaymentProjectedDate;
    }

    public void setNextPaymentProjectedDate(String nextPaymentProjectedDate) {
        this.nextPaymentProjectedDate = nextPaymentProjectedDate;
    }
}
