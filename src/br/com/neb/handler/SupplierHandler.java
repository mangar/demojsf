/**
 * 
 */
package br.com.neb.handler;

import java.util.ArrayList;
import java.util.List;

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

    public String doCreate() {
	return "create";
    }

    public void doRemove(ActionEvent event) {
	Integer id = (Integer) this.findParamameter(event, "_id_supplier_remove");
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
		break;
	    }
	}

    }

    public String doSave() {
	System.out.println("............. " + this.count + " / "
		+ this.suppliers.size());
	suppliers
		.add(new SupplierVO().setIdFluent(++count).setNameFluent(
			this.supplier.getName()).setCityFluent(
			this.supplier.getCity()).createCreditCard(this.getSupplier().getCc().getNumber()));
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

    public void setSuppliers(List<SupplierVO> suppliers) {
	this.suppliers = suppliers;
    }

    public SupplierVO getSupplier() {
	return supplier;
    }

    public void setSupplier(SupplierVO supplier) {
	this.supplier = supplier;
    }

}
