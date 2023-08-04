package app.demo.domain.LoanDetail;

public class LoanDetailsRequestData {
    private LoanDetailRequest data;

    public LoanDetailsRequestData(LoanDetailRequest data) {
        this.data = data;
    }

    public LoanDetailRequest getData() {
        return data;
    }

    public void setData(LoanDetailRequest data) {
        this.data = data;
    }
}
