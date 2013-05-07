package br.com.hypersales.framework.presentation;

public class JsonResult<T> extends AbstractJsonResult<T> {

	private T t;

	public JsonResult(T t) {
		super();
		this.t = t;
	}

	public JsonResult() {
		super();
	}

	public void setObject(T t) {
		this.t = t;
	}

	public T getObject() {
		return this.t;
	}

}