package app.demo.domain.opportunitiesinquiry;

import app.demo.domain.errors.Errors;
import app.demo.domain.rest.Meta;

import java.util.ArrayList;

public class ResponseOpportunitiesInquiry {
    private Meta meta;
    private OpportunitiesInquiry data;
    private Long status;
    private String title;
    private ArrayList<Errors> errors;

    public ResponseOpportunitiesInquiry() {
    }

    public ResponseOpportunitiesInquiry(Meta meta, OpportunitiesInquiry data) {
        this.meta = meta;
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta metaObject) {
        this.meta = metaObject;
    }

    public OpportunitiesInquiry getData() {
        return data;
    }

    public void setData(OpportunitiesInquiry dataObject) {
        this.data = dataObject;
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
