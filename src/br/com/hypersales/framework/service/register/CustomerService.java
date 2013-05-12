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
						if (keyValue[0].toUpperCase().equals("CUSTOMERNAME")) {
							pRet.setName(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("CUSTOMERUNITID")) {
							pRetUnit.setId(customerUnitId);
						}
						if (keyValue[0].toUpperCase().equals("CUSTOMERUNITNAME")) {
							pRetUnit.setName(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("CUSTOMERCNPJ")) {
							pRet.setCnpj(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("CUSTOMERSTATEREGISTRATION")) {
							pRet.setStateRegistration(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("CUSTOMERDISTRICTREGISTRATION")) {
							pRet.setDistrictRegistration(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("CUSTOMERIDCARD")) {
							pRet.setIdCard(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("CUSTOMERADDRESS")) {
							pRet.setAddress(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("CUSTOMERCITY")) {
							pRet.setCity(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("CUSTOMERSTATE")) {
							pRet.setState(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("CUSTOMERDISTRICT")) {
							pRet.setDistrict(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("CUSTOMERZIPCODE")) {
							pRet.setZipCode(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("CUSTOMERINTAREACODE")) {
							pRet.setIntAreaCode(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("CUSTOMERAREACODE")) {
							pRet.setAreaCode(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("CUSTOMERPHONENUMBER")) {
							pRet.setPhoneNumber(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("CUSTOMERFAXNUMBER")) {
							pRet.setFaxNumber(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("COUNTRYID")) {
							pRet.setCountryCode(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("COUNTRYNAME")) {
							pRet.setCountryName(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("CUSTOMERINOVICINGADDRESS")) {
							pRet.setInovicingAddress(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("CUSTOMERDELIVERYADDRESS")) {
							pRet.setDeliveryAddress(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("CUSTOMERRECEPTIONADDRESS")) {
							pRet.setReceptionAddress(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("CUSTOMERCONTACTNAME")) {
							pRet.setContactName(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("FREIGHTTYPEID")) {
							pRet.setName(keyValue.length>1?keyValue[1]:"");
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
