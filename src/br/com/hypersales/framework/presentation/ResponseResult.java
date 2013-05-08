package br.com.hypersales.framework.presentation;

public abstract class ResponseResult {
	private int responseId;
	private String responseMessage;
	
	public int getResponseId() {
		return responseId;
	}
	public void setResponseId(int responseId) {
		this.responseId = responseId;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

}
