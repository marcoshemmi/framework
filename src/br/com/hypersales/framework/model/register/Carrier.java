package br.com.hypersales.framework.model.register;

public class Carrier {

	private String id;
	private String name;
	private String shortName;

	public Carrier() {
		super();
	}

	public Carrier(String name, String shortName) {
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
}