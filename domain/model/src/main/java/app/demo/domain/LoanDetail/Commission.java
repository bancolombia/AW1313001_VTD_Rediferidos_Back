package app.demo.domain.LoanDetail;

public class Commission {
    private static final long serialVersionUID = 166251166550283974L;
    private String type;
    private String amount;
    private String taxes;

    public Commission() {
    }

    public Commission(String type, String amount, String taxes) {
        this.type = type;
        this.amount = amount;
        this.taxes = taxes;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTaxes() {
        return taxes;
    }

    public void setTaxes(String taxes) {
        this.taxes = taxes;
    }
}
