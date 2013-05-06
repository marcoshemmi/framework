package br.com.hypersales.framework.service.stock;

import java.util.ArrayList;
import java.util.List;

import br.com.hypersales.framework.model.stock.Product;

public class ProductService {

	public List<Product> getAllProducts() {	
		List<Product> result = new ArrayList<Product>();
		result.add(new Product("aaaaaaaaaaa", "00001"));
		result.add(new Product("bbbbbbbbbbbbbb", "00002"));
		return result;
	}

}
