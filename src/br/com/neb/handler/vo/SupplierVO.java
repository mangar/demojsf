/**
 * 
 */
package br.com.neb.handler.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author mangar
 *
 */
public class SupplierVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1686980927592147793L;

	private Integer id;
	
	private String name;
	
	private String city;
	
	private String state;

	
	
	public static SupplierVO generateSupplier1() {
		return new SupplierVO().setId(Integer.valueOf(1)).setName("Supplier 001").setCity("Sao Paulo").setState("SP");		
	}
	public static SupplierVO generateSupplier2() {
		return new SupplierVO().setId(Integer.valueOf(2)).setName("Supplier 002").setCity("Rio de Janeiro").setState("RJ");		
	}
	public static SupplierVO generateSupplier3() {
		return new SupplierVO().setId(Integer.valueOf(3)).setName("Supplier 003").setCity("Bauru").setState("SP");		
	}
	
	
	public Integer getId() {
		return id;
	}

	public SupplierVO setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public SupplierVO setName(String name) {
		this.name = name;
		return this;
	}

	public String getCity() {
		return city;
	}

	public SupplierVO setCity(String city) {
		this.city = city;
		return this;
	}

	public String getState() {
		return state;
	}

	public SupplierVO setState(String state) {
		this.state = state;
		return this;
	}
	
}
