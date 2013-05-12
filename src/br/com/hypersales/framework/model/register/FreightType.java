package br.com.hypersales.framework.model.register;

public class FreightType {

	private String id;
	private String name;

	public FreightType() {
		super();
	}

	public FreightType(String id, String name) {
		super();
		this.id = id;
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

	// TODO método somente para teste
	public void setId(String id) {
		this.id = id;
	}

}