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
public class StudentAcc extends StudentDB {

    private String firstname;
    private String lastname;
    private String stuID;
    private String pass;
    private String conPass;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getConPass() {
        return conPass;
    }

    public void setConPass(String conPass) {
        this.conPass = conPass;
    }

    public boolean newStudent() throws ClassNotFoundException, SQLException {

        boolean newStudent = super.newAccStudent(this);
        return newStudent;
    }

    public boolean findStudent() throws ClassNotFoundException, SQLException {

        List<StudentAcc> studentList = super.authenticateStudent(firstname, lastname, pass);

        if (!studentList.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
