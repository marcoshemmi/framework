package br.com.hypersales.framework.controller.commercial;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.ModelAndView;

import br.com.hypersales.framework.model.commercial.SalesOrder;
import br.com.hypersales.framework.service.commercial.SalesOrderService;
import br.com.hypersales.framework.util.JsonResultList;

@Controller
@RequestMapping("/salesorder")
public class SalesOrderController {
	
	SalesOrderService salesOrderService = new SalesOrderService();

	@RequestMapping(value = "/getlist/", method = RequestMethod.GET)
	public @ResponseBody JsonResultList<SalesOrder> getList(
									@RequestParam("hashCode") String hashCode, 
									@RequestParam("sellerId") String sellerId,
									@RequestParam("dateFrom") String dateFrom,
									@RequestParam("dateTo") String dateTo,
									@RequestParam("customerId") String customerId
									) {
		JsonResultList<SalesOrder> salesOrders = salesOrderService.getList(hashCode, sellerId, dateFrom, dateTo, customerId);
		return salesOrders;
	}
}