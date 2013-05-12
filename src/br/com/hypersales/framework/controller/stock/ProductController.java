package br.com.hypersales.framework.controller.stock;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.hypersales.framework.model.stock.Product;
import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.service.stock.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

	ProductService productService = new ProductService();
	
	// /products/getListByProductGroupId/?hashCode=asfd1234&productGroupId=00001
		@RequestMapping(value = "/getlistbyproductgroupid", method = RequestMethod.GET)
		public @ResponseBody JsonResultList<Product> getListByProductGroupId(
											@RequestParam("hashCode") String hashCode,
											@RequestParam("productGroupId") String productGroupId
											) {
			JsonResultList<Product> products = productService.getListByProductGroupId(hashCode, productGroupId);
			return products;
		}
	
}