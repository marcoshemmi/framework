package br.com.hypersales.framework.service;

import java.util.ArrayList;
import java.util.List;

import br.com.hypersales.framework.model.register.Currency;

public class CurrencyService {

	public List<Currency> getAllCurrencies() {	
		List<Currency> result = new ArrayList<Currency>();
		result.add(new Currency("aaaaaaaaaaa", "00001"));
		result.add(new Currency("bbbbbbbbbbbbbb", "00002"));
		return result;
	}

}
