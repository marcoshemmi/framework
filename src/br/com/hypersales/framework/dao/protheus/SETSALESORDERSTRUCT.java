
package br.com.hypersales.framework.dao.protheus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SETSALESORDERSTRUCT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SETSALESORDERSTRUCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CARRIERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTOMERDELIVERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTOMERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTOMERUNITDELIVERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTOMERUNITID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FREIGHTTYPEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OPERATIONTYPEID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PAYMENTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVATIONTYPEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SALESORDERDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SALESORDERITEM" type="{http://fw.rozac.com.br:81/}ARRAYOFSALESITEMLIST" minOccurs="0"/>
 *         &lt;element name="SALESORDERNOTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SALESORDERTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SELLERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SETSALESORDERSTRUCT", propOrder = {
    "carrierid",
    "customerdeliverid",
    "customerid",
    "customerunitdeliverid",
    "customerunitid",
    "freighttypeid",
    "operationtypeid",
    "paymentid",
    "reservationtypeid",
    "salesorderdate",
    "salesorderitem",
    "salesordernote",
    "salesordertype",
    "sellerid"
})
public class SETSALESORDERSTRUCT {

    @XmlElement(name = "CARRIERID")
    protected String carrierid;
    @XmlElement(name = "CUSTOMERDELIVERID")
    protected String customerdeliverid;
    @XmlElement(name = "CUSTOMERID")
    protected String customerid;
    @XmlElement(name = "CUSTOMERUNITDELIVERID")
    protected String customerunitdeliverid;
    @XmlElement(name = "CUSTOMERUNITID")
    protected String customerunitid;
    @XmlElement(name = "FREIGHTTYPEID")
    protected String freighttypeid;
    @XmlElement(name = "OPERATIONTYPEID", required = true)
    protected String operationtypeid;
    @XmlElement(name = "PAYMENTID")
    protected String paymentid;
    @XmlElement(name = "RESERVATIONTYPEID")
    protected String reservationtypeid;
    @XmlElement(name = "SALESORDERDATE")
    protected String salesorderdate;
    @XmlElement(name = "SALESORDERITEM")
    protected ARRAYOFSALESITEMLIST salesorderitem;
    @XmlElement(name = "SALESORDERNOTE")
    protected String salesordernote;
    @XmlElement(name = "SALESORDERTYPE")
    protected String salesordertype;
    @XmlElement(name = "SELLERID")
    protected String sellerid;

    /**
     * Gets the value of the carrierid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARRIERID() {
        return carrierid;
    }

    /**
     * Sets the value of the carrierid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARRIERID(String value) {
        this.carrierid = value;
    }

    /**
     * Gets the value of the customerdeliverid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMERDELIVERID() {
        return customerdeliverid;
    }

    /**
     * Sets the value of the customerdeliverid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMERDELIVERID(String value) {
        this.customerdeliverid = value;
    }

    /**
     * Gets the value of the customerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMERID() {
        return customerid;
    }

    /**
     * Sets the value of the customerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMERID(String value) {
        this.customerid = value;
    }

    /**
     * Gets the value of the customerunitdeliverid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMERUNITDELIVERID() {
        return customerunitdeliverid;
    }

    /**
     * Sets the value of the customerunitdeliverid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMERUNITDELIVERID(String value) {
        this.customerunitdeliverid = value;
    }

    /**
     * Gets the value of the customerunitid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMERUNITID() {
        return customerunitid;
    }

    /**
     * Sets the value of the customerunitid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMERUNITID(String value) {
        this.customerunitid = value;
    }

    /**
     * Gets the value of the freighttypeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFREIGHTTYPEID() {
        return freighttypeid;
    }

    /**
     * Sets the value of the freighttypeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFREIGHTTYPEID(String value) {
        this.freighttypeid = value;
    }

    /**
     * Gets the value of the operationtypeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPERATIONTYPEID() {
        return operationtypeid;
    }

    /**
     * Sets the value of the operationtypeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPERATIONTYPEID(String value) {
        this.operationtypeid = value;
    }

    /**
     * Gets the value of the paymentid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYMENTID() {
        return paymentid;
    }

    /**
     * Sets the value of the paymentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYMENTID(String value) {
        this.paymentid = value;
    }

    /**
     * Gets the value of the reservationtypeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVATIONTYPEID() {
        return reservationtypeid;
    }

    /**
     * Sets the value of the reservationtypeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVATIONTYPEID(String value) {
        this.reservationtypeid = value;
    }

    /**
     * Gets the value of the salesorderdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSALESORDERDATE() {
        return salesorderdate;
    }

    /**
     * Sets the value of the salesorderdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSALESORDERDATE(String value) {
        this.salesorderdate = value;
    }

    /**
     * Gets the value of the salesorderitem property.
     * 
     * @return
     *     possible object is
     *     {@link ARRAYOFSALESITEMLIST }
     *     
     */
    public ARRAYOFSALESITEMLIST getSALESORDERITEM() {
        return salesorderitem;
    }

    /**
     * Sets the value of the salesorderitem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARRAYOFSALESITEMLIST }
     *     
     */
    public void setSALESORDERITEM(ARRAYOFSALESITEMLIST value) {
        this.salesorderitem = value;
    }

    /**
     * Gets the value of the salesordernote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSALESORDERNOTE() {
        return salesordernote;
    }

    /**
     * Sets the value of the salesordernote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSALESORDERNOTE(String value) {
        this.salesordernote = value;
    }

    /**
     * Gets the value of the salesordertype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSALESORDERTYPE() {
        return salesordertype;
    }

    /**
     * Sets the value of the salesordertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSALESORDERTYPE(String value) {
        this.salesordertype = value;
    }

    /**
     * Gets the value of the sellerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSELLERID() {
        return sellerid;
    }

    /**
     * Sets the value of the sellerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSELLERID(String value) {
        this.sellerid = value;
    }

}
