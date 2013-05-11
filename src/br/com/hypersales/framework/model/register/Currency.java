package br.com.hypersales.framework.model.register;

import java.util.Date;

public class Currency {

	private String id;
	private String name;
	private Date rateDate;
	private String symbol;
	private float rate;

	public Currency() {
		super();
	}

	public Currency(String name, Date rateDate, String symbol, float rate) {
		super();
		this.name = name;
		this.rateDate = rateDate;
		this.symbol = symbol;
		this.rate = rate;
	}

	public String getId() {
		return id;
	}

	// TODO metodo somente para testes
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getRateDate() {
		return rateDate;
	}

	public void setRateDate(Date rateDate) {
		this.rateDate = rateDate;
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