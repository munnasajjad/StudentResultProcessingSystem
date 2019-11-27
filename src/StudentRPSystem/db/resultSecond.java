/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentRPSystem.db;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rasel
 */
public class resultSecond extends StudentDB {
    
    private String searchID;
    private String studentName2nd;
    private String fatherName2nd;
    private String studentID2nd;
    private String BEEsess;
    private String BEEmid;
    private String BEEfinal;
    private String BEEtotal;
    private String BEEgp;
    private String DSsess;
    private String DSmid;
    private String DSfinal;
    private String DStotal;
    private String DSgp;
    private String CPPsess;
    private String CPPmid;
    private String CPPfinal;
    private String CPPtotal;
    private String CPPgp;
    private String PHY2sess;
    private String PHY2mid;
    private String PHY2final;
    private String PHY2total;
    private String PHY2gp;
    private String MATH2sess;
    private String MATH2mid;
    private String MATH2final;
    private String MATH2total;
    private String MATH2gp;
    private String PEsess;
    private String PEmid;
    private String PEfinal;
    private String PEtotal;
    private String PEgp;
    private String BEELab;
    private String BEELabtotal;
    private String BEELabgp;
    private String DSLab;
    private String DSLabtotal;
    private String DSLabgp;
    private String CPPLab;
    private String CPPLabtotal;
    private String CPPLabgp;
    private String PHY2Labfinal;
    private String PHY2Labtotal;
    private String PHY2Labgp;
    
        public String getSearchID() {
        return searchID;
    }

    public void setSearchID(String searchID) {
        this.searchID = searchID;
    }
    
    public String getStudentName2nd() {
        return studentName2nd;
    }
    
    public void setStudentName2nd(String studentName2nd) {
        this.studentName2nd = studentName2nd;
    }
    
    public String getFatherName2nd() {
        return fatherName2nd;
    }
    
    public void setFatherName2nd(String fatherName2nd) {
        this.fatherName2nd = fatherName2nd;
    }
    
    public String getStudentID2nd() {
        return studentID2nd;
    }
    
    public void setStudentID2nd(String studentID2nd) {
        this.studentID2nd = studentID2nd;
    }
    
    public String getBEEsess() {
        return BEEsess;
    }
    
    public void setBEEsess(String BEEsess) {
        this.BEEsess = BEEsess;
    }
    
    public String getBEEmid() {
        return BEEmid;
    }
    
    public void setBEEmid(String BEEmid) {
        this.BEEmid = BEEmid;
    }
    
    public String getBEEfinal() {
        return BEEfinal;
    }
    
    public void setBEEfinal(String BEEfinal) {
        this.BEEfinal = BEEfinal;
    }
    
    public String getBEEtotal() {
        return BEEtotal;
    }
    
    public void setBEEtotal(String BEEtotal) {
        this.BEEtotal = BEEtotal;
    }
    
    public String getBEEgp() {
        return BEEgp;
    }
    
    public void setBEEgp(String BEEgp) {
        this.BEEgp = BEEgp;
    }
    
    public String getDSsess() {
        return DSsess;
    }
    
    public void setDSsess(String DSsess) {
        this.DSsess = DSsess;
    }
    
    public String getDSmid() {
        return DSmid;
    }
    
    public void setDSmid(String DSmid) {
        this.DSmid = DSmid;
    }
    
    public String getDSfinal() {
        return DSfinal;
    }
    
    public void setDSfinal(String DSfinal) {
        this.DSfinal = DSfinal;
    }
    
    public String getDStotal() {
        return DStotal;
    }
    
    public void setDStotal(String DStotal) {
        this.DStotal = DStotal;
    }
    
    public String getDSgp() {
        return DSgp;
    }
    
    public void setDSgp(String DSgp) {
        this.DSgp = DSgp;
    }
    
    public String getCPPsess() {
        return CPPsess;
    }
    
    public void setCPPsess(String CPPsess) {
        this.CPPsess = CPPsess;
    }
    
    public String getCPPmid() {
        return CPPmid;
    }
    
    public void setCPPmid(String CPPmid) {
        this.CPPmid = CPPmid;
    }
    
    public String getCPPfinal() {
        return CPPfinal;
    }
    
    public void setCPPfinal(String CPPfinal) {
        this.CPPfinal = CPPfinal;
    }
    
    public String getCPPtotal() {
        return CPPtotal;
    }
    
    public void setCPPtotal(String CPPtotal) {
        this.CPPtotal = CPPtotal;
    }
    
    public String getCPPgp() {
        return CPPgp;
    }
    
    public void setCPPgp(String CPPgp) {
        this.CPPgp = CPPgp;
    }
    
    public String getPHY2sess() {
        return PHY2sess;
    }
    
    public void setPHY2sess(String PHY2sess) {
        this.PHY2sess = PHY2sess;
    }
    
    public String getPHY2mid() {
        return PHY2mid;
    }
    
    public void setPHY2mid(String PHY2mid) {
        this.PHY2mid = PHY2mid;
    }
    
    public String getPHY2final() {
        return PHY2final;
    }
    
    public void setPHY2final(String PHY2final) {
        this.PHY2final = PHY2final;
    }
    
