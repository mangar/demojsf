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

    private String email;

    private String email2;

    private CreditCardVO cc = new CreditCardVO();

    public static SupplierVO generateSupplier1() {
	return new SupplierVO().setIdFluent(Integer.valueOf(1)).setNameFluent("Supplier 001")
		.setCityFluent("Sao Paulo").setStateFluent("SP").createCreditCard("1111.1111.1111.1111")
		.setEmailFluent("1@1.com.br");
    }

    public static SupplierVO generateSupplier2() {
	return new SupplierVO().setIdFluent(Integer.valueOf(2)).setNameFluent("Supplier 002").setCityFluent(
		"Rio de Janeiro").setStateFluent("RJ").createCreditCard("2222.2222.2222.2222").setEmailFluent(
		"2@2.com.br");
    }

    public static SupplierVO generateSupplier3() {
	return new SupplierVO().setIdFluent(Integer.valueOf(3)).setNameFluent("Supplier 003").setCityFluent("Bauru")
		.setStateFluent("SP").createCreditCard("3333.3333.3333.3333").setEmailFluent("3@3.com.br");
    }

    public SupplierVO setIdFluent(Integer id) {
	this.id = id;
	return this;
    }

    public SupplierVO setEmailFluent(String email) {
	this.email = email;
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

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getEmail2() {
	return email2;
    }

    public void setEmail2(String email2) {
	this.email2 = email2;
    }

}
