package app.demo.domain.opportunitiesinquiry;

public class PreaprovedDistribution {
    private Long productCode;
    private String productName;
    private Long businessValue;

    public PreaprovedDistribution() {
        //Do nothing
    }

    public Long getProductCode() {
        return productCode;
    }

    public void setProductCode(Long productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getBusinessValue() {
        return businessValue;
    }

    public void setBusinessValue(Long businessValue) {
        this.businessValue = businessValue;
    }
}
