package app.demo.domain.opportunitiesmanagement;

public class OpportunitiesManagement {
    private String responseCode;
    private String responseText;

    public OpportunitiesManagement() {
        //Do nothing
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseText() {
        return responseText;
    }

    public void setResponseText(String responseText) {
        this.responseText = responseText;
    }
}
