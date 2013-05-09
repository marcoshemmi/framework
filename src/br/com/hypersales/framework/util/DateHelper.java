package br.com.hypersales.framework.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateHelper {
	
	public static String FormatFrameworkDate(Date date) {
		return String.format("{0}{1}{2}", date.getYear(), date.getMonth(),  date.getDate());
	}

	public static Date FromFrameworkDateToDate(String date) throws ParseException {
		//DateFormat df = new SimpleDateFormat("yyyyMMdd", Locale.US);
		DateFormat df = new SimpleDateFormat("yyyyMMdd");
	    Date result = df.parse(date);  
	    return result;
	}

}
