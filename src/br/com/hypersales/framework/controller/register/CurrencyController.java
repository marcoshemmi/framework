package br.com.hypersales.framework.controller.register;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.ModelAndView;

import br.com.hypersales.framework.model.register.Currency;
import br.com.hypersales.framework.service.register.CurrencyService;

@Controller
@RequestMapping("/currencies")
public class CurrencyController {

	CurrencyService currencyService = new CurrencyService();
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody List<Currency> getListByDate(
										@RequestParam("hashCode") String hashCode,
										@RequestParam("currencyDate") Date currencyDate
										) {
		List<Currency> currencies = currencyService.getAllCurrencies();
		return currencies;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody Currency getDataByCurrencyId(
										@RequestParam("hashCode") String hashCode,
										@RequestParam("currencyId") String currencyId,
										@RequestParam("currencyDate") Date currencyDate
										) {
		return new Currency();		
	}
	
}