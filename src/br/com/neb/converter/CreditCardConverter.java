/**
 * 
 */
package br.com.neb.converter;

import java.util.regex.Pattern;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

import br.com.neb.handler.vo.CreditCardVO;

/**
 * @author mangar
 * 
 */
public class CreditCardConverter implements Converter {

    private static Pattern pattern = Pattern.compile("([0-9]{4}-{3}[0-9]{4}");

    public Object getAsObject(FacesContext context, UIComponent component, String value) {
	if (pattern.matcher(value).find()) {
	    CreditCardVO cc = new CreditCardVO();
	    cc.setNumber(value);
	    return cc;
	}
	throw new ConverterException("Cannot convert: " + value);
    }

    public String getAsString(FacesContext context, UIComponent component, Object cc) {
	return ((CreditCardVO) cc).getNumber();
    }

}
