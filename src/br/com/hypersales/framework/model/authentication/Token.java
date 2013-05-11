package br.com.hypersales.framework.model.authentication;

import java.io.Serializable;

import br.com.hypersales.framework.presentation.JsonResult;

public class Token implements Serializable {
	
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
