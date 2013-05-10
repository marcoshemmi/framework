
package br.com.hypersales.framework.dao.protheus;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.hypersales.framework.dao.protheus package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.hypersales.framework.dao.protheus
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GETSQL }
     * 
     */
    public GETSQL createGETSQL() {
        return new GETSQL();
    }

    /**
     * Create an instance of {@link INSERT }
     * 
     */
    public INSERT createINSERT() {
        return new INSERT();
    }

    /**
     * Create an instance of {@link SETSALESORDERSTRUCT }
     * 
     */
    public SETSALESORDERSTRUCT createSETSALESORDERSTRUCT() {
        return new SETSALESORDERSTRUCT();
    }

    /**
     * Create an instance of {@link GETSQLRESPONSE }
     * 
     */
    public GETSQLRESPONSE createGETSQLRESPONSE() {
        return new GETSQLRESPONSE();
    }

    /**
     * Create an instance of {@link STRUCTRETURN }
     * 
     */
    public STRUCTRETURN createSTRUCTRETURN() {
        return new STRUCTRETURN();
    }

    /**
     * Create an instance of {@link INSERTRESPONSE }
     * 
     */
    public INSERTRESPONSE createINSERTRESPONSE() {
        return new INSERTRESPONSE();
    }

    /**
     * Create an instance of {@link ARRAYOFSTRING }
     * 
     */
    public ARRAYOFSTRING createARRAYOFSTRING() {
        return new ARRAYOFSTRING();
    }

    /**
     * Create an instance of {@link SALESITEMLIST }
     * 
     */
    public SALESITEMLIST createSALESITEMLIST() {
        return new SALESITEMLIST();
    }

    /**
     * Create an instance of {@link ARRAYOFSALESITEMLIST }
     * 
     */
    public ARRAYOFSALESITEMLIST createARRAYOFSALESITEMLIST() {
        return new ARRAYOFSALESITEMLIST();
    }

}
