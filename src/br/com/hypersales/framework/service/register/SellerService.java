package br.com.hypersales.framework.service.register;

import br.com.hypersales.framework.model.register.Seller;
import br.com.hypersales.framework.presentation.JsonResultList;

public class SellerService {

	public JsonResultList<Seller> getAllSellers() {
		JsonResultList<Seller> result = new JsonResultList<Seller>();
		result.add(new Seller("aaaaaaaaaaa", "00001"));
		result.add(new Seller("bbbbbbbbbbbbbb", "00002"));
		return result;
	}

}
