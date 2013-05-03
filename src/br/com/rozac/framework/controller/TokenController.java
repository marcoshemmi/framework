package br.com.rozac.framework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.rozac.framework.model.authentication.Token;
import br.com.rozac.framework.model.authentication.TokenHash;
import br.com.rozac.framework.util.EnumRequestStatus;

@Controller
@RequestMapping("/auth")
public class TokenController {
	
	@RequestMapping(value = "/hash/", method = RequestMethod.GET)
	public @ResponseBody Token getHash(@RequestParam("userEmail") String email, 
										@RequestParam("userPassword") String password) {
		
		Token tokenResult = new Token();
		//1 - validar valores informados
		if(email.trim().equals("") || password.trim().equals(""))
		{
			//TODO: método generico para setar status de retorno
			tokenResult.setResponseId(EnumRequestStatus.BAD_REQUEST.statusCode());
			tokenResult.setResponseMessage(EnumRequestStatus.BAD_REQUEST.toString());
		} else {
			tokenResult.setResponseId(EnumRequestStatus.SUCCESS.statusCode());
			tokenResult.setResponseMessage(EnumRequestStatus.SUCCESS.toString());
			
			/*
				DUMMY OBJ
				TODO: chamar MODEL, quando estiver disponivel
			*/
			TokenHash t = new TokenHash();
			t.setCode("98r78jkfdsasdsafasd34rwd");
			t.setValidDate("20130520");
			t.setValidTime("235959");
			tokenResult.setTokenHash(t);
			
			tokenResult.setSellerId("000001");
		}
		
		
		return tokenResult;
	}
}
