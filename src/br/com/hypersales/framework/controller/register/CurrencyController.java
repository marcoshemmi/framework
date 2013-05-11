package br.com.hypersales.framework.controller.register;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.hypersales.framework.model.register.Currency;
import br.com.hypersales.framework.presentation.JsonResult;
import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.service.register.CurrencyService;

@Controller
@RequestMapping("/currencies")
public class CurrencyController {

	CurrencyService currencyService = new CurrencyService();
	
	// /currencies/getlistbydate/?hashCode=asdf1234&currencyDate=20130606
	// TODO erro de bad request pode ser a data.
	@RequestMapping(value = "/getlistbydate", method = RequestMethod.GET)
	public @ResponseBody JsonResultList<Currency> getListByDate(
										@RequestParam("hashCode") String hashCode,
										@RequestParam("currencyDate") String currencyDate
										) {

		JsonResultList<Currency> currencies = currencyService.getListByDate(currencyDate);
		return currencies;
	}

	// /currencies/getdatabycurrencyid/?hashCode=asdf1234&currencyId=1&currencyDate=20130606
	@RequestMapping(value = "/getdatabycurrencyid", method = RequestMethod.GET)
	public @ResponseBody JsonResult<Currency> getDataByCurrencyId(
										@RequestParam("hashCode") String hashCode,
										@RequestParam("currencyId") String currencyId,
										@RequestParam("currencyDate") String currencyDate
										) {

		JsonResult<Currency> currency = currencyService.getDataByCurrencyId(currencyId, currencyDate);
		return currency;
	}
	
}