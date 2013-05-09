package br.com.hypersales.framework.service.stock;

import com.sun.org.apache.bcel.internal.generic.BranchInstruction;
import com.sun.org.apache.bcel.internal.generic.Visitor;

import br.com.hypersales.framework.model.register.Branch;
import br.com.hypersales.framework.model.stock.ProductStock;
import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.util.enums.ReservationType;

public class ProductStockService {
	JsonResultList<ProductStock> productsStock = new JsonResultList<ProductStock>();

	public ProductStockService(){
		Branch b1 = new Branch("name1");
		b1.setId("000001");
		Branch b2 = new Branch("name2");
		b2.setId("000002");
		
		for (int i = 1; i < 10; i++) {
			ProductStock ps = new ProductStock("description" +i, "measureUnit", 100, 100, branch, i%2==1?ReservationType.A:ReservationType.b, purchaseRequest)
		}
	}

	public JsonResultList<ProductStock> getAllProductsStock() {
		JsonResultList<ProductStock> result = new JsonResultList<ProductStock>();
		// result.add(new ProductStock("aaaaaaaaaaa", "00001"));
		// result.add(new ProductStock("bbbbbbbbbbbbbb", "00002"));
		return result;
	}

}
