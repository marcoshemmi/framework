
package br.com.hypersales.framework.dao.protheus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SALESITEMLIST complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SALESITEMLIST">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BRANCHID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CURRENCYID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRODUCTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PURCHASEREQUESTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SALESORDERDISCOUNTVALUE" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="SALESORDERITEMQUANTIY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="SALESORDERUNITVALUE" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SALESITEMLIST", propOrder = {
    "branchid",
    "currencyid",
    "productid",
    "purchaserequestid",
    "salesorderdiscountvalue",
    "salesorderitemquantiy",
    "salesorderunitvalue"
})
public class SALESITEMLIST {

    @XmlElement(name = "BRANCHID")
    protected String branchid;
    @XmlElement(name = "CURRENCYID")
    protected String currencyid;
    @XmlElement(name = "PRODUCTID")
    protected String productid;
    @XmlElement(name = "PURCHASEREQUESTID")
    protected String purchaserequestid;
    @XmlElement(name = "SALESORDERDISCOUNTVALUE")
    protected Float salesorderdiscountvalue;
    @XmlElement(name = "SALESORDERITEMQUANTIY")
    protected long salesorderitemquantiy;
    @XmlElement(name = "SALESORDERUNITVALUE")
    protected Float salesorderunitvalue;

    /**
     * Gets the value of the branchid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANCHID() {
        return branchid;
    }

    /**
     * Sets the value of the branchid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRANCHID(String value) {
        this.branchid = value;
    }

    /**
     * Gets the value of the currencyid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCYID() {
        return currencyid;
    }

    /**
     * Sets the value of the currencyid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENCYID(String value) {
        this.currencyid = value;
    }

    /**
     * Gets the value of the productid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODUCTID() {
        return productid;
    }

    /**
     * Sets the value of the productid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODUCTID(String value) {
        this.productid = value;
    }

    /**
     * Gets the value of the purchaserequestid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPURCHASEREQUESTID() {
        return purchaserequestid;
    }

    /**
     * Sets the value of the purchaserequestid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPURCHASEREQUESTID(String value) {
        this.purchaserequestid = value;
    }

    /**
     * Gets the value of the salesorderdiscountvalue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSALESORDERDISCOUNTVALUE() {
        return salesorderdiscountvalue;
    }

    /**
     * Sets the value of the salesorderdiscountvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSALESORDERDISCOUNTVALUE(Float value) {
        this.salesorderdiscountvalue = value;
    }

    /**
     * Gets the value of the salesorderitemquantiy property.
     * 
     * @return
     *     possible object is
     *     {@link long }
     *     
     */
    public long getSALESORDERITEMQUANTIY() {
        return salesorderitemquantiy;
    }

    /**
     * Sets the value of the salesorderitemquantiy property.
     * 
     * @param value
     *     allowed object is
     *     {@link long }
     *     
     */
    public void setSALESORDERITEMQUANTIY(long value) {
        this.salesorderitemquantiy = value;
    }

    /**
     * Gets the value of the salesorderunitvalue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSALESORDERUNITVALUE() {
        return salesorderunitvalue;
    }

    /**
     * Sets the value of the salesorderunitvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSALESORDERUNITVALUE(Float value) {
        this.salesorderunitvalue = value;
    }

}
