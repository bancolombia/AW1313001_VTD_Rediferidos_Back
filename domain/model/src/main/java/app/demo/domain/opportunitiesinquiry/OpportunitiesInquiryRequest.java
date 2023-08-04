package app.demo.domain.opportunitiesinquiry;

public class OpportunitiesInquiryRequest {
    private OpportunitiesInquiryData data;

    public OpportunitiesInquiryRequest(OpportunitiesInquiryData data) {
        this.data = data;
    }

    public OpportunitiesInquiryData getData() {
        return data;
    }

    public void setData(OpportunitiesInquiryData data) {
        this.data = data;
    }
}
