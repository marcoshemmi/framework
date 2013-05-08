package br.com.hypersales.framework.presentation;

import br.com.hypersales.framework.util.enums.RequestStatus;

public class JsonResult<T> extends AbstractJsonResult<T> {

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
		super.setResponseId(requestStatus.statusCode());
		super.setResponseMessage(requestStatus.toString());
	}

	public void setObject(T t) {
		this.t = t;
	}

	public T getObject() {
		return this.t;
	}

}