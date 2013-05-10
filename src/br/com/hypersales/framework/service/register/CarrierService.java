package br.com.hypersales.framework.service.register;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import br.com.hypersales.framework.dao.Wsp;
import br.com.hypersales.framework.dao.protheus.ARRAYOFSTRING;
import br.com.hypersales.framework.dao.protheus.STRUCTRETURN;
import br.com.hypersales.framework.model.register.Carrier;
import br.com.hypersales.framework.model.register.Payment;
import br.com.hypersales.framework.presentation.JsonResultList;

public class CarrierService {

	public JsonResultList<Carrier> getAllCarriers() {
		JsonResultList<Carrier> result = new JsonResultList<Carrier>();

		Wsp daoWs = new Wsp();
		try {
			STRUCTRETURN retorno = daoWs.execute("Carrier_getList", null);
			if (retorno.getRESPONSEMESSAGE().equals("OK")) {
				ARRAYOFSTRING item = retorno.getSALESORDERID();
				for (String record : item.getSTRING()) {
					record = record.substring(1);
					record = record.substring(0, record.length() - 2);

					String[] keyValueRecord = record.split("\",\"");

					Carrier carrier = new Carrier();

					for (String kv : keyValueRecord) {

						// posicao 0: name e 1:value
						String[] keyValue = kv.split("\":\"");

						if (keyValue[0].toUpperCase().equals("CARRIERID")) {
							carrier.setId(keyValue[1]);
						} else if (keyValue[0].toUpperCase().equals(
								"CARRIERNAME")) {
							carrier.setName(keyValue[1]);
						}

					}
					result.add(carrier);
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
