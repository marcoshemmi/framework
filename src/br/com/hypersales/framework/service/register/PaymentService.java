package br.com.hypersales.framework.service.register;

import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import br.com.hypersales.framework.dao.Wsp;
import br.com.hypersales.framework.dao.protheus.ARRAYOFSTRING;
import br.com.hypersales.framework.dao.protheus.STRUCTRETURN;
import br.com.hypersales.framework.model.register.Payment;
import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.util.enums.RequestStatus;

public class PaymentService {

	public PaymentService() {

	}

	public JsonResultList<Payment> getList(String hashCode) {
		// TODO public JsonResultList<Payment> getList(String hashCode)
		/*
		Payment p1 = new Payment("description1");
		p1.setId("000001");
		Payment p2 = new Payment("description2");
		p2.setId("000002");
		Payment p3 = new Payment("description3");
		p3.setId("000003");
		
		JsonResultList<Payment> payments = new JsonResultList<Payment>();
		
		payments.setResponseId(RequestStatus.SUCCESS.statusCode());
		payments.setResponseMessage(RequestStatus.SUCCESS.toString());
		payments.add(p1);
		payments.add(p2);
		payments.add(p3);
		
		return payments;
		*/
		
		JsonResultList<Payment> payments = new JsonResultList<>(getAllPayments());

		payments.setResponseId(RequestStatus.SUCCESS.statusCode());
		payments.setResponseMessage(RequestStatus.SUCCESS.toString());

		return payments;
		
	}

	private List<Payment> getAllPayments() { 

		//TODO: este método deveria ser generico, e nao ser replicado em todos os locais.
		List<Payment> listRet = new ArrayList<Payment>();

		Wsp daoWs = new Wsp();
		try {
			STRUCTRETURN retorno = daoWs.execute("Payment_getList", null);
			if (retorno.getRESPONSEMESSAGE().equals("OK")) {
				//int count = 0;
				ARRAYOFSTRING item = retorno.getSALESORDERID();
				for(String record : item.getSTRING()) {
					record = record.substring(1);
					record = record.substring(0, record.length() -2);

					String[] keyValueRecord = record.split("\",\"");

					Payment pRet = new Payment();

					for(String kv : keyValueRecord) {
						String[] keyValue = kv.split("\":\""); //posicao 0: name e 1:value
						if (keyValue[0].toUpperCase().equals("PAYMENTID")) {
							pRet.setId(keyValue[1]);
						}
						if (keyValue[0].toUpperCase().equals("PAYMENTDESCRIPTION")) {
							pRet.setDescription(keyValue[1]);
						}
					}
					listRet.add(pRet);
					
					//listRet.add(pRet);
					//count++;
					//if(count == 5) break;
				}
			}
		} catch (XPathExpressionException | ParserConfigurationException
				| SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listRet;
	}

}
