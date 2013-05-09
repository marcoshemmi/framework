package br.com.hypersales.framework.util.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@JsonFormat(shape = Shape.OBJECT)
public enum FreightType {

	C("CIF"), F("FOB");

	private final String label;

	FreightType(String s) {
		this.label = s;
	}

	public String toString() {
		return this.name();
	}

	public String getNome() {
		return this.name();
	}

	public String getLabel() {
		return label;
	}

}
