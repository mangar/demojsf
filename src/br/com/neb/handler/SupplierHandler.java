/**
 * 
 */
package br.com.neb.handler;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import br.com.neb.handler.vo.SupplierVO;

/**
 * @author mangar
 * 
 */
public class SupplierHandler extends BaseHandler {

	private SupplierVO supplier = new SupplierVO();

	private List<SupplierVO> suppliers;

	private Integer count = new Integer(3);

	private String message;

	public String doCreate() {
		this.setMessage("");
		return "create";
	}

	public void doRemove(ActionEvent event) {
		Integer id = (Integer) this.findParamameter(event,
				"_id_supplier_remove");
		int index = 0;
		for (SupplierVO supplier : suppliers) {
			if (supplier.getId().intValue() == id.intValue()) {
				suppliers.remove(index);
				break;
			}
			index++;
		}
	}

	/**
	 * 
	 * @param event
	 */
	public void doLoad(ActionEvent event) {
		Integer id = (Integer) this.findParamameter(event, "_id_supplier_edit");
		for (SupplierVO supplier : suppliers) {
			if (supplier.getId().intValue() == id.intValue()) {
				this.supplier.setName(supplier.getName());
				this.supplier.setCity(supplier.getCity());
				this.supplier.setEmail(supplier.getEmail());
				break;
			}
		}
	}

	public String doSave() {
		System.out.println("............. " + this.count + " / "
				+ this.suppliers.size());

		String welcomeTitle = this.getMessage("welcome-title");
		System.out.println("Welcome Title: " + welcomeTitle);

		suppliers.add(new SupplierVO().setIdFluent(++count).setNameFluent(
				this.supplier.getName()).setCityFluent(this.supplier.getCity())
				.createCreditCard(this.getSupplier().getCc().getNumber())
				.setEmailFluent(this.supplier.getEmail()));
		
		this.setMessage( this.getMessage("message-save-ok") );

		return "success";
	}

	public List<SupplierVO> getSuppliers() {
		if (this.suppliers == null) {
			suppliers = new ArrayList<SupplierVO>();
			suppliers.add(SupplierVO.generateSupplier1());
			suppliers.add(SupplierVO.generateSupplier2());
			suppliers.add(SupplierVO.generateSupplier3());
		}

		return this.suppliers;
	}

	/**
	 * 
	 * @param context
	 * @param component
	 * @param value
	 */
	// @TODO create a UTIL for this....
	public void validateEmail(FacesContext context, UIComponent component,
			Object value) {
		String email = value.toString();
		if (!email.contains("@")) {
			((UIInput) component).setValid(false);
			FacesMessage message = new FacesMessage("email inv‡lido!");
			context.addMessage(component.getClientId(context), message);
		}
	}

	public void setSuppliers(List<SupplierVO> suppliers) {
		this.suppliers = suppliers;
	}

	public SupplierVO getSupplier() {
		return supplier;
	}

	public void setSupplier(SupplierVO supplier) {
		this.supplier = supplier;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
