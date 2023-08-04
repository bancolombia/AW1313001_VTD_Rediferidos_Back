package app.demo.domain.opportunitiesmanagement;

import app.demo.domain.errors.Errors;
import app.demo.domain.rest.Meta;

import java.util.ArrayList;

public class ResponseOpportunitiesManagement {

    private Meta meta;
    private OpportunitiesManagement data;
    private Long status;
    private String title;
    private ArrayList<Errors> errors;

    public ResponseOpportunitiesManagement() {
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public OpportunitiesManagement getData() {
        return data;
    }

    public void setData(OpportunitiesManagement data) {
        this.data = data;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Errors> getErrors() {
        return errors;
    }

    public void setErrors(ArrayList<Errors> errors) {
        this.errors = errors;
    }
}
