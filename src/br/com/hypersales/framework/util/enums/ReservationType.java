package br.com.hypersales.framework.util.enums;

public enum ReservationType {
	PE {
		public String toString() {
			return "Pronta Entrega";
		}
	},
	SC {
		public String toString() {
			return "Solicitação de Compra";
		}
	},
	EN {
		public String toString() {
			return "Encomenda";
		}
	},
}