package app.demo.domain.LoanDetail;

public class LoanDetail {

    private static final long serialVersionUID = -733331728753894011L;
    private Object header;
    private String title;
    public LoanDetails loanDetails;

    public LoanDetail() {
    }

    public LoanDetail(Object header, String title, LoanDetails loanDetails) {
        this.header = header;
        this.title = title;
        this.loanDetails = loanDetails;
    }

    /**
     * get field
     *
     * @return header
     */
    public Object getHeader() {
        return this.header;
    }

    /**
     * set field
     *
     * @param header
     */
    public void setHeader(Object header) {
        this.header = header;
    }

    /**
     * get field
     *
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * set field
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * get field
     *
     * @return loanDetails
     */
    public LoanDetails getLoanDetails() {
        return this.loanDetails;
    }

    /**
     * set field
     *
     * @param loanDetails
     */
    public void setLoanDetails(LoanDetails loanDetails) {
        this.loanDetails = loanDetails;
    }
}
