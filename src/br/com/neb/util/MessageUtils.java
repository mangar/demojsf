/**
 * 
 */
package br.com.neb.util;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import javax.faces.context.FacesContext;

/**
 * @author mangar 
 * 'Copied from:http://www.laliluna.de/javaserver-faces-message-resource-bundle-tutorial.html
 */
public class MessageUtils {

	protected static ClassLoader getCurrentClassLoader(Object defaultObject) {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		if (loader == null) {
			loader = defaultObject.getClass().getClassLoader();
		}
		return loader;
	}

	/**
	 * 
	 * Usage: String welcomeTitle =
	 * MessageUtil.get(FacesContext.getCurrentInstance(), "welcome-title");
	 * 
	 * @param context
	 * @param key
	 * @return
	 */
	public static String get(FacesContext context, String key) {
		return MessageUtils.get(context, key, null);
	}

	public static String get(FacesContext context, String key, Object params[]) {

		if (context == null || key == null) {
			return null;
		}

		String text = null;
		ResourceBundle bundle = ResourceBundle.getBundle(context
				.getApplication().getMessageBundle(), context.getViewRoot()
				.getLocale(), getCurrentClassLoader(params));

		System.out.println("Locale: " + context.getViewRoot().getLocale().getLanguage());
		
		try {
			text = bundle.getString(key);
		} catch (MissingResourceException e) {
			text = "?? key " + key + " not found ??";
		}

		if (params != null) {
			MessageFormat mf = new MessageFormat(text, context.getViewRoot()
					.getLocale());
			text = mf.format(params, new StringBuffer(), null).toString();
		}
		return text;
	}

}
