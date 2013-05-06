package br.com.hypersales.framework.model.stock;

public class ProductStock {
	private String name;
	private String id;

	public ProductStock(){
		super();
	}

	public ProductStock(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}