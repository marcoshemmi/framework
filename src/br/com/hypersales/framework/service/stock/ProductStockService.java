package br.com.hypersales.framework.service.stock;

import java.util.Calendar;

import br.com.hypersales.framework.model.register.Branch;
import br.com.hypersales.framework.model.stock.ProductStock;
import br.com.hypersales.framework.model.stock.PurchaseRequest;
import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.util.enums.ReservationType;

public class ProductStockService {
	JsonResultList<ProductStock> productsStock = new JsonResultList<ProductStock>();

	public ProductStockService() {
		Branch b1 = new Branch("name1");
		b1.setId("000001");
		Branch b2 = new Branch("name2");
		b2.setId("000002");

		PurchaseRequest pr1 = new PurchaseRequest("000001",
				Calendar.getInstance());
		pr1.setId("000001");
		PurchaseRequest pr2 = new PurchaseRequest("000002",
				Calendar.getInstance());
		pr2.setId("000002");

		for (int i = 1; i < 10; i++) {
			ProductStock ps = new ProductStock("description" + i,
					"measureUnit", 100, 100, i % 2 == 1 ? b1 : b2,
					i % 2 == 1 ? ReservationType.A : ReservationType.B,
					i % 2 == 1 ? pr1 : pr2);
			productsStock.add(ps);
		}
	}

	public JsonResultList<ProductStock> getAllProductsStock(String hashCode) {
		return productsStock;
	}

}
