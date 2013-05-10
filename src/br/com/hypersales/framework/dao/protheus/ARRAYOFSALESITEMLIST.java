
package br.com.hypersales.framework.dao.protheus;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ARRAYOFSALESITEMLIST complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ARRAYOFSALESITEMLIST">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SALESITEMLIST" type="{http://fw.rozac.com.br:81/}SALESITEMLIST" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ARRAYOFSALESITEMLIST", propOrder = {
    "salesitemlist"
})
public class ARRAYOFSALESITEMLIST {

    @XmlElement(name = "SALESITEMLIST")
    protected List<SALESITEMLIST> salesitemlist;

    /**
     * Gets the value of the salesitemlist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesitemlist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSALESITEMLIST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SALESITEMLIST }
     * 
     * 
     */
    public List<SALESITEMLIST> getSALESITEMLIST() {
        if (salesitemlist == null) {
            salesitemlist = new ArrayList<SALESITEMLIST>();
        }
        return this.salesitemlist;
    }

}
