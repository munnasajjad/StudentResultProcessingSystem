/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentRPSystem.ui;

import StudentRPSystem.db.resultFirst;
import StudentRPSystem.db.resultSecond;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rasel
 */
public class MarksCount extends javax.swing.JPanel {

    public MarksCount() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
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
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtStuNameFirst = new javax.swing.JTextField();
        txtFathNameFirst = new javax.swing.JTextField();
        txtStudentIDFirst = new javax.swing.JTextField();
        btnFirstSave = new javax.swing.JButton();
        btnFirstReset = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        txtstudentNameSec = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtfatherNameSec = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtstudentIDSec = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        txtBEEsess = new javax.swing.JTextField();
        txtCPPsess = new javax.swing.JTextField();
        txtPHY2sess = new javax.swing.JTextField();
        txtMATH2sess = new javax.swing.JTextField();
        txtPEsess = new javax.swing.JTextField();
        txtDSsess = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        txtBEEmid = new javax.swing.JTextField();
        txtDSmid = new javax.swing.JTextField();
        txtCPPmid = new javax.swing.JTextField();
        txtPHY2mid = new javax.swing.JTextField();
        txtMATH2mid = new javax.swing.JTextField();
        txtPEmid = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        txtBEEfinal = new javax.swing.JTextField();
        txtDSfinal = new javax.swing.JTextField();
        txtCPPfinal = new javax.swing.JTextField();
        txtPHY2final = new javax.swing.JTextField();
        txtMATH2final = new javax.swing.JTextField();
        txtPEfinal = new javax.swing.JTextField();
        BEELabfinal = new javax.swing.JTextField();
        DSLabfinal = new javax.swing.JTextField();
        CPPLabfinal = new javax.swing.JTextField();
        PHY2Labfinal = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();
        txtBEEtotal = new javax.swing.JTextField();
        txtDStotal = new javax.swing.JTextField();
        txtCPPtotal = new javax.swing.JTextField();
        txtPHY2total = new javax.swing.JTextField();
        txtMATH2total = new javax.swing.JTextField();
        txtPEtotal = new javax.swing.JTextField();
        BEELabtotal = new javax.swing.JTextField();
        DSLabtotal = new javax.swing.JTextField();
        CPPLabtotal = new javax.swing.JTextField();
        PHY2Labtotal = new javax.swing.JTextField();
        jPanel25 = new javax.swing.JPanel();
        txtBEEgp = new javax.swing.JTextField();
        txtDSgp = new javax.swing.JTextField();
        txtCPPgp = new javax.swing.JTextField();
        txtPHY2gp = new javax.swing.JTextField();
        txtMATH2gp = new javax.swing.JTextField();
        txtPEgp = new javax.swing.JTextField();
        BEELabgp = new javax.swing.JTextField();
        DSLabgp = new javax.swing.JTextField();
        CPPLabgp = new javax.swing.JTextField();
        PHY2Labgp = new javax.swing.JTextField();
        btnSecondSave = new javax.swing.JButton();
        btnSecondReset = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jTabbedPane5 = new javax.swing.JTabbedPane();

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jTabbedPane1.setForeground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 20)); // NOI18N

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Courses", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Matura MT Script Capitals", 0, 18))); // NOI18N

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Course Title", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Matura MT Script Capitals", 0, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel1.setText("Computer Fundamentals and Application");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel2.setText("Structured Computer Programming with C");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel3.setText("Physics-1");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel4.setText("Mathematics-1");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel5.setText("English Language Course");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel6.setText("Principles of Accounting and Management");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel7.setText("Bangladesh Studies(GED Course)");
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel8.setText("Lab-1: Based on CSE 1101");
        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel9.setText("Lab-2: Based on CSE 1102");
        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel10.setText("Lab-3: Based on CSE 1103");
        jLabel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Course Code", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Matura MT Script Capitals", 0, 14))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("CSE 1101");
        jLabel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("CSE 1105");
        jLabel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("CSE 1106");
        jLabel13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("CSE 1107");
        jLabel14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel15.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("CSE 1108");
        jLabel15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel16.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("CSE 1109");
        jLabel16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel17.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("CSE 1110");
        jLabel17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel18.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("CSE 1103");
        jLabel18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel19.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("CSE 1104");
        jLabel19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel20.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("CSE 1102");
        jLabel20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Marks Obtained", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Matura MT Script Capitals", 0, 18))); // NOI18N

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sessional(25)", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Matura MT Script Capitals", 0, 14))); // NOI18N

        txtCFsess.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCFsess.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCFsess.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        txtPhysess.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtPhysess.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhysess.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtMathsess.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtMathsess.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMathsess.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtEngsess.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtEngsess.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEngsess.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtAccsess.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtAccsess.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccsess.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtBSsess.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtBSsess.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBSsess.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCsess.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCsess.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCsess.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

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
                    .addComponent(txtCsess, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCFsess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCsess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPhysess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMathsess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEngsess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtAccsess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBSsess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mid Term(15)", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Matura MT Script Capitals", 0, 14))); // NOI18N

        txtCFmid.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCFmid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCFmid.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCmid.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCmid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCmid.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtPhymid.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtPhymid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhymid.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtMathmid.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtMathmid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMathmid.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtEngmid.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtEngmid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEngmid.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtAccmid.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtAccmid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccmid.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtBSmid.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtBSmid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBSmid.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCFmid, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
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
                .addComponent(txtCFmid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCmid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(txtPhymid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMathmid, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEngmid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtAccmid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBSmid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Final(60/Lab(100)", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Matura MT Script Capitals", 0, 14))); // NOI18N

        txtCFfinal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCFfinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCFfinal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCFfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCFfinalActionPerformed(evt);
            }
        });

        txtCfinal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCfinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCfinal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCfinalActionPerformed(evt);
            }
        });

        txtPhyfinal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtPhyfinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhyfinal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPhyfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhyfinalActionPerformed(evt);
            }
        });

        txtMathfinal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtMathfinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMathfinal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtMathfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMathfinalActionPerformed(evt);
            }
        });

        txtEngfinal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtEngfinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEngfinal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtEngfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEngfinalActionPerformed(evt);
            }
        });

        txtAccfinal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtAccfinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccfinal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAccfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccfinalActionPerformed(evt);
            }
        });

        txtBSfinal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtBSfinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBSfinal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtBSfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBSfinalActionPerformed(evt);
            }
        });

        txtCFLabfinal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCFLabfinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCFLabfinal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCFLabfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCFLabfinalActionPerformed(evt);
            }
        });

        txtCLabfinal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCLabfinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCLabfinal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCLabfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCLabfinalActionPerformed(evt);
            }
        });

        txtPhyLabfinal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtPhyLabfinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhyLabfinal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
                    .addComponent(txtCLabfinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
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
                .addComponent(txtCFfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPhyfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMathfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEngfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtAccfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBSfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCFLabfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCLabfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPhyLabfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total(100)", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Matura MT Script Capitals", 0, 14))); // NOI18N

        txtCFtotal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCFtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCFtotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCtotal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCtotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtPhytotal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtPhytotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhytotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtMathtotal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtMathtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMathtotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtEngtotal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtEngtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEngtotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtAcctotal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtAcctotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAcctotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtBStotal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtBStotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBStotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCFLabtotal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCFLabtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCFLabtotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCLabtotal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCLabtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCLabtotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtPhyLabtotal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtPhyLabtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhyLabtotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCFtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtCFtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPhytotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMathtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEngtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtAcctotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBStotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCFLabtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCLabtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPhyLabtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GP", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Matura MT Script Capitals", 0, 14))); // NOI18N

        txtCFGPA.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCFGPA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCFGPA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCGPA.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCGPA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCGPA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtPhyGPA.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtPhyGPA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhyGPA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtMathGPA.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtMathGPA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMathGPA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtEngGPA.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtEngGPA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEngGPA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtAccGPA.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtAccGPA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccGPA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtBSGPA.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtBSGPA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBSGPA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCFLabGPA.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCFLabGPA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCFLabGPA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCLabGPA.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCLabGPA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCLabGPA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtPhyLabGPA.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtPhyLabGPA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhyLabGPA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCFGPA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtCFGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPhyGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMathGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEngGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtAccGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBSGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCFLabGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCLabGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPhyLabGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel21.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 16)); // NOI18N
        jLabel21.setText("Student Name:");

        jLabel22.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 16)); // NOI18N
        jLabel22.setText("Father's Name:");

        jLabel23.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 16)); // NOI18N
        jLabel23.setText("Student ID:");

        txtStuNameFirst.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtStuNameFirst.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtFathNameFirst.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtFathNameFirst.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtStudentIDFirst.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtStudentIDFirst.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnFirstSave.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 18)); // NOI18N
        btnFirstSave.setText("Save");
        btnFirstSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFirstSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstSaveActionPerformed(evt);
            }
        });

        btnFirstReset.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 18)); // NOI18N
        btnFirstReset.setText("Reset");
        btnFirstReset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFirstReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFirstSave, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(btnFirstReset, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(28, 28, 28)
                                .addComponent(txtStuNameFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFathNameFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStudentIDFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtStuNameFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtFathNameFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtStudentIDFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirstSave)
                    .addComponent(btnFirstReset))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("1st", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel24.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 16)); // NOI18N
        jLabel24.setText("Student Name:");

        txtstudentNameSec.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtstudentNameSec.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel25.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 16)); // NOI18N
        jLabel25.setText("Father's Name:");

        txtfatherNameSec.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtfatherNameSec.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel26.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 16)); // NOI18N
        jLabel26.setText("Student ID:");

        txtstudentIDSec.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtstudentIDSec.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Courses", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Matura MT Script Capitals", 0, 18))); // NOI18N

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Course Title", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Matura MT Script Capitals", 0, 14))); // NOI18N

        jLabel27.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel27.setText("Basic Electrical Engineering");
        jLabel27.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel28.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel28.setText("Data Structure");
        jLabel28.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel29.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel29.setText("Computer Programming with C++");
        jLabel29.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel30.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel30.setText("Physics-2");
        jLabel30.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel31.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel31.setText("Mathematics-2");
        jLabel31.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel32.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel32.setText("Professional Ethics of Computing");
        jLabel32.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel34.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel34.setText("Lab-1: Based on CSE 1201");
        jLabel34.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel35.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel35.setText("Lab-2: Based on CSE 1202");
        jLabel35.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel36.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel36.setText("Lab-3: Based on CSE 1203");
        jLabel36.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel47.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel47.setText("Lab-3: Based on CSE 1204");
        jLabel47.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addGap(18, 18, 18)
                .addComponent(jLabel31)
                .addGap(18, 18, 18)
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addComponent(jLabel34)
                .addGap(18, 18, 18)
                .addComponent(jLabel35)
                .addGap(18, 18, 18)
                .addComponent(jLabel36)
                .addGap(18, 18, 18)
                .addComponent(jLabel47)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Course Code", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Matura MT Script Capitals", 0, 14))); // NOI18N

        jLabel37.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("CSE 1201");
        jLabel37.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel38.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("CSE 1205");
        jLabel38.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel39.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("CSE 1206");
        jLabel39.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel40.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("CSE 1207");
        jLabel40.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel41.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("CSE 1208");
        jLabel41.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel42.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("CSE 1209");
        jLabel42.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel43.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("CSE 1210");
        jLabel43.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel44.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("CSE 1203");
        jLabel44.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel45.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("CSE 1204");
        jLabel45.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel46.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("CSE 1202");
        jLabel46.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addGap(18, 18, 18)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel45)
                .addGap(18, 18, 18)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel39)
                .addGap(18, 18, 18)
                .addComponent(jLabel40)
                .addGap(18, 18, 18)
                .addComponent(jLabel41)
                .addGap(18, 18, 18)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel43)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Marks Obtained", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Matura MT Script Capitals", 0, 18))); // NOI18N

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sessional(25)", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Matura MT Script Capitals", 0, 14))); // NOI18N

        txtBEEsess.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtBEEsess.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBEEsess.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCPPsess.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCPPsess.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCPPsess.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtPHY2sess.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtPHY2sess.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPHY2sess.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtMATH2sess.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtMATH2sess.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMATH2sess.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtPEsess.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtPEsess.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPEsess.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtDSsess.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtDSsess.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDSsess.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBEEsess)
                    .addComponent(txtPEsess, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMATH2sess, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPHY2sess)
                    .addComponent(txtCPPsess)
                    .addComponent(txtDSsess, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBEEsess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDSsess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCPPsess)
                .addGap(18, 18, 18)
                .addComponent(txtPHY2sess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMATH2sess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(txtPEsess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mid Term(15)", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Matura MT Script Capitals", 0, 14))); // NOI18N

        txtBEEmid.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtBEEmid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBEEmid.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtDSmid.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtDSmid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDSmid.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCPPmid.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCPPmid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCPPmid.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtPHY2mid.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtPHY2mid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPHY2mid.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtMATH2mid.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtMATH2mid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMATH2mid.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtPEmid.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtPEmid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPEmid.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBEEmid, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(txtMATH2mid)
                    .addComponent(txtPHY2mid)
                    .addComponent(txtCPPmid)
                    .addComponent(txtDSmid)
                    .addComponent(txtPEmid, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBEEmid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDSmid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(txtCPPmid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPHY2mid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMATH2mid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txtPEmid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Final(60/Lab(100)", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Matura MT Script Capitals", 0, 14))); // NOI18N

        txtBEEfinal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtBEEfinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBEEfinal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtBEEfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBEEfinalActionPerformed(evt);
            }
        });

        txtDSfinal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtDSfinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDSfinal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtDSfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDSfinalActionPerformed(evt);
            }
        });

        txtCPPfinal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCPPfinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCPPfinal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCPPfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPPfinalActionPerformed(evt);
            }
        });

        txtPHY2final.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtPHY2final.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPHY2final.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPHY2final.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPHY2finalActionPerformed(evt);
            }
        });

        txtMATH2final.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtMATH2final.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMATH2final.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtMATH2final.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMATH2finalActionPerformed(evt);
            }
        });

        txtPEfinal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtPEfinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPEfinal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPEfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPEfinalActionPerformed(evt);
            }
        });

        BEELabfinal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        BEELabfinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BEELabfinal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BEELabfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEELabfinalActionPerformed(evt);
            }
        });

        DSLabfinal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        DSLabfinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DSLabfinal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DSLabfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DSLabfinalActionPerformed(evt);
            }
        });

        CPPLabfinal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        CPPLabfinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CPPLabfinal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CPPLabfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPPLabfinalActionPerformed(evt);
            }
        });

        PHY2Labfinal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        PHY2Labfinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PHY2Labfinal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PHY2Labfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PHY2LabfinalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CPPLabfinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(DSLabfinal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BEELabfinal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPEfinal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMATH2final, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPHY2final, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCPPfinal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDSfinal)
                    .addComponent(txtBEEfinal)
                    .addComponent(PHY2Labfinal))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBEEfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDSfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCPPfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPHY2final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMATH2final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPEfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BEELabfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DSLabfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CPPLabfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PHY2Labfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total(100)", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Matura MT Script Capitals", 0, 14))); // NOI18N

        txtBEEtotal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtBEEtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBEEtotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtDStotal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtDStotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDStotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCPPtotal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCPPtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCPPtotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtPHY2total.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtPHY2total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPHY2total.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtMATH2total.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtMATH2total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMATH2total.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtPEtotal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtPEtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPEtotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BEELabtotal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        BEELabtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BEELabtotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        DSLabtotal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        DSLabtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DSLabtotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        CPPLabtotal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        CPPLabtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CPPLabtotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        PHY2Labtotal.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        PHY2Labtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PHY2Labtotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBEEtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(txtDStotal)
                    .addComponent(txtCPPtotal)
                    .addComponent(txtPHY2total)
                    .addComponent(txtMATH2total)
                    .addComponent(txtPEtotal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BEELabtotal)
                    .addComponent(DSLabtotal)
                    .addComponent(CPPLabtotal)
                    .addComponent(PHY2Labtotal))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBEEtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDStotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCPPtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPHY2total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMATH2total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtPEtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BEELabtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DSLabtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CPPLabtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PHY2Labtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GP", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Matura MT Script Capitals", 0, 14))); // NOI18N

        txtBEEgp.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtBEEgp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBEEgp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtDSgp.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtDSgp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDSgp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCPPgp.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtCPPgp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCPPgp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtPHY2gp.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtPHY2gp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPHY2gp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtMATH2gp.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtMATH2gp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMATH2gp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtPEgp.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        txtPEgp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPEgp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BEELabgp.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        BEELabgp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BEELabgp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        DSLabgp.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        DSLabgp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DSLabgp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        CPPLabgp.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        CPPLabgp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CPPLabgp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        PHY2Labgp.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        PHY2Labgp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PHY2Labgp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBEEgp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(txtDSgp)
                    .addComponent(txtCPPgp)
                    .addComponent(txtPHY2gp)
                    .addComponent(txtMATH2gp)
                    .addComponent(txtPEgp, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BEELabgp)
                    .addComponent(DSLabgp)
                    .addComponent(CPPLabgp)
                    .addComponent(PHY2Labgp))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBEEgp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDSgp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCPPgp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPHY2gp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMATH2gp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPEgp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BEELabgp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DSLabgp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CPPLabgp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PHY2Labgp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnSecondSave.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 18)); // NOI18N
        btnSecondSave.setText("Save");
        btnSecondSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSecondSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecondSaveActionPerformed(evt);
            }
        });

        btnSecondReset.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 18)); // NOI18N
        btnSecondReset.setText("Reset");
        btnSecondReset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSecondReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecondResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtstudentNameSec, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtfatherNameSec, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtstudentIDSec, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSecondSave, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(btnSecondReset, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtstudentNameSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtfatherNameSec)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtstudentIDSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSecondSave)
                    .addComponent(btnSecondReset))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("2nd", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1261, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 762, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("3rd", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1261, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 762, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("4th", jPanel5);

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.addTab("5th", jTabbedPane2);

        jTabbedPane3.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.addTab("6th", jTabbedPane3);

        jTabbedPane4.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.addTab("7th", jTabbedPane4);

        jTabbedPane5.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.addTab("8th", jTabbedPane5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public double GPA(double marks) {
        if (marks >= 80 && marks < 100) {
            return 4.00;
        } else if (marks >= 75 && marks < 80) {
            return 3.75;
        } else if (marks >= 70 && marks < 75) {
            return 3.50;
        } else if (marks >= 65 && marks < 70) {
            return 3.25;
        } else if (marks >= 60 && marks < 65) {
            return 3.00;
        } else if (marks >= 55 && marks < 60) {
            return 2.75;
        } else if (marks >= 50 && marks < 55) {
            return 2.50;
        } else if (marks >= 45 && marks < 50) {
            return 2.25;
        } else if (marks >= 40 && marks < 45) {
            return 2.00;
        } else {
            return 0.00;
        }
    }

    private boolean checkValidationFirst() {
        if (!txtStuNameFirst.getText().trim().isEmpty()) {
            if (!txtFathNameFirst.getText().trim().isEmpty()) {
                if (!txtStudentIDFirst.getText().trim().isEmpty()) {
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter student ID. ");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please enter father name.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please enter student name.");
        }
        return false;
    }

    private boolean checkValidationSecond() {
        if (!txtstudentNameSec.getText().trim().isEmpty()) {
            if (!txtfatherNameSec.getText().trim().isEmpty()) {
                if (!txtstudentIDSec.getText().trim().isEmpty()) {
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter student ID. ");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please enter father name.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please enter student name.");
        }
        return false;
    }

    public void txtClearfirst() {

        txtAccfinal.setText("");
        txtAccmid.setText("");
        txtAccsess.setText("");
        txtAcctotal.setText("");
        txtBSfinal.setText("");
        txtBSmid.setText("");
        txtBSsess.setText("");
        txtBStotal.setText("");
        txtCFLabfinal.setText("");
        txtCFLabtotal.setText("");
        txtCFfinal.setText("");
        txtCFmid.setText("");
        txtCFsess.setText("");
        txtCFtotal.setText("");
        txtCLabfinal.setText("");
        txtCLabtotal.setText("");
        txtCfinal.setText("");
        txtCmid.setText("");
        txtCsess.setText("");
        txtCtotal.setText("");
        txtEngfinal.setText("");
        txtEngmid.setText("");
        txtEngsess.setText("");
        txtEngtotal.setText("");
        txtFathNameFirst.setText("");
        txtMathfinal.setText("");
        txtMathmid.setText("");
        txtMathsess.setText("");
        txtMathtotal.setText("");
        txtPhyLabfinal.setText("");
        txtPhyLabtotal.setText("");
        txtPhyfinal.setText("");
        txtPhymid.setText("");
        txtPhysess.setText("");
        txtPhytotal.setText("");
        txtStuNameFirst.setText("");
        txtStudentIDFirst.setText("");
    }

    public void txtClearsecond() {

        txtstudentNameSec.setText("");
        txtfatherNameSec.setText("");
        txtstudentIDSec.setText("");
        txtBEEsess.setText("");
        txtBEEmid.setText("");
        txtBEEfinal.setText("");
        txtBEEtotal.setText("");
        txtBEEgp.setText("");
        txtDSsess.setText("");
        txtDSmid.setText("");
        txtDSfinal.setText("");
        txtDStotal.setText("");
        txtDSgp.setText("");
        txtCPPsess.setText("");
        txtCPPmid.setText("");
        txtCPPfinal.setText("");
        txtCPPtotal.setText("");
        txtCPPgp.setText("");
        txtPHY2sess.setText("");
        txtPHY2mid.setText("");
        txtPHY2final.setText("");
        txtPHY2total.setText("");
        txtPHY2gp.setText("");
        txtMATH2sess.setText("");
        txtMATH2mid.setText("");
        txtMATH2final.setText("");
        txtMATH2total.setText("");
        txtMATH2gp.setText("");
        txtPEsess.setText("");
        txtPEmid.setText("");
        txtPEfinal.setText("");
        txtPEtotal.setText("");
        txtPEgp.setText("");
        BEELabfinal.setText("");
        BEELabtotal.setText("");
        BEELabgp.setText("");
        DSLabfinal.setText("");
        DSLabtotal.setText("");
        DSLabgp.setText("");
        CPPLabfinal.setText("");
        CPPLabtotal.setText("");
        CPPLabgp.setText("");
        PHY2Labfinal.setText("");
        PHY2Labtotal.setText("");
        PHY2Labgp.setText("");
    }

    private void btnFirstSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstSaveActionPerformed

        resultFirst rst = new resultFirst();
        try {
            rst.setStudentID(txtStudentIDFirst.getText());
            boolean chk = rst.search();
            //   System.out.println(chk);
            if (!chk) {
                JOptionPane.showMessageDialog(null, "Record already in!");
            } else if (checkValidationFirst()) {
                try {
                    resultFirst first = new resultFirst();
                    first.setStudentName(this.txtStuNameFirst.getText());
                    first.setFatherName(this.txtFathNameFirst.getText());
                    first.setStudentID(this.txtStudentIDFirst.getText());
                    first.setSessCF(this.txtCFsess.getText());
                    first.setMidCF(this.txtCFmid.getText());
                    first.setFinalCF(this.txtCFfinal.getText());
                    first.setTotalCF(this.txtCFtotal.getText());
                    first.setCFGPA(this.txtCFGPA.getText());
                    first.setSessC(this.txtCsess.getText());
                    first.setMidC(this.txtCmid.getText());
                    first.setFinalC(this.txtCfinal.getText());
                    first.setTotalC(this.txtCtotal.getText());
                    first.setCGPA(this.txtCGPA.getText());
                    first.setSessPhy(this.txtPhysess.getText());
                    first.setMidPhy(this.txtPhymid.getText());
                    first.setFinalPhy(this.txtPhyfinal.getText());
                    first.setTotalPhy(this.txtPhytotal.getText());
                    first.setPhyGPA(this.txtPhyGPA.getText());
                    first.setSessMath1(this.txtMathsess.getText());
                    first.setMidMath1(this.txtMathmid.getText());
                    first.setFinalMath1(this.txtMathfinal.getText());
                    first.setTotalMath1(this.txtMathtotal.getText());
                    first.setMathGPA(this.txtMathGPA.getText());
                    first.setSessEng(this.txtEngsess.getText());
                    first.setMidEng(this.txtEngmid.getText());
                    first.setFinalEng(this.txtEngfinal.getText());
                    first.setTotalEng(this.txtEngtotal.getText());
                    first.setEngGPA(this.txtEngGPA.getText());
                    first.setSessAcc(this.txtAccsess.getText());
                    first.setMidAcc(this.txtAccmid.getText());
                    first.setFinalAcc(this.txtAccfinal.getText());
                    first.setTotalAcc(this.txtAcctotal.getText());
                    first.setAccGPA(this.txtAccGPA.getText());
                    first.setSessBS(this.txtBSsess.getText());
                    first.setMidBS(this.txtBSmid.getText());
                    first.setFinalBS(this.txtBSfinal.getText());
                    first.setTotalBS(this.txtBStotal.getText());
                    first.setBSGPA(this.txtBSGPA.getText());
                    first.setCFLab(this.txtCFLabfinal.getText());
                    first.setTotalCFLab(this.txtCFLabtotal.getText());
                    first.setCFLabGPA(this.txtCFLabGPA.getText());
                    first.setCLab(this.txtCLabfinal.getText());
                    first.setTotalCLab(this.txtCLabtotal.getText());
                    first.setCLabGPA(this.txtCLabGPA.getText());
                    first.setPhyLab(this.txtPhyLabfinal.getText());
                    first.setTotalPhyLab(this.txtPhyLabtotal.getText());
                    first.setPhyLabGPA(this.txtPhyLabGPA.getText());

                    boolean auth = first.resultFirst();
                    if (auth) {
                        JOptionPane.showMessageDialog(null, "Result recorded!");
                    }
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnFirstSaveActionPerformed

    private void btnSecondSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecondSaveActionPerformed

        resultSecond rst = new resultSecond();
        try {
            rst.setStudentID2nd(txtstudentIDSec.getText());
            boolean chk = rst.search();
            //   System.out.println(chk);
            if (!chk) {
                JOptionPane.showMessageDialog(null, "Record already in!");
            } else if (checkValidationSecond()) {
                try {
                    resultSecond sec = new resultSecond();
                    sec.setStudentName2nd(this.txtstudentNameSec.getText());
                    sec.setFatherName2nd(this.txtfatherNameSec.getText());
                    sec.setStudentID2nd(this.txtstudentIDSec.getText());
                    sec.setBEEsess(this.txtBEEsess.getText());
                    sec.setBEEmid(this.txtBEEmid.getText());
                    sec.setBEEfinal(this.txtBEEfinal.getText());
                    sec.setBEEtotal(this.txtBEEtotal.getText());
                    sec.setBEEgp(this.txtBEEgp.getText());
                    sec.setDSsess(this.txtDSsess.getText());
                    sec.setDSmid(this.txtDSmid.getText());
                    sec.setDSfinal(this.txtDSfinal.getText());
                    sec.setDStotal(this.txtDStotal.getText());
                    sec.setDSgp(this.txtDSgp.getText());
                    sec.setCPPsess(this.txtCPPsess.getText());
                    sec.setCPPmid(this.txtCPPmid.getText());
                    sec.setCPPfinal(this.txtCPPfinal.getText());
                    sec.setCPPtotal(this.txtCPPtotal.getText());
                    sec.setCPPgp(this.txtCPPgp.getText());
                    sec.setPHY2sess(this.txtPHY2sess.getText());
                    sec.setPHY2mid(this.txtPHY2mid.getText());
                    sec.setPHY2final(this.txtPHY2final.getText());
                    sec.setPHY2total(this.txtPHY2total.getText());
                    sec.setPHY2gp(this.txtPHY2gp.getText());
                    sec.setMATH2sess(this.txtMATH2sess.getText());
                    sec.setMATH2mid(this.txtMATH2mid.getText());
                    sec.setMATH2final(this.txtMATH2final.getText());
                    sec.setMATH2total(this.txtMATH2total.getText());
                    sec.setMATH2gp(this.txtMATH2gp.getText());
                    sec.setPEsess(this.txtPEsess.getText());
                    sec.setPEmid(this.txtPEmid.getText());
                    sec.setPEfinal(this.txtPEfinal.getText());
                    sec.setPEtotal(this.txtPEtotal.getText());
                    sec.setPEgp(this.txtPEgp.getText());
                    sec.setBEELab(this.BEELabfinal.getText());
                    sec.setBEELabtotal(this.BEELabtotal.getText());
                    sec.setBEELabgp(this.BEELabgp.getText());
                    sec.setDSLab(this.DSLabfinal.getText());
                    sec.setDSLabtotal(this.DSLabtotal.getText());
                    sec.setDSLabgp(this.DSLabgp.getText());
                    sec.setCPPLab(this.CPPLabfinal.getText());
                    sec.setCPPLabtotal(this.CPPLabtotal.getText());
                    sec.setCPPLabgp(this.CPPLabgp.getText());
                    sec.setPHY2Labfinal(this.PHY2Labfinal.getText());
                    sec.setPHY2Labtotal(this.PHY2Labtotal.getText());
                    sec.setPHY2Labgp(this.PHY2Labgp.getText());

                    boolean auth = sec.resultSecond();
                    if (auth) {
                        JOptionPane.showMessageDialog(null, "Result recorded!");
                    }
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnSecondSaveActionPerformed

    private void btnSecondResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecondResetActionPerformed

        txtClearsecond();
    }//GEN-LAST:event_btnSecondResetActionPerformed

    private void btnFirstResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstResetActionPerformed

        txtClearfirst();

    }//GEN-LAST:event_btnFirstResetActionPerformed

    private void txtCFfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCFfinalActionPerformed

        double CFsess = Double.parseDouble(txtCFsess.getText());
        double CFmid = Double.parseDouble(txtCFmid.getText());
        double CFfinal = Double.parseDouble(txtCFfinal.getText());
        if ((CFsess < 0 || CFsess > 25) || (CFmid < 0 || CFmid > 15) || (CFfinal < 0 || CFfinal > 60)) {
            JOptionPane.showMessageDialog(null, "Invalid Marks!");
        } else {
            double total = CFsess + CFmid + CFfinal;
            String Gtotal = String.valueOf(total);
            txtCFtotal.setText(Gtotal);
            txtCFGPA.setText(String.valueOf(GPA(total)));
        }

    }//GEN-LAST:event_txtCFfinalActionPerformed

    private void txtCfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCfinalActionPerformed

        double Csess = Double.parseDouble(txtCsess.getText());
        double Cmid = Double.parseDouble(txtCmid.getText());
        double Cfinal = Double.parseDouble(txtCfinal.getText());
        if ((Csess < 0 || Csess > 25) || (Cmid < 0 || Cmid > 15) || (Cfinal < 0 || Cfinal > 60)) {
            JOptionPane.showMessageDialog(null, "Invalid Marks!");
        } else {
            double total = Csess + Cmid + Cfinal;
            String Gtotal = String.valueOf(total);
            txtCtotal.setText(Gtotal);
            txtCGPA.setText(String.valueOf(GPA(total)));
        }

    }//GEN-LAST:event_txtCfinalActionPerformed

    private void txtPhyfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhyfinalActionPerformed

        double Physess = Double.parseDouble(txtPhysess.getText());
        double Phymid = Double.parseDouble(txtPhymid.getText());
        double Phyfinal = Double.parseDouble(txtPhyfinal.getText());
        if ((Physess < 0 || Physess > 25) || (Phymid < 0 || Phymid > 15) || (Phyfinal < 0 || Phyfinal > 60)) {
            JOptionPane.showMessageDialog(null, "Invalid Marks!");
        } else {
            double total = Physess + Phymid + Phyfinal;
            String Gtotal = String.valueOf(total);
            txtPhytotal.setText(Gtotal);
            txtPhyGPA.setText(String.valueOf(GPA(total)));
        }

    }//GEN-LAST:event_txtPhyfinalActionPerformed

    private void txtMathfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMathfinalActionPerformed

        double Mathsess = Double.parseDouble(txtMathsess.getText());
        double Mathmid = Double.parseDouble(txtMathmid.getText());
        double Mathfinal = Double.parseDouble(txtMathfinal.getText());
        if ((Mathsess < 0 || Mathsess > 25) || (Mathmid < 0 || Mathmid > 15) || (Mathfinal < 0 || Mathfinal > 60)) {
            JOptionPane.showMessageDialog(null, "Invalid Marks!");
        } else {
            double total = Mathsess + Mathmid + Mathfinal;
            String Gtotal = String.valueOf(total);
            txtMathtotal.setText(Gtotal);
            txtMathGPA.setText(String.valueOf(GPA(total)));
        }

    }//GEN-LAST:event_txtMathfinalActionPerformed

    private void txtEngfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEngfinalActionPerformed

        double sess = Double.parseDouble(txtEngsess.getText());
        double mid = Double.parseDouble(txtEngmid.getText());
        double Engfinal = Double.parseDouble(txtEngfinal.getText());
        if ((sess < 0 || sess > 25) || (mid < 0 || mid > 15) || (Engfinal < 0 || Engfinal > 60)) {
            JOptionPane.showMessageDialog(null, "Invalid Marks!");
        } else {
            double total = sess + mid + Engfinal;
            String Gtotal = String.valueOf(total);
            txtEngtotal.setText(Gtotal);
            txtEngGPA.setText(String.valueOf(GPA(total)));
        }
    }//GEN-LAST:event_txtEngfinalActionPerformed

    private void txtAccfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccfinalActionPerformed

        double sess = Double.parseDouble(txtAccsess.getText());
        double mid = Double.parseDouble(txtAccmid.getText());
        double Accfinal = Double.parseDouble(txtAccfinal.getText());
        if ((sess < 0 || sess > 25) || (mid < 0 || mid > 15) || (Accfinal < 0 || Accfinal > 60)) {
            JOptionPane.showMessageDialog(null, "Invalid Marks!");
        } else {
            double total = sess + mid + Accfinal;
            String Gtotal = String.valueOf(total);
            txtAcctotal.setText(Gtotal);
            txtAccGPA.setText(String.valueOf(GPA(total)));
        }
    }//GEN-LAST:event_txtAccfinalActionPerformed

    private void txtBSfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBSfinalActionPerformed

        double sess = Double.parseDouble(txtBSsess.getText());
        double mid = Double.parseDouble(txtBSmid.getText());
        double BSfinal = Double.parseDouble(txtBSfinal.getText());
        if ((sess < 0 || sess > 25) || (mid < 0 || mid > 15) || (BSfinal < 0 || BSfinal > 60)) {
            JOptionPane.showMessageDialog(null, "Invalid Marks!");
        } else {
            double total = sess + mid + BSfinal;
            String Gtotal = String.valueOf(total);
            txtBStotal.setText(Gtotal);
            txtBSGPA.setText(String.valueOf(GPA(total)));
        }

    }//GEN-LAST:event_txtBSfinalActionPerformed

    private void txtCFLabfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCFLabfinalActionPerformed

        double total = Double.valueOf(txtCFLabfinal.getText());
        if (total > 100 || total < 0) {
            JOptionPane.showMessageDialog(null, "Invalid Marks!");
        } else {
            txtCFLabtotal.setText(txtCFLabfinal.getText());
            txtCFLabGPA.setText(String.valueOf(GPA(total)));
        }
    }//GEN-LAST:event_txtCFLabfinalActionPerformed

    private void txtCLabfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCLabfinalActionPerformed

        double total = Double.valueOf(txtCLabfinal.getText());
        if (total > 100 || total < 0) {
            JOptionPane.showMessageDialog(null, "Invalid Marks!");
        } else {
            txtCLabtotal.setText(txtCLabfinal.getText());
            txtCLabGPA.setText(String.valueOf(GPA(total)));
        }
    }//GEN-LAST:event_txtCLabfinalActionPerformed

    private void txtPhyLabfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhyLabfinalActionPerformed

        double total = Double.valueOf(txtPhyLabfinal.getText());
        if (total > 100 || total < 0) {
            JOptionPane.showMessageDialog(null, "Invalid Marks!");
        } else {
            txtPhyLabtotal.setText(txtPhyLabfinal.getText());
            txtPhyLabGPA.setText(String.valueOf(GPA(total)));
        }

    }//GEN-LAST:event_txtPhyLabfinalActionPerformed

    private void txtBEEfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBEEfinalActionPerformed

        double BEEsess = Double.parseDouble(txtBEEsess.getText());
        double BEEmid = Double.parseDouble(txtBEEmid.getText());
        double BEEfinal = Double.parseDouble(txtBEEfinal.getText());
        if ((BEEsess < 0 || BEEsess > 25) || (BEEmid < 0 || BEEmid > 15) || (BEEfinal < 0 || BEEfinal > 60)) {
            JOptionPane.showMessageDialog(null, "Invalid Marks!");
        } else {
            double total = BEEsess + BEEmid + BEEfinal;
            String Gtotal = String.valueOf(total);
            txtBEEtotal.setText(Gtotal);
            txtBEEgp.setText(String.valueOf(GPA(total)));
        }
    }//GEN-LAST:event_txtBEEfinalActionPerformed

    private void txtDSfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDSfinalActionPerformed

        double DSsess = Double.parseDouble(txtDSsess.getText());
        double DSmid = Double.parseDouble(txtDSmid.getText());
        double DSfinal = Double.parseDouble(txtDSfinal.getText());
        if ((DSsess < 0 || DSsess > 25) || (DSmid < 0 || DSmid > 15) || (DSfinal < 0 || DSfinal > 60)) {
            JOptionPane.showMessageDialog(null, "Invalid Marks!");
        } else {
            double total = DSsess + DSmid + DSfinal;
            String Gtotal = String.valueOf(total);
            txtDStotal.setText(Gtotal);
            txtDSgp.setText(String.valueOf(GPA(total)));
        }
    }//GEN-LAST:event_txtDSfinalActionPerformed

    private void txtCPPfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPPfinalActionPerformed

        double CPPsess = Double.parseDouble(txtCPPsess.getText());
        double CPPmid = Double.parseDouble(txtCPPmid.getText());
        double CPPfinal = Double.parseDouble(txtCPPfinal.getText());
        if ((CPPsess < 0 || CPPsess > 25) || (CPPmid < 0 || CPPmid > 15) || (CPPfinal < 0 || CPPfinal > 60)) {
            JOptionPane.showMessageDialog(null, "Invalid Marks!");
        } else {
            double total = CPPsess + CPPmid + CPPfinal;
            String Gtotal = String.valueOf(total);
            txtCPPtotal.setText(Gtotal);
            txtCPPgp.setText(String.valueOf(GPA(total)));
        }
    }//GEN-LAST:event_txtCPPfinalActionPerformed

    private void txtPHY2finalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPHY2finalActionPerformed

        double PHY2sess = Double.parseDouble(txtPHY2sess.getText());
        double PHY2mid = Double.parseDouble(txtPHY2mid.getText());
        double PHY2final = Double.parseDouble(txtPHY2final.getText());
        if ((PHY2sess < 0 || PHY2sess > 25) || (PHY2mid < 0 || PHY2mid > 15) || (PHY2final < 0 || PHY2final > 60)) {
            JOptionPane.showMessageDialog(null, "Invalid Marks!");
        } else {
            double total = PHY2sess + PHY2mid + PHY2final;
            String Gtotal = String.valueOf(total);
            txtPHY2total.setText(Gtotal);
            txtPHY2gp.setText(String.valueOf(GPA(total)));
        }
    }//GEN-LAST:event_txtPHY2finalActionPerformed

    private void txtMATH2finalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMATH2finalActionPerformed

        double MATH2sess = Double.parseDouble(txtMATH2sess.getText());
        double MATH2mid = Double.parseDouble(txtMATH2mid.getText());
        double MATH2final = Double.parseDouble(txtMATH2final.getText());
        if ((MATH2sess < 0 || MATH2sess > 25) || (MATH2mid < 0 || MATH2mid > 15) || (MATH2final < 0 || MATH2final > 60)) {
            JOptionPane.showMessageDialog(null, "Invalid Marks!");
        } else {
            double total = MATH2sess + MATH2mid + MATH2final;
            String Gtotal = String.valueOf(total);
            txtMATH2total.setText(Gtotal);
            txtMATH2gp.setText(String.valueOf(GPA(total)));
        }
    }//GEN-LAST:event_txtMATH2finalActionPerformed

    private void txtPEfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPEfinalActionPerformed

        double PEsess = Double.parseDouble(txtPEsess.getText());
        double PEmid = Double.parseDouble(txtPEmid.getText());
        double PEfinal = Double.parseDouble(txtPEfinal.getText());
        if ((PEsess < 0 || PEsess > 25) || (PEmid < 0 || PEmid > 15) || (PEfinal < 0 || PEfinal > 60)) {
            JOptionPane.showMessageDialog(null, "Invalid Marks!");
        } else {
            double total = PEsess + PEmid + PEfinal;
            String Gtotal = String.valueOf(total);
            txtPEtotal.setText(Gtotal);
            txtPEgp.setText(String.valueOf(GPA(total)));
        }
    }//GEN-LAST:event_txtPEfinalActionPerformed

    private void BEELabfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEELabfinalActionPerformed

        double total = Double.valueOf(BEELabfinal.getText());
        if (total > 100 || total < 0) {
            JOptionPane.showMessageDialog(null, "Invalid Marks!");
        } else {
            BEELabtotal.setText(BEELabfinal.getText());
            BEELabgp.setText(String.valueOf(GPA(total)));
        }
    }//GEN-LAST:event_BEELabfinalActionPerformed

    private void DSLabfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DSLabfinalActionPerformed

        double total = Double.valueOf(DSLabfinal.getText());
        if (total > 100 || total < 0) {
            JOptionPane.showMessageDialog(null, "Invalid Marks!");
        } else {
            DSLabtotal.setText(DSLabfinal.getText());
            DSLabgp.setText(String.valueOf(GPA(total)));
        }
    }//GEN-LAST:event_DSLabfinalActionPerformed

    private void CPPLabfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPPLabfinalActionPerformed

        double total = Double.valueOf(CPPLabfinal.getText());
        if (total > 100 || total < 0) {
            JOptionPane.showMessageDialog(null, "Invalid Marks!");
        } else {
            CPPLabtotal.setText(CPPLabfinal.getText());
            CPPLabgp.setText(String.valueOf(GPA(total)));
        }
    }//GEN-LAST:event_CPPLabfinalActionPerformed

    private void PHY2LabfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PHY2LabfinalActionPerformed

        double total = Double.valueOf(PHY2Labfinal.getText());
        if (total > 100 || total < 0) {
            JOptionPane.showMessageDialog(null, "Invalid Marks!");
        } else {
            PHY2Labtotal.setText(PHY2Labfinal.getText());
            PHY2Labgp.setText(String.valueOf(GPA(total)));
        }
    }//GEN-LAST:event_PHY2LabfinalActionPerformed

    private void txtCFsessInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtCFsessInputMethodTextChanged

    }//GEN-LAST:event_txtCFsessInputMethodTextChanged

    private void txtCFsessPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtCFsessPropertyChange

    }//GEN-LAST:event_txtCFsessPropertyChange

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BEELabfinal;
    private javax.swing.JTextField BEELabgp;
    private javax.swing.JTextField BEELabtotal;
    private javax.swing.JTextField CPPLabfinal;
    private javax.swing.JTextField CPPLabgp;
    private javax.swing.JTextField CPPLabtotal;
    private javax.swing.JTextField DSLabfinal;
    private javax.swing.JTextField DSLabgp;
    private javax.swing.JTextField DSLabtotal;
    private javax.swing.JTextField PHY2Labfinal;
    private javax.swing.JTextField PHY2Labgp;
    private javax.swing.JTextField PHY2Labtotal;
    private javax.swing.JButton btnFirstReset;
    private javax.swing.JButton btnFirstSave;
    private javax.swing.JButton btnSecondReset;
    private javax.swing.JButton btnSecondSave;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
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
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTextField txtAccGPA;
    private javax.swing.JTextField txtAccfinal;
    private javax.swing.JTextField txtAccmid;
    private javax.swing.JTextField txtAccsess;
    private javax.swing.JTextField txtAcctotal;
    private javax.swing.JTextField txtBEEfinal;
    private javax.swing.JTextField txtBEEgp;
    private javax.swing.JTextField txtBEEmid;
    private javax.swing.JTextField txtBEEsess;
    private javax.swing.JTextField txtBEEtotal;
    private javax.swing.JTextField txtBSGPA;
    private javax.swing.JTextField txtBSfinal;
    private javax.swing.JTextField txtBSmid;
    private javax.swing.JTextField txtBSsess;
    private javax.swing.JTextField txtBStotal;
    private javax.swing.JTextField txtCFGPA;
    private javax.swing.JTextField txtCFLabGPA;
    private javax.swing.JTextField txtCFLabfinal;
    private javax.swing.JTextField txtCFLabtotal;
    private javax.swing.JTextField txtCFfinal;
    private javax.swing.JTextField txtCFmid;
    private javax.swing.JTextField txtCFsess;
    private javax.swing.JTextField txtCFtotal;
    private javax.swing.JTextField txtCGPA;
    private javax.swing.JTextField txtCLabGPA;
    private javax.swing.JTextField txtCLabfinal;
    private javax.swing.JTextField txtCLabtotal;
    private javax.swing.JTextField txtCPPfinal;
    private javax.swing.JTextField txtCPPgp;
    private javax.swing.JTextField txtCPPmid;
    private javax.swing.JTextField txtCPPsess;
    private javax.swing.JTextField txtCPPtotal;
    private javax.swing.JTextField txtCfinal;
    private javax.swing.JTextField txtCmid;
    private javax.swing.JTextField txtCsess;
    private javax.swing.JTextField txtCtotal;
    private javax.swing.JTextField txtDSfinal;
    private javax.swing.JTextField txtDSgp;
    private javax.swing.JTextField txtDSmid;
    private javax.swing.JTextField txtDSsess;
    private javax.swing.JTextField txtDStotal;
    private javax.swing.JTextField txtEngGPA;
    private javax.swing.JTextField txtEngfinal;
    private javax.swing.JTextField txtEngmid;
    private javax.swing.JTextField txtEngsess;
    private javax.swing.JTextField txtEngtotal;
    private javax.swing.JTextField txtFathNameFirst;
    private javax.swing.JTextField txtMATH2final;
    private javax.swing.JTextField txtMATH2gp;
    private javax.swing.JTextField txtMATH2mid;
    private javax.swing.JTextField txtMATH2sess;
    private javax.swing.JTextField txtMATH2total;
    private javax.swing.JTextField txtMathGPA;
    private javax.swing.JTextField txtMathfinal;
    private javax.swing.JTextField txtMathmid;
    private javax.swing.JTextField txtMathsess;
    private javax.swing.JTextField txtMathtotal;
    private javax.swing.JTextField txtPEfinal;
    private javax.swing.JTextField txtPEgp;
    private javax.swing.JTextField txtPEmid;
    private javax.swing.JTextField txtPEsess;
    private javax.swing.JTextField txtPEtotal;
    private javax.swing.JTextField txtPHY2final;
    private javax.swing.JTextField txtPHY2gp;
    private javax.swing.JTextField txtPHY2mid;
    private javax.swing.JTextField txtPHY2sess;
    private javax.swing.JTextField txtPHY2total;
    private javax.swing.JTextField txtPhyGPA;
    private javax.swing.JTextField txtPhyLabGPA;
    private javax.swing.JTextField txtPhyLabfinal;
    private javax.swing.JTextField txtPhyLabtotal;
    private javax.swing.JTextField txtPhyfinal;
    private javax.swing.JTextField txtPhymid;
    private javax.swing.JTextField txtPhysess;
    private javax.swing.JTextField txtPhytotal;
    private javax.swing.JTextField txtStuNameFirst;
    private javax.swing.JTextField txtStudentIDFirst;
    private javax.swing.JTextField txtfatherNameSec;
    private javax.swing.JTextField txtstudentIDSec;
    private javax.swing.JTextField txtstudentNameSec;
    // End of variables declaration//GEN-END:variables
}
