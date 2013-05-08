package br.com.hypersales.framework.presentation;

import br.com.hypersales.framework.util.enums.RequestStatus;

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
	
	public JsonResult(RequestStatus requestStatus) {
		super();
		this.responseId = requestStatus.statusCode();
		this.responseMessage = requestStatus.toString();
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

	public void setObject(T t) {
		this.t = t;
	}

	public T getObject() {
		return this.t;
	}

}