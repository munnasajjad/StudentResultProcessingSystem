/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentRPSystem.db;

import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author rasel
 */
public class resultFirst extends StudentDB {

    private String searchID;
    private String studentName;
    private String fatherName;
    private String studentID;
    private String sessCF;
    private String midCF;
    private String finalCF;
    private String totalCF;
    private String sessC;
    private String midC;
    private String finalC;
    private String totalC;
    private String sessPhy;
    private String midPhy;
    private String finalPhy;
    private String totalPhy;
    private String sessMath1;
    private String midMath1;
    private String finalMath1;
    private String totalMath1;
    private String sessEng;
    private String midEng;
    private String finalEng;
    private String totalEng;
    private String sessAcc;
    private String midAcc;
    private String finalAcc;
    private String totalAcc;
    private String sessBS;
    private String midBS;
    private String finalBS;
    private String totalBS;
    private String CFLab;
    private String totalCFLab;
    private String CLab;
    private String totalCLab;
    private String PhyLab;
    private String totalPhyLab;
    private String CFGPA;
    private String CGPA;
    private String PhyGPA;
    private String MathGPA;
    private String EngGPA;
    private String AccGPA;
    private String BSGPA;
    private String CFLabGPA;
    private String CLabGPA;
    private String PhyLabGPA;

      public String getSearchID() {
        return searchID;
    }

    public void setSearchID(String searchID) {
        this.searchID = searchID;
    }
    
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getSessCF() {
        return sessCF;
    }

    public void setSessCF(String sessCF) {
        this.sessCF = sessCF;
    }

    public String getMidCF() {
        return midCF;
    }

    public void setMidCF(String midCF) {
        this.midCF = midCF;
    }

    public String getFinalCF() {
        return finalCF;
    }

    public void setFinalCF(String finalCF) {
        this.finalCF = finalCF;
    }

    public String getTotalCF() {
        return totalCF;
    }

    public void setTotalCF(String totalCF) {
        this.totalCF = totalCF;
    }

    public String getSessC() {
        return sessC;
    }

    public void setSessC(String sessC) {
        this.sessC = sessC;
    }

    public String getMidC() {
        return midC;
    }

    public void setMidC(String midC) {
        this.midC = midC;
    }

    public String getFinalC() {
        return finalC;
    }

    public void setFinalC(String finalC) {
        this.finalC = finalC;
    }

    public String getTotalC() {
        return totalC;
    }

    public void setTotalC(String totalC) {
        this.totalC = totalC;
    }

    public String getSessPhy() {
        return sessPhy;
    }

    public void setSessPhy(String sessPhy) {
        this.sessPhy = sessPhy;
    }

    public String getMidPhy() {
        return midPhy;
    }

    public void setMidPhy(String midPhy) {
        this.midPhy = midPhy;
    }

    public String getFinalPhy() {
        return finalPhy;
    }

    public void setFinalPhy(String finalPhy) {
        this.finalPhy = finalPhy;
    }

    public String getTotalPhy() {
        return totalPhy;
    }

    public void setTotalPhy(String totalPhy) {
        this.totalPhy = totalPhy;
    }

    public String getSessMath1() {
        return sessMath1;
    }

    public void setSessMath1(String sessMath1) {
        this.sessMath1 = sessMath1;
    }

    public String getMidMath1() {
        return midMath1;
    }

    public void setMidMath1(String midMath1) {
        this.midMath1 = midMath1;
    }

    public String getFinalMath1() {
        return finalMath1;
    }

    public void setFinalMath1(String finalMath1) {
        this.finalMath1 = finalMath1;
    }

    public String getTotalMath1() {
        return totalMath1;
    }

    public void setTotalMath1(String totalMath1) {
        this.totalMath1 = totalMath1;
    }

    public String getSessEng() {
        return sessEng;
    }

    public void setSessEng(String sessEng) {
        this.sessEng = sessEng;
    }

    public String getMidEng() {
        return midEng;
    }

    public void setMidEng(String midEng) {
        this.midEng = midEng;
    }

    public String getFinalEng() {
        return finalEng;
    }

    public void setFinalEng(String finalEng) {
        this.finalEng = finalEng;
    }

    public String getTotalEng() {
        return totalEng;
    }

    public void setTotalEng(String totalEng) {
        this.totalEng = totalEng;
    }

    public String getSessAcc() {
        return sessAcc;
    }

    public void setSessAcc(String sessAcc) {
        this.sessAcc = sessAcc;
    }

    public String getMidAcc() {
        return midAcc;
    }

    public void setMidAcc(String midAcc) {
        this.midAcc = midAcc;
    }

    public String getFinalAcc() {
        return finalAcc;
    }

    public void setFinalAcc(String finalAcc) {
        this.finalAcc = finalAcc;
    }

    public String getTotalAcc() {
        return totalAcc;
    }

    public void setTotalAcc(String totalAcc) {
        this.totalAcc = totalAcc;
    }

    public String getSessBS() {
        return sessBS;
    }

    public void setSessBS(String sessBS) {
        this.sessBS = sessBS;
    }

    public String getMidBS() {
        return midBS;
    }

    public void setMidBS(String midBS) {
        this.midBS = midBS;
    }

    public String getFinalBS() {
        return finalBS;
    }

    public void setFinalBS(String finalBS) {
        this.finalBS = finalBS;
    }

    public String getTotalBS() {
        return totalBS;
    }

    public void setTotalBS(String totalBS) {
        this.totalBS = totalBS;
    }

    public String getCFLab() {
        return CFLab;
    }

    public void setCFLab(String CFLab) {
        this.CFLab = CFLab;
    }

    public String getTotalCFLab() {
        return totalCFLab;
    }

    public void setTotalCFLab(String totalCFLab) {
        this.totalCFLab = totalCFLab;
    }

    public String getCLab() {
        return CLab;
    }

    public void setCLab(String CLab) {
        this.CLab = CLab;
    }

    public String getTotalCLab() {
        return totalCLab;
    }

    public void setTotalCLab(String totalCLab) {
        this.totalCLab = totalCLab;
    }

    public String getPhyLab() {
        return PhyLab;
    }

    public void setPhyLab(String PhyLab) {
        this.PhyLab = PhyLab;
    }

    public String getTotalPhyLab() {
        return totalPhyLab;
    }

    public void setTotalPhyLab(String totalPhyLab) {
        this.totalPhyLab = totalPhyLab;
    }

    public String getCFGPA() {
        return CFGPA;
    }

    public void setCFGPA(String CFGPA) {
        this.CFGPA = CFGPA;
    }

    public String getCGPA() {
        return CGPA;
    }

    public void setCGPA(String CGPA) {
        this.CGPA = CGPA;
    }

    public String getPhyGPA() {
        return PhyGPA;
    }

    public void setPhyGPA(String PhyGPA) {
        this.PhyGPA = PhyGPA;
    }

    public String getMathGPA() {
        return MathGPA;
    }

    public void setMathGPA(String MathGPA) {
        this.MathGPA = MathGPA;
    }

    public String getEngGPA() {
        return EngGPA;
    }

    public void setEngGPA(String EngGPA) {
        this.EngGPA = EngGPA;
    }

    public String getAccGPA() {
        return AccGPA;
    }

    public void setAccGPA(String AccGPA) {
        this.AccGPA = AccGPA;
    }

    public String getBSGPA() {
        return BSGPA;
    }

    public void setBSGPA(String BSGPA) {
        this.BSGPA = BSGPA;
    }

    public String getCFLabGPA() {
        return CFLabGPA;
    }

    public void setCFLabGPA(String CFLabGPA) {
        this.CFLabGPA = CFLabGPA;
    }

    public String getCLabGPA() {
        return CLabGPA;
    }

    public void setCLabGPA(String CLabGPA) {
        this.CLabGPA = CLabGPA;
    }

    public String getPhyLabGPA() {
        return PhyLabGPA;
    }

    public void setPhyLabGPA(String PhyLabGPA) {
        this.PhyLabGPA = PhyLabGPA;
    }

    public boolean resultFirst() throws ClassNotFoundException, SQLException {

        boolean resultFirst = super.resultFirstSem(this);
        return resultFirst;
    }

    public boolean search() throws ClassNotFoundException, SQLException {

        List<resultFirst> search = super.resultFirstSearch(this);
        if (search.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public List<resultFirst> FirstSemResult() throws ClassNotFoundException, SQLException {

        List<resultFirst> FSRtable = super.ResultData1st(this);
        if (FSRtable.isEmpty()) {
            return FSRtable;
        } else {
            return FSRtable;
        }
    }

    public ArrayList<resultFirst> tableSearch() throws ClassNotFoundException, SQLException {
        ArrayList<resultFirst> search = super.tableSearch(searchID);
        if (search.isEmpty()) {
            return search;
        } else {
            return search;
        }
    }

     public boolean searchMarksheet() throws ClassNotFoundException, SQLException {

        List<resultFirst> marksheet = super.Marksheet1st(this);
        if (marksheet.isEmpty()) {
            return false;                    
        } else {
            return true;
        }
    }
    
}
