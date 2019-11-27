/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentRPSystem.db;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author rasel
 */
public class AdminAcc extends StudentDB {

    private String firstName;
    private String LastName;
    private String AdmCode;
    private String choosePass;
    private String Password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getAdmCode() {
        return AdmCode;
    }

    public void setAdmCode(String AdmCode) {
        this.AdmCode = AdmCode;
    }

    public String getChoosePass() {
        return choosePass;
    }

    public void setChoosePass(String choosePass) {
        this.choosePass = choosePass;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public boolean newAdmin() throws ClassNotFoundException, SQLException {

        boolean newAdmin = super.newAccAdmin(this);
        return newAdmin;
    }

    public boolean findAdmin() throws ClassNotFoundException, SQLException {

        List<AdminAcc> adminList = super.authenticateAdmin(firstName, LastName, Password);

        if (!adminList.isEmpty()) {
            return true;
                    
        } else {
            return false;
        }
    }
}
