package br.com.hypersales.framework.service.authentication;

import br.com.hypersales.framework.model.authentication.Token;
import br.com.hypersales.framework.model.authentication.TokenHash;
import br.com.hypersales.framework.presentation.JsonResult;
import br.com.hypersales.framework.util.enums.RequestStatus;

public class TokenService {

	public JsonResult<Token> generateToken(String user, String password) {
		/*
		DUMMY OBJ
		TODO: chamar MODEL, quando estiver disponivel
		 */
		Token tokenResult = new Token();
		
		TokenHash t = new TokenHash();
		t.setCode("98r78jkfdsasdsafasd34rwd");
		t.setValidDate("20130520");
		t.setValidTime("235959");
		tokenResult.setTokenHash(t);

		tokenResult.setSellerId("000001");
		
		JsonResult<Token> resultJson = new JsonResult<Token>(tokenResult);
		//resultJson.set(tokenResult);
		resultJson.setResponseId(RequestStatus.SUCCESS.statusCode());
		resultJson.setResponseMessage(RequestStatus.SUCCESS.toString());

		return resultJson;
	}

}
