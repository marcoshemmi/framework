package br.com.hypersales.framework.util.enums;

public enum FreightType {
	C {
		public String toString() {
			return "CIF";
		}
	},
	F {
		public String toString() {
			return "FOB";
		}
	},
}