    public String getPHY2total() {
        return PHY2total;
    }
    
    public void setPHY2total(String PHY2total) {
        this.PHY2total = PHY2total;
    }
    
    public String getPHY2gp() {
        return PHY2gp;
    }
    
    public void setPHY2gp(String PHY2gp) {
        this.PHY2gp = PHY2gp;
    }
    
    public String getMATH2sess() {
        return MATH2sess;
    }
    
    public void setMATH2sess(String MATH2sess) {
        this.MATH2sess = MATH2sess;
    }
    
    public String getMATH2mid() {
        return MATH2mid;
    }
    
    public void setMATH2mid(String MATH2mid) {
        this.MATH2mid = MATH2mid;
    }
    
    public String getMATH2final() {
        return MATH2final;
    }
    
    public void setMATH2final(String MATH2final) {
        this.MATH2final = MATH2final;
    }
    
    public String getMATH2total() {
        return MATH2total;
    }
    
    public void setMATH2total(String MATH2total) {
        this.MATH2total = MATH2total;
    }
    
    public String getMATH2gp() {
        return MATH2gp;
    }
    
    public void setMATH2gp(String MATH2gp) {
        this.MATH2gp = MATH2gp;
    }
    
    public String getPEsess() {
        return PEsess;
    }
    
    public void setPEsess(String PEsess) {
        this.PEsess = PEsess;
    }
    
    public String getPEmid() {
        return PEmid;
    }
    
    public void setPEmid(String PEmid) {
        this.PEmid = PEmid;
    }
    
    public String getPEfinal() {
        return PEfinal;
    }
    
    public void setPEfinal(String PEfinal) {
        this.PEfinal = PEfinal;
    }
    
    public String getPEtotal() {
        return PEtotal;
    }
    
    public void setPEtotal(String PEtotal) {
        this.PEtotal = PEtotal;
    }
    
    public String getPEgp() {
        return PEgp;
    }
    
    public void setPEgp(String PEgp) {
        this.PEgp = PEgp;
    }
    
    public String getBEELab() {
        return BEELab;
    }
    
    public void setBEELab(String BEELab) {
        this.BEELab = BEELab;
    }
    
    public String getBEELabtotal() {
        return BEELabtotal;
    }
    
    public void setBEELabtotal(String BEELabtotal) {
        this.BEELabtotal = BEELabtotal;
    }
    
    public String getBEELabgp() {
        return BEELabgp;
    }
    
    public void setBEELabgp(String BEELabgp) {
        this.BEELabgp = BEELabgp;
    }
    
    public String getDSLab() {
        return DSLab;
    }
    
    public void setDSLab(String DSLab) {
        this.DSLab = DSLab;
    }
    
    public String getDSLabtotal() {
        return DSLabtotal;
    }
    
    public void setDSLabtotal(String DSLabtotal) {
        this.DSLabtotal = DSLabtotal;
    }
    
    public String getDSLabgp() {
        return DSLabgp;
    }
    
    public void setDSLabgp(String DSLabgp) {
        this.DSLabgp = DSLabgp;
    }
    
    public String getCPPLab() {
        return CPPLab;
    }
    
    public void setCPPLab(String CPPLab) {
        this.CPPLab = CPPLab;
    }
    
    public String getCPPLabtotal() {
        return CPPLabtotal;
    }
    
    public void setCPPLabtotal(String CPPLabtotal) {
        this.CPPLabtotal = CPPLabtotal;
    }
    
    public String getCPPLabgp() {
        return CPPLabgp;
    }
    
    public void setCPPLabgp(String CPPLabgp) {
        this.CPPLabgp = CPPLabgp;
    }
    
    public String getPHY2Labfinal() {
        return PHY2Labfinal;
    }
    
    public void setPHY2Labfinal(String PHY2Labfinal) {
        this.PHY2Labfinal = PHY2Labfinal;
    }
    
    public String getPHY2Labtotal() {
        return PHY2Labtotal;
    }
    
    public void setPHY2Labtotal(String PHY2Labtotal) {
        this.PHY2Labtotal = PHY2Labtotal;
    }
    
    public String getPHY2Labgp() {
        return PHY2Labgp;
    }
    
    public void setPHY2Labgp(String PHY2Labgp) {
        this.PHY2Labgp = PHY2Labgp;
    }
    
    public boolean resultSecond() throws ClassNotFoundException, SQLException {
        
        boolean result2nd = super.result2ndSem(this);
        return result2nd;
    }
    
    public boolean search() throws ClassNotFoundException, SQLException {
        
        List<resultSecond> search = super.resultSecondSearch(this);
        if (search.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public List<resultSecond> SecondSemResult() throws ClassNotFoundException, SQLException{
        List<resultSecond> SSemResult = super.ResultData2nd(this);
        if(SSemResult.isEmpty())
            return SSemResult;
        else
            return SSemResult;
    }
    
    public ArrayList<resultSecond> tablesearch() throws ClassNotFoundException, SQLException{
        ArrayList<resultSecond> tblsearch = super.tablesearch2nd(searchID);
        if(tblsearch.isEmpty())
            return tblsearch;
        else 
            return tblsearch;
    }
}
