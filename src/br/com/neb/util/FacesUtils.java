/**
 * 
 */
package br.com.neb.util;

import java.util.Locale;

import javax.faces.context.FacesContext;

/**
 * @author mangar
 * 
 */
public class FacesUtils {

	public static Locale getLocale() {
		return FacesUtils.getContext().getViewRoot().getLocale();
	}

	public static FacesContext getContext() {
		return FacesContext.getCurrentInstance();
	}

}
