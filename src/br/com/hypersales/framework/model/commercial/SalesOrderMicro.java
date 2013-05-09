package br.com.hypersales.framework.model.commercial;

import br.com.hypersales.framework.util.enums.SalesOrderStatus;

public class SalesOrderMicro {
	private String id;
	private SalesOrderStatus salesOrderStatus;
	private int salesOrderStatusId;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public SalesOrderStatus getSalesOrderStatus() {
		return salesOrderStatus;
	}
	public void setSalesOrderStatus(SalesOrderStatus salesOrderStatus) {
		this.salesOrderStatus = salesOrderStatus;
		this.salesOrderStatusId =  salesOrderStatus.statusCode();
	}
	public int getSalesOrderStatusId() {
		return salesOrderStatusId;
	}

}
