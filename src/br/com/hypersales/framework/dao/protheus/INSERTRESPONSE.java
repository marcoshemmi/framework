
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
 *         &lt;element name="INSERTRESULT" type="{http://fw.rozac.com.br:81/}STRUCTRETURN"/>
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
    "insertresult"
})
@XmlRootElement(name = "INSERTRESPONSE")
public class INSERTRESPONSE {

    @XmlElement(name = "INSERTRESULT", required = true)
    protected STRUCTRETURN insertresult;

    /**
     * Gets the value of the insertresult property.
     * 
     * @return
     *     possible object is
     *     {@link STRUCTRETURN }
     *     
     */
    public STRUCTRETURN getINSERTRESULT() {
        return insertresult;
    }

    /**
     * Sets the value of the insertresult property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRUCTRETURN }
     *     
     */
    public void setINSERTRESULT(STRUCTRETURN value) {
        this.insertresult = value;
    }

}
