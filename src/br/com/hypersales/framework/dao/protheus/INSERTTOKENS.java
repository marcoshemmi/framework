
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
 *         &lt;element name="STRUCTTOKEN" type="{http://fw.rozac.com.br:81/}TOKENSTRUCT" minOccurs="0"/>
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
    "structtoken"
})
@XmlRootElement(name = "INSERTTOKENS")
public class INSERTTOKENS {

    @XmlElement(name = "STRUCTTOKEN")
    protected TOKENSTRUCT structtoken;

    /**
     * Gets the value of the structtoken property.
     * 
     * @return
     *     possible object is
     *     {@link TOKENSTRUCT }
     *     
     */
    public TOKENSTRUCT getSTRUCTTOKEN() {
        return structtoken;
    }

    /**
     * Sets the value of the structtoken property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOKENSTRUCT }
     *     
     */
    public void setSTRUCTTOKEN(TOKENSTRUCT value) {
        this.structtoken = value;
    }

}
