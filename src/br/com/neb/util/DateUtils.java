/**
 * 
 */
package br.com.neb.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author mangar
 * 
 */
public class DateUtils {

	protected static SimpleDateFormat sdfPT = new SimpleDateFormat("dd/MM/yyyy");

	protected static SimpleDateFormat sdfEN = new SimpleDateFormat("MM/dd/yyyy");

	public static Date parseDateEN(String value) {
		Date date = null;
		try {
			date = sdfEN.parse(value);
		} catch (ParseException pe) {
			System.err.println("Error to convert date(EN), value: " + value);
		}
		return date;
	}

	public static String formatDateEN(Date date) {
		String value = sdfEN.format(date);
		return value;
	}

	public static Date parseDatePT(String value) {
		Date date = null;
		try {
			date = sdfPT.parse(value);
		} catch (ParseException pe) {
			System.err.println("Error to convert date(PT), value: " + value);
		}
		return date;
	}

	public static String formatDatePT(Date date) {
		String value = sdfPT.format(date);
		return value;
	}

}
