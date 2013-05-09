package br.com.hypersales.framework.model.stock;

public class ProductGroup {
	private String name;
	private String id;

	public ProductGroup() {
		super();
	}

	public ProductGroup(String name) {
		super();
		this.name = name;
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