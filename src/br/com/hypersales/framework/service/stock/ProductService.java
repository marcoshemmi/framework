package br.com.hypersales.framework.service.stock;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import br.com.hypersales.framework.dao.Wsp;
import br.com.hypersales.framework.dao.protheus.ARRAYOFSTRING;
import br.com.hypersales.framework.dao.protheus.STRUCTRETURN;
import br.com.hypersales.framework.model.stock.Product;
import br.com.hypersales.framework.model.stock.ProductGroup;
import br.com.hypersales.framework.presentation.JsonResultList;

public class ProductService {

	JsonResultList<Product> products = new JsonResultList<Product>();

	public JsonResultList<Product> getListByProductGroupId(String hashCode,
			String productGroupId) {
		JsonResultList<Product> result = new JsonResultList<Product>();

		Wsp daoWs = new Wsp();
		try {
			STRUCTRETURN retorno = daoWs.execute("Product_getListByProductGroupId",
					new String[] { productGroupId });
			
			
			result.setResponseId(Integer.parseInt(retorno.responseid));
			result.setResponseMessage(retorno.responsemessage);
			
			if (retorno.getRESPONSEMESSAGE().equals("OK")) {
				
				ARRAYOFSTRING item = retorno.getSALESORDERID();
				for (String record : item.getSTRING()) {
					record = record.substring(1);
					record = record.substring(0, record.length() - 2);

					String[] keyValueRecord = record.split("\",\"");

					Product product = new Product();
					ProductGroup productGroup = new ProductGroup();
					productGroup.setId(productGroupId);
					productGroup.setName("");
					product.setProductGroup(productGroup);

					for (String kv : keyValueRecord) {

						// posicao 0: name e 1:value
						String[] keyValue = kv.split("\":\"");

						if (keyValue[0].toUpperCase().equals("PRODUCTID")) {
							product.setId(keyValue[1]);
						}else if (keyValue[0].toUpperCase().equals("PRODUCTDESCRIPTION")) {
							product.setDescription(keyValue[1]);
						} else if (keyValue[0].toUpperCase().equals("PRODUCTMEASUREUNIT")) {
							product.setMeasureUnit(keyValue[1]);
						} else if (keyValue[0].toUpperCase().equals("PRODUCTPRICE")) {
							product.setPrice(Double.parseDouble(keyValue[1]));
						}

					}
					result.add(product);
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
