package br.com.hypersales.framework.controller.stock;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.hypersales.framework.model.stock.ProductStock;
import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.service.stock.ProductStockService;

@Controller
@RequestMapping("/productsstock")
public class ProductStockController {

	ProductStockService productStockService = new ProductStockService();

	@RequestMapping(value = "/getlistbyproductid", method = RequestMethod.GET)
	public @ResponseBody
	JsonResultList<ProductStock> getListByProductId(
			@RequestParam("hashCode") String hashCode,
			@RequestParam("productId") String productId) {
		JsonResultList<ProductStock> products = productStockService
				.getAllProductsStock();
		return products;
	}

}