package br.com.hypersales.framework.model.stock;

import java.util.Calendar;

public class PurchaseRequest {
	private String id;
	private String itemId;
	private Calendar date;

	public PurchaseRequest(String itemId, Calendar date) {
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

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

}
