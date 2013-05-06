package br.com.hypersales.framework.controller.stock;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.ModelAndView;

import br.com.hypersales.framework.model.stock.ProductGroup;
import br.com.hypersales.framework.service.stock.ProductGroupService;

@Controller
@RequestMapping("/products")
public class ProductGroupController {

	ProductGroupService productGroupService = new ProductGroupService();
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody List<ProductGroup> getList(
										@RequestParam("hashCode") String hashCode
										) {
		List<ProductGroup> productGroups = productGroupService.getAllProductGroups();
		return productGroups;
	}
	
}