package br.com.hypersales.framework.service;

import java.util.ArrayList;
import java.util.List;

import br.com.hypersales.framework.model.register.Carrier;

public class CarrierService {

	public List<Carrier> getAllCarriers() {	
		List<Carrier> result = new ArrayList<Carrier>();
		result.add(new Carrier("aaaaaaaaaaa", "00001"));
		result.add(new Carrier("bbbbbbbbbbbbbb", "00002"));
		return result;
	}

}
