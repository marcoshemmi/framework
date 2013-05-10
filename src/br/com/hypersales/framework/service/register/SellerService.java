package br.com.hypersales.framework.service.register;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import br.com.hypersales.framework.dao.Wsp;
import br.com.hypersales.framework.dao.protheus.ARRAYOFSTRING;
import br.com.hypersales.framework.dao.protheus.STRUCTRETURN;
import br.com.hypersales.framework.model.register.Payment;
import br.com.hypersales.framework.model.register.Seller;
import br.com.hypersales.framework.presentation.JsonResult;
import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.util.enums.RequestStatus;

public class SellerService {

	public JsonResultList<Seller> getAllSellers() {
		JsonResultList<Seller> result = new JsonResultList<Seller>();
		
		
		Wsp daoWs = new Wsp();
		try {
			STRUCTRETURN retorno = daoWs.execute("Seller_getList", null);
			if (retorno.getRESPONSEMESSAGE().equals("OK")) {
				ARRAYOFSTRING item = retorno.getSALESORDERID();
				for(String record : item.getSTRING()) {
					record = record.substring(1);
					record = record.substring(0, record.length() -2);

					String[] keyValueRecord = record.split("\",\"");

					Seller pRet = new Seller();
					pRet.setShortName("");

					for(String kv : keyValueRecord) {
						String[] keyValue = kv.split("\":\"");
						if (keyValue[0].toUpperCase().equals("SELLERID")) {
							pRet.setId(keyValue[1]);
						}
						if (keyValue[0].toUpperCase().equals("SELLERNAME")) {
							pRet.setName(keyValue[1]);
						}
					}
					result.add(pRet);
				}
			}
		} catch (XPathExpressionException | ParserConfigurationException
				| SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*
		result.setResponseId(RequestStatus.SUCCESS.statusCode());
		result.setResponseMessage(RequestStatus.SUCCESS.toString());

		for (int i = 1; i < 10; i++) {
			Seller s = new Seller("name" + i, "shortName" + 1);
			s.setId("00000" + i);

			result.add(s);
		}
		*/
		return result;
	}

}
