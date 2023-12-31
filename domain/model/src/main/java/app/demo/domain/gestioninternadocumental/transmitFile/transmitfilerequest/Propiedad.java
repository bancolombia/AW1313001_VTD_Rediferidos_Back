package app.demo.domain.gestioninternadocumental.transmitFile.transmitfilerequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for Property complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Property">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Property", propOrder = {
		"key",
		"value"
})
public class Propiedad implements Serializable {

	private static final long serialVersionUID = -8571522926279810913L;

	@XmlElement(required = true)
	protected String key;
	@XmlElement(required = true)
	protected String value;



	public Propiedad() {
	}

	public Propiedad(String llave, String valor) {
		this.key = llave;
		this.value = valor;
	}


	/**
	 * Gets the value of the key property.
	 *
	 * @return
	 *     possible object is
	 *     {@link String }
	 *
	 */
	public String getKey() {
		return key;
	}

	/**
	 * Sets the value of the key property.
	 *
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *
	 */
	public void setKey(String value) {
		this.key = value;
	}

	/**
	 * Gets the value of the value property.
	 *
	 * @return
	 *     possible object is
	 *     {@link String }
	 *
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 *
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *
	 */
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Propiedad{" +
				"llave='" + key + '\'' +
				", valor='" + value + '\'' +
				'}';
	}
}
