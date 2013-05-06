package br.com.hypersales.framework.model.register;

import br.com.hypersales.framework.util.enums.FreightType;

public class Customer {
	private String id;
	private String name;
	private String tradeName;//
	private String cnpj;
	private String stateRegistration;
	private String districtRegistration;
	private String idCard;
	private String address;
	private String city;
	private String state;
	private String district;
	private int zipCode;
	private int intAreaCode;
	private int areaCode;
	private int phoneNumber;
	private int faxNumber;
	private String countryCode;
	private String countryName;
	private String inovicingAddress;
	private String deliveryAddress;
	private String receptionAddress;
	private String contactName;
	private Payment payment;
	private Carrier carrier;
	private Seller seller;
	private FreightType freightType;
	private CustomerUnit customerUnit;

	public Customer() {
		super();
	}

	public Customer(String name, String tradeName, String cnpj,
			String stateRegistration, String districtRegistration,
			String idCard, String address, String city, String state,
			String district, int zipCode, int intAreaCode, int areaCode,
			int phoneNumber, int faxNumber, String countryCode,
			String countryName, String inovicingAddress,
			String deliveryAddress, String receptionAddress,
			String contactName, Payment payment, Carrier carrier,
			Seller seller, FreightType freightType, CustomerUnit customerUnit) {
		super();
		this.name = name;
		this.tradeName = tradeName;
		this.cnpj = cnpj;
		this.stateRegistration = stateRegistration;
		this.districtRegistration = districtRegistration;
		this.idCard = idCard;
		this.address = address;
		this.city = city;
		this.state = state;
		this.district = district;
		this.zipCode = zipCode;
		this.intAreaCode = intAreaCode;
		this.areaCode = areaCode;
		this.phoneNumber = phoneNumber;
		this.faxNumber = faxNumber;
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.inovicingAddress = inovicingAddress;
		this.deliveryAddress = deliveryAddress;
		this.receptionAddress = receptionAddress;
		this.contactName = contactName;
		this.payment = payment;
		this.carrier = carrier;
		this.seller = seller;
		this.freightType = freightType;
		this.customerUnit = customerUnit;
	}

	public String getId() {
		return id;
	}

	// TODO somente para testes
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTradeName() {
		return tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getStateRegistration() {
		return stateRegistration;
	}

	public void setStateRegistration(String stateRegistration) {
		this.stateRegistration = stateRegistration;
	}

	public String getDistrictRegistration() {
		return districtRegistration;
	}

	public void setDistrictRegistration(String districtRegistration) {
		this.districtRegistration = districtRegistration;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public int getIntAreaCode() {
		return intAreaCode;
	}

	public void setIntAreaCode(int intAreaCode) {
		this.intAreaCode = intAreaCode;
	}

	public int getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(int faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getInovicingAddress() {
		return inovicingAddress;
	}

	public void setInovicingAddress(String inovicingAddress) {
		this.inovicingAddress = inovicingAddress;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getReceptionAddress() {
		return receptionAddress;
	}

	public void setReceptionAddress(String receptionAddress) {
		this.receptionAddress = receptionAddress;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
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

	public FreightType getFreightType() {
		return freightType;
	}

	public void setFreightType(FreightType freightType) {
		this.freightType = freightType;
	}

	public CustomerUnit getCustomerUnit() {
		return customerUnit;
	}

	public void setCustomerUnit(CustomerUnit customerUnit) {
		this.customerUnit = customerUnit;
	}

}
