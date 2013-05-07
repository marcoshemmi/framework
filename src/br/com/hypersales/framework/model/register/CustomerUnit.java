package br.com.hypersales.framework.model.register;

import br.com.hypersales.framework.presentation.JsonResult;

public class CustomerUnit {
	// loja do cliente

	private String id;
	private String cnpj;
	private String name;
	private String city;
	private String state;

	public CustomerUnit() {
		super();
	}

	public CustomerUnit(String cnpj, String name, String city, String state) {
		super();
		this.cnpj = cnpj;
		this.name = name;
		this.city = city;
		this.state = state;
	}

	public String getId() {
		return id;
	}

	// TODO método somente para testes
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
