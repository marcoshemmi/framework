package br.com.hypersales.framework.model.register;

public class Seller {
	private String name;
	private String id;

	public Seller(){
		super();
	}

	public Seller(String name, String id) {
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