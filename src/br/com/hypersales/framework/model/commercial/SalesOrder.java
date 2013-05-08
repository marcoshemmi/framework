package br.com.hypersales.framework.model.commercial;

import java.util.List;

import br.com.hypersales.framework.model.register.Carrier;
import br.com.hypersales.framework.model.register.Customer;
import br.com.hypersales.framework.model.register.CustomerUnit;
import br.com.hypersales.framework.model.register.Payment;
import br.com.hypersales.framework.model.register.Seller;
import br.com.hypersales.framework.presentation.JsonResult;
import br.com.hypersales.framework.util.enums.FreightType;
import br.com.hypersales.framework.util.enums.OperationType;
import br.com.hypersales.framework.util.enums.ReservationType;
import br.com.hypersales.framework.util.enums.SalesOrderStatus;

public class SalesOrder {
	
	private String id;
	private SalesOrderStatus salesOrderStatus;
	private int salesOrderStatusId;
	private String salesOrderDate;
	private ReservationType reservationType;
	private String reservationTypeId;
	private Customer customer;
	private CustomerUnit customerUnit;
	private String invoiceKey;
	private FreightType freightType;
	private String deliveryId;
	private String deliveryUnitId;
	private OperationType operationType;
	private Carrier carrier;
	private Seller seller;
	private Payment payment;
	private String note;
	private List<SalesOrderItem> salesOrderItems;
	
	//TODO: popular objeto com campos adicionais de "cadastro"
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
	}
	public String getSalesOrderDate() {
		return salesOrderDate;
	}
	public void setSalesOrderDate(String salesOrderDate) {
		this.salesOrderDate = salesOrderDate;
	}
	public ReservationType getReservationType() {
		return reservationType;
	}
	public void setReservationType(ReservationType reservationType) {
		this.reservationType = reservationType;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public CustomerUnit getCustomerUnit() {
		return customerUnit;
	}
	public void setCustomerUnit(CustomerUnit customerUnit) {
		this.customerUnit = customerUnit;
	}
	public String getInvoiceKey() {
		return invoiceKey;
	}
	public void setInvoiceKey(String invoiceKey) {
		this.invoiceKey = invoiceKey;
	}
	public FreightType getFreightType() {
		return freightType;
	}
	public void setFreightType(FreightType freightType) {
		this.freightType = freightType;
	}
	public int getSalesOrderStatusId() {
		return salesOrderStatusId;
	}
	public void setSalesOrderStatusId(int salesOrderStatusId) {
		this.salesOrderStatusId = salesOrderStatusId;
	}
	public String getReservationTypeId() {
		return reservationTypeId;
	}
	public void setReservationTypeId(String reservationTypeId) {
		this.reservationTypeId = reservationTypeId;
	}
	public String getDeliveryId() {
		return deliveryId;
	}
	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}
	public String getDeliveryUnitId() {
		return deliveryUnitId;
	}
	public void setDeliveryUnitId(String deliveryUnitId) {
		this.deliveryUnitId = deliveryUnitId;
	}
	public OperationType getOperationType() {
		return operationType;
	}
	public void setOperationType(OperationType operationType) {
		this.operationType = operationType;
	}
	public Carrier getCarrier() {
		return carrier;
	}
	public void setCarrier(Carrier carrier) {
		this.carrier = carrier;
	}
	public Seller getSeller() {
		return seller;
	}
	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public List<SalesOrderItem> getSalesOrderItems() {
		return salesOrderItems;
	}
	public void setSalesOrderItems(List<SalesOrderItem> salesOrderItems) {
		this.salesOrderItems = salesOrderItems;
	}
}
