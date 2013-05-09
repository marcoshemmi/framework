package br.com.hypersales.framework.model.stock;

import br.com.hypersales.framework.model.register.Branch;
import br.com.hypersales.framework.util.enums.ReservationType;

public class ProductStock {
	private String id;
	private String description;
	private String measureUnit;
	private double price;
	private int quantity;
	private Branch branch;
	private ReservationType reservationType;
	private PurchaseRequest purchaseRequest;

	public ProductStock(String description, String measureUnit, double price,
			int quantity, Branch branch, ReservationType reservationType,
			PurchaseRequest purchaseRequest) {
		super();
		this.description = description;
		this.measureUnit = measureUnit;
		this.price = price;
		this.quantity = quantity;
		this.branch = branch;
		this.reservationType = reservationType;
		this.purchaseRequest = purchaseRequest;
	}

	public ProductStock() {
		super();
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

	public String getMeasureUnit() {
		return measureUnit;
	}

	public void setMeasureUnit(String measureUnit) {
		this.measureUnit = measureUnit;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public ReservationType getReservationType() {
		return reservationType;
	}

	public void setReservationType(ReservationType reservationType) {
		this.reservationType = reservationType;
	}

	public PurchaseRequest getPurchaseRequest() {
		return purchaseRequest;
	}

	public void setPurchaseRequest(PurchaseRequest purchaseRequest) {
		this.purchaseRequest = purchaseRequest;
	}

}