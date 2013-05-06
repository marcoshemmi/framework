package br.com.hypersales.framework.service.commercial;

import java.util.ArrayList;
import java.util.List;

import br.com.hypersales.framework.model.commercial.SalesOrder;
import br.com.hypersales.framework.model.register.Customer;
import br.com.hypersales.framework.model.register.CustomerUnit;
import br.com.hypersales.framework.util.JsonResultList;
import br.com.hypersales.framework.util.enums.RequestStatus;
import br.com.hypersales.framework.util.enums.ReservationType;
import br.com.hypersales.framework.util.enums.SalesOrderStatus;

public class SalesOrderService {

	public JsonResultList<SalesOrder> getList(String hashCode, String sellerId, String dateFrom, String dateTo, String customerId) {
		/*
		DUMMY OBJ
		TODO: chamar MODEL, quando estiver disponível
		 */
		JsonResultList<SalesOrder> result = new JsonResultList<SalesOrder>();

		for (int i=1; i < 10; i++)
		{
			SalesOrder so = new SalesOrder();
			so.setId("000" + i);
			if(i > 7) {
				so.setSalesOrderStatusId(SalesOrderStatus.PROCESSING.statusCode());
				so.setSalesOrderStatus(SalesOrderStatus.PROCESSING);
			} 
			else if (i > 4) 
			{
				so.setSalesOrderStatusId(SalesOrderStatus.PICKING.statusCode());
				so.setSalesOrderStatus(SalesOrderStatus.PICKING);
			} 
			else
			{
				so.setSalesOrderStatusId(SalesOrderStatus.WAITING_ADVANCE_PAYMENT.statusCode());
				so.setSalesOrderStatus(SalesOrderStatus.WAITING_ADVANCE_PAYMENT);
			}
			so.setSalesOrderDate("20130303"); //TODO: usar FormatFrameworkDate do datehelper
			so.setReservationType(ReservationType.C);
			so.setReservationTypeId(ReservationType.C.name());

			Customer c = new Customer("00001", "Cliente 1");
			so.setCustomer(c);

			CustomerUnit cunit = new CustomerUnit();
			cunit.setCustomer(c);
			cunit.setId("01");
			cunit.setName("Cliente 1 loja " + i);
			cunit.setCNPJ("01.001.0001/0001-0" + i);
			cunit.setCity("SAO PAULO");
			cunit.setState("SP");

			so.setCustomerUnit(cunit);
			result.add(so);
		}

		result.setResponseId(RequestStatus.SUCCESS.statusCode());
		result.setResponseMessage(RequestStatus.SUCCESS.toString());

		return result;
	}

}
