package br.com.hypersales.framework.service.commercial;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Logger;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.apache.juli.logging.Log;
import org.xml.sax.SAXException;

import br.com.hypersales.framework.dao.Wsp;
import br.com.hypersales.framework.dao.protheus.ARRAYOFSTRING;
import br.com.hypersales.framework.dao.protheus.STRUCTRETURN;
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
		
		JsonResultList<SalesOrder> result =  new JsonResultList<SalesOrder>(this.getOrderList(sellerId, dateFrom, dateTo, customerId));
		result.setResponseId(RequestStatus.SUCCESS.statusCode());
		result.setResponseMessage(RequestStatus.SUCCESS.toString());

		//JsonResultList<SalesOrder> result =  this.getOrderList(sellerId, dateFrom, dateTo, customerId);
		
		/*
		 * DUMMY OBJ TODO: chamar MODEL, quando estiver disponivel
		 */
		/*
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
*/
		return result;
	}

	public JsonResult<SalesOrder> getDataByOrderId(String hashCode,
			String salesOrderId) {

		/*
		 * DUMMY OBJ TODO: chamar MODEL, quando estiver disponivel
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
		
		Wsp daoWs = new Wsp();
		STRUCTRETURN retorno = daoWs.insert(so);
		resultJson.setResponseId(Integer.parseInt(retorno.responseid));
		resultJson.setResponseMessage(retorno.responsemessage);
		resultJson.add(new KeyValueResult("salesOrderId", retorno.getSALESORDERID()));
		
		/*for (int i=1; i<4; i++) {
			KeyValueResult<String, String> soInsertReturn = new KeyValueResult<>("salesOrderId", "00000" + i);
			resultJson.add(soInsertReturn);
		}
		
		resultJson.setResponseId(RequestStatus.SUCCESS.statusCode());
		resultJson.setResponseMessage(RequestStatus.SUCCESS.toString());
*/
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
	
	private List<SalesOrder> getOrderList(String sellerId,
			String dateFrom, String dateTo, String customerId) {
	
		List<SalesOrder> listRet = null;

		//TODO: este metodo deveria ser generico, e nao ser replicado em todos os locais.
		//TODO:colocar este metodo em uma camada apropriada 

		Wsp daoWs = new Wsp();

		String[] parameters = new String[]{sellerId, dateFrom, dateTo, customerId, customerId, customerId};
		STRUCTRETURN retorno = null;
		try {
			retorno = daoWs.execute("SalesOrder_getList", parameters);
		} catch (XPathExpressionException | ParserConfigurationException
				| SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Logger log =  Logger.getLogger("SalesOrderService");
		//log.warning("erro:" + erro + ", RETORNO: " + retorno.getRESPONSEMESSAGE());
		
		if (retorno.getRESPONSEMESSAGE().equals("OK")) {
			//int count = 0;
			ARRAYOFSTRING item = retorno.getSALESORDERID();
			listRet = new ArrayList<SalesOrder>();

			for(String record : item.getSTRING()) {

				record = record.substring(1);
				record = record.substring(0, record.length() -2);

				String[] keyValueRecord = record.split("\",\"");

				SalesOrder soRet = new SalesOrder();
				Customer c = new Customer();
				CustomerUnit cUnit = new CustomerUnit();

				for(String kv : keyValueRecord) {
					String[] keyValue = kv.split("\":\""); //posicao 0: name e 1:value
					if (keyValue[0].toUpperCase().equals("SALESORDERID") && keyValue.length > 1) {
						soRet.setId(keyValue[1]);
					}
					if (keyValue[0].toUpperCase().equals("BRANCHID")  && keyValue.length > 1) {
						//soRet.setBranchId(keyValue[1]);
					}
					if (keyValue[0].toUpperCase().equals("STATUSID")  && keyValue.length > 1) {
						if(! keyValue[1].equals("")) {
							for(SalesOrderStatus st : SalesOrderStatus.values()){
								if(st.statusCode() == Integer.parseInt(keyValue[1])) {
									soRet.setSalesOrderStatus(st);
									break;									
								}
							}
						}
					}
					if (keyValue[0].toUpperCase().equals("SALEDATE") && keyValue.length > 1) {
						soRet.setSalesOrderDate(keyValue[1]);
					}
					if (keyValue[0].toUpperCase().equals("RESERVATIONTYPEID") && keyValue.length > 1) {
						
						if(! keyValue[1].equals("")) {
							for(ReservationType r : ReservationType.values()){
								if(r.name().equals(keyValue[1])){
									soRet.setReservationType(r);
									break;
								}
							}
						}
						soRet.setReservationTypeId(keyValue[1]);
					}
					if (keyValue[0].toUpperCase().equals("CUSTOMERID") && keyValue.length > 1) {
						c.setId(keyValue[1]);
					}						
					if (keyValue[0].toUpperCase().equals("CNPJ") && keyValue.length > 1) {
						c.setCnpj(keyValue[1]);
					}						
					if (keyValue[0].toUpperCase().equals("NAME") && keyValue.length > 1) {
						c.setName(keyValue[1]);
					}
					if (keyValue[0].toUpperCase().equals("INVOICEKEY") && keyValue.length > 1) {
						soRet.setInvoiceKey(keyValue[1]);
					}
					if (keyValue[0].toUpperCase().equals("UNITID") && keyValue.length > 1) {
						cUnit.setId(keyValue[1]);
					}
					if (keyValue[0].toUpperCase().equals("UNITNAME") && keyValue.length > 1) {
						cUnit.setName(keyValue[1]);
					}

				}
				soRet.setCustomer(c);
				soRet.setCustomerUnit(cUnit);
				listRet.add(soRet);

				//listRet.add(pRet);
				//count++;
				//if(count == 5) break;
			}
		}

		return listRet;

	}

}
