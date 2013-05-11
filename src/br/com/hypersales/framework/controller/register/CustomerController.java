package br.com.hypersales.framework.controller.register;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.hypersales.framework.model.register.Customer;
import br.com.hypersales.framework.presentation.JsonResult;
import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.service.register.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	
	//CustomerService customerService = new CustomerService();
	
	CustomerService CustomerService = new CustomerService();

	// /customers/getallcustomers/?hashCode=asdf1234
	@RequestMapping(value = "/getallcustomers", method = RequestMethod.GET)
	public @ResponseBody JsonResultList<Customer> getAllCustomers(
										@RequestParam("hashCode") String hashCode
										) {
		JsonResultList<Customer> customers = CustomerService.getAllCustomers(hashCode);
		return customers;
	}
	
	// /customers/getlistbysellerid/?hashCode=asdf1234&sellerId=000001
	@RequestMapping(value = "/getlistbysellerid", method = RequestMethod.GET)
	public @ResponseBody JsonResultList<Customer> getListBySellerId(
										@RequestParam("hashCode") String hashCode, 
										@RequestParam("sellerId") String sellerId
										) {
		JsonResultList<Customer> customers = CustomerService.getListBySellerId(sellerId);
		return customers;
	}
	

	
	// /customers/getdataBycustomerid/?hashCode=asdf1234&customerId=001&customerUnitId=001
	@RequestMapping(value = "/getdataBycustomerid", method = RequestMethod.GET)
	public @ResponseBody JsonResult<Customer> getDataByCustomerId(
										@RequestParam("hashCode") String hashCode,
										@RequestParam("customerId") String customerId,
										@RequestParam("customerUnitId") String customerUnitId
										) {
		JsonResult<Customer> customers = CustomerService.getDataByCustomerId(customerId, customerUnitId);
		return customers;
	}
	
	
	
}
