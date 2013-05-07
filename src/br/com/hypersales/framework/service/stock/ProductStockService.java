package br.com.hypersales.framework.service.stock;

import br.com.hypersales.framework.model.stock.ProductStock;
import br.com.hypersales.framework.presentation.JsonResultList;

public class ProductStockService {

	public JsonResultList<ProductStock> getAllProductsStock() {	
		JsonResultList<ProductStock> result = new JsonResultList<ProductStock>();
		result.add(new ProductStock("aaaaaaaaaaa", "00001"));
		result.add(new ProductStock("bbbbbbbbbbbbbb", "00002"));
		return result;
	}

}
