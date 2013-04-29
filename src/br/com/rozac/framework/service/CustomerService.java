package br.com.rozac.framework.service;

import java.util.ArrayList;
import java.util.List;

import br.com.rozac.framework.model.Customer;

public class CustomerService {

	public List<Customer> getAllCustomers() {	
		List<Customer> result = new ArrayList<Customer>();
		result.add(new Customer("aaaaaaaaaaa", 1));
		result.add(new Customer("bbbbbbbbbbbbbb", 2));
		return result;
	}

}
