package br.com.hypersales.framework.util.enums;

public enum FreightType {
	C("CIF"), F("FOB");

	private final String label;

	FreightType(String s) {
		this.label = s;
	}

	public String toString() {
		return label;
	}
}
