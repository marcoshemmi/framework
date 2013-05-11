package br.com.hypersales.framework.model.commercial;

import br.com.hypersales.framework.model.register.Branch;
import br.com.hypersales.framework.model.register.Currency;
import br.com.hypersales.framework.model.stock.Product;
import br.com.hypersales.framework.util.enums.ReservationType;

public class SalesOrderItem {
	private String id;
	private Product product;
	private Currency currency;
	private float unitValue;
	private float unitDiscount;
	private Branch branch;
	private ReservationType reservationType;
	private int itemQuantity;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public float getUnitValue() {
		return unitValue;
	}
	public void setUnitValue(float unitValue) {
		this.unitValue = unitValue;
	}
	public float getUnitDiscount() {
		return unitDiscount;
	}
	public void setUnitDiscount(float unitDiscount) {
		this.unitDiscount = unitDiscount;
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
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
}