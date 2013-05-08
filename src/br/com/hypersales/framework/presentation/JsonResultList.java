package br.com.hypersales.framework.presentation;

import java.util.ArrayList;
import java.util.List;

public class JsonResultList<T> extends JsonResult
{
	private List<T> list;
	
	public JsonResultList() {
		super();
	}
	
	public JsonResultList(List<T> list) {
		super();
		this.list = list;
	}
	
	public List<T> getList(){
		return list;
	}
	
	public void add(T t)
	{
		if(list == null) {
			list = new ArrayList<>();
		}
		list.add(t);
	}

}
