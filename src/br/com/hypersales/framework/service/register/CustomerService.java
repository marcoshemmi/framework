package br.com.hypersales.framework.service.register;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import br.com.hypersales.framework.dao.Wsp;
import br.com.hypersales.framework.dao.protheus.ARRAYOFSTRING;
import br.com.hypersales.framework.dao.protheus.STRUCTRETURN;
import br.com.hypersales.framework.model.register.Carrier;
import br.com.hypersales.framework.model.register.Customer;
import br.com.hypersales.framework.model.register.CustomerUnit;
import br.com.hypersales.framework.model.register.Payment;
import br.com.hypersales.framework.model.register.Seller;
import br.com.hypersales.framework.presentation.JsonResult;
import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.util.enums.RequestStatus;
import br.com.hypersales.framework.util.enums.FreightType;

public class CustomerService {

	public JsonResultList<Customer> getAllCustomers(String hashCode) {
		
		JsonResultList<Customer> result = new JsonResultList<Customer>();
		
		//result.add(new Customer("aaaaaaaaaaa", "00001"));
		//result.add(new Customer("bbbbbbbbbbbbbb", "00002"));
		
		result.setResponseId(RequestStatus.SUCCESS.hashCode());
		result.setResponseMessage(RequestStatus.SUCCESS.toString());
		
		return result;
	}
	
	public JsonResultList<Customer> getListBySellerId(String sellerId) {
		JsonResultList<Customer> result = new JsonResultList<Customer>();
		
		Wsp daoWs = new Wsp();
		try {
			STRUCTRETURN retorno = daoWs.execute("Customer_getListBySellerId", new String[]{sellerId});
			result.setResponseId(Integer.parseInt(retorno.responseid));
			result.setResponseMessage(retorno.responsemessage);
			if (retorno.getRESPONSEMESSAGE().equals("OK")) {
				ARRAYOFSTRING item = retorno.getSALESORDERID();
				for(String record : item.getSTRING()) {
					record = record.substring(1);
					record = record.substring(0, record.length() -2);

					String[] keyValueRecord = record.split("\",\"");

					Customer pRet = new Customer();

					for(String kv : keyValueRecord) {
						String[] keyValue = kv.split("\":\"");
						if (keyValue[0].toUpperCase().equals("CUSTOMERID")) {
							pRet.setId(keyValue[1]);
						}
						if (keyValue[0].toUpperCase().equals("CUSTOMERNAME")) {
							pRet.setName(keyValue[1]);
						}
					}
					result.add(pRet);
				}
			}
		} catch (XPathExpressionException | ParserConfigurationException
				| SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	public JsonResult<Customer> getDataByCustomerId(String customerId, String customerUnitId) {
		JsonResult<Customer> result = new JsonResult<Customer>();
		
		Wsp daoWs = new Wsp();
		try {
			STRUCTRETURN retorno = daoWs.execute("Customer_getDataByCustomerId", new String[]{customerId, customerUnitId});
			result.setResponseId(Integer.parseInt(retorno.responseid));
			result.setResponseMessage(retorno.responsemessage);
			if (retorno.getRESPONSEMESSAGE().equals("OK")) {
				ARRAYOFSTRING item = retorno.getSALESORDERID();
				for(String record : item.getSTRING()) {
					record = record.substring(1);
					record = record.substring(0, record.length() -2);

					String[] keyValueRecord = record.split("\",\"");

					Customer pRet = new Customer();
					CustomerUnit pRetUnit = new CustomerUnit();
					Payment pRetPayment = new Payment();
					Seller pRetSeller = new Seller();
					Carrier pRetCarrier = new Carrier();
					//FreightType pRetFreightType = new FreightType();
					
					for(String kv : keyValueRecord) {
						String[] keyValue = kv.split("\":\"");
						if (keyValue[0].toUpperCase().equals("CUSTOMERID")) {
							pRet.setId(customerId);
						}
						if (keyValue[0].toUpperCase().equals("NAME")) {
							pRet.setName(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("UNITID")) {
							pRetUnit.setId(customerUnitId);
						}
						if (keyValue[0].toUpperCase().equals("UNITNAME")) {
							pRetUnit.setName(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("CNPJ")) {
							pRet.setCnpj(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("STATEREGISTRATION")) {
							pRet.setStateRegistration(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("DISTRICTREGISTRATION")) {
							pRet.setDistrictRegistration(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("IDCARD")) {
							pRet.setIdCard(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("ADDRESS")) {
							pRet.setAddress(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("CITY")) {
							pRet.setCity(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("STATE")) {
							pRet.setState(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("DISTRICT")) {
							pRet.setDistrict(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("ZIPCODE")) {
							pRet.setZipCode(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("INTAREACODE")) {
							pRet.setIntAreaCode(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("AREACODE")) {
							pRet.setAreaCode(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("PHONENUMBER")) {
							pRet.setPhoneNumber(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("FAXNUMBER")) {
							pRet.setFaxNumber(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("COUNTRYID")) {
							pRet.setCountryCode(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("COUNTRYNAME")) {
							pRet.setCountryName(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("INOVICINGADDRESS")) {
							pRet.setInovicingAddress(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("DELIVERYADDRESS")) {
							pRet.setDeliveryAddress(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("RECEPTIONADDRESS")) {
							pRet.setReceptionAddress(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("CONTACTNAME")) {
							pRet.setContactName(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("FREIGHTTYPEID")) {
							pRet.setFreightType(FreightType.valueOf(keyValue.length>1?keyValue[1]:"C"));
						}
						if (keyValue[0].toUpperCase().equals("CARRIERID")) {
							pRetCarrier.setId(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("CARRIERNAME")) {
							pRetCarrier.setName(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("PAYMENTID")) {
							pRetPayment.setId(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("PAYMENTDESCRIPTION")) {
							pRetPayment.setDescription(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("SELLERID")) {
							pRetSeller.setId(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("SELLERNAME")) {
							pRetSeller.setName(keyValue.length>1?keyValue[1]:"");
						}
					}
					pRet.setCarrier(pRetCarrier);
					pRet.setCustomerUnit(pRetUnit);
					pRet.setPayment(pRetPayment);
					pRet.setSeller(pRetSeller);
					result.setObject(pRet);
				}
			}
		} catch (XPathExpressionException | ParserConfigurationException
				| SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}
