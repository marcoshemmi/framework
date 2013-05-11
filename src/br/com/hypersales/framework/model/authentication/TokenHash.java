package br.com.hypersales.framework.model.authentication;

import java.io.Serializable;

public class TokenHash implements Serializable {
	private String code;
	private String validDate;
	private String validTime;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getValidDate() {
		return validDate;
	}
	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}
	public String getValidTime() {
		return validTime;
	}
	public void setValidTime(String validTime) {
		this.validTime = validTime;
	}
}
