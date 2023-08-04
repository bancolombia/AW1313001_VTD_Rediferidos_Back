package app.demo.domain.gestioninternadocumental.transmitFile.transmitfilerequest;




import java.util.List;

public class TransmitFileRequest extends  TransmitFileRequestHelper {


    private String systemId;
    private String messageId;
    private List<Metadata> metadataTypes;
    private String documentType;
    private String documentNumber;
    private String fileName;
    private byte[] file;
    private String subSequenceCode;
    private String documentaryType;
    private String securityGroup;
    private String securityAccount;
    private String documentarySubtype;
    private String profileId;
    private String author;

    public TransmitFileRequest(List<String> classifications, List<Propiedad> properties, String username, String token, String destinationName, String destinationOperation, String destinationNamespace, String systemId, String messageId, List<Metadata> metadataTypes, String documentType, String documentNumber, String fileName, byte[] file, String subSequenceCode, String documentaryType, String securityGroup, String securityAccount, String documentarySubtype, String profileId, String author) {
        super(classifications, properties, username, token, destinationName, destinationOperation, destinationNamespace);
        this.systemId = systemId;
        this.messageId = messageId;
        this.metadataTypes = metadataTypes;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.fileName = fileName;
        this.file = file;
        this.subSequenceCode = subSequenceCode;
        this.documentaryType = documentaryType;
        this.securityGroup = securityGroup;
        this.securityAccount = securityAccount;
        this.documentarySubtype = documentarySubtype;
        this.profileId = profileId;
        this.author = author;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public List<Metadata> getMetadataTypes() {
        return metadataTypes;
    }

    public void setMetadataTypes(List<Metadata> metadataTypes) {
        this.metadataTypes = metadataTypes;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public String getSubSequenceCode() {
        return subSequenceCode;
    }

    public void setSubSequenceCode(String subSequenceCode) {
        this.subSequenceCode = subSequenceCode;
    }

    public String getDocumentaryType() {
        return documentaryType;
    }

    public void setDocumentaryType(String documentaryType) {
        this.documentaryType = documentaryType;
    }

    public String getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(String securityGroup) {
        this.securityGroup = securityGroup;
    }

    public String getSecurityAccount() {
        return securityAccount;
    }

    public void setSecurityAccount(String securityAccount) {
        this.securityAccount = securityAccount;
    }

    public String getDocumentarySubtype() {
        return documentarySubtype;
    }

    public void setDocumentarySubtype(String documentarySubtype) {
        this.documentarySubtype = documentarySubtype;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
