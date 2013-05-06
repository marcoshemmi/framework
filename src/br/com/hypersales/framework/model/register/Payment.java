package br.com.hypersales.framework.model.register;

public class Payment {

	private String id;
	private String description;

	public Payment() {
		super();
	}

	public Payment(String description) {
		super();
		this.description = description;
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

}
