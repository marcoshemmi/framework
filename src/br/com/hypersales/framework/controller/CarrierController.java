package br.com.hypersales.framework.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.ModelAndView;

import br.com.hypersales.framework.model.register.Carrier;
import br.com.hypersales.framework.service.CarrierService;

@Controller
@RequestMapping("/carriers")
public class CarrierController {

	CarrierService carrierService = new CarrierService();
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody List<Carrier> getList(
										@RequestParam("hashCode") String hashCode
										) {
		List<Carrier> carriers = carrierService.getAllCarriers();
		return carriers;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody Carrier getDataByCarrierId(
										@RequestParam("hashCode") String hashCode,
										@RequestParam("carrierId") String carrierId
										) {
		return new Carrier();		
	}
	
}