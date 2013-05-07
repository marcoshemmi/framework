package br.com.hypersales.framework.service.register;

import java.util.Calendar;

import br.com.hypersales.framework.model.register.Currency;
import br.com.hypersales.framework.presentation.JsonResultList;

public class CurrencyService {

	public JsonResultList<Currency> getAllCurrencies() {
		JsonResultList<Currency> result = new JsonResultList<Currency>();

		for (int i = 0; i < 5; i++) {
			Currency c = new Currency("name" + i, Calendar.getInstance(), "R$",
					1.0f);
			c.setId("" + i);
			result.add(c);
		}

		return result;
	}

}
