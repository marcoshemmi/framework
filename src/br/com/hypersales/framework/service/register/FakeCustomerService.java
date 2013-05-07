package br.com.hypersales.framework.service.register;

import br.com.hypersales.framework.model.register.Carrier;
import br.com.hypersales.framework.model.register.Customer;
import br.com.hypersales.framework.model.register.Payment;
import br.com.hypersales.framework.model.register.Seller;
import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.util.enums.FreightType;
import br.com.hypersales.framework.util.enums.RequestStatus;

public class FakeCustomerService {

	JsonResultList<Customer> custumers = new JsonResultList<Customer>();

	public FakeCustomerService() {
		Seller s1 = new Seller("name1", "shortName1");
		s1.setId("1");
		Seller s2 = new Seller("name2", "shortName2");
		s2.setId("2");
		
		Payment p = new Payment("description");
		p.setId("000001");
		
		Carrier car = new Carrier("name", "shortName");
		car.setId("000001");
		

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
			 123456 + i,
			 456 + i,
			 12 + i,
			 45645678 + i,
			 45645645 + i,
			 "countryCode" + i,
			 "countryName" + i,
			 "inovicingAddress" + i,
			 "deliveryAddress" + i,
			 "receptionAddress" + i,
			 "contactName" + i,
			 p, // payment
			 car, //carrier
			 i%2==0?s1:s2, // intercala entre os dois seller
			 FreightType.C,//freightType
			 null // 
			 );

			 c.setId("00000"+i);

			custumers.add(c);
		}
	}

	public JsonResultList<Customer> getAllCustomers() {

		return custumers;
	}

	public JsonResultList<Customer> getListBySellerId(String hashCode,
			String sellerId) {

		JsonResultList<Customer> resposta = new JsonResultList<Customer>();
		if (resposta == null)
			return null;

		resposta.setResponseId(RequestStatus.SUCCESS.statusCode());
		resposta.setResponseMessage(RequestStatus.SUCCESS.toString());

		for (Customer customer : getAllCustomers().getList()) {
			if (customer.getSeller().getId() == sellerId.trim()) {
				resposta.add(customer);
			}
		}

		return resposta;
	}
	// TODO TESTE método para teste
	public static Customer createOneCustomer(){
		int i = 9;
		
		Seller s1 = new Seller("name1", "shortName1");
		s1.setId("1");
		
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
			 123456 + i,
			 456 + i,
			 12 + i,
			 45645678 + i,
			 45645645 + i,
			 "countryCode" + i,
			 "countryName" + i,
			 "inovicingAddress" + i,
			 "deliveryAddress" + i,
			 "receptionAddress" + i,
			 "contactName" + i,
			 null, // payment
			 null, //carrier
			 s1, 
			 null,//freightType
			 null
			 );

			 c.setId(""+i);
			 return c;
	}

	public JsonResultList<Customer> getUnitListByCustomerId(String hashCode,
			String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	public JsonResultList<Customer> getDataByCustomerId(String hashCode,
			String customerId, String customerUnitId) {
		// TODO Auto-generated method stub
		return null;
	}

}
