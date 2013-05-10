package br.com.hypersales.framework.dao;

import java.io.IOException;
import java.text.MessageFormat;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import br.com.hypersales.framework.dao.protheus.*;

import javax.xml.parsers.*;
import javax.xml.xpath.*;


public class Wsp {

	public STRUCTRETURN execute(String procname, String[] args) throws XPathExpressionException, ParserConfigurationException, SAXException, IOException{
		STRUCTRETURN message;
		message = this.doGet(procname, args);
		return message;
	}
	
	  private STRUCTRETURN doGet(String procname, String[] args)
			throws ParserConfigurationException, SAXException, 
			IOException, XPathExpressionException {
		
		STRUCTRETURN message = new STRUCTRETURN();
		String query = "";
		  
		DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
		domFactory.setNamespaceAware(true);
		DocumentBuilder builder = domFactory.newDocumentBuilder();
		Document doc = builder.parse("procedures.xml");
		
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		XPathExpression expr = xpath.compile("//proc[@name='"+procname+"']/query/text()");
		Object result = expr.evaluate(doc, XPathConstants.NODESET);
	    NodeList nodesquery = (NodeList) result;
	    if(nodesquery.getLength()>0){
	    	HYPERSALESSOAP salesordersoap = new HYPERSALES().getHYPERSALESSOAP();
	    	XPathExpression exprparam = xpath.compile("//proc[@name='"+procname+"']/parameters/param");
			Object resultparam = exprparam.evaluate(doc, XPathConstants.NODESET);
		    NodeList nodesparam = (NodeList) resultparam;
		    if(nodesparam.getLength()>0){
		    	query = MessageFormat.format(nodesquery.item(0).getNodeValue(), args);
		    }else{
		    	query = nodesquery.item(0).getNodeValue();
		    }
	    	message = salesordersoap.getsql(query);
	    }else{
	    	message.responseid = "400";
	    	message.responsemessage = "Metodo nao encontrado!";
	    	message.salesorderid = new ARRAYOFSTRING();
	    	message.salesorderid.getSTRING().add("");
	    }
		return message;
	}
}
