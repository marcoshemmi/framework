package br.com.hypersales.framework.service.register;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import br.com.hypersales.framework.dao.Wsp;
import br.com.hypersales.framework.dao.protheus.ARRAYOFSTRING;
import br.com.hypersales.framework.dao.protheus.STRUCTRETURN;
import br.com.hypersales.framework.model.register.Customer;
import br.com.hypersales.framework.model.register.CustomerUnit;
import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.util.enums.RequestStatus;

public class CustomerUnitService {

	public JsonResultList<CustomerUnit> getUnitListByCustomerId(
			String hashCode, String customerId) {

		JsonResultList<CustomerUnit> custUnit = new JsonResultList<CustomerUnit>(getUnitListByCustomerId(customerId));

		custUnit.setResponseId(RequestStatus.SUCCESS.statusCode());
		custUnit.setResponseMessage(RequestStatus.SUCCESS.toString());

		return custUnit;
	}
	
	
	private List<CustomerUnit> getUnitListByCustomerId(String customerId) {
		List<CustomerUnit> result = new ArrayList<>();
		
		Wsp daoWs = new Wsp();
		try {
			STRUCTRETURN retorno = daoWs.execute("CustomerUnit_getUnitListByCustomerId", new String[]{customerId});

			if (retorno.getRESPONSEMESSAGE().equals("OK")) {
				ARRAYOFSTRING item = retorno.getSALESORDERID();
				for(String record : item.getSTRING()) {
					record = record.substring(1);
					record = record.substring(0, record.length() -2);

					String[] keyValueRecord = record.split("\",\"");

					CustomerUnit cRet = new CustomerUnit();

					for(String kv : keyValueRecord) {
						String[] keyValue = kv.split("\":\"");
						if (keyValue[0].toUpperCase().equals("UNITID")) {
							cRet.setId(keyValue[1]);
						}
						if (keyValue[0].toUpperCase().equals("NAME")) {
							cRet.setName(keyValue[1]);
						}
						if (keyValue[0].toUpperCase().equals("CNPJ")) {
							cRet.setCnpj(keyValue[1]);
						}
						if (keyValue[0].toUpperCase().equals("CITY")) {
							cRet.setCity(keyValue[1]);
						}
						if (keyValue[0].toUpperCase().equals("STATE")) {
							cRet.setState(keyValue[1]);
						}

					}
					result.add(cRet);
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
