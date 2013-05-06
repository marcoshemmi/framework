package br.com.hypersales.framework.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.ModelAndView;

import br.com.hypersales.framework.model.register.Seller;
import br.com.hypersales.framework.service.SellerService;

@Controller
@RequestMapping("/sellers")
public class SellerController {

	SellerService sellerService = new SellerService();
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody List<Seller> getList(
										@RequestParam("hashCode") String hashCode
										) {
		List<Seller> sellers = sellerService.getAllSellers();
		return sellers;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody Seller getDataBySellerId(
										@RequestParam("hashCode") String hashCode,
										@RequestParam("sellerId") String sellerId
										) {
		return new Seller();		
	}
	
}