package br.com.hypersales.framework.model.stock;

public class Product {
	private String id;
	private String description;
	private String measureUnit;
	private double price;
	private ProductGroup productGroup;

	public Product() {
		super();
	}

	public Product(String description, String measureUnit, double price,
			ProductGroup productGroup) {
		super();
		this.description = description;
		this.measureUnit = measureUnit;
		this.price = price;
		this.productGroup = productGroup;
	}

	public String getId() {
		return id;
	}

	// TODO método somente para testes
	public void setId(String id) {
		this.id = id;
	}

	public ProductGroup getProductGroup() {
		return productGroup;
	}

	public void setProductGroup(ProductGroup productGroup) {
		this.productGroup = productGroup;
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