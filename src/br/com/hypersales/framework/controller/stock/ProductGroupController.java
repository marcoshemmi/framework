package br.com.hypersales.framework.controller.stock;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.hypersales.framework.model.stock.ProductGroup;
import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.service.stock.ProductGroupService;

@Controller
@RequestMapping("/productgroups")
public class ProductGroupController {

	ProductGroupService productGroupService = new ProductGroupService();
	
	// /productgroups/getlist/?hashCode=asfd1234
	@RequestMapping(value = "/getlist", method = RequestMethod.GET)
	public @ResponseBody JsonResultList<ProductGroup> getList(
										@RequestParam("hashCode") String hashCode
										) {
		JsonResultList<ProductGroup> productGroups = productGroupService.getAllProductGroups();
		return productGroups;
	}
	
}