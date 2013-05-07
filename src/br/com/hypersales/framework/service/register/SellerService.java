package br.com.hypersales.framework.service.register;

import br.com.hypersales.framework.model.register.Seller;
import br.com.hypersales.framework.presentation.JsonResult;
import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.util.enums.RequestStatus;

public class SellerService {

	public JsonResultList<Seller> getAllSellers() {
		JsonResultList<Seller> result = new JsonResultList<Seller>();
		
		result.setResponseId(RequestStatus.SUCCESS.statusCode());
		result.setResponseMessage(RequestStatus.SUCCESS.toString());

		for (int i = 1; i < 10; i++) {
			Seller s = new Seller("name" + i, "shortName" + 1);
			s.setId("00000" + i);

			result.add(s);
		}

		return result;
	}

}
