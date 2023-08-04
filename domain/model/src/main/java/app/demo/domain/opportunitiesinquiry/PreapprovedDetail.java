package app.demo.domain.opportunitiesinquiry;

public class PreapprovedDetail {
    private String expirationDate;
    private Long capacity;
    private Long minimumTerm;
    private Long maximumTerm;

    public PreapprovedDetail() {
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public Long getCapacity() {
        return capacity;
    }

    public Long getMinimumTerm() {
        return minimumTerm;
    }

    public Long getMaximumTerm() {
        return maximumTerm;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public void setMinimumTerm(Long minimumTerm) {
        this.minimumTerm = minimumTerm;
    }

    public void setMaximumTerm(Long maximumTerm) {
        this.maximumTerm = maximumTerm;
    }
}
