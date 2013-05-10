package br.com.hypersales.framework.controller.register;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.service.register.PaymentService;
import br.com.hypersales.framework.model.register.Payment;

@Controller
@RequestMapping("/payments")
public class PaymentController {
	
	
	PaymentService paymentService = new PaymentService();

	// /payments/getlist/?hashCode=asdf1234
	@RequestMapping(value = "/getlist", method = RequestMethod.GET)
	public @ResponseBody JsonResultList<Payment> getList(
										@RequestParam("hashCode") String hashCode
										) {
		JsonResultList<Payment> customers = paymentService.getList(hashCode);
		
		return customers;
	}
	
	
	
	
}
