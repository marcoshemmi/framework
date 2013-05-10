
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
 *         &lt;element name="GETSQLRESULT" type="{http://fw.rozac.com.br:81/}STRUCTRETURN"/>
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
    "getsqlresult"
})
@XmlRootElement(name = "GETSQLRESPONSE")
public class GETSQLRESPONSE {

    @XmlElement(name = "GETSQLRESULT", required = true)
    protected STRUCTRETURN getsqlresult;

    /**
     * Gets the value of the getsqlresult property.
     * 
     * @return
     *     possible object is
     *     {@link STRUCTRETURN }
     *     
     */
    public STRUCTRETURN getGETSQLRESULT() {
        return getsqlresult;
    }

    /**
     * Sets the value of the getsqlresult property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRUCTRETURN }
     *     
     */
    public void setGETSQLRESULT(STRUCTRETURN value) {
        this.getsqlresult = value;
    }

}
