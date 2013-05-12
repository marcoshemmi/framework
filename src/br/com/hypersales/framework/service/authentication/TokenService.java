package br.com.hypersales.framework.service.authentication;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

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

		JsonResult<Token> resultJson; 
		User userFramework = null;
		
		//1: tenta autenticar como vendedor (Seller)
		userFramework = authenticateSeller(user, password);
		
		//2: se não conseguir como vendedor, tenta autenticar como usuário Protheus
		if(userFramework == null) {
			userFramework = authenticateUser(user, password);
		}
		
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
	

    /**
     * Autentica um usuário no Protheus.
     * 
     * <p>
     * Aqui, retorna um usuário válido se o mesmo tiver sido criado no Protheus (ex: admin do protheus)
     * <p>
     * 
     * 
     */
	private User authenticateSeller(String email, String password) {
		Wsp daoWs = new Wsp();

		User uRet = null;

		try {
			STRUCTRETURN retorno = daoWs.execute("Authentication_getUserByEmail", new String[]{email});
			if (retorno.getRESPONSEMESSAGE().equals("OK")) {
				ARRAYOFSTRING item = retorno.getSALESORDERID();
				for(String record : item.getSTRING()) {
					record = record.substring(1);
					record = record.substring(0, record.length() -2);

					String[] keyValueRecord = record.split("\",\"");

					uRet = new User();

					for(String kv : keyValueRecord) {
						String[] keyValue = kv.split("\":\"");
						if (keyValue[0].toUpperCase().equals("SELLERID")) {
							uRet.setId(keyValue[1]);
						}
						if (keyValue[0].toUpperCase().equals("SELLERNAME")) {
							uRet.setName(keyValue[1]);
						}
						if (keyValue[0].toUpperCase().equals("SELLERPASSWORD")) {
							uRet.setPassword(keyValue[1]);
						}
					}
					
					if(! uRet.getPassword().equals(password)) {
						//senha não confere
						uRet = null;
					}

					break; //(apenas um registro)
				}
			}
		} catch (XPathExpressionException | ParserConfigurationException
				| SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return uRet;
	}

    /**
     * Autentica um Vendedor (seller).
     * 
     * <p>
     * <p>
     * 
     */
	private User authenticateUser(String user, String password) {
		Wsp daoWs = new Wsp();

		User uRet = null;

		STRUCTRETURN retorno = daoWs.doIsUserValid(user, password);
		if (retorno.getRESPONSEMESSAGE().equals("OK")) {
			ARRAYOFSTRING item = retorno.getSALESORDERID();
			for(String record : item.getSTRING()) {
				uRet = new User();
				uRet.setId(record); 
				//uRet.setId("000062");
				uRet.setName(user);
				break; //(apenas um registro)
			}
		}
		return uRet;
	}
	
}
