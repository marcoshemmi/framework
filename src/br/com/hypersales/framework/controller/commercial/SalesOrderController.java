package br.com.hypersales.framework.controller.commercial;

import java.io.IOException;
import java.util.Hashtable;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.hypersales.framework.model.commercial.SalesOrder;
import br.com.hypersales.framework.model.commercial.SalesOrderMicro;
import br.com.hypersales.framework.presentation.JsonResult;
import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.presentation.KeyValueResult;
import br.com.hypersales.framework.service.commercial.SalesOrderService;
import br.com.hypersales.framework.util.JSONHelper;
import br.com.hypersales.framework.util.enums.RequestStatus;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Controller
@RequestMapping("/salesorder")
public class SalesOrderController {
	
	SalesOrderService salesOrderService = new SalesOrderService();

	// /salesorder/getlist/?hashCode=asdf1234&sellerId=001&dateFrom=20130606&dateTo=20130606&customerId=001
	@RequestMapping(value = "/getlist/", method = RequestMethod.GET)
	public @ResponseBody JsonResultList<SalesOrder> getList(
									@RequestParam("hashCode") String hashCode, 
									@RequestParam("sellerId") String sellerId,
									@RequestParam("dateFrom") String dateFrom,
									@RequestParam("dateTo") String dateTo,
									@RequestParam("customerId") String customerId
									) {
		
		if(customerId.equals("")) customerId = "000000";
		
		JsonResultList<SalesOrder> salesOrders = salesOrderService.getList(hashCode, sellerId, dateFrom, dateTo, customerId);
		return salesOrders;
	}
	
	// /salesorder/getbyorderid/hashCode=asdf1234&salesOrderId=001
	@RequestMapping(value = "/getbyorderid/", method = RequestMethod.GET)
	public @ResponseBody JsonResult<SalesOrder> getDataByOrderId(
									@RequestParam("hashCode") String hashCode, 
									@RequestParam("salesOrderId") String salesOrderId
									) {
		JsonResult<SalesOrder> salesOrder = salesOrderService.getDataByOrderId(hashCode, salesOrderId);
		return salesOrder;
	}

	// /salesorder/insert/hashCode=asdf1234&json={}
	@RequestMapping(value = "/insert/", method = RequestMethod.POST)
	public @ResponseBody JsonResultList<KeyValueResult<String, String>> insert(
									@RequestParam("hashCode") String hashCode, 
									@RequestParam("json") String salesOrderJSON
									) {
		
		JSONHelper<SalesOrder> helper = new JSONHelper<SalesOrder>();
		SalesOrder so;
		try {
			so = helper.FromJSONToObject(salesOrderJSON, SalesOrder.class);
			JsonResultList<KeyValueResult<String, String>> salesOrder = salesOrderService.insert(hashCode, so);
			return salesOrder;
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new JsonResultList<>(RequestStatus.BAD_REQUEST);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new JsonResultList<>(RequestStatus.BAD_REQUEST);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new JsonResultList<>(RequestStatus.BAD_REQUEST);
		}
	}
	
	
	// /salesorder/update/hashCode=asdf1234&json={}
	@RequestMapping(value = "/update/", method = RequestMethod.POST)
	public @ResponseBody JsonResult<KeyValueResult<String, String>> update(
									@RequestParam("hashCode") String hashCode, 
									@RequestParam("json") String salesOrderJSON
									) {
		
		JSONHelper<SalesOrder> helper = new JSONHelper<SalesOrder>();
		SalesOrder so;
		try {
			so = helper.FromJSONToObject(salesOrderJSON, SalesOrder.class);
			JsonResult<KeyValueResult<String, String>> salesOrder = salesOrderService.update(hashCode, so);
			return salesOrder;
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new JsonResult<>(RequestStatus.BAD_REQUEST);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new JsonResult<>(RequestStatus.BAD_REQUEST);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new JsonResult<>(RequestStatus.BAD_REQUEST);
		}
	}
	
	// /salesorder/delete/hashCode=asdf1234&salesOrderId=001
	@RequestMapping(value = "/delete/", method = RequestMethod.GET)
	public @ResponseBody JsonResult<KeyValueResult<String, String>> delete(
									@RequestParam("hashCode") String hashCode, 
									@RequestParam("salesOrderId") String salesOrderId
									) {
		JsonResult<KeyValueResult<String, String>> salesOrder = salesOrderService.delete(hashCode, salesOrderId);
		return salesOrder;
	}
	
	// /salesorder/getinsertresult/hashCode=asdf1234&portalSalesOrderId=001
	@RequestMapping(value = "/getinsertresult/", method = RequestMethod.GET)
	public @ResponseBody JsonResultList<SalesOrderMicro> getInsertResult(
									@RequestParam("hashCode") String hashCode, 
									@RequestParam("portalSalesOrderId") String portalSalesOrderId
									) {
		JsonResultList<SalesOrderMicro> salesOrders = salesOrderService.getInsertResult(hashCode, portalSalesOrderId);
		return salesOrders;
	}
	
}
