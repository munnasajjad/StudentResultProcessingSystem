package StudentRPSystem.ui;

import StudentRPSystem.db.resultFirst;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rasel
 */
public class DisplayResult1st extends javax.swing.JPanel {

    public DisplayResult1st() {
        initComponents();
        jPanel8.setVisible(false);
    }
    
    public String LaterGrade(String gp) {
        if (gp.equals("4.0")) {
            return "A+";
        } else if (gp.equals("3.75")) {
            return "A";
        } else if (gp.equals("3.5")) {
            return "A-";
        } else if (gp.equals("3.25")) {
            return "B+";
        } else if (gp.equals("3.0")) {
            return "B";
        } else if (gp.equals("2.75")) {
            return "B-";
        } else if (gp.equals("2.5")) {
            return "C+";
        } else if (gp.equals("2.25")) {
            return "C";
        } else if (gp.equals("2.0")) {
            return "D";
        } else {
            return "F";
        }
    }

    public void findstudent() throws ClassNotFoundException, SQLException {

        resultFirst first = new resultFirst();
        first.setSearchID(txtsearch.getText());
        boolean chk = first.searchMarksheet();
        System.out.println(chk);
        if (chk) {
            jPanel8.setVisible(true);
            txtStuNameFirst.setText(first.getStudentName());
            txtFathNameFirst.setText(first.getFatherName());
            txtStudentIDFirst.setText(first.getStudentID());
            txtCFsess.setText(first.getSessCF());
            txtCFmid.setText(first.getMidCF());
            txtCFfinal.setText(first.getFinalCF());
            txtCFtotal.setText(first.getTotalCF());
            txtCFGPA.setText(first.getCFGPA());
            txtCFlg.setText(LaterGrade(first.getCFGPA()));
            txtCsess.setText(first.getSessC());
            txtCmid.setText(first.getMidC());
            txtCfinal.setText(first.getFinalC());
            txtCtotal.setText(first.getTotalC());
            txtCGPA.setText(first.getCGPA());
            txtClg.setText(LaterGrade(first.getCGPA()));
            txtPhysess.setText(first.getSessPhy());
            txtPhymid.setText(first.getMidPhy());
            txtPhyfinal.setText(first.getFinalPhy());
            txtPhytotal.setText(first.getTotalPhy());
            txtPhyGPA.setText(first.getPhyGPA());
            txtPhylg.setText(LaterGrade(first.getPhyGPA()));
            txtMathsess.setText(first.getSessMath1());
            txtMathmid.setText(first.getMidMath1());
            txtMathfinal.setText(first.getFinalMath1());
            txtMathtotal.setText(first.getTotalMath1());
            txtMathGPA.setText(first.getMathGPA());
            txtMathlg.setText(LaterGrade(first.getMathGPA()));
            txtEngsess.setText(first.getSessEng());
            txtEngmid.setText(first.getMidEng());
            txtEngfinal.setText(first.getFinalEng());
            txtEngtotal.setText(first.getTotalEng());
            txtEngGPA.setText(first.getEngGPA());
            txtEnglg.setText(LaterGrade(first.getEngGPA()));
            txtAccsess.setText(first.getSessAcc());
            txtAccmid.setText(first.getMidAcc());
            txtAccfinal.setText(first.getFinalAcc());
            txtAcctotal.setText(first.getTotalAcc());
            txtAccGPA.setText(first.getAccGPA());
            txtAcclg.setText(LaterGrade(first.getAccGPA()));
            txtBSsess.setText(first.getSessBS());
            txtBSmid.setText(first.getMidBS());
            txtBSfinal.setText(first.getFinalBS());
            txtBStotal.setText(first.getTotalBS());
            txtBSGPA.setText(first.getBSGPA());
            txtBSlg.setText(LaterGrade(first.getBSGPA()));
            txtCFLabfinal.setText(first.getCFLab());
            txtCFLabtotal.setText(first.getTotalCFLab());
            txtCFLabGPA.setText(first.getCFGPA());
            txtCFLablg.setText(LaterGrade(first.getCFLabGPA()));
            txtCLabfinal.setText(first.getCLab());
            txtCLabtotal.setText(first.getTotalCLab());
            txtCLabGPA.setText(first.getCGPA());
            txtCLablg.setText(LaterGrade(first.getCLabGPA()));
            txtPhyLabfinal.setText(first.getPhyLab());
            txtPhyLabtotal.setText(first.getTotalPhyLab());
            txtPhyLabGPA.setText(first.getPhyGPA());
            txtPhyLablg.setText(LaterGrade(first.getPhyLabGPA()));
            
            double CFgp = Double.parseDouble(first.getCFGPA());
            double Cgp = Double.parseDouble(first.getCGPA());
            double Phygp = Double.parseDouble(first.getPhyGPA());
            double Mathgp = Double.parseDouble(first.getMathGPA());
            double Enggp = Double.parseDouble(first.getEngGPA());
            double Accgp = Double.parseDouble(first.getAccGPA());
            double BSgp = Double.parseDouble(first.getBSGPA());
            double CFLabgp = Double.parseDouble(first.getCFLabGPA());
            double CLabgp = Double.parseDouble(first.getCLabGPA());
            double PhyLabgp = Double.parseDouble(first.getPhyGPA()); 
            
            double total = ((CFgp*3)+(Cgp*3)+(Phygp*2)+(Mathgp*3)+(Enggp*2)+(Accgp*2)+(BSgp*1)+(CFLabgp*1)+(CLabgp*2)+(PhyLabgp*1))/20;
            lebelResult.setText("Grade Point Average(GPA): "+String.format("%.2f", total));
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        txtCFsess = new javax.swing.JTextField();
        txtPhysess = new javax.swing.JTextField();
        txtMathsess = new javax.swing.JTextField();
        txtEngsess = new javax.swing.JTextField();
        txtAccsess = new javax.swing.JTextField();
        txtBSsess = new javax.swing.JTextField();
        txtCsess = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        txtCFmid = new javax.swing.JTextField();
        txtCmid = new javax.swing.JTextField();
        txtPhymid = new javax.swing.JTextField();
        txtMathmid = new javax.swing.JTextField();
        txtEngmid = new javax.swing.JTextField();
        txtAccmid = new javax.swing.JTextField();
        txtBSmid = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        txtCFfinal = new javax.swing.JTextField();
        txtCfinal = new javax.swing.JTextField();
        txtPhyfinal = new javax.swing.JTextField();
        txtMathfinal = new javax.swing.JTextField();
        txtEngfinal = new javax.swing.JTextField();
        txtAccfinal = new javax.swing.JTextField();
        txtBSfinal = new javax.swing.JTextField();
        txtCFLabfinal = new javax.swing.JTextField();
        txtCLabfinal = new javax.swing.JTextField();
        txtPhyLabfinal = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        txtCFtotal = new javax.swing.JTextField();
        txtCtotal = new javax.swing.JTextField();
        txtPhytotal = new javax.swing.JTextField();
        txtMathtotal = new javax.swing.JTextField();
        txtEngtotal = new javax.swing.JTextField();
        txtAcctotal = new javax.swing.JTextField();
        txtBStotal = new javax.swing.JTextField();
        txtCFLabtotal = new javax.swing.JTextField();
        txtCLabtotal = new javax.swing.JTextField();
        txtPhyLabtotal = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        txtCFGPA = new javax.swing.JTextField();
        txtCGPA = new javax.swing.JTextField();
        txtPhyGPA = new javax.swing.JTextField();
        txtMathGPA = new javax.swing.JTextField();
        txtEngGPA = new javax.swing.JTextField();
        txtAccGPA = new javax.swing.JTextField();
        txtBSGPA = new javax.swing.JTextField();
        txtCFLabGPA = new javax.swing.JTextField();
        txtCLabGPA = new javax.swing.JTextField();
        txtPhyLabGPA = new javax.swing.JTextField();
        jPanel26 = new javax.swing.JPanel();
        txtCFlg = new javax.swing.JTextField();
        txtClg = new javax.swing.JTextField();
        txtPhylg = new javax.swing.JTextField();
        txtMathlg = new javax.swing.JTextField();
        txtEnglg = new javax.swing.JTextField();
        txtAcclg = new javax.swing.JTextField();
        txtBSlg = new javax.swing.JTextField();
        txtCFLablg = new javax.swing.JTextField();
        txtCLablg = new javax.swing.JTextField();
        txtPhyLablg = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtStuNameFirst = new javax.swing.JTextField();
        txtFathNameFirst = new javax.swing.JTextField();
        txtStudentIDFirst = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lebelResult = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 18)); // NOI18N
        jLabel1.setText("Student ID: ");

