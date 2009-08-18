/**
 * 
 */
package br.com.neb.handler;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import br.com.neb.handler.vo.SupplierVO;

/**
 * @author mangar
 * 
 */
public class LoginHandler {

	private String username;

	private String password;

	private SupplierVO supplier;

	/**
	 * Process the authentication...
	 * 
	 * @return
	 */
	public String doAuthentication() {
		if (this.getUsername().equalsIgnoreCase("user")) {
			return "authenticated";
		} else if (this.getUsername().equalsIgnoreCase("adm")) {
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
	 * @return
	 */
	public String doConfirmSupplier() {
		System.out.println("doConfirmSupplier.........................");
		this.supplier = new SupplierVO().setId(Integer.valueOf(1)).setName("Name...");
		this.username = "abc...";
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public SupplierVO getSupplier() {
		return supplier;
	}

	public void setSupplier(SupplierVO supplier) {
		this.supplier = supplier;
	}

}
