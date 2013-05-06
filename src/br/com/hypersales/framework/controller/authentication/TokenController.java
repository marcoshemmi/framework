package br.com.hypersales.framework.controller.authentication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.hypersales.framework.model.authentication.Token;
import br.com.hypersales.framework.presentation.JsonResult;
import br.com.hypersales.framework.service.authentication.TokenService;
import br.com.hypersales.framework.util.enums.RequestStatus;

@Controller
@RequestMapping("/auth")
// teste 2
public class TokenController {

	@RequestMapping(value = "/hash/", method = RequestMethod.GET)
	public @ResponseBody
	JsonResult<Token> getHash(@RequestParam("userEmail") String email,
			@RequestParam("userPassword") String password) {

		JsonResult<Token> tokenResult;

		TokenService tokenService = new TokenService();

		// 1 - validar valores informados
		if (email.trim().equals("") || password.trim().equals("")) {
			// TODO: m�todo generico para setar status de retorno
			tokenResult = new JsonResult<Token>();
			tokenResult.setResponseId(RequestStatus.BAD_REQUEST.statusCode());
			tokenResult
					.setResponseMessage(RequestStatus.BAD_REQUEST.toString());
		} else {
			tokenResult = tokenService.generateToken(email, password);
		}

		return tokenResult;
	}
}
