package br.com.hypersales.framework.service.register;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.hypersales.framework.model.register.Currency;

public class CurrencyService {

	public List<Currency> getAllCurrencies() {
		List<Currency> result = new ArrayList<Currency>();

		for (int i = 0; i < 5; i++) {
			Currency c = new Currency("name" + i, Calendar.getInstance(), "R$",
					1.0f);
			c.setId("" + i);
			result.add(c);
		}

		return result;
	}

}
