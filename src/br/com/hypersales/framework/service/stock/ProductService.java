package br.com.hypersales.framework.service.stock;

import br.com.hypersales.framework.model.stock.Product;
import br.com.hypersales.framework.presentation.JsonResultList;

public class ProductService {

	public JsonResultList<Product> getAllProducts() {	
		JsonResultList<Product> result = new JsonResultList<Product>();
		//result.add(new Product("aaaaaaaaaaa", "00001"));
		//result.add(new Product("bbbbbbbbbbbbbb", "00002"));
		return result;
	}

	public JsonResultList<Product> getListByProductGroupId(String hashCode,
			String productGroupId) {
		
		// TODO JsonResultList<Product> getListByProductGroupId
		return null;
	}

}
