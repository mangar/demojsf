/**
 * 
 */
package br.com.neb.handler;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.neb.handler.vo.SupplierVO;
import br.com.neb.handler.vo.UserVO;

/**
 * @author mangar
 * 
 */
public class LoginHandler {

    private UserVO user = new UserVO();
    
    /**
     * Process the authentication...
     * 
     * @return
     */
    public String doAuthentication() {
	if (this.getUser().getUsername().equalsIgnoreCase("user")) {
	    return "authenticated";
	} else if (this.getUser().getUsername().equalsIgnoreCase("adm")) {
	    return "selectSupplier";
	}
	return "fail";
    }

    /**
     * Return a list of suppliers... for select object
     * 
     * @return
     */
    public List<SelectItem> getSuppliers() {
	List<SelectItem> options = new ArrayList<SelectItem>();
	options.add(new SelectItem("supplier001", "Supplier 001"));
	options.add(new SelectItem("supplier002", "Supplier 002"));
	return options;
    }

    /**
     * Return a list of suppliers... for a table object...
     * 
     * @return
     */
    public List<SupplierVO> getSuppliersVO() {
	List<SupplierVO> suppliers = new ArrayList<SupplierVO>();
	suppliers.add(SupplierVO.generateSupplier1());
	suppliers.add(SupplierVO.generateSupplier2());
	suppliers.add(SupplierVO.generateSupplier3());
	return suppliers;
    }

    /**
     * Collect info from supplier and set it in the Handler
     * 
     * @return
     */
    public String doConfirmSupplier() {
	System.out.println("doConfirmSupplier.........................");
	// this.supplier = new SupplierVO().setId(Integer.valueOf(1)).setName(
	// "Name...");
	this.user.setUsername("abc...");
	return "Username....";
    }

    /**
     * Do something with the selected supplier....
     * 
     * @return
     */
    public String doSupplierSelected() {
	return "selected";
    }

    
    
    
    

    public UserVO getUser() {
        return user;
    }

    public void setUser(UserVO user) {
        this.user = user;
    }

//    public void setSelectedSupplierId(String selectedSupplierId) {
//	this.selectedSupplierId = selectedSupplierId;
//	this.setSelectedSupplierName((this.selectedSupplierId.trim().length() == 0 ? "" : "Supplier 00" + selectedSupplierId));
//    }


}
