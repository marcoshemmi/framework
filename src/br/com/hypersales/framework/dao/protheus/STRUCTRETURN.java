
package br.com.hypersales.framework.dao.protheus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for STRUCTRETURN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STRUCTRETURN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RESPONSEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESPONSEMESSAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SALESORDERID" type="{http://fw.rozac.com.br:81/}ARRAYOFSTRING" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STRUCTRETURN", propOrder = {
    "responseid",
    "responsemessage",
    "salesorderid"
})
public class STRUCTRETURN {

    @XmlElement(name = "RESPONSEID")
    public String responseid;
    @XmlElement(name = "RESPONSEMESSAGE")
    public String responsemessage;
    @XmlElement(name = "SALESORDERID")
    public ARRAYOFSTRING salesorderid;

    /**
     * Gets the value of the responseid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESPONSEID() {
        return responseid;
    }

    /**
     * Sets the value of the responseid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESPONSEID(String value) {
        this.responseid = value;
    }

    /**
     * Gets the value of the responsemessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESPONSEMESSAGE() {
        return responsemessage;
    }

    /**
     * Sets the value of the responsemessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESPONSEMESSAGE(String value) {
        this.responsemessage = value;
    }

    /**
     * Gets the value of the salesorderid property.
     * 
     * @return
     *     possible object is
     *     {@link ARRAYOFSTRING }
     *     
     */
    public ARRAYOFSTRING getSALESORDERID() {
        return salesorderid;
    }

    /**
     * Sets the value of the salesorderid property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARRAYOFSTRING }
     *     
     */
    public void setSALESORDERID(ARRAYOFSTRING value) {
        this.salesorderid = value;
    }

}
