package app.demo.domain.gestioninternadocumental.transmitFile.transmitfilerequest;


import java.util.ArrayList;
import java.util.List;

public class TransmitFileRequestHelper {

    private List<String> classifications;

    private List<Propiedad> properties = new ArrayList<>();

    private String username;
    private String token;
    private String destinationName;
    private String destinationOperation;
    private String destinationNamespace;

    public TransmitFileRequestHelper(List<String> classifications, List<Propiedad> properties, String username, String token, String destinationName, String destinationOperation, String destinationNamespace) {
        this.classifications = classifications;
        this.properties = properties;
        this.username = username;
        this.token = token;
        this.destinationName = destinationName;
        this.destinationOperation = destinationOperation;
        this.destinationNamespace = destinationNamespace;
    }

    public List<String> getClassifications() {
        return classifications;
    }

    public void setClassifications(List<String> classifications) {
        this.classifications = classifications;
    }

    public List<Propiedad> getProperties() {
        return properties;
    }

    public void setProperties(List<Propiedad> properties) {
        this.properties = properties;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public String getDestinationOperation() {
        return destinationOperation;
    }

    public void setDestinationOperation(String destinationOperation) {
        this.destinationOperation = destinationOperation;
    }

    public String getDestinationNamespace() {
        return destinationNamespace;
    }

    public void setDestinationNamespace(String destinationNamespace) {
        this.destinationNamespace = destinationNamespace;
    }
}
