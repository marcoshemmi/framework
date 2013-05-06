package br.com.hypersales.framework.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.ModelAndView;

import br.com.hypersales.framework.model.register.Customer;
import br.com.hypersales.framework.service.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	
	CustomerService customerService = new CustomerService();

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody List<Customer> getAllCustomers() {
		List<Customer> customers = customerService.getAllCustomers();
		return customers;
	}
}
