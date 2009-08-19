/**
 * 
 */
package br.com.neb.handler;

import javax.faces.component.UIComponent;
import javax.faces.component.UIParameter;
import javax.faces.event.ActionEvent;

/**
 * @author mangar
 * 
 */
public class BaseHandler {

    /**
     * Helper to find the component in the ActionEvent
     * @param event
     * @param componentName
     * @return
     */
    public Object findParamameter(ActionEvent event, String componentName) {
	UIComponent link = event.getComponent();
	UIParameter param = (UIParameter) link.findComponent(componentName);
	return param.getValue();
    }

}
