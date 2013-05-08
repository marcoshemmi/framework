package br.com.hypersales.framework.model.stock;

public class Product {
	private String id;
	private String description;
	private String measureUnit;
	private double price;

	public Product() {
		super();
	}

	public Product(String description, String measureUnit, double price) {
		super();
		this.description = description;
		this.measureUnit = measureUnit;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	// TODO método somente para testes
	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMeasureUnit() {
		return measureUnit;
	}

	public void setMeasureUnit(String measureUnit) {
		this.measureUnit = measureUnit;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}