/**
 * 
 */
package br.com.neb.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * @author mangar
 * 
 */
public class EmailValidator implements Validator {

    /*
     * (non-Javadoc)
     * 
     * @see javax.faces.validator.Validator#validate(javax.faces.context.FacesContext,
     * javax.faces.component.UIComponent, java.lang.Object)
     */
    public void validate(FacesContext context, UIComponent component, Object object) throws ValidatorException {

	String enteredEmail = (String) object;
	// Set the email pattern string
	Pattern p = Pattern.compile(".+@.+\\.[a-z]+");

	// Match the given string with the pattern
	Matcher m = p.matcher(enteredEmail);

	// Check whether match is found
	boolean matchFound = m.matches();

	if (!matchFound) {
	    FacesMessage message = new FacesMessage();
	    message.setDetail("Email not valid");
	    message.setSummary("Email not valid");
	    message.setSeverity(FacesMessage.SEVERITY_ERROR);
	    throw new ValidatorException(message);
	}

    }

}
