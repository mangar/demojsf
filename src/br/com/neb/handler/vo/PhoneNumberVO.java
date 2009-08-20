/**
 * 
 */
package br.com.neb.handler.vo;

import java.io.Serializable;

/**
 * @author mangar
 * 
 */
public class PhoneNumberVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2108249228706063362L;

	private String countryCode;
	private String areaCode;
	private String prefix;
	private String number;
	private String original;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getOriginal() {
		return original;
	}

	public void setOriginal(String original) {
		this.original = original;
	}

	public String toString() {
		if (countryCode.equals("1")) {
			return countryCode + " " + areaCode + " " + prefix + " " + number;
		} else {
			return number;
		}
	}
}
