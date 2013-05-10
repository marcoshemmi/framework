package br.com.hypersales.framework.service.authentication;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import br.com.hypersales.framework.dao.Wsp;
import br.com.hypersales.framework.dao.protheus.ARRAYOFSTRING;
import br.com.hypersales.framework.dao.protheus.STRUCTRETURN;
import br.com.hypersales.framework.model.authentication.Token;
import br.com.hypersales.framework.model.authentication.TokenHash;
import br.com.hypersales.framework.model.authentication.User;
import br.com.hypersales.framework.presentation.JsonResult;
import br.com.hypersales.framework.util.enums.RequestStatus;

public class TokenService {

	public JsonResult<Token> generateToken(String user, String password) {
		/*
		DUMMY OBJ
		TODO: chamar MODEL, quando estiver disponivel
		 */
		JsonResult<Token> resultJson; 
		
		User userFramework = authenticateUser(user, password);
		
		if(userFramework == null) {
			resultJson = new JsonResult<Token>(RequestStatus.UNAUTHORIZED_WRONG_AUTHENTICATION);
		} else { 

			//usuario valido. gera hash.

			String hashCode = UUID.randomUUID().toString(); 

			Token tokenResult = new Token();

			TokenHash t = new TokenHash();
			t.setCode(hashCode);

			Calendar cal = Calendar.getInstance();
			cal.setTime(new Date());
			cal.add(Calendar.HOUR_OF_DAY, 1);

			//Date today = Calendar.getInstance().getTime();

			SimpleDateFormat formatDate = new SimpleDateFormat("yyyyMMdd");
			SimpleDateFormat formatTime = new SimpleDateFormat("hhmss");

			t.setValidDate(formatDate.format(cal.getTime()));
			t.setValidTime(formatTime.format(cal.getTime()));
			tokenResult.setTokenHash(t);

			tokenResult.setSellerId(userFramework.getId());

			resultJson = new JsonResult<Token>(tokenResult);
			resultJson.setResponseId(RequestStatus.SUCCESS.statusCode());
			resultJson.setResponseMessage(RequestStatus.SUCCESS.toString());
		}



		return resultJson;
	}
	
	private User authenticateUser(String user, String password) {
		Wsp daoWs = new Wsp();
		
		User uRet = null;
		
		STRUCTRETURN retorno = daoWs.doIsUserValid(user, password);
		if (retorno.getRESPONSEMESSAGE().equals("OK")) {
			ARRAYOFSTRING item = retorno.getSALESORDERID();
			for(String record : item.getSTRING()) {
				uRet = new User();
				uRet.setId(record);
				uRet.setName(user);
				break; //(apenas um registro)
			}
		}
		return uRet;
	}

}
