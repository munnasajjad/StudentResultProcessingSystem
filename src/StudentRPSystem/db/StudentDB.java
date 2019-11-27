/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentRPSystem.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rasel
 */
public class StudentDB extends ConnectionUtill {

    public StudentDB() {
    }

    protected boolean newAccAdmin(AdminAcc admin) throws SQLException, ClassNotFoundException {

        boolean newAccAdmin = false;

        Connection con = super.doConnection();
        String sql = "insert into admin(firstname, lastname, admcode, password)values(?,?,?,?)";

        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, admin.getFirstName());
        pstmt.setString(2, admin.getLastName());
        pstmt.setString(3, admin.getAdmCode());
        pstmt.setString(4, admin.getPassword());

        pstmt.executeUpdate();
        return newAccAdmin = true;
    }

    protected boolean newAccStudent(StudentAcc student) throws SQLException, ClassNotFoundException {

        boolean newAccStudent = false;

        Connection con = super.doConnection();
        String sql = "insert into student(firstname, lastname, studentID, password)values(?,?,?,?)";

        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, student.getFirstname());
        pstmt.setString(2, student.getLastname());
        pstmt.setString(3, student.getStuID());
        pstmt.setString(4, student.getConPass());

        pstmt.executeUpdate();
        return newAccStudent = true;
    }

    protected List<AdminAcc> authenticateAdmin(String firstname, String lastname, String password) throws ClassNotFoundException, SQLException {

        List<AdminAcc> adminList = new ArrayList();
        Connection con = super.doConnection();
        String sql = "Select admcode from admin where firstname=? and password=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, firstname);
        pstmt.setString(2, password);

        AdminAcc admin = new AdminAcc();
        ResultSet rst = pstmt.executeQuery();

        while (rst.next()) {
            admin.setAdmCode(rst.getString("admcode"));
            adminList.add(admin);
        }
        return adminList;
    }

    protected List<StudentAcc> authenticateStudent(String firstname, String lastname, String password) throws ClassNotFoundException, SQLException {

        List<StudentAcc> studentList = new ArrayList();
        Connection con = super.doConnection();
        String sql = "Select studentID from student where firstname=? and lastname=? and password=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, firstname);
        pstmt.setString(2, lastname);
        pstmt.setString(3, password);

        StudentAcc student = new StudentAcc();
        ResultSet rst = pstmt.executeQuery();

        while (rst.next()) {
            student.setStuID(rst.getString("studentID"));
            studentList.add(student);
        }
        return studentList;
    }

    protected boolean resultFirstSem(resultFirst result) throws ClassNotFoundException, SQLException {
        boolean resultFirstSem = false;

        Connection con = super.doConnection();
        String sql = "insert into resultfirst(studentname, fathername, studentID, CFsessional, CFmid, CFfinal, CFtotal, gpaCF, Csessional, Cmid, Cfinal, Ctotal, gpaC, Physessional, Phymid, Phyfinal, Phytotal, gpaPhy, Mathsessional, Mathmid, Mathfinal, Mathtotal, gpaMath, Engsessional, Engmid, Engfinal, Engtotal, gpaEng, Accsessional, Accmid, Accfinal, Acctotal, gpaAcc, BSsessional, BSmid, BSfinal, BStotal, gpaBS, CFLabfinal, CFLabtotal, gpaCFLab, CLabfinal, CLabtotal, gpaCLab, PhyLabfinal, PhyLabtotal, gpaPhyLab) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, result.getStudentName());
        pstmt.setString(2, result.getFatherName());
        pstmt.setString(3, result.getStudentID());
        pstmt.setString(4, result.getSessCF());
        pstmt.setString(5, result.getMidCF());
        pstmt.setString(6, result.getFinalCF());
        pstmt.setString(7, result.getTotalCF());
        pstmt.setString(8, result.getCFGPA());
        pstmt.setString(9, result.getSessC());
        pstmt.setString(10, result.getMidC());
        pstmt.setString(11, result.getFinalC());
        pstmt.setString(12, result.getTotalC());
        pstmt.setString(13, result.getCGPA());
        pstmt.setString(14, result.getSessPhy());
        pstmt.setString(15, result.getMidPhy());
        pstmt.setString(16, result.getFinalPhy());
        pstmt.setString(17, result.getTotalPhy());
        pstmt.setString(18, result.getPhyGPA());
        pstmt.setString(19, result.getSessMath1());
        pstmt.setString(20, result.getMidMath1());
        pstmt.setString(21, result.getFinalMath1());
        pstmt.setString(22, result.getTotalMath1());
        pstmt.setString(23, result.getMathGPA());
        pstmt.setString(24, result.getSessEng());
        pstmt.setString(25, result.getMidEng());
        pstmt.setString(26, result.getFinalEng());
        pstmt.setString(27, result.getTotalEng());
        pstmt.setString(28, result.getEngGPA());
        pstmt.setString(29, result.getSessAcc());
        pstmt.setString(30, result.getMidAcc());
        pstmt.setString(31, result.getFinalAcc());
        pstmt.setString(32, result.getTotalAcc());
        pstmt.setString(33, result.getAccGPA());
        pstmt.setString(34, result.getSessBS());
        pstmt.setString(35, result.getMidBS());
        pstmt.setString(36, result.getFinalBS());
        pstmt.setString(37, result.getTotalBS());
        pstmt.setString(38, result.getBSGPA());
        pstmt.setString(39, result.getCFLab());
        pstmt.setString(40, result.getTotalCFLab());
        pstmt.setString(41, result.getCFLabGPA());
        pstmt.setString(42, result.getCLab());
        pstmt.setString(43, result.getTotalCLab());
        pstmt.setString(44, result.getCLabGPA());
        pstmt.setString(45, result.getPhyLab());
        pstmt.setString(46, result.getTotalPhyLab());
        pstmt.setString(47, result.getPhyLabGPA());

        pstmt.executeUpdate();
        return resultFirstSem = true;
    }

    protected List<resultFirst> resultFirstSearch(resultFirst rslfst) throws ClassNotFoundException, SQLException {

        List<resultFirst> fst = new ArrayList();

        Connection con = super.doConnection();
        String sql = "Select studentname, fathername from resultfirst where studentID=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, rslfst.getStudentID());
        ResultSet rst = pstmt.executeQuery();
        if (rst.next()) {
            rslfst.setStudentName(rst.getString("studentname"));
            rslfst.setFatherName(rst.getString("fathername"));
            fst.add(rslfst);
        }
        return fst;
    }

    protected boolean result2ndSem(resultSecond sec) throws ClassNotFoundException, SQLException {

        boolean result2nd = false;

        Connection con = super.doConnection();
        String sql = "insert into resultsecond (studentname, fathername, studentID, BEEsessional, BEEmid, BEEfinal, BEEtotal, BEEgp, DSsessional, DSmid, DSfinal, DStotal, DSgp, CPPsessional, CPPmid, CPPfinal, CPPtotal, CPPgp, PHY2sessional, PHY2mid, PHY2final, PHY2total, PHY2gp, MATH2sessional, MATH2mid, MATH2final, MATH2total, MATH2gp, PEsessional, PEmid, PEfinal, PEtotal, PEgp, BEELabfinal, BEELabtotal, BEELabgp, DSLabfinal, DSLabtotal, DSLabgp, CPPLabfinal, CPPLabtotal, CPPLabgp, PHY2Labfinal, PHY2Labtotal, PHY2Labgp) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, sec.getStudentName2nd());
        pstmt.setString(2, sec.getFatherName2nd());
        pstmt.setString(3, sec.getStudentID2nd());
        pstmt.setString(4, sec.getBEEsess());
        pstmt.setString(5, sec.getBEEmid());
        pstmt.setString(6, sec.getBEEfinal());
        pstmt.setString(7, sec.getBEEtotal());
        pstmt.setString(8, sec.getBEEgp());
        pstmt.setString(9, sec.getDSsess());
        pstmt.setString(10, sec.getDSmid());
        pstmt.setString(11, sec.getDSfinal());
        pstmt.setString(12, sec.getDStotal());
        pstmt.setString(13, sec.getDSgp());
        pstmt.setString(14, sec.getCPPsess());
        pstmt.setString(15, sec.getCPPmid());
        pstmt.setString(16, sec.getCPPfinal());
        pstmt.setString(17, sec.getCPPtotal());
        pstmt.setString(18, sec.getCPPgp());
        pstmt.setString(19, sec.getPHY2sess());
        pstmt.setString(20, sec.getPHY2mid());
        pstmt.setString(21, sec.getPHY2final());
        pstmt.setString(22, sec.getPHY2total());
        pstmt.setString(23, sec.getPHY2gp());
        pstmt.setString(24, sec.getMATH2sess());
        pstmt.setString(25, sec.getMATH2mid());
        pstmt.setString(26, sec.getMATH2final());
        pstmt.setString(27, sec.getMATH2total());
        pstmt.setString(28, sec.getMATH2gp());
        pstmt.setString(29, sec.getPEsess());
        pstmt.setString(30, sec.getPEmid());
        pstmt.setString(31, sec.getPEfinal());
        pstmt.setString(32, sec.getPEtotal());
        pstmt.setString(33, sec.getPEgp());
        pstmt.setString(34, sec.getBEELab());
        pstmt.setString(35, sec.getBEELabtotal());
        pstmt.setString(36, sec.getBEELabgp());
        pstmt.setString(37, sec.getDSLab());
        pstmt.setString(38, sec.getDSLabtotal());
        pstmt.setString(39, sec.getDSLabgp());
        pstmt.setString(40, sec.getCPPLab());
        pstmt.setString(41, sec.getCPPLabtotal());
        pstmt.setString(42, sec.getCPPLabgp());
        pstmt.setString(43, sec.getPHY2Labfinal());
        pstmt.setString(44, sec.getPHY2Labtotal());
        pstmt.setString(45, sec.getPHY2Labgp());

        pstmt.executeUpdate();
        return result2nd = true;
    }

    protected List<resultSecond> resultSecondSearch(resultSecond sec) throws ClassNotFoundException, SQLException {

        List<resultSecond> result = new ArrayList();
        Connection con = super.doConnection();
        String sql = "Select studentname, fathername from resultsecond where studentID=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, sec.getStudentID2nd());
        ResultSet rst = pstmt.executeQuery();
        while (rst.next()) {
            sec.setStudentName2nd(rst.getString("studentname"));
            sec.setStudentID2nd(rst.getString("fathername"));
            result.add(sec);
        }
        return result;
    }

    protected List<resultFirst> ResultData1st(resultFirst first) throws ClassNotFoundException, SQLException {

        List<resultFirst> resultTable = new ArrayList();
        Connection con = super.doConnection();
        String sql = "select * from resultfirst order by studentID";
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rst = pstmt.executeQuery();
        while (rst.next()) {
            resultFirst result = new resultFirst();
            result.setStudentName(rst.getString("studentname"));
            result.setFatherName(rst.getString("fathername"));
            result.setStudentID(rst.getString("studentID"));
            result.setSessCF(rst.getString("CFsessional"));
            result.setMidCF(rst.getString("CFmid"));
            result.setFinalCF(rst.getString("CFfinal"));
            result.setTotalCF(rst.getString("CFtotal"));
            result.setCFGPA(rst.getString("gpaCF"));
            result.setSessC(rst.getString("Csessional"));
            result.setMidC(rst.getString("Cmid"));
            result.setFinalC(rst.getString("Cfinal"));
            result.setTotalC(rst.getString("Ctotal"));
            result.setCGPA(rst.getString("gpaC"));
            result.setSessPhy(rst.getString("Physessional"));
            result.setMidPhy(rst.getString("Phymid"));
            result.setFinalPhy(rst.getString("Phyfinal"));
            result.setTotalPhy(rst.getString("Phytotal"));
            result.setPhyGPA(rst.getString("gpaPhy"));
            result.setSessMath1(rst.getString("Mathsessional"));
            result.setMidMath1(rst.getString("Mathmid"));
            result.setFinalMath1(rst.getString("Mathfinal"));
            result.setTotalMath1(rst.getString("Mathtotal"));
            result.setMathGPA(rst.getString("gpaMath"));
            result.setSessEng(rst.getString("Engsessional"));
            result.setMidEng(rst.getString("Engmid"));
            result.setFinalEng(rst.getString("Engfinal"));
            result.setTotalEng(rst.getString("Engtotal"));
            result.setEngGPA(rst.getString("gpaEng"));
            result.setSessAcc(rst.getString("Accsessional"));
            result.setMidAcc(rst.getString("Accmid"));
            result.setFinalAcc(rst.getString("Accfinal"));
            result.setTotalAcc(rst.getString("Acctotal"));
            result.setAccGPA(rst.getString("gpaAcc"));
            result.setSessBS(rst.getString("BSsessional"));
            result.setMidBS(rst.getString("BSmid"));
            result.setFinalBS(rst.getString("BSfinal"));
            result.setTotalBS(rst.getString("BStotal"));
            result.setBSGPA(rst.getString("gpaBS"));
            result.setCFLab(rst.getString("CFLabfinal"));
            result.setTotalCFLab(rst.getString("CFLabtotal"));
            result.setCFLabGPA(rst.getString("gpaCFLab"));
            result.setCLab(rst.getString("CLabfinal"));
            result.setTotalCLab(rst.getString("CLabtotal"));
            result.setCLabGPA(rst.getString("gpaCLab"));
            result.setPhyLab(rst.getString("PhyLabfinal"));
            result.setTotalPhyLab(rst.getString("PhyLabtotal"));
            result.setPhyLabGPA(rst.getString("gpaPhyLab"));

            resultTable.add(result);
        }
        return resultTable;
    }

    protected ArrayList<resultFirst> tableSearch(String searchID) throws ClassNotFoundException, SQLException {
        ArrayList<resultFirst> result = new ArrayList();
        Connection con = super.doConnection();
        String sql = "SELECT * from `resultfirst` WHERE studentID = ?"; 
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, searchID);
        ResultSet rst = pstmt.executeQuery();
        while (rst.next()) {
            resultFirst first = new resultFirst();
            first.setStudentID(rst.getString("studentID"));
            first.setStudentName(rst.getString("studentname"));
            first.setFatherName(rst.getString("fathername"));
            first.setSessCF(rst.getString("CFsessional"));
            first.setMidCF(rst.getString("CFmid"));
            first.setFinalCF(rst.getString("CFfinal"));
            first.setTotalCF(rst.getString("CFtotal"));
            first.setCFGPA(rst.getString("gpaCF"));
            first.setSessC(rst.getString("Csessional"));
            first.setMidC(rst.getString("Cmid"));
            first.setFinalC(rst.getString("Cfinal"));
            first.setTotalC(rst.getString("Ctotal"));
            first.setCGPA(rst.getString("gpaC"));
            first.setSessPhy(rst.getString("Physessional"));
            first.setMidPhy(rst.getString("Phymid"));
            first.setFinalPhy(rst.getString("Phyfinal"));
            first.setTotalPhy(rst.getString("Phytotal"));
            first.setPhyGPA(rst.getString("gpaPhy"));
            first.setSessMath1(rst.getString("Mathsessional"));
            first.setMidMath1(rst.getString("Mathmid"));
            first.setFinalMath1(rst.getString("Mathfinal"));
            first.setTotalMath1(rst.getString("Mathtotal"));
            first.setMathGPA(rst.getString("gpaMath"));
            first.setSessEng(rst.getString("Engsessional"));
            first.setMidEng(rst.getString("Engmid"));
            first.setFinalEng(rst.getString("Engfinal"));
            first.setTotalEng(rst.getString("Engtotal"));
            first.setEngGPA(rst.getString("gpaEng"));
            first.setSessAcc(rst.getString("Accsessional"));
            first.setMidAcc(rst.getString("Accmid"));
            first.setFinalAcc(rst.getString("Accfinal"));
            first.setTotalAcc(rst.getString("Acctotal"));
            first.setAccGPA(rst.getString("gpaAcc"));
            first.setSessBS(rst.getString("BSsessional"));
            first.setMidBS(rst.getString("BSmid"));
            first.setFinalBS(rst.getString("BSfinal"));
            first.setTotalBS(rst.getString("BStotal"));
            first.setBSGPA(rst.getString("gpaBS"));
            first.setCFLab(rst.getString("CFLabfinal"));
            first.setTotalCFLab(rst.getString("CFLabtotal"));
            first.setCFLabGPA(rst.getString("gpaCFLab"));
            first.setCLab(rst.getString("CLabfinal"));
            first.setTotalCLab(rst.getString("CLabtotal"));
            first.setCLabGPA(rst.getString("gpaCLab"));
            first.setPhyLab(rst.getString("PhyLabfinal"));
            first.setTotalPhyLab(rst.getString("PhyLabtotal"));
            first.setPhyLabGPA(rst.getString("gpaPhyLab"));

            result.add(first);
        }
        return result;
    }
    
    protected ArrayList<resultFirst> Marksheet1st(resultFirst first) throws ClassNotFoundException, SQLException {
        ArrayList<resultFirst> result = new ArrayList();
        Connection con = super.doConnection();
        String sql = "SELECT * from `resultfirst` WHERE studentID = ?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, first.getSearchID());
        ResultSet rst = pstmt.executeQuery();
        while (rst.next()) {
            first.setStudentID(rst.getString("studentID"));
            first.setStudentName(rst.getString("studentname"));
            first.setFatherName(rst.getString("fathername"));
            first.setSessCF(rst.getString("CFsessional"));
            first.setMidCF(rst.getString("CFmid"));
            first.setFinalCF(rst.getString("CFfinal"));
            first.setTotalCF(rst.getString("CFtotal"));
            first.setCFGPA(rst.getString("gpaCF"));
            first.setSessC(rst.getString("Csessional"));
            first.setMidC(rst.getString("Cmid"));
            first.setFinalC(rst.getString("Cfinal"));
            first.setTotalC(rst.getString("Ctotal"));
            first.setCGPA(rst.getString("gpaC"));
            first.setSessPhy(rst.getString("Physessional"));
            first.setMidPhy(rst.getString("Phymid"));
            first.setFinalPhy(rst.getString("Phyfinal"));
            first.setTotalPhy(rst.getString("Phytotal"));
            first.setPhyGPA(rst.getString("gpaPhy"));
            first.setSessMath1(rst.getString("Mathsessional"));
            first.setMidMath1(rst.getString("Mathmid"));
            first.setFinalMath1(rst.getString("Mathfinal"));
            first.setTotalMath1(rst.getString("Mathtotal"));
            first.setMathGPA(rst.getString("gpaMath"));
            first.setSessEng(rst.getString("Engsessional"));
            first.setMidEng(rst.getString("Engmid"));
            first.setFinalEng(rst.getString("Engfinal"));
            first.setTotalEng(rst.getString("Engtotal"));
            first.setEngGPA(rst.getString("gpaEng"));
            first.setSessAcc(rst.getString("Accsessional"));
            first.setMidAcc(rst.getString("Accmid"));
            first.setFinalAcc(rst.getString("Accfinal"));
            first.setTotalAcc(rst.getString("Acctotal"));
            first.setAccGPA(rst.getString("gpaAcc"));
            first.setSessBS(rst.getString("BSsessional"));
            first.setMidBS(rst.getString("BSmid"));
            first.setFinalBS(rst.getString("BSfinal"));
            first.setTotalBS(rst.getString("BStotal"));
            first.setBSGPA(rst.getString("gpaBS"));
            first.setCFLab(rst.getString("CFLabfinal"));
            first.setTotalCFLab(rst.getString("CFLabtotal"));
            first.setCFLabGPA(rst.getString("gpaCFLab"));
            first.setCLab(rst.getString("CLabfinal"));
            first.setTotalCLab(rst.getString("CLabtotal"));
            first.setCLabGPA(rst.getString("gpaCLab"));
            first.setPhyLab(rst.getString("PhyLabfinal"));
            first.setTotalPhyLab(rst.getString("PhyLabtotal"));
            first.setPhyLabGPA(rst.getString("gpaPhyLab"));

            result.add(first);
        }
        return result;
    }

    protected List<resultSecond> ResultData2nd(resultSecond sec) throws ClassNotFoundException, SQLException {

        List<resultSecond> resultTable = new ArrayList();
        Connection con = super.doConnection();
        String sql = "select * from resultsecond order by studentID";
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rst = pstmt.executeQuery();
        while (rst.next()) {
            resultSecond result = new resultSecond();
            result.setStudentName2nd(rst.getString("studentname"));
            result.setFatherName2nd(rst.getString("fathername"));
            result.setStudentID2nd(rst.getString("studentID"));
            result.setBEEsess(rst.getString("BEEsessional"));
            result.setBEEmid(rst.getString("BEEmid"));
            result.setBEEfinal(rst.getString("BEEfinal"));
            result.setBEEtotal(rst.getString("BEEtotal"));
            result.setBEEgp(rst.getString("BEEgp"));
            result.setDSsess(rst.getString("DSsessional"));
            result.setDSmid(rst.getString("DSmid"));
            result.setDSfinal(rst.getString("DSfinal"));
            result.setDStotal(rst.getString("DStotal"));
            result.setDSgp(rst.getString("DSgp"));
            result.setCPPsess(rst.getString("CPPsessional"));
            result.setCPPmid(rst.getString("CPPmid"));
            result.setCPPfinal(rst.getString("CPPfinal"));
            result.setCPPtotal(rst.getString("CPPtotal"));
            result.setCPPgp(rst.getString("CPPgp"));
            result.setPHY2sess(rst.getString("PHY2sessional"));
            result.setPHY2mid(rst.getString("PHY2mid"));
            result.setPHY2final(rst.getString("PHY2final"));
            result.setPHY2total(rst.getString("PHY2total"));
            result.setPHY2gp(rst.getString("PHY2gp"));
            result.setMATH2sess(rst.getString("MATH2sessional"));
            result.setMATH2mid(rst.getString("MATH2mid"));
            result.setMATH2final(rst.getString("MATH2final"));
            result.setMATH2total(rst.getString("MATH2total"));
            result.setMATH2gp(rst.getString("MATH2gp"));
            result.setPEsess(rst.getString("PEsessional"));
            result.setPEmid(rst.getString("PEmid"));
            result.setPEfinal(rst.getString("PEfinal"));
            result.setPEtotal(rst.getString("PEtotal"));
            result.setPEgp(rst.getString("PEgp"));
            result.setBEELab(rst.getString("BEELabfinal"));
            result.setBEELabtotal(rst.getString("BEELabtotal"));
            result.setBEELabgp(rst.getString("BEELabgp"));
            result.setDSLab(rst.getString("DSLabfinal"));
            result.setDSLabtotal(rst.getString("DSLabtotal"));
            result.setDSLabgp(rst.getString("DSLabgp"));
            result.setCPPLab(rst.getString("CPPLabfinal"));
            result.setCPPLabtotal(rst.getString("CPPLabtotal"));
            result.setCPPLabgp(rst.getString("CPPLabgp"));
            result.setPHY2Labfinal(rst.getString("PHY2Labfinal"));
            result.setPHY2Labtotal(rst.getString("PHY2Labtotal"));
            result.setPHY2Labgp(rst.getString("PHY2Labgp"));

            resultTable.add(result);
        }
        return resultTable;
    }

    protected ArrayList<resultSecond> tablesearch2nd(String searchID) throws ClassNotFoundException, SQLException {
        ArrayList<resultSecond> sec = new ArrayList();
        Connection con = super.doConnection();
        String sql = "SELECT * from `resultsecond` WHERE studentID = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, searchID);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            resultSecond result = new resultSecond();
            result.setStudentID2nd(rs.getString("studentID"));
            result.setStudentName2nd(rs.getString("studentname"));
            result.setFatherName2nd(rs.getString("fathername"));
            result.setBEEsess(rs.getString("BEEsessional"));
            result.setBEEmid(rs.getString("BEEmid"));
            result.setBEEfinal(rs.getString("BEEfinal"));
            result.setBEEtotal(rs.getString("BEEtotal"));
            result.setBEEgp(rs.getString("BEEgp"));
            result.setDSsess(rs.getString("DSsessional"));
            result.setDSmid(rs.getString("DSmid"));
            result.setDSfinal(rs.getString("DSfinal"));
            result.setDStotal(rs.getString("DStotal"));
            result.setDSgp(rs.getString("DSgp"));
            result.setCPPsess(rs.getString("CPPsessional"));
            result.setCPPmid(rs.getString("CPPmid"));
            result.setCPPfinal(rs.getString("CPPfinal"));
            result.setCPPtotal(rs.getString("CPPtotal"));
            result.setCPPgp(rs.getString("CPPgp"));
            result.setPHY2sess(rs.getString("PHY2sessional"));
            result.setPHY2mid(rs.getString("PHY2mid"));
            result.setPHY2final(rs.getString("PHY2total"));
            result.setPHY2gp(rs.getString("PHY2gp"));
            result.setMATH2sess(rs.getString("MATH2sessional"));
            result.setMATH2mid(rs.getString("MATH2mid"));
            result.setMATH2final(rs.getString("MATH2final"));
            result.setMATH2total(rs.getString("MATH2total"));
            result.setMATH2gp(rs.getString("MATH2gp"));
            result.setPEsess(rs.getString("PEsessional"));
            result.setPEmid(rs.getString("PEmid"));
            result.setPEfinal(rs.getString("PEfinal"));
            result.setPEtotal(rs.getString("PEtotal"));
            result.setPEgp(rs.getString("PEgp"));
            result.setBEELab(rs.getString("BEELabfinal"));
            result.setBEELabtotal(rs.getString("BEELabtotal"));
            result.setBEELabgp(rs.getString("BEELabgp"));
            result.setDSLab(rs.getString("DSLabfinal"));
            result.setDSLabtotal(rs.getString("DSLabtotal"));
            result.setDSLabgp(rs.getString("DSLabgp"));
            result.setCPPLab(rs.getString("CPPLabfinal"));
            result.setCPPLabtotal(rs.getString("CPPLabtotal"));
            result.setCPPLabgp(rs.getString("CPPLabgp"));
            result.setPHY2Labfinal(rs.getString("PHY2Labfinal"));
            result.setPHY2Labtotal(rs.getString("PHY2Labtotal"));
            result.setPHY2Labgp(rs.getString("PHY2Labgp"));
            
            sec.add(result);
        }
        return sec;
    }
}
