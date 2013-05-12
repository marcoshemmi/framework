package br.com.hypersales.framework.model.stock;

import java.util.Calendar;

public class PurchaseRequest {
	private String id;
	private String itemId;
	private String date;

	public PurchaseRequest() {
		super();
	}
	
	public PurchaseRequest(String itemId, String date) {
		super();
		this.itemId = itemId;
		this.date = date;
	}

	public String getId() {
		return id;
	}

	// TODO método somente para testes
	public void setId(String id) {
		this.id = id;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
