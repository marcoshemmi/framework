package br.com.hypersales.framework.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CryptoHelper {
	public static String getMD5Hash(String source) {
		String ret = "";
		
		try {
			MessageDigest algorithm = MessageDigest.getInstance("MD5");
			algorithm.update(source.getBytes());
			
			byte byteData[] = algorithm.digest();
			
			StringBuffer hexString = new StringBuffer();
			for (int i=0;i<byteData.length;i++) {
				hexString.append(Integer.toHexString(0xFF & byteData[i]));
			}
			ret = byteData.toString();
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ret;
	}
}
