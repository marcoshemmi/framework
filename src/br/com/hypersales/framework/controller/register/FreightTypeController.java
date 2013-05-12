package br.com.hypersales.framework.controller.register;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.hypersales.framework.model.register.FreightType;
import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.service.register.FreightTypeService;

@Controller
@RequestMapping("/freighttype")
public class FreightTypeController {

	FreightTypeService fService = new FreightTypeService();

	// /freighttype/getList/?hashCode=asdf1234
	@RequestMapping(value = "/getlist", method = RequestMethod.GET)
	public @ResponseBody
	JsonResultList<FreightType> getList(
			@RequestParam("hashCode") String hashCode) {
		JsonResultList<FreightType> freightType = fService.getAllFreightTypes();

		return freightType;
	}

}
