package br.com.hypersales.framework.dao.protheus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TOKENSTRUCT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TOKENSTRUCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DATAFIM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATAINI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HASHCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDUSER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOKENSTRUCT", propOrder = {
    "datafim",
    "dataini",
    "hashcode",
    "iduser"
})
public class TOKENSTRUCT {

    @XmlElement(name = "DATAFIM")
    protected String datafim;
    @XmlElement(name = "DATAINI")
    protected String dataini;
    @XmlElement(name = "HASHCODE")
    protected String hashcode;
    @XmlElement(name = "IDUSER")
    protected String iduser;

    /**
     * Gets the value of the datafim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAFIM() {
        return datafim;
    }

    /**
     * Sets the value of the datafim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAFIM(String value) {
        this.datafim = value;
    }

    /**
     * Gets the value of the dataini property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAINI() {
        return dataini;
    }

    /**
     * Sets the value of the dataini property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAINI(String value) {
        this.dataini = value;
    }

    /**
     * Gets the value of the hashcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHASHCODE() {
        return hashcode;
    }

    /**
     * Sets the value of the hashcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHASHCODE(String value) {
        this.hashcode = value;
    }

    /**
     * Gets the value of the iduser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDUSER() {
        return iduser;
    }

    /**
     * Sets the value of the iduser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDUSER(String value) {
        this.iduser = value;
    }

}