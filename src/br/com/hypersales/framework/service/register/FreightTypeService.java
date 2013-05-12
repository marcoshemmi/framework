package br.com.hypersales.framework.service.register;

import br.com.hypersales.framework.model.register.FreightType;
import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.util.enums.RequestStatus;

public class FreightTypeService {

	public JsonResultList<FreightType> getAllFreightTypes() {
		JsonResultList<FreightType> result = new JsonResultList<FreightType>();
		
		result.add(new FreightType(br.com.hypersales.framework.util.enums.FreightType.C.getNome(), br.com.hypersales.framework.util.enums.FreightType.C.getLabel()));
		result.add(new FreightType(br.com.hypersales.framework.util.enums.FreightType.F.getNome(), br.com.hypersales.framework.util.enums.FreightType.F.getLabel()));

		result.setResponseId(RequestStatus.SUCCESS.statusCode());
		result.setResponseMessage(RequestStatus.SUCCESS.toString());
		
		return result;
	}

}