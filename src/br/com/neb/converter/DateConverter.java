/**
 * 
 */
package br.com.neb.converter;

import java.util.Date;
import java.util.Locale;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.apache.commons.lang.StringUtils;

import br.com.neb.util.DateUtils;
import br.com.neb.util.FacesUtils;

/**
 * @author mangar
 * 
 */
public class DateConverter implements Converter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.faces.convert.Converter#getAsObject(javax.faces.context.FacesContext
	 * , javax.faces.component.UIComponent, java.lang.String)
	 */
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		System.out.println("Date converter 1");
		if (StringUtils.isEmpty(value)) {
			return null;
		}

		Date date;
		String[] dateChomps = StringUtils.split(value, "/");

		if (dateChomps.length < 3) {
			return null;

		} else {

			Locale locale = FacesContext.getCurrentInstance().getViewRoot()
					.getLocale();

			String month, day, year;
			if (locale.getLanguage().startsWith("en")) {
				month = dateChomps[0];
				day = dateChomps[1];
				year = dateChomps[2];
				date = DateUtils.parseDateEN(month + "/" + day + "/" + year);

			} else {
				day = dateChomps[0];
				month = dateChomps[1];
				year = dateChomps[2];
				date = DateUtils.parseDatePT(day + "/" + month + "/" + year);
			}

		}

		return date;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.faces.convert.Converter#getAsString(javax.faces.context.FacesContext
	 * , javax.faces.component.UIComponent, java.lang.Object)
	 */
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		String data;
		if (FacesUtils.getLocale().getLanguage().startsWith("en") ) {
			data = DateUtils.formatDateEN(((Date)value));
		} else {
			data = DateUtils.formatDatePT(((Date)value));
		}
		return data;
	}
}
