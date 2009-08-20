/**
 * 
 */
package br.com.neb.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.apache.commons.lang.StringUtils;

import br.com.neb.handler.vo.PhoneNumberVO;

/**
 * @author mangar
 * 
 */
public class PhoneConverter implements Converter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.faces.convert.Converter#getAsObject(javax.faces.context.FacesContext
	 * , javax.faces.component.UIComponent, java.lang.String)
	 */
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		System.out.println("Phone converter 1");
		if (StringUtils.isEmpty(value)) {
			return null;
		}

		PhoneNumberVO phone = new PhoneNumberVO();
		phone.setOriginal(value);
		String[] phoneComps = StringUtils.split(value, " ,()-.");
		String countryCode = phoneComps[0];
		phone.setCountryCode(countryCode);

		System.out.println("Phone converter 2");

		if ("1".equals(countryCode) && phoneComps.length == 4) {
			String areaCode = phoneComps[1];
			String prefix = phoneComps[2];
			String number = phoneComps[3];
			phone.setAreaCode(areaCode);
			phone.setPrefix(prefix);
			phone.setNumber(number);
		} else {
			phone.setNumber(value);
		}
		System.out.println("Phone converter 3");
		return phone;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.faces.convert.Converter#getAsString(javax.faces.context.FacesContext
	 * , javax.faces.component.UIComponent, java.lang.Object)
	 */
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		return value.toString();

	}

}
