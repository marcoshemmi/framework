package br.com.hypersales.framework.service.stock;

import java.util.ArrayList;
import java.util.List;

import br.com.hypersales.framework.model.stock.ProductStock;

public class ProductStockService {

	public List<ProductStock> getAllProductsStock() {	
		List<ProductStock> result = new ArrayList<ProductStock>();
		result.add(new ProductStock("aaaaaaaaaaa", "00001"));
		result.add(new ProductStock("bbbbbbbbbbbbbb", "00002"));
		return result;
	}

}
