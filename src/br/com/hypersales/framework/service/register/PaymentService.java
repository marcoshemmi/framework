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

	public JsonResultList<Payment> getAllPayments() {
		JsonResultList<Payment> result = new JsonResultList<Payment>();

		Wsp daoWs = new Wsp();
		try {
			STRUCTRETURN retorno = daoWs.execute("Payment_getList", null);
			
			result.setResponseId(Integer.parseInt(retorno.responseid));
			result.setResponseMessage(retorno.responsemessage);
			
			if (retorno.getRESPONSEMESSAGE().equals("OK")) {
				ARRAYOFSTRING item = retorno.getSALESORDERID();
				for (String record : item.getSTRING()) {
					record = record.substring(1);
					record = record.substring(0, record.length() - 2);

					String[] keyValueRecord = record.split("\",\"");

					Payment payment = new Payment();

					for (String kv : keyValueRecord) {

						// posicao 0: name e 1:value
						String[] keyValue = kv.split("\":\"");

						if (keyValue[0].toUpperCase().equals("PAYMENTID")) {
							payment.setId(keyValue[1]);
						} else if (keyValue[0].toUpperCase().equals(
								"PAYMENTDESCRIPTION")) {
							payment.setDescription(keyValue[1]);
						}

					}
					result.add(payment);
				}
			}
			
		} catch (XPathExpressionException | ParserConfigurationException
				| SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

}