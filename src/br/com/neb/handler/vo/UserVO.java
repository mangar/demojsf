/**
 * 
 */
package br.com.neb.handler.vo;

import java.io.Serializable;

/**
 * @author mangar
 *
 */
public class UserVO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -6089112001097405045L;

    private String username;
    
    private String password;
    
    private SupplierVO supplier = new SupplierVO();

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
