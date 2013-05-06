package br.com.hypersales.framework.util.enums;

public enum ReservationType {
	A {
		public String toString() {
			return "Pronta Entrega";
		}
	},
	B {
		public String toString() {
			return "Solicita��o de Compra";
		}
	},
	C {
		public String toString() {
			return "Encomenda";
		}
	}
}