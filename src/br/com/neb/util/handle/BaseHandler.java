/**
 * 
 */
package br.com.neb.util.handle;

import javax.faces.component.UIComponent;
import javax.faces.component.UIParameter;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import br.com.neb.util.MessageUtils;

/**
 * @author mangar
 * 
 */
public class BaseHandler {

	/**
	 * Helper to find the component in the ActionEvent
	 * 
	 * @param event
	 * @param componentName
	 * @return
	 */
	public Object findParamameter(ActionEvent event, String componentName) {
		UIComponent link = event.getComponent();
		UIParameter param = (UIParameter) link.findComponent(componentName);
		return param.getValue();
	}

	/**
	 * Gets the message from the bundle file
	 * @param key
	 * @return
	 */
	public String getMessage(String key) {
		return MessageUtils.get(FacesContext.getCurrentInstance(), key);
	}

}
