package br.com.hypersales.framework.model.register;

public class Branch {
	private String id;
	private String Name;

	public Branch() {
		super();
	}

	public Branch(String name) {
		super();
		Name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}
