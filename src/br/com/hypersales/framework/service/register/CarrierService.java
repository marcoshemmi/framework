package br.com.hypersales.framework.service.register;

import br.com.hypersales.framework.model.register.Carrier;
import br.com.hypersales.framework.presentation.JsonResultList;

public class CarrierService {

	public JsonResultList<Carrier> getAllCarriers() {	
		JsonResultList<Carrier> result = new JsonResultList<Carrier>();
		result.add(new Carrier("aaaaaaaaaaa", "00001"));
		result.add(new Carrier("bbbbbbbbbbbbbb", "00002"));
		return result;
	}

}
