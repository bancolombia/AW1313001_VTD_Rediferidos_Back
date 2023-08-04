package app.demo.domain.gestioninternadocumental.transmitFile.TransmitFileResponse;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransmitirDocumentoResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TransmitirDocumentoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransmitirDocumentoResponse", propOrder = {
        "idDocumento"
})
public class TransmitirDocumentoResponse {


    protected String idDocumento;

    /**
     * Gets the value of the idDocumento property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdDocumento() {
        return idDocumento;
    }

    /**
     * Sets the value of the idDocumento property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdDocumento(String value) {
        this.idDocumento = value;
    }


}
