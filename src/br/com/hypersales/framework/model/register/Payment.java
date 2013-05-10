package br.com.hypersales.framework.model.register;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import br.com.hypersales.framework.dao.Wsp;
import br.com.hypersales.framework.dao.protheus.ARRAYOFSTRING;
import br.com.hypersales.framework.dao.protheus.STRUCTRETURN;

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