        txtsearch.setBackground(new java.awt.Color(240, 240, 240));
        txtsearch.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 18)); // NOI18N
        txtsearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Courses", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Matura MT Script Capitals", 0, 18))); // NOI18N

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Course Title", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Matura MT Script Capitals", 0, 14))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel3.setText("Computer Fundamentals and Application");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel4.setText("Structured Computer Programming with C");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel5.setText("Physics-1");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel6.setText("Mathematics-1");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel7.setText("English Language Course");
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel8.setText("Principles of Accounting and Management");
        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel9.setText("Bangladesh Studies(GED Course)");
        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel10.setText("Lab-1: Based on CSE 1101");
        jLabel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel11.setText("Lab-2: Based on CSE 1102");
        jLabel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel12.setText("Lab-3: Based on CSE 1103");
        jLabel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Course Code (Credit)", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Matura MT Script Capitals", 0, 14))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("CSE 1101 (3)");
        jLabel13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("CSE 1105 (2)");
        jLabel14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel15.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("CSE 1106 (2)");
        jLabel15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel16.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("CSE 1107 (1)");
        jLabel16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel17.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("CSE 1108 (1)");
        jLabel17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel18.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("CSE 1109 (2)");
        jLabel18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel19.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("CSE 1110 (1)");
        jLabel19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel20.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("CSE 1103 (2)");
        jLabel20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel21.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("CSE 1104 (3)");
        jLabel21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel22.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("CSE 1102 (3)");
        jLabel22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Marks Obtained", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Matura MT Script Capitals", 0, 18))); // NOI18N

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sessional(25)", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Matura MT Script Capitals", 0, 14))); // NOI18N

        txtCFsess.setBackground(new java.awt.Color(240, 240, 240));
        txtCFsess.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCFsess.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCFsess.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCFsess.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtCFsessInputMethodTextChanged(evt);
            }
        });
        txtCFsess.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtCFsessPropertyChange(evt);
            }
        });

        txtPhysess.setBackground(new java.awt.Color(240, 240, 240));
        txtPhysess.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtPhysess.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhysess.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtMathsess.setBackground(new java.awt.Color(240, 240, 240));
        txtMathsess.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtMathsess.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMathsess.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtEngsess.setBackground(new java.awt.Color(240, 240, 240));
        txtEngsess.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtEngsess.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEngsess.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtAccsess.setBackground(new java.awt.Color(240, 240, 240));
        txtAccsess.setEditable(false);
        txtAccsess.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtAccsess.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccsess.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtBSsess.setBackground(new java.awt.Color(240, 240, 240));
        txtBSsess.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtBSsess.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBSsess.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtBSsess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBSsessActionPerformed(evt);
            }
        });

        txtCsess.setBackground(new java.awt.Color(240, 240, 240));
        txtCsess.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCsess.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCsess.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCFsess)
                    .addComponent(txtBSsess, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAccsess, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEngsess, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMathsess)
                    .addComponent(txtPhysess)
                    .addComponent(txtCsess, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCFsess, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCsess, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPhysess, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMathsess, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(txtEngsess, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtAccsess, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(txtBSsess, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mid Term(15)", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Matura MT Script Capitals", 0, 14))); // NOI18N

        txtCFmid.setBackground(new java.awt.Color(240, 240, 240));
        txtCFmid.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCFmid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCFmid.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtCmid.setBackground(new java.awt.Color(240, 240, 240));
        txtCmid.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCmid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCmid.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtPhymid.setBackground(new java.awt.Color(240, 240, 240));
        txtPhymid.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtPhymid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhymid.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtMathmid.setBackground(new java.awt.Color(240, 240, 240));
        txtMathmid.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtMathmid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMathmid.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtEngmid.setBackground(new java.awt.Color(240, 240, 240));
        txtEngmid.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtEngmid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEngmid.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtAccmid.setBackground(new java.awt.Color(240, 240, 240));
        txtAccmid.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtAccmid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccmid.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtBSmid.setBackground(new java.awt.Color(240, 240, 240));
        txtBSmid.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtBSmid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBSmid.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCFmid, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(txtEngmid)
                    .addComponent(txtMathmid)
                    .addComponent(txtPhymid)
                    .addComponent(txtCmid)
                    .addComponent(txtAccmid, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBSmid))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCFmid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCmid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPhymid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMathmid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(txtEngmid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtAccmid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBSmid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Final(60/Lab(100)", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Matura MT Script Capitals", 0, 14))); // NOI18N

        txtCFfinal.setBackground(new java.awt.Color(240, 240, 240));
        txtCFfinal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCFfinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCFfinal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCFfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCFfinalActionPerformed(evt);
            }
        });

        txtCfinal.setBackground(new java.awt.Color(240, 240, 240));
        txtCfinal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCfinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCfinal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCfinalActionPerformed(evt);
            }
        });

        txtPhyfinal.setBackground(new java.awt.Color(240, 240, 240));
        txtPhyfinal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtPhyfinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhyfinal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPhyfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhyfinalActionPerformed(evt);
            }
        });

        txtMathfinal.setBackground(new java.awt.Color(240, 240, 240));
        txtMathfinal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtMathfinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMathfinal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtMathfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMathfinalActionPerformed(evt);
            }
        });

        txtEngfinal.setBackground(new java.awt.Color(240, 240, 240));
        txtEngfinal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtEngfinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEngfinal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtEngfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEngfinalActionPerformed(evt);
            }
        });

        txtAccfinal.setBackground(new java.awt.Color(240, 240, 240));
        txtAccfinal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtAccfinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccfinal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtAccfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccfinalActionPerformed(evt);
            }
        });

        txtBSfinal.setBackground(new java.awt.Color(240, 240, 240));
        txtBSfinal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtBSfinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBSfinal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtBSfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBSfinalActionPerformed(evt);
            }
        });

        txtCFLabfinal.setBackground(new java.awt.Color(240, 240, 240));
        txtCFLabfinal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCFLabfinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCFLabfinal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCFLabfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCFLabfinalActionPerformed(evt);
            }
        });

        txtCLabfinal.setBackground(new java.awt.Color(240, 240, 240));
        txtCLabfinal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCLabfinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCLabfinal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCLabfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCLabfinalActionPerformed(evt);
            }
        });

        txtPhyLabfinal.setBackground(new java.awt.Color(240, 240, 240));
        txtPhyLabfinal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtPhyLabfinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhyLabfinal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPhyLabfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhyLabfinalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCLabfinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(txtCFLabfinal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBSfinal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAccfinal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEngfinal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMathfinal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPhyfinal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCfinal)
                    .addComponent(txtCFfinal)
                    .addComponent(txtPhyLabfinal))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCFfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPhyfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMathfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEngfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtAccfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(txtBSfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCFLabfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCLabfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPhyLabfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total(100)", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Matura MT Script Capitals", 0, 14))); // NOI18N

        txtCFtotal.setBackground(new java.awt.Color(240, 240, 240));
        txtCFtotal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCFtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCFtotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtCtotal.setBackground(new java.awt.Color(240, 240, 240));
        txtCtotal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCtotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtPhytotal.setBackground(new java.awt.Color(240, 240, 240));
        txtPhytotal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtPhytotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhytotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtMathtotal.setBackground(new java.awt.Color(240, 240, 240));
        txtMathtotal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtMathtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMathtotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtEngtotal.setBackground(new java.awt.Color(240, 240, 240));
        txtEngtotal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtEngtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEngtotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtAcctotal.setBackground(new java.awt.Color(240, 240, 240));
        txtAcctotal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtAcctotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAcctotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtBStotal.setBackground(new java.awt.Color(240, 240, 240));
        txtBStotal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtBStotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBStotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtCFLabtotal.setBackground(new java.awt.Color(240, 240, 240));
        txtCFLabtotal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCFLabtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCFLabtotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtCLabtotal.setBackground(new java.awt.Color(240, 240, 240));
        txtCLabtotal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCLabtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCLabtotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtPhyLabtotal.setBackground(new java.awt.Color(240, 240, 240));
        txtPhyLabtotal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtPhyLabtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhyLabtotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPhyLabtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhyLabtotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCFtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(txtCtotal)
                    .addComponent(txtPhytotal)
                    .addComponent(txtMathtotal)
                    .addComponent(txtEngtotal)
                    .addComponent(txtAcctotal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBStotal)
                    .addComponent(txtCFLabtotal)
                    .addComponent(txtCLabtotal)
                    .addComponent(txtPhyLabtotal))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCFtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPhytotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMathtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEngtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtAcctotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBStotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCFLabtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCLabtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPhyLabtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GP", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Matura MT Script Capitals", 0, 14))); // NOI18N

        txtCFGPA.setBackground(new java.awt.Color(240, 240, 240));
        txtCFGPA.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCFGPA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCFGPA.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtCGPA.setBackground(new java.awt.Color(240, 240, 240));
        txtCGPA.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCGPA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCGPA.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtPhyGPA.setBackground(new java.awt.Color(240, 240, 240));
        txtPhyGPA.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtPhyGPA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhyGPA.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtMathGPA.setBackground(new java.awt.Color(240, 240, 240));
        txtMathGPA.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtMathGPA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMathGPA.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtEngGPA.setBackground(new java.awt.Color(240, 240, 240));
        txtEngGPA.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtEngGPA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEngGPA.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtAccGPA.setBackground(new java.awt.Color(240, 240, 240));
        txtAccGPA.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtAccGPA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccGPA.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtBSGPA.setBackground(new java.awt.Color(240, 240, 240));
        txtBSGPA.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtBSGPA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBSGPA.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtCFLabGPA.setBackground(new java.awt.Color(240, 240, 240));
        txtCFLabGPA.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCFLabGPA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCFLabGPA.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtCLabGPA.setBackground(new java.awt.Color(240, 240, 240));
        txtCLabGPA.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCLabGPA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCLabGPA.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtPhyLabGPA.setBackground(new java.awt.Color(240, 240, 240));
        txtPhyLabGPA.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtPhyLabGPA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhyLabGPA.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCFGPA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(txtCGPA)
                    .addComponent(txtPhyGPA)
                    .addComponent(txtMathGPA)
                    .addComponent(txtEngGPA)
                    .addComponent(txtAccGPA, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBSGPA)
                    .addComponent(txtCFLabGPA)
                    .addComponent(txtCLabGPA)
                    .addComponent(txtPhyLabGPA))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCFGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPhyGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMathGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEngGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtAccGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBSGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCFLabGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCLabGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPhyLabGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LG", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Matura MT Script Capitals", 0, 14))); // NOI18N

        txtCFlg.setBackground(new java.awt.Color(240, 240, 240));
        txtCFlg.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCFlg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCFlg.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtClg.setBackground(new java.awt.Color(240, 240, 240));
        txtClg.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtClg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtClg.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtPhylg.setBackground(new java.awt.Color(240, 240, 240));
        txtPhylg.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtPhylg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhylg.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtMathlg.setBackground(new java.awt.Color(240, 240, 240));
        txtMathlg.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtMathlg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMathlg.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtEnglg.setBackground(new java.awt.Color(240, 240, 240));
        txtEnglg.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtEnglg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEnglg.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtAcclg.setBackground(new java.awt.Color(240, 240, 240));
        txtAcclg.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtAcclg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAcclg.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtBSlg.setBackground(new java.awt.Color(240, 240, 240));
        txtBSlg.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtBSlg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBSlg.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtCFLablg.setBackground(new java.awt.Color(240, 240, 240));
        txtCFLablg.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCFLablg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCFLablg.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtCLablg.setBackground(new java.awt.Color(240, 240, 240));
        txtCLablg.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCLablg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCLablg.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtPhyLablg.setBackground(new java.awt.Color(240, 240, 240));
        txtPhyLablg.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtPhyLablg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhyLablg.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCFlg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(txtClg)
                    .addComponent(txtPhylg)
                    .addComponent(txtMathlg)
                    .addComponent(txtEnglg)
                    .addComponent(txtAcclg, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBSlg)
                    .addComponent(txtCFLablg)
                    .addComponent(txtCLablg)
                    .addComponent(txtPhyLablg))
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCFlg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtClg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPhylg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMathlg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEnglg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtAcclg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBSlg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCFLablg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCLablg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPhyLablg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel23.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 16)); // NOI18N
        jLabel23.setText("Student Name:");

        jLabel24.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 16)); // NOI18N
        jLabel24.setText("Father's Name:");

        jLabel25.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 16)); // NOI18N
        jLabel25.setText("Student ID:");

        txtStuNameFirst.setBackground(new java.awt.Color(240, 240, 240));
        txtStuNameFirst.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtStuNameFirst.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        txtFathNameFirst.setBackground(new java.awt.Color(240, 240, 240));
        txtFathNameFirst.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtFathNameFirst.setBorder(null);

        txtStudentIDFirst.setBackground(new java.awt.Color(240, 240, 240));
        txtStudentIDFirst.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtStudentIDFirst.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 30)); // NOI18N
        jLabel2.setText("Result");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        lebelResult.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel23))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStuNameFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFathNameFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStudentIDFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lebelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtStuNameFirst, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtFathNameFirst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtStudentIDFirst)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lebelResult, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtsearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCFsessInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtCFsessInputMethodTextChanged
   }//GEN-LAST:event_txtCFsessInputMethodTextChanged

    private void txtCFsessPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtCFsessPropertyChange
   }//GEN-LAST:event_txtCFsessPropertyChange

    private void txtCFfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCFfinalActionPerformed
    }//GEN-LAST:event_txtCFfinalActionPerformed

    private void txtCfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCfinalActionPerformed
    }//GEN-LAST:event_txtCfinalActionPerformed

    private void txtPhyfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhyfinalActionPerformed
    }//GEN-LAST:event_txtPhyfinalActionPerformed

    private void txtMathfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMathfinalActionPerformed
    }//GEN-LAST:event_txtMathfinalActionPerformed

    private void txtEngfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEngfinalActionPerformed
    }//GEN-LAST:event_txtEngfinalActionPerformed

    private void txtAccfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccfinalActionPerformed
    }//GEN-LAST:event_txtAccfinalActionPerformed

    private void txtBSfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBSfinalActionPerformed
    }//GEN-LAST:event_txtBSfinalActionPerformed

    private void txtCFLabfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCFLabfinalActionPerformed
    }//GEN-LAST:event_txtCFLabfinalActionPerformed

    private void txtCLabfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCLabfinalActionPerformed
    }//GEN-LAST:event_txtCLabfinalActionPerformed

    private void txtPhyLabfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhyLabfinalActionPerformed
    }//GEN-LAST:event_txtPhyLabfinalActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed

        resultFirst search = new resultFirst();
        try {
            search.setStudentID(txtsearch.getText());
            boolean chk = search.search();
            System.out.println(chk);
            if (chk) {
                JOptionPane.showMessageDialog(null, "Invalid Student ID!");
            } else {
                findstudent();
            }


        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_txtsearchActionPerformed

    private void txtBSsessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBSsessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBSsessActionPerformed

    private void txtPhyLabtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhyLabtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhyLabtotalActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lebelResult;
    private javax.swing.JTextField txtAccGPA;
    private javax.swing.JTextField txtAccfinal;
    private javax.swing.JTextField txtAcclg;
    private javax.swing.JTextField txtAccmid;
    private javax.swing.JTextField txtAccsess;
    private javax.swing.JTextField txtAcctotal;
    private javax.swing.JTextField txtBSGPA;
    private javax.swing.JTextField txtBSfinal;
    private javax.swing.JTextField txtBSlg;
    private javax.swing.JTextField txtBSmid;
    private javax.swing.JTextField txtBSsess;
    private javax.swing.JTextField txtBStotal;
    private javax.swing.JTextField txtCFGPA;
    private javax.swing.JTextField txtCFLabGPA;
    private javax.swing.JTextField txtCFLabfinal;
    private javax.swing.JTextField txtCFLablg;
    private javax.swing.JTextField txtCFLabtotal;
    private javax.swing.JTextField txtCFfinal;
    private javax.swing.JTextField txtCFlg;
    private javax.swing.JTextField txtCFmid;
    private javax.swing.JTextField txtCFsess;
    private javax.swing.JTextField txtCFtotal;
    private javax.swing.JTextField txtCGPA;
    private javax.swing.JTextField txtCLabGPA;
    private javax.swing.JTextField txtCLabfinal;
    private javax.swing.JTextField txtCLablg;
    private javax.swing.JTextField txtCLabtotal;
    private javax.swing.JTextField txtCfinal;
    private javax.swing.JTextField txtClg;
    private javax.swing.JTextField txtCmid;
    private javax.swing.JTextField txtCsess;
    private javax.swing.JTextField txtCtotal;
    private javax.swing.JTextField txtEngGPA;
    private javax.swing.JTextField txtEngfinal;
    private javax.swing.JTextField txtEnglg;
    private javax.swing.JTextField txtEngmid;
    private javax.swing.JTextField txtEngsess;
    private javax.swing.JTextField txtEngtotal;
    private javax.swing.JTextField txtFathNameFirst;
    private javax.swing.JTextField txtMathGPA;
    private javax.swing.JTextField txtMathfinal;
    private javax.swing.JTextField txtMathlg;
    private javax.swing.JTextField txtMathmid;
    private javax.swing.JTextField txtMathsess;
    private javax.swing.JTextField txtMathtotal;
    private javax.swing.JTextField txtPhyGPA;
    private javax.swing.JTextField txtPhyLabGPA;
    private javax.swing.JTextField txtPhyLabfinal;
    private javax.swing.JTextField txtPhyLablg;
    private javax.swing.JTextField txtPhyLabtotal;
    private javax.swing.JTextField txtPhyfinal;
    private javax.swing.JTextField txtPhylg;
    private javax.swing.JTextField txtPhymid;
    private javax.swing.JTextField txtPhysess;
    private javax.swing.JTextField txtPhytotal;
    private javax.swing.JTextField txtStuNameFirst;
    private javax.swing.JTextField txtStudentIDFirst;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
