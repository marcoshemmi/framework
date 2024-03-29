
package br.com.hypersales.framework.dao.protheus;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * Web Service responsavel pela integração de Pedidos de Vendas
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HYPERSALES", targetNamespace = "http://fw.rozac.com.br:81/", wsdlLocation = "http://fw.rozac.com.br:81/wsrozac/HYPERSALES.apw?WSDL")
public class HYPERSALES
    extends Service
{

    private final static URL HYPERSALES_WSDL_LOCATION;
    private final static WebServiceException HYPERSALES_EXCEPTION;
    private final static QName HYPERSALES_QNAME = new QName("http://fw.rozac.com.br:81/", "HYPERSALES");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://fw.rozac.com.br:81/wsrozac/HYPERSALES.apw?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HYPERSALES_WSDL_LOCATION = url;
        HYPERSALES_EXCEPTION = e;
    }

    public HYPERSALES() {
        super(__getWsdlLocation(), HYPERSALES_QNAME);
    }
/*
    public HYPERSALES(WebServiceFeature... features) {
        super(__getWsdlLocation(), HYPERSALES_QNAME, features);
    }
*/
    public HYPERSALES(URL wsdlLocation) {
        super(wsdlLocation, HYPERSALES_QNAME);
    }
/*
    public HYPERSALES(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HYPERSALES_QNAME, features);
    }
*/
    public HYPERSALES(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }
/*
    public HYPERSALES(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }
*/
    /**
     * 
     * @return
     *     returns HYPERSALESSOAP
     */
    @WebEndpoint(name = "HYPERSALESSOAP")
    public HYPERSALESSOAP getHYPERSALESSOAP() {
        return super.getPort(new QName("http://fw.rozac.com.br:81/", "HYPERSALESSOAP"), HYPERSALESSOAP.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HYPERSALESSOAP
     */
    @WebEndpoint(name = "HYPERSALESSOAP")
    public HYPERSALESSOAP getHYPERSALESSOAP(WebServiceFeature... features) {
        return super.getPort(new QName("http://fw.rozac.com.br:81/", "HYPERSALESSOAP"), HYPERSALESSOAP.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HYPERSALES_EXCEPTION!= null) {
            throw HYPERSALES_EXCEPTION;
        }
        return HYPERSALES_WSDL_LOCATION;
    }

}
