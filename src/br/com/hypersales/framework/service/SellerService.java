package br.com.hypersales.framework.service;

import java.util.ArrayList;
import java.util.List;

import br.com.hypersales.framework.model.register.Seller;

public class SellerService {

	public List<Seller> getAllSellers() {	
		List<Seller> result = new ArrayList<Seller>();
		result.add(new Seller("aaaaaaaaaaa", "00001"));
		result.add(new Seller("bbbbbbbbbbbbbb", "00002"));
		return result;
	}

}
