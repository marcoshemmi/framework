package br.com.hypersales.framework.util.enums;

public enum RequestStatus {
	SUCCESS(200),
	SERVICE_UNAVAILABLE(300),
	BAD_REQUEST(400),
	UNAUTHORIZED_WRONG_AUTHENTICATION(401),
	UNAUTHORIZED_INVALID_TOKEN(402);
   
	//TODO: preencher todos os status
	
	private final int statusCode;   

	RequestStatus(int statusCode) {
        this.statusCode = statusCode;
    }

    public int statusCode() { 
        return statusCode; 
    }
}
