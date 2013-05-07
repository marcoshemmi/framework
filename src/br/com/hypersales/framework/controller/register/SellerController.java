package br.com.hypersales.framework.controller.register;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.hypersales.framework.model.register.Seller;
import br.com.hypersales.framework.presentation.JsonResult;
import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.service.register.SellerService;

@Controller
@RequestMapping("/sellers")
public class SellerController {

	SellerService sellerService = new SellerService();

	// /sellers/getlist/?hashCode=asfd1234
	@RequestMapping(value = "/getlist", method = RequestMethod.GET)
	public @ResponseBody
	JsonResultList<Seller> getList(@RequestParam("hashCode") String hashCode) {
		JsonResultList<Seller> sellers = sellerService.getAllSellers();
		return sellers;
	}

	// /sellers/getdatabysellerid/?hashCode=asfd1234&sellerId=001
	@RequestMapping(value = "/getdatabysellerid", method = RequestMethod.GET)
	public @ResponseBody
	JsonResult<Seller> getDataBySellerId(
			@RequestParam("hashCode") String hashCode,
			@RequestParam("sellerId") String sellerId) {
		return new JsonResult<Seller>();
	}

}