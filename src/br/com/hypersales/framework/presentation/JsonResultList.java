package br.com.hypersales.framework.presentation;

import br.com.hypersales.framework.util.enums.RequestStatus;
import java.util.ArrayList;
import java.util.List;

public class JsonResultList<T> extends AbstractJsonResult<T> {

	private List<T> list;
	
	public JsonResultList() {
		super();
	}
	
	public JsonResultList(List<T> list) {
		super();
		this.list = list;
	}
	
	public JsonResultList(RequestStatus requestStatus) {
		super();
		super.setResponseId(requestStatus.statusCode());
		super.setResponseMessage(requestStatus.toString());
		//responseId = requestStatus.statusCode();
		//this.responseMessage = requestStatus.toString();
	}
	
	public List<T> getList(){
		return list;
	}

	public void add(T t) {
		if (list == null) {
			list = new ArrayList<>();
		}
		list.add(t);
	}

}
