package br.com.hypersales.framework.util;

import java.util.Date;

public class DateHelper {
	
	public static String FormatFrameworkDate(Date date) {
		return String.format("{0}{1}{2}", date.getYear(), date.getMonth(),  date.getDate());
	}
}
