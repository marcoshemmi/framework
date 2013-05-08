package br.com.hypersales.framework.service.register;

import br.com.hypersales.framework.model.register.Payment;
import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.util.enums.RequestStatus;

public class FakePaymentService {

	public FakePaymentService() {

	}

	public JsonResultList<Payment> getList(String hashCode) {
		// TODO public JsonResultList<Payment> getList(String hashCode)

		Payment p1 = new Payment("description1");
		p1.setId("000001");
		Payment p2 = new Payment("description2");
		p2.setId("000002");
		Payment p3 = new Payment("description3");
		p3.setId("000003");
		
		JsonResultList<Payment> payments = new JsonResultList<Payment>();
		
		payments.setResponseId(RequestStatus.SUCCESS.statusCode());
		payments.setResponseMessage(RequestStatus.SUCCESS.toString());
		
		
		payments.add(p1);
		payments.add(p2);
		payments.add(p3);
		
		
		return payments;
	}

}
