package br.com.hypersales.framework.controller.register;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.hypersales.framework.model.register.CustomerUnit;
import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.service.register.CustomerUnitService;

@Controller
@RequestMapping("/customersunit")
public class CustomerUnitController {

	CustomerUnitService customerUnitService = new CustomerUnitService();

	// /customerunit/getunitlistbycustomerid/?hashCode=asdf1234&customerId=00001
	@RequestMapping(value = "/getunitlistbycustomerid", method = RequestMethod.GET)
	public @ResponseBody JsonResultList<CustomerUnit> getUnitListByCustomerId(
										@RequestParam("hashCode") String hashCode,
										@RequestParam("customerId") String customerId
										) {
		JsonResultList<CustomerUnit> customers = customerUnitService.getUnitListByCustomerId(hashCode, customerId);
		return customers;
	}

}