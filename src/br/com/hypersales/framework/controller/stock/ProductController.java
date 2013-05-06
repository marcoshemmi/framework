package br.com.hypersales.framework.controller.stock;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.ModelAndView;

import br.com.hypersales.framework.model.stock.Product;
import br.com.hypersales.framework.service.stock.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

	ProductService productService = new ProductService();
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody List<Product> getList(
										@RequestParam("hashCode") String hashCode,
										@RequestParam("productGroupId") String productGroupId
										) {
		List<Product> products = productService.getAllProducts();
		return products;
	}
	
}