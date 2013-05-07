package br.com.hypersales.framework.service.register;

import br.com.hypersales.framework.model.register.Customer;
import br.com.hypersales.framework.model.register.CustomerUnit;
import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.util.enums.RequestStatus;

public class FakeCustomerUnitService {

	public JsonResultList<CustomerUnit> getUnitListByCustomerId(
			String hashCode, String customerId) {

		JsonResultList<CustomerUnit> custUnit = new JsonResultList<CustomerUnit>();

		custUnit.setResponseId(RequestStatus.SUCCESS.statusCode());
		custUnit.setResponseMessage(RequestStatus.SUCCESS.toString());

		for (Customer customer : new FakeCustomerService().getAllCustomers()
				.getList()) {
			if (customer.getId().equals(customerId.trim()) ) {
				custUnit.add(customer.getCustomerUnit());
			}
		}

		return custUnit;
	}
}
