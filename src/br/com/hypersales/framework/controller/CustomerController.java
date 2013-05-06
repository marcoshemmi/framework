package br.com.hypersales.framework.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.ModelAndView;

import br.com.hypersales.framework.model.register.Customer;
import br.com.hypersales.framework.service.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	
	CustomerService customerService = new CustomerService();

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody List<Customer> getAllCustomers(
										@RequestParam("hashCode") String hashCode
										) {
		List<Customer> customers = customerService.getAllCustomers();
		return customers;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody List<Customer> getListBySellerId(
										@RequestParam("hashCode") String hashCode, 
										@RequestParam("sellerId") String sellerId
										) {
		List<Customer> customers = customerService.getAllCustomers();
		return customers;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody List<Customer> getUnitListByCustomerId(
										@RequestParam("hashCode") String hashCode,
										@RequestParam("customerId") String customerId
										) {
		List<Customer> customers = customerService.getAllCustomers();
		return customers;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody Customer getDataByCustomerId(
										@RequestParam("hashCode") String hashCode,
										@RequestParam("customerId") String customerId,
										@RequestParam("customerUnitId") String customerUnitId
										) {
		return new Customer();
	}
	
	
	
}
