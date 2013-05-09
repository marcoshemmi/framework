package br.com.hypersales.framework.controller.register;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.util.enums.FreightType;
import br.com.hypersales.framework.util.enums.RequestStatus;

@Controller
@RequestMapping("/freighttype")
public class FreightTypeController {

	// FakeCustomerService fakeCustomerService = new FakeCustomerService();

	// /freighttype/getList/?hashCode=asdf1234
	@RequestMapping(value = "/getlist", method = RequestMethod.GET)
	public @ResponseBody
	JsonResultList<FreightType> getList(
			@RequestParam("hashCode") String hashCode) {
		JsonResultList<FreightType> freightType = new JsonResultList<FreightType>();

		freightType.setResponseId(RequestStatus.SUCCESS.statusCode());
		freightType.setResponseMessage(RequestStatus.SUCCESS.toString());

		for (FreightType ft : FreightType.values()) {
			freightType.add(ft);
		}

		return freightType;
	}

}
