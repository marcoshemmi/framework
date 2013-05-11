package br.com.hypersales.framework.util.enums;

public enum SalesOrderStatus {
	PROCESSING(100),
	WAITING_ADVANCE_PAYMENT(200),
	WAITING_CREDIT_RELEASE(300),
	WAITING_ARRIVAL_MERCHANDISE(400),
	PICKING(500),
	INVOICE(600);
   
	private final int statusCode;   

	SalesOrderStatus(int statusCode) {
        this.statusCode = statusCode;
    }

    public int statusCode() { 
        return statusCode; 
    }
}
