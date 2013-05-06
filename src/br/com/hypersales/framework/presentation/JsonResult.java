package br.com.hypersales.framework.presentation;

public class JsonResult<T> {
	
	private int responseId;
	private String responseMessage;
	private T t;
	
	public JsonResult(T t) {
		super();
		this.t = t;
	}
	
	public JsonResult() {
		super();
	}	
	
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
	
	public T getObject() {
		return this.t;
	}
	
}