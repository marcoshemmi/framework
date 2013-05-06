package br.com.hypersales.framework.model.register;

public class Seller {

	private String id;
	private String name;
	private String shortName;

	public Seller() {
		super();
	}

	public Seller(String name, String shortName) {
		super();
		this.name = name;
		this.shortName = shortName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getId() {
		return id;
	}

	// TODO método somente para teste.
	public void setId(String id) {
		this.id = id;
	}
}