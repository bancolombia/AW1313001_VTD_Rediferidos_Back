package app.demo.domain.LoanDetail;

public class PaymentsDistribution {
    private static final long serialVersionUID = -7861029830214312842L;
    private String concept;
    private String connector;

    public PaymentsDistribution() {
    }

    public PaymentsDistribution(String concept, String connector) {
        this.concept = concept;
        this.connector = connector;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public String getConnector() {
        return connector;
    }

    public void setConnector(String connector) {
        this.connector = connector;
    }
}
