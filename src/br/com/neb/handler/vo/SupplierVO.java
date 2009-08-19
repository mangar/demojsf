/**
 * 
 */
package br.com.neb.handler.vo;

import java.io.Serializable;

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

    private CreditCardVO cc = new CreditCardVO();

    public static SupplierVO generateSupplier1() {
	return new SupplierVO().setIdFluent(Integer.valueOf(1)).setNameFluent("Supplier 001")
		.setCityFluent("Sao Paulo").setStateFluent("SP");
    }

    public static SupplierVO generateSupplier2() {
	return new SupplierVO().setIdFluent(Integer.valueOf(2)).setNameFluent("Supplier 002").setCityFluent(
		"Rio de Janeiro").setStateFluent("RJ");
    }

    public static SupplierVO generateSupplier3() {
	return new SupplierVO().setIdFluent(Integer.valueOf(3)).setNameFluent("Supplier 003").setCityFluent("Bauru")
		.setStateFluent("SP");
    }

    public SupplierVO setIdFluent(Integer id) {
	this.id = id;
	return this;
    }

    public SupplierVO setNameFluent(String name) {
	this.name = name;
	return this;
    }

    public SupplierVO setCityFluent(String city) {
	this.city = city;
	return this;
    }

    public SupplierVO setStateFluent(String state) {
	this.state = state;
	return this;
    }

    
    public SupplierVO createCreditCard(String number) {
	if (this.cc == null) {
	    this.cc = new CreditCardVO();
	}
	this.cc.setNumber(number);
	return this;
    }
    
    public void setId(Integer id) {
	this.id = id;
    }

    public void setCity(String city) {
	this.city = city;
    }

    public void setState(String state) {
	this.state = state;
    }

    public Integer getId() {
	return id;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getName() {
	return name;
    }

    public String getCity() {
	return city;
    }

    public String getState() {
	return state;
    }

    public CreditCardVO getCc() {
	return cc;
    }

    public void setCc(CreditCardVO cc) {
	this.cc = cc;
    }

}
