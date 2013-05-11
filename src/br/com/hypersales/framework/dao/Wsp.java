package br.com.hypersales.framework.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.logging.Logger;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import br.com.hypersales.framework.dao.protheus.*;
import br.com.hypersales.framework.model.commercial.SalesOrder;
import br.com.hypersales.framework.model.commercial.SalesOrderItem;

import javax.xml.parsers.*;
import javax.xml.xpath.*;

public class Wsp {

	public STRUCTRETURN execute(String procname, String[] args) throws XPathExpressionException, ParserConfigurationException, SAXException, IOException{
		STRUCTRETURN message;
		message = this.doGet(procname, args);
		return message;
	}
	
	public STRUCTRETURN insert(SalesOrder salesorder){
		STRUCTRETURN message;
		message = this.doPut(salesorder);
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

		//ServletContext context = getServletContext();
		//InputStream is = context.getRealPath("/WEB-INF/procedures.xml");
		FileInputStream fis = new FileInputStream("procedures.xml");

		Document doc = builder.parse(fis);

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

			Logger log =  Logger.getLogger("WSP Query");
			log.warning("query:" + query);

			message = salesordersoap.getsql(query);
		}else{
			message.responseid = "400";
			message.responsemessage = "Metodo nao encontrado!";
			message.salesorderid = new ARRAYOFSTRING();
			message.salesorderid.getSTRING().add("");
		}
		return message;
	}

	  private STRUCTRETURN doPut(SalesOrder salesorder){
		  SETSALESORDERSTRUCT setsalesorder = new SETSALESORDERSTRUCT();
		  setsalesorder.setSELLERID(salesorder.getSeller().getId());
		  //setsalesorder.setSALESORDERTYPE();
		  setsalesorder.setRESERVATIONTYPEID(salesorder.getReservationTypeId());
		  setsalesorder.setCUSTOMERID(salesorder.getCustomer().getId());
		  setsalesorder.setCUSTOMERUNITID(salesorder.getCustomerUnit().getId());
		  setsalesorder.setCUSTOMERDELIVERID(salesorder.getDeliveryId());
		  setsalesorder.setCUSTOMERUNITDELIVERID(salesorder.getDeliveryUnitId());
		  setsalesorder.setSALESORDERDATE(salesorder.getSalesOrderDate());
		  setsalesorder.setOPERATIONTYPEID(String.valueOf(salesorder.getOperationType().ordinal()));
		  setsalesorder.setFREIGHTTYPEID(salesorder.getFreightType().getLabel());
		  setsalesorder.setCARRIERID(salesorder.getCarrier().getId());
		  setsalesorder.setPAYMENTID(salesorder.getPayment().getId());
		  setsalesorder.setSALESORDERNOTE(salesorder.getNote());
		  ARRAYOFSALESITEMLIST sil = new ARRAYOFSALESITEMLIST();
		  for(SalesOrderItem soi : salesorder.getSalesOrderItems()){
			  SALESITEMLIST salesitemlist = new SALESITEMLIST();
			  salesitemlist.setPRODUCTID(soi.getId());
			  salesitemlist.setCURRENCYID(soi.getCurrency().getId());
			  salesitemlist.setSALESORDERUNITVALUE(soi.getUnitValue());
			  salesitemlist.setSALESORDERDISCOUNTVALUE(soi.getUnitDiscount());
			  salesitemlist.setBRANCHID(soi.getBranch().getId());
			  salesitemlist.setSALESORDERITEMQUANTIY(soi.getItemQuantity());
			  //TODO: codigo da soliciatacao de compra
			  salesitemlist.setPURCHASEREQUESTID("      ");
			  sil.getSALESITEMLIST().add(salesitemlist);
		  }
		  setsalesorder.setSALESORDERITEM(sil);
		  STRUCTRETURN message;
		  HYPERSALESSOAP salesordersoap = new HYPERSALES().getHYPERSALESSOAP();
		  message = salesordersoap.insert(setsalesorder);
		  return message;
	  }
}
