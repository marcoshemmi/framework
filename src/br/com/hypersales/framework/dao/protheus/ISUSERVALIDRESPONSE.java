
package br.com.hypersales.framework.dao.protheus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ISUSERVALIDRESULT" type="{http://fw.rozac.com.br:81/}STRUCTRETURN"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "isuservalidresult"
})
@XmlRootElement(name = "ISUSERVALIDRESPONSE")
public class ISUSERVALIDRESPONSE {

    @XmlElement(name = "ISUSERVALIDRESULT", required = true)
    protected STRUCTRETURN isuservalidresult;

    /**
     * Gets the value of the isuservalidresult property.
     * 
     * @return
     *     possible object is
     *     {@link STRUCTRETURN }
     *     
     */
    public STRUCTRETURN getISUSERVALIDRESULT() {
        return isuservalidresult;
    }

    /**
     * Sets the value of the isuservalidresult property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRUCTRETURN }
     *     
     */
    public void setISUSERVALIDRESULT(STRUCTRETURN value) {
        this.isuservalidresult = value;
    }

}
