package br.com.hypersales.framework.service.register;

import java.util.Calendar;
import java.util.Date;

import br.com.hypersales.framework.model.register.Currency;
import br.com.hypersales.framework.presentation.JsonResult;
import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.util.enums.RequestStatus;

public class CurrencyService {

	public JsonResultList<Currency> getAllCurrencies() {
		JsonResultList<Currency> result = new JsonResultList<Currency>(RequestStatus.SUCCESS);

		for (int i = 0; i < 5; i++) {
			Currency c = new Currency("name" + i, Calendar.getInstance(), "R$",
					1.0f);
			c.setId("" + i);
			result.add(c);
		}

		return result;
	}

	public JsonResultList<Currency> getListByDate(Date currencyDate) {
		JsonResultList<Currency> result = new JsonResultList<Currency>(RequestStatus.SUCCESS);

		for (int i = 0; i < 5; i++) {
			Currency c = new Currency("name" + i, Calendar.getInstance(), "R$",
					1.0f);
			c.setId("" + i);
			result.add(c);
		}

		return result;
	}

	public JsonResult<Currency> getDataByCurrencyId(String currencyId, Date currencyDate) {
		JsonResult<Currency> result = new JsonResult<Currency>(RequestStatus.SUCCESS);

			Currency c = new Currency("name1", Calendar.getInstance(), "R$",
					1.0f);
			c.setId("1");
			result.setObject(c);
		return result;
	}
	
}
