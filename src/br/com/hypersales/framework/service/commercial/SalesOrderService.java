package br.com.hypersales.framework.service.commercial;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

import br.com.hypersales.framework.model.commercial.SalesOrder;
import br.com.hypersales.framework.model.commercial.SalesOrderMicro;
import br.com.hypersales.framework.model.register.Customer;
import br.com.hypersales.framework.model.register.CustomerUnit;
import br.com.hypersales.framework.presentation.JsonResult;
import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.presentation.KeyValueResult;
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
				so.setSalesOrderStatus(SalesOrderStatus.PROCESSING);
			} else if (i > 4) {
				so.setSalesOrderStatus(SalesOrderStatus.PICKING);
			} else {
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

	public JsonResultList<KeyValueResult<String, String>> insert(String hashCode, SalesOrder so)
	{
		JsonResultList<KeyValueResult<String, String>> resultJson = new JsonResultList<>();
		
		for (int i=1; i<4; i++) {
			KeyValueResult<String, String> soInsertReturn = new KeyValueResult<>("salesOrderId", "00000" + i);
			resultJson.add(soInsertReturn);
		}
		
		resultJson.setResponseId(RequestStatus.SUCCESS.statusCode());
		resultJson.setResponseMessage(RequestStatus.SUCCESS.toString());

		return resultJson;
	}
	
	public JsonResult<KeyValueResult<String, String>> update(String hashCode, SalesOrder so)
	{
		JsonResult<KeyValueResult<String, String>> resultJson = new JsonResult<>();
		
		KeyValueResult<String, String> soInsertReturn = new KeyValueResult<>("salesOrderId", "000001-01");
		resultJson.setObject(soInsertReturn);
		
		resultJson.setResponseId(RequestStatus.SUCCESS.statusCode());
		resultJson.setResponseMessage(RequestStatus.SUCCESS.toString());

		return resultJson;
	}
	
	public JsonResult<KeyValueResult<String, String>> delete(String hashCode, String salesOrderId)
	{
		JsonResult<KeyValueResult<String, String>> resultJson = new JsonResult<>();
		
		KeyValueResult<String, String> soInsertReturn = new KeyValueResult<>("salesOrderId", salesOrderId);
		resultJson.setObject(soInsertReturn);
		
		resultJson.setResponseId(RequestStatus.SUCCESS.statusCode());
		resultJson.setResponseMessage(RequestStatus.SUCCESS.toString());

		return resultJson;
	}
	
	public JsonResultList<SalesOrderMicro> getInsertResult(String hashCode, String portalSalesOrderId)
	{
		JsonResultList<SalesOrderMicro> resultJson = new JsonResultList<>();
		
		for (int i=1; i<4; i++) {
			SalesOrderMicro soInsertReturn = new SalesOrderMicro();
			soInsertReturn.setId("00000" + i);
			soInsertReturn.setSalesOrderStatus(SalesOrderStatus.WAITING_CREDIT_RELEASE);
			resultJson.add(soInsertReturn);
		}
		
		resultJson.setResponseId(RequestStatus.SUCCESS.statusCode());
		resultJson.setResponseMessage(RequestStatus.SUCCESS.toString());

		return resultJson;
	
	}
	
}
