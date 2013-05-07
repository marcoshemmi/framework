package br.com.hypersales.framework.model.register;

import java.util.Calendar;

public class Currency {

	private String id;
	private String name;
	private Calendar data;
	private String symbol;
	private float rate;

	public Currency() {
		super();
	}

	public Currency(String name, Calendar data, String symbol, float rate) {
		super();
		this.name = name;
		this.data = data;
		this.symbol = symbol;
		this.rate = rate;
	}

	public String getId() {
		return id;
	}

	// TODO método somente para testes
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

}