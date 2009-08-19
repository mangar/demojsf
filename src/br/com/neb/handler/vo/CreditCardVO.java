/**
 * 
 */
package br.com.neb.handler.vo;

import java.io.Serializable;

/**
 * @author mangar
 *
 */
public class CreditCardVO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -5392641389431898573L;

    private String number;
    
    private String name;
    
    private String expireDate;
    
    private String cod;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
    
    
    
    
}
