package br.com.hypersales.framework.controller.register;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.hypersales.framework.model.register.Carrier;
import br.com.hypersales.framework.presentation.JsonResult;
import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.service.register.CarrierService;

@Controller
@RequestMapping("/carriers")
public class CarrierController {

	CarrierService carrierService = new CarrierService();

	// /carriers/getlist/?hashCode=asdf1234
	@RequestMapping(value = "/getlist", method = RequestMethod.GET)
	public @ResponseBody
	JsonResultList<Carrier> getList(@RequestParam("hashCode") String hashCode) {
		JsonResultList<Carrier> carriers = carrierService.getAllCarriers();
		return carriers;
	}

	// /carriers/getdatabycarrierid/?hashCode=asdf1234&carrierId=001

	@RequestMapping(value = "/getdatabycarrierid", method = RequestMethod.GET)
	public @ResponseBody
	JsonResult<Carrier> getDataByCarrierId(
			@RequestParam("hashCode") String hashCode,
			@RequestParam("carrierId") String carrierId) {
		
		JsonResult<Carrier> carriers = carrierService.getDataByCarrierId(carrierId);
		return carriers;
	}

}