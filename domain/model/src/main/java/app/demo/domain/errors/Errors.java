package app.demo.domain.errors;

public class Errors {
    private String code;
    private String detail;

    public Errors() {
        //Do nothing
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
