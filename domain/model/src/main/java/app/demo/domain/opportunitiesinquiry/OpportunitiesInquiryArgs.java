package app.demo.domain.opportunitiesinquiry;

public class OpportunitiesInquiryArgs {
    private Long documentNumber;
    private Long documentType;
    private Long contactChannelCode;

    public OpportunitiesInquiryArgs(Long documentNumber, Long documentType, Long contactChannelCode) {
        this.documentNumber = documentNumber;
        this.documentType = documentType;
        this.contactChannelCode = contactChannelCode;
    }

    public Long getDocumentNumber() {
        return documentNumber;
    }

    public Long getDocumentType() {
        return documentType;
    }

    public Long getContactChannelCode() {
        return contactChannelCode;
    }

    public void setDocumentNumber(Long documentNumber) {
        this.documentNumber = documentNumber;
    }

    public void setDocumentType(Long documentType) {
        this.documentType = documentType;
    }

    public void setContactChannelCode(Long contactChannelCode) {
        this.contactChannelCode = contactChannelCode;
    }
}
