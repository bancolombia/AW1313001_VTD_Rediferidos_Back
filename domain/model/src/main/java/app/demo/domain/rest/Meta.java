package app.demo.domain.rest;

public class Meta {
    private String _messageId;
    private String _requestDateTime;
    private String _applicationId;

    private String _version;
    private String _requestDate;
    private float _responseSize;
    private String _clientRequest;

    public Meta() {
    }

    public Meta(String _messageId, String _requestDateTime, String _applicationId,
                String _version, String _requestDate, float _responseSize, String _clientRequest) {
        this._messageId = _messageId;
        this._requestDateTime = _requestDateTime;
        this._applicationId = _applicationId;
        this._version = _version;
        this._requestDate = _requestDate;
        this._responseSize = _responseSize;
        this._clientRequest = _clientRequest;
    }

    public String get_messageId() {
        return _messageId;
    }

    public void set_messageId(String _messageId) {
        this._messageId = _messageId;
    }

    public String get_requestDateTime() {
        return _requestDateTime;
    }

    public void set_requestDateTime(String _requestDateTime) {
        this._requestDateTime = _requestDateTime;
    }

    public String get_applicationId() {
        return _applicationId;
    }

    public void set_applicationId(String _applicationId) {
        this._applicationId = _applicationId;
    }

    public String get_version() {
        return _version;
    }

    public void set_version(String _version) {
        this._version = _version;
    }

    public String get_requestDate() {
        return _requestDate;
    }

    public void set_requestDate(String _requestDate) {
        this._requestDate = _requestDate;
    }

    public float get_responseSize() {
        return _responseSize;
    }

    public void set_responseSize(float _responseSize) {
        this._responseSize = _responseSize;
    }

    public String get_clientRequest() {
        return _clientRequest;
    }

    public void set_clientRequest(String _clientRequest) {
        this._clientRequest = _clientRequest;
    }
}
