package br.com.hypersales.framework.service.commercial;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

import br.com.hypersales.framework.model.commercial.SalesOrder;
import br.com.hypersales.framework.model.register.Customer;
import br.com.hypersales.framework.model.register.CustomerUnit;
import br.com.hypersales.framework.presentation.JsonResult;
import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.util.enums.RequestStatus;
import br.com.hypersales.framework.util.enums.ReservationType;
import br.com.hypersales.framework.util.enums.SalesOrderStatus;

public class SalesOrderService {

	public JsonResultList<SalesOrder> getList(String hashCode, String sellerId,
			String dateFrom, String dateTo, String customerId) {
		/*
		 * DUMMY OBJ TODO: chamar MODEL, quando estiver dispon�vel
		 */
		JsonResultList<SalesOrder> result = new JsonResultList<SalesOrder>();

		for (int i = 1; i < 10; i++) {
			SalesOrder so = new SalesOrder();
			so.setId("00000" + i);
			if (i > 7) {
				so.setSalesOrderStatusId(SalesOrderStatus.PROCESSING
						.statusCode());
				so.setSalesOrderStatus(SalesOrderStatus.PROCESSING);
			} else if (i > 4) {
				so.setSalesOrderStatusId(SalesOrderStatus.PICKING.statusCode());
				so.setSalesOrderStatus(SalesOrderStatus.PICKING);
			} else {
				so.setSalesOrderStatusId(SalesOrderStatus.WAITING_ADVANCE_PAYMENT
						.statusCode());
				so.setSalesOrderStatus(SalesOrderStatus.WAITING_ADVANCE_PAYMENT);
			}
			so.setSalesOrderDate("20130303"); // TODO: usar FormatFrameworkDate
												// do datehelper
			so.setReservationType(ReservationType.C);
			so.setReservationTypeId(ReservationType.C.name());

			Customer c = new Customer();
			c.setId("00001");
			c.setName("cliente 1");
			so.setCustomer(c);

			CustomerUnit cunit = new CustomerUnit();
			cunit.setId("1");
			cunit.setName("Cliente 1 loja " + i);
			cunit.setCnpj("01.001.0001/0001-0" + i);
			cunit.setCity("SAO PAULO");
			cunit.setState("SP");

			so.setCustomerUnit(cunit);
			result.add(so);
		}

		result.setResponseId(RequestStatus.SUCCESS.statusCode());
		result.setResponseMessage(RequestStatus.SUCCESS.toString());

		return result;
	}

	public JsonResult<SalesOrder> getDataByOrderId(String hashCode,
			String salesOrderId) {

		/*
		 * DUMMY OBJ TODO: chamar MODEL, quando estiver dispon�vel
		 */

		SalesOrder so = new SalesOrder();
		so.setId("000001");
		so.setSalesOrderStatusId(SalesOrderStatus.PROCESSING.statusCode());
		so.setSalesOrderStatus(SalesOrderStatus.PROCESSING);
		so.setSalesOrderDate("20130303"); // TODO: usar FormatFrameworkDate do
											// datehelper
		so.setReservationType(ReservationType.C);
		so.setReservationTypeId(ReservationType.C.name());

		Customer c = new Customer();
		c.setId("00001");
		c.setName("cliente 1");
		so.setCustomer(c);

		CustomerUnit cunit = new CustomerUnit();
		cunit.setId("2");
		cunit.setName("Cliente 1 loja 1");
		cunit.setCnpj("01.001.0001/0001-01");
		cunit.setCity("SAO PAULO");
		cunit.setState("SP");

		so.setCustomerUnit(cunit);

		JsonResult<SalesOrder> result = new JsonResult<SalesOrder>(so);
		result.setResponseId(RequestStatus.SUCCESS.statusCode());
		result.setResponseMessage(RequestStatus.SUCCESS.toString());

		return result;
	}

	public JsonResult<Hashtable<String, String>> insert(String hashCode, SalesOrder so)
	{
		Hashtable<String, String> result = new Hashtable<>();
		result.put("salesOrderId", "000003");
		
		JsonResult<Hashtable<String, String>> resultJson = new JsonResult<Hashtable<String, String>>(result);
		
		resultJson.setResponseId(RequestStatus.SUCCESS.statusCode());
		resultJson.setResponseMessage(RequestStatus.SUCCESS.toString());

		return resultJson;
	}
	
}
