package br.com.hypersales.framework.service.stock;

import br.com.hypersales.framework.model.stock.Product;
import br.com.hypersales.framework.model.stock.ProductGroup;
import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.util.enums.RequestStatus;

public class ProductService {

	JsonResultList<Product> products = new JsonResultList<Product>();

	public ProductService() {
		ProductGroup pg1 = new ProductGroup("name1");
		pg1.setId("000001");
		ProductGroup pg2 = new ProductGroup("name2");
		pg2.setId("000002");

		for (int i = 1; i < 10; i++) {
			Product p = new Product("description" + i, "measureUnit" + i,
					100 + i, i % 2 == 1 ? pg1 : pg2);
			p.setId("00000" + i);
		}
	}

	public JsonResultList<Product> getAllProducts(String hashcode) {
		products.setResponseId(RequestStatus.SUCCESS.statusCode());
		products.setResponseMessage(RequestStatus.SUCCESS.toString());

		return products;
	}

	public JsonResultList<Product> getListByProductGroupId(String hashCode,
			String productGroupId) {
		JsonResultList<Product> result = new JsonResultList<Product>();

		result.setResponseId(RequestStatus.SUCCESS.statusCode());
		result.setResponseMessage(RequestStatus.SUCCESS.toString());

		for (Product p : products.getList()) {
			if (p.getProductGroup().getId().equals(productGroupId.trim())) {
				result.add(p);
			}
		}
		return result;
	}
}
