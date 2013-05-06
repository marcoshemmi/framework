package br.com.hypersales.framework.service.stock;

import java.util.ArrayList;
import java.util.List;

import br.com.hypersales.framework.model.stock.ProductGroup;

public class ProductGroupService {

	public List<ProductGroup> getAllProductGroups() {	
		List<ProductGroup> result = new ArrayList<ProductGroup>();
		result.add(new ProductGroup("aaaaaaaaaaa", "00001"));
		result.add(new ProductGroup("bbbbbbbbbbbbbb", "00002"));
		return result;
	}

}
