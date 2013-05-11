package br.com.hypersales.framework.service.register;

/*


DEPRECATED CLASS! USE CUSTOMERSERVICE INSTEAD!!

import br.com.hypersales.framework.model.register.Carrier;
import br.com.hypersales.framework.model.register.Customer;
import br.com.hypersales.framework.model.register.CustomerUnit;
import br.com.hypersales.framework.model.register.Payment;
import br.com.hypersales.framework.model.register.Seller;
import br.com.hypersales.framework.presentation.JsonResult;
import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.util.enums.FreightType;
import br.com.hypersales.framework.util.enums.RequestStatus;

public class FakeCustomerService {

	JsonResultList<Customer> custumers = new JsonResultList<Customer>();

	public FakeCustomerService() {
		Seller s1 = new Seller("name1", "shortName1");
		s1.setId("000001");
		Seller s2 = new Seller("name2", "shortName2");
		s2.setId("000002");
		
		Payment p1 = new Payment("description");
		p1.setId("000001");
		Payment p2 = new Payment("description");
		p2.setId("000002");
		
		Carrier car1 = new Carrier("name", "shortName");
		car1.setId("000001");
		Carrier car2 = new Carrier("name", "shortName");
		car2.setId("000002");
		
		CustomerUnit custUnit1 = new CustomerUnit("cnpj", "name", "city", "state");
		custUnit1.setId("000001");
		CustomerUnit custUnit2 = new CustomerUnit("cnpj", "name", "city", "state");
		custUnit2.setId("000002");
		

		for (int i = 1; i < 10; i++) {

			 Customer c = new Customer(	 
			 "name" + i,
			 "tradeName" + i,
			 "cnpj" + i,
			 "stateRegistration" + i,
			 "districtRegistration" + i,
			 "idCard" + i,
			 "address" + i,
			 "city" + i,
			 "state" + i,
			 "district" + i,
			 "123456" + i,
			 "456" + i,
			 "12" + i,
			 "45645678" + i,
			 "45645645" + i,
			 "countryCode" + i,
			 "countryName" + i,
			 "inovicingAddress" + i,
			 "deliveryAddress" + i,
			 "receptionAddress" + i,
			 "contactName" + i,
			 i%2==1?p1:p2, // intercala entre os dois payment
			 i%2==1?car1:car2, //intercala entre os dois carrier
			 i%2==1?s1:s2, // intercala entre os dois seller
			 i%2==1?FreightType.C:FreightType.F,// intercala entre os dois freightType
			 i%2==1?custUnit1:custUnit2 // intercala entre os dois CustomerUnit
			 );

			 c.setId("00000"+i);

			custumers.add(c);
		}
	}

	public JsonResultList<Customer> getAllCustomers(String hashcode) {
		
		custumers.setResponseId(RequestStatus.SUCCESS.statusCode());
		custumers.setResponseMessage(RequestStatus.SUCCESS.toString());
		
		return custumers;
	}

	public JsonResultList<Customer> getListBySellerId(String hashCode,
			String sellerId) {
		
		JsonResultList<Customer> resposta = new JsonResultList<Customer>();
		
		resposta.setResponseId(RequestStatus.SUCCESS.statusCode());
		resposta.setResponseMessage(RequestStatus.SUCCESS.toString());

		for (Customer customer : getAllCustomers("").getList()) {
			if (customer.getSeller().getId().equals(sellerId.trim())) {
				resposta.add(customer);
			}
		}

		return resposta;
	}
	
	public static Customer createOneCustomer(){
		int i = 1;
		
		Seller s1 = new Seller("name1", "shortName1");
		s1.setId("000001");
		Seller s2 = new Seller("name2", "shortName2");
		s2.setId("000002");
		
		Payment p1 = new Payment("description");
		p1.setId("000001");
		Payment p2 = new Payment("description");
		p2.setId("000002");
		
		Carrier car1 = new Carrier("name", "shortName");
		car1.setId("000001");
		Carrier car2 = new Carrier("name", "shortName");
		car2.setId("000002");
		
		CustomerUnit custUnit1 = new CustomerUnit("cnpj", "name", "city", "state");
		custUnit1.setId("000001");
		CustomerUnit custUnit2 = new CustomerUnit("cnpj", "name", "city", "state");
		custUnit2.setId("000002");
		
		
	Customer c = new Customer(	 
			 "name" + i,
			 "tradeName" + i,
			 "cnpj" + i,
			 "stateRegistration" + i,
			 "districtRegistration" + i,
			 "idCard" + i,
			 "address" + i,
			 "city" + i,
			 "state" + i,
			 "district" + i,
			 "123456" + i,
			 "456" + i,
			 "12" + i,
			 "45645678" + i,
			 "45645645" + i,
			 "countryCode" + i,
			 "countryName" + i,
			 "inovicingAddress" + i,
			 "deliveryAddress" + i,
			 "receptionAddress" + i,
			 "contactName" + i,
			 i%2==1?p1:p2, // intercala entre os dois payment
			 i%2==1?car1:car2, //intercala entre os dois carrier
			 i%2==1?s1:s2, // intercala entre os dois seller
			 i%2==1?FreightType.C:FreightType.F,// intercala entre os dois freightType
		   	 i%2==1?custUnit1:custUnit2 // intercala entre os dois CustomerUnit
			 );

			 c.setId(""+i);
			 return c;
	}

	

	public JsonResult<Customer> getDataByCustomerId(String hashCode,
			String customerId, String customerUnitId) {
		JsonResult<Customer> resposta = new JsonResult<Customer>();
		
		resposta.setResponseId(RequestStatus.SUCCESS.statusCode());
		resposta.setResponseMessage(RequestStatus.SUCCESS.toString());

		for (Customer customer : getAllCustomers("").getList()) {
			if (customer.getId().equals(customerId.trim())  && customer.getCustomerUnit().getId().equals(customerUnitId.trim())) {
				resposta.setObject(customer);
				break;
			}
		}
		
		return resposta;
	}

}
*/