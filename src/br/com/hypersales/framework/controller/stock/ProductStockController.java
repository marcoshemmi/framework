package br.com.hypersales.framework.controller.stock;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.ModelAndView;

import br.com.hypersales.framework.model.stock.ProductStock;
import br.com.hypersales.framework.service.stock.ProductStockService;

@Controller
@RequestMapping("/productsstock")
public class ProductStockController {

	ProductStockService productStockService = new ProductStockService();
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody List<ProductStock> getListByProductId(
										@RequestParam("hashCode") String hashCode,
										@RequestParam("productId") String productId
										) {
		List<ProductStock> products = productStockService.getAllProductsStock();
		return products;
	}
	
}