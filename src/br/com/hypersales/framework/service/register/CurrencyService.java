package br.com.hypersales.framework.service.register;

import java.io.IOException;
import java.text.ParseException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import br.com.hypersales.framework.dao.Wsp;
import br.com.hypersales.framework.dao.protheus.ARRAYOFSTRING;
import br.com.hypersales.framework.dao.protheus.STRUCTRETURN;
import br.com.hypersales.framework.model.register.Currency;
import br.com.hypersales.framework.presentation.JsonResult;
import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.util.DateHelper;
import br.com.hypersales.framework.util.enums.RequestStatus;

public class CurrencyService {

	public JsonResultList<Currency> getListByDate(String currencyDate) {
		JsonResultList<Currency> result = new JsonResultList<Currency>();

		Wsp daoWs = new Wsp();
		try {
			DateHelper datehelper = new DateHelper();
			STRUCTRETURN retorno = daoWs.execute("Currency_getListByDate", new String[]{currencyDate, currencyDate});
			result.setResponseId(Integer.parseInt(retorno.responseid));
			result.setResponseMessage(retorno.responsemessage);
			if (retorno.getRESPONSEMESSAGE().equals("OK")) {
				ARRAYOFSTRING item = retorno.getSALESORDERID();
				for(String record : item.getSTRING()) {
					record = record.substring(1);
					record = record.substring(0, record.length() -2);

					String[] keyValueRecord = record.split("\",\"");

					Currency pRet = new Currency();

					for(String kv : keyValueRecord) {
						String[] keyValue = kv.split("\":\"");
						if (keyValue[0].toUpperCase().equals("CURRENCYID")) {
							pRet.setId(keyValue[1]);
						}
						if (keyValue[0].toUpperCase().equals("CURRENCYSYMBOL")) {
							pRet.setSymbol(keyValue[1]);
						}
						if (keyValue[0].toUpperCase().equals("CURRENCYNAME")) {
							pRet.setName(keyValue[1]);
						}
						if (keyValue[0].toUpperCase().equals("CURRENCYDATE")) {
							pRet.setRateDate(datehelper.FromFrameworkDateToDate(keyValue[1].toString()));
						}
						if (keyValue[0].toUpperCase().equals("CURRENCYRATE")) {
							pRet.setRate(Float.parseFloat(keyValue[1]));
						}
					}
					result.add(pRet);
				}
			}
		} catch (XPathExpressionException | ParserConfigurationException
				| SAXException | IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	public JsonResult<Currency> getDataByCurrencyId(String currencyId, String currencyDate) {
		JsonResult<Currency> result = new JsonResult<Currency>(RequestStatus.SUCCESS);

		Wsp daoWs = new Wsp();
		try {
			DateHelper datehelper = new DateHelper();
			STRUCTRETURN retorno = daoWs.execute("Currency_getDataByCurrencyId", new String[]{currencyDate, currencyDate, currencyId});
			result.setResponseId(Integer.parseInt(retorno.responseid));
			result.setResponseMessage(retorno.responsemessage);
			if (retorno.getRESPONSEMESSAGE().equals("OK")) {
				ARRAYOFSTRING item = retorno.getSALESORDERID();
				for(String record : item.getSTRING()) {
					record = record.substring(1);
					record = record.substring(0, record.length() -2);

					String[] keyValueRecord = record.split("\",\"");

					Currency pRet = new Currency();

					for(String kv : keyValueRecord) {
						String[] keyValue = kv.split("\":\"");
						if (keyValue[0].toUpperCase().equals("CURRENCYID")) {
							pRet.setId(keyValue[1]);
						}
						if (keyValue[0].toUpperCase().equals("CURRENCYSYMBOL")) {
							pRet.setSymbol(keyValue[1]);
						}
						if (keyValue[0].toUpperCase().equals("CURRENCYNAME")) {
							pRet.setName(keyValue[1]);
						}
						if (keyValue[0].toUpperCase().equals("CURRENCYDATE")) {
							pRet.setRateDate(datehelper.FromFrameworkDateToDate(keyValue[1].toString()));
						}
						if (keyValue[0].toUpperCase().equals("CURRENCYRATE")) {
							pRet.setRate(Float.parseFloat(keyValue[1]));
						}
					}
					result.setObject(pRet);
				}
			}
		} catch (XPathExpressionException | ParserConfigurationException
				| SAXException | IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
}
