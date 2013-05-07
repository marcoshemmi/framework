package br.com.hypersales.framework.service.register;

import br.com.hypersales.framework.model.register.Customer;
import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.util.enums.RequestStatus;

public class CustomerService {

	public JsonResultList<Customer> getAllCustomers() {	
		//List<Customer> result = new ArrayList<Customer>();
		
		JsonResultList<Customer> result = new JsonResultList<Customer>();
		//result.add(new Customer("aaaaaaaaaaa", "00001"));
		//result.add(new Customer("bbbbbbbbbbbbbb", "00002"));
		
		result.setResponseId(RequestStatus.SUCCESS.hashCode());
		result.setResponseMessage(RequestStatus.SUCCESS.toString());
		
		return result;
	}

}
