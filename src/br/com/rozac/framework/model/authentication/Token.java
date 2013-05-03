package br.com.rozac.framework.model.authentication;

import br.com.rozac.framework.util.JsonResult;

public class Token  extends JsonResult {
	
	private String sellerId;
	private TokenHash tokenHash;
	
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public TokenHash getTokenHash() {
		return tokenHash;
	}
	public void setTokenHash(TokenHash tokenHash) {
		this.tokenHash = tokenHash;
	}
	
}
