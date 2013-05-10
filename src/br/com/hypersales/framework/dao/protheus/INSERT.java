
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
 *         &lt;element name="STRUCTSETSALESORDER" type="{http://fw.rozac.com.br:81/}SETSALESORDERSTRUCT" minOccurs="0"/>
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
    "structsetsalesorder"
})
@XmlRootElement(name = "INSERT")
public class INSERT {

    @XmlElement(name = "STRUCTSETSALESORDER")
    protected SETSALESORDERSTRUCT structsetsalesorder;

    /**
     * Gets the value of the structsetsalesorder property.
     * 
     * @return
     *     possible object is
     *     {@link SETSALESORDERSTRUCT }
     *     
     */
    public SETSALESORDERSTRUCT getSTRUCTSETSALESORDER() {
        return structsetsalesorder;
    }

    /**
     * Sets the value of the structsetsalesorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SETSALESORDERSTRUCT }
     *     
     */
    public void setSTRUCTSETSALESORDER(SETSALESORDERSTRUCT value) {
        this.structsetsalesorder = value;
    }

}
