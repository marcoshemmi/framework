package br.com.hypersales.framework.service.stock;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import br.com.hypersales.framework.dao.Wsp;
import br.com.hypersales.framework.dao.protheus.ARRAYOFSTRING;
import br.com.hypersales.framework.dao.protheus.STRUCTRETURN;
import br.com.hypersales.framework.model.register.Branch;
import br.com.hypersales.framework.model.stock.ProductGroup;
import br.com.hypersales.framework.model.stock.ProductStock;
import br.com.hypersales.framework.model.stock.PurchaseRequest;
import br.com.hypersales.framework.presentation.JsonResultList;
import br.com.hypersales.framework.util.enums.RequestStatus;
import br.com.hypersales.framework.util.enums.ReservationType;

public class ProductStockService {
	

	public JsonResultList<ProductStock> getProductsStocksByProductId(String hashCode, String productId) {
	
		JsonResultList<ProductStock> productsStock = new JsonResultList<ProductStock>(this.getListByProductId(productId));
		
		productsStock.setResponseId(RequestStatus.SUCCESS.statusCode());
		productsStock.setResponseMessage(RequestStatus.SUCCESS.toString());
		
		return productsStock;
	}

	
	private List<ProductStock> getListByProductId(String productId) {
		List<ProductStock> result = new ArrayList<>();
		
		Wsp daoWs = new Wsp();
		try {
			STRUCTRETURN retorno = daoWs.execute("ProductStock_getListByProductId", new String[]{productId, productId, productId, productId});

			if (retorno.getRESPONSEMESSAGE().equals("OK")) {
				ARRAYOFSTRING item = retorno.getSALESORDERID();
				for(String record : item.getSTRING()) {
					record = record.substring(1);
					record = record.substring(0, record.length() -2);

					String[] keyValueRecord = record.split("\",\"");

					ProductStock pRet = new ProductStock();
					pRet.setDescription("");
					pRet.setMeasureUnit("");
					PurchaseRequest purchase = new PurchaseRequest();

					for(String kv : keyValueRecord) {
						String[] keyValue = kv.split("\":\"");
						if (keyValue[0].toUpperCase().equals("PRODUCTID")) {
							pRet.setId(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("BRANCHID")) {
							Branch b = new Branch();
							b.setId(keyValue.length>1?keyValue[1]:"");
							b.setName("");
							pRet.setBranch(b);
						}
						if (keyValue[0].toUpperCase().equals("TYPEID") && keyValue.length > 1) {
							if(! keyValue[1].equals("")) {
								for(ReservationType r : ReservationType.values()){
									if(r.name().equals(keyValue[1])){
										pRet.setReservationType(r);
										break;
									}
								}
							}
						}
						
						if (keyValue[0].toUpperCase().equals("REQUESTID")) {
							purchase.setId(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("REQUESTITEMID")) {
							purchase.setItemId(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("REQUESTDATE")) {
							purchase.setDate(keyValue.length>1?keyValue[1]:"");
						}
						if (keyValue[0].toUpperCase().equals("PRODUCTQUANTITY")) {
							pRet.setQuantity(Integer.parseInt(keyValue.length>1?keyValue[1]:"0"));
						}

					}
					pRet.setPurchaseRequest(purchase);
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
}
