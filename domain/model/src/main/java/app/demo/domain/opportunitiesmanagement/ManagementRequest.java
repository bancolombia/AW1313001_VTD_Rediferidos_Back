package app.demo.domain.opportunitiesmanagement;

public class ManagementRequest {
    private ManagementData data;

    public ManagementRequest(ManagementData data) {
        this.data = data;
    }

    public ManagementData getData() {
        return data;
    }

    public void setData(ManagementData data) {
        this.data = data;
    }
}
