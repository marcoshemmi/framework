package br.com.hypersales.framework.service.stock;

import br.com.hypersales.framework.model.stock.ProductGroup;
import br.com.hypersales.framework.presentation.JsonResultList;

public class ProductGroupService {

	public JsonResultList<ProductGroup> getAllProductGroups() {
		JsonResultList<ProductGroup> result = new JsonResultList<ProductGroup>();
		result.add(new ProductGroup("aaaaaaaaaaa"));
		result.add(new ProductGroup("bbbbbbbbbbbbbb"));
		return result;
	}

}
