/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentRPSystem.ui;

import StudentRPSystem.db.resultSecond;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rasel
 */
public class Marksheet2nd extends javax.swing.JPanel {

    /**
     * Creates new form Marksheet2nd
     */
    public Marksheet2nd() {
        initComponents();
        it();
    }

    public void it() {
        try {
            resultSecond sec = new resultSecond();
            List<resultSecond> rst = sec.SecondSemResult();
            String[][] str = new String[rst.size()][45];
            int i = 0;
            for (resultSecond j : rst) {
                str[i][0] = j.getStudentID2nd();
                str[i][1] = j.getStudentName2nd();
                str[i][2] = j.getFatherName2nd();
                str[i][3] = j.getBEEsess();
                str[i][4] = j.getBEEmid();
                str[i][5] = j.getBEEfinal();
                str[i][6] = j.getBEEtotal();
                str[i][7] = j.getBEEgp();
                str[i][8] = j.getDSsess();
                str[i][9] = j.getDSmid();
                str[i][10] = j.getDSfinal();
                str[i][11] = j.getDStotal();
                str[i][12] = j.getDSgp();
                str[i][13] = j.getCPPsess();
                str[i][14] = j.getCPPmid();
                str[i][15] = j.getCPPfinal();
                str[i][16] = j.getCPPtotal();
                str[i][17] = j.getCPPgp();
                str[i][18] = j.getPHY2sess();
                str[i][19] = j.getPHY2mid();
                str[i][20] = j.getPHY2final();
                str[i][21] = j.getPHY2total();
                str[i][22] = j.getPHY2gp();
                str[i][23] = j.getMATH2sess();
                str[i][24] = j.getMATH2mid();
                str[i][25] = j.getMATH2final();
                str[i][26] = j.getMATH2total();
                str[i][27] = j.getMATH2gp();
                str[i][28] = j.getPEsess();
                str[i][29] = j.getPEmid();
                str[i][30] = j.getPEfinal();
                str[i][31] = j.getPEtotal();
                str[i][32] = j.getPEgp();
                str[i][33] = j.getBEELab();
                str[i][34] = j.getBEELabtotal();
                str[i][35] = j.getBEELabgp();
                str[i][36] = j.getDSLab();
                str[i][37] = j.getDSLabtotal();
                str[i][38] = j.getDSLabgp();
                str[i][39] = j.getCPPLab();
                str[i][40] = j.getCPPLabtotal();
                str[i][41] = j.getCPPLabgp();
                str[i][42] = j.getPHY2Labfinal();
                str[i][43] = j.getPHY2Labtotal();
                str[i][44] = j.getPHY2Labgp();

                i++;
            }
            resultTable2nd.setModel(new DefaultTableModel(
                    str,
                    new String[]{"Student ID", "Student name", "Father name", "BEE(S)", "BEE(M)", "BEE(F)", "BEE(T)", "GP", "DS(S)", "DS(M)", "DS(F)", "DS(T)", "GP", "CPP(S)", "CPP(M)", "CPP(F)", "CPP(T)", "GP", "PHY2(S)", "PHY2(M)", "PHY2(F)", "PHY2(T)", "GP", "MATH2(S)", "MATH2(M)", "MATH2(F)", "MATH2(T)", "GP", "PE(S)", "PE(M)", "PE(F)", "PE(T)", "GP", "BEELAB(F)", "BEELAB(T)", "GP", "DSLAB(F)", "DSLAB(T)", "GP", "CPPLAB(F)", "CPPLAB(T)", "GP", "PHY2LAB(F)", "PHY2LAB(T)", "GP"}));

        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
        }
    }

    public void findstudent() throws ClassNotFoundException, SQLException {

        resultSecond sec = new resultSecond();
        sec.setSearchID(this.txtsearch2nd.getText());
        ArrayList<resultSecond> rst = sec.tablesearch();
        String[][] str = new String[rst.size()][45];
        System.out.println(rst.size());
        int i = 0;
        for (resultSecond j : rst) {
            str[i][0] = j.getStudentID2nd();
            str[i][1] = j.getStudentName2nd();
            str[i][2] = j.getFatherName2nd();
            str[i][3] = j.getBEEsess();
            str[i][4] = j.getBEEmid();
            str[i][5] = j.getBEEfinal();
            str[i][6] = j.getBEEtotal();
            str[i][7] = j.getBEEgp();
            str[i][8] = j.getDSsess();
            str[i][9] = j.getDSmid();
            str[i][10] = j.getDSfinal();
            str[i][11] = j.getDStotal();
            str[i][12] = j.getDSgp();
            str[i][13] = j.getCPPsess();
            str[i][14] = j.getCPPmid();
            str[i][15] = j.getCPPfinal();
            str[i][16] = j.getCPPtotal();
            str[i][17] = j.getCPPgp();
            str[i][18] = j.getPHY2sess();
            str[i][19] = j.getPHY2mid();
            str[i][20] = j.getPHY2final();
            str[i][21] = j.getPHY2total();
            str[i][22] = j.getPHY2gp();
            str[i][23] = j.getMATH2sess();
            str[i][24] = j.getMATH2mid();
            str[i][25] = j.getMATH2final();
            str[i][26] = j.getMATH2total();
            str[i][27] = j.getMATH2gp();
            str[i][28] = j.getPEsess();
            str[i][29] = j.getPEmid();
            str[i][30] = j.getPEfinal();
            str[i][31] = j.getPEtotal();
            str[i][32] = j.getPEgp();
            str[i][33] = j.getBEELab();
            str[i][34] = j.getBEELabtotal();
            str[i][35] = j.getBEELabgp();
            str[i][36] = j.getDSLab();
            str[i][37] = j.getDSLabtotal();
            str[i][38] = j.getDSLabgp();
            str[i][39] = j.getCPPLab();
            str[i][40] = j.getCPPLabtotal();
            str[i][41] = j.getCPPLabgp();
            str[i][42] = j.getPHY2Labfinal();
            str[i][43] = j.getPHY2Labtotal();
            str[i][44] = j.getPHY2Labgp();

            i++;
        }
        resultTable2nd.setModel(new DefaultTableModel(
                str,
                new String[]{"Student ID", "Student name", "Father name", "BEE(S)", "BEE(M)", "BEE(F)", "BEE(T)", "GP", "DS(S)", "DS(M)", "DS(F)", "DS(T)", "GP", "CPP(S)", "CPP(M)", "CPP(F)", "CPP(T)", "GP", "PHY2(S)", "PHY2(M)", "PHY2(F)", "PHY2(T)", "GP", "MATH2(S)", "MATH2(M)", "MATH2(F)", "MATH2(T)", "GP", "PE(S)", "PE(M)", "PE(F)", "PE(T)", "GP", "BEELAB(F)", "BEELAB(T)", "GP", "DSLAB(F)", "DSLAB(T)", "GP", "CPPLAB(F)", "CPPLAB(T)", "GP", "PHY2LAB(F)", "PHY2LAB(T)", "GP"}));


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable2nd = new javax.swing.JTable();
        txtsearch2nd = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jPanel8.setPreferredSize(new java.awt.Dimension(2805, 558));

        resultTable2nd.setAutoCreateRowSorter(true);
        resultTable2nd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        resultTable2nd.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 16)); // NOI18N
        resultTable2nd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Student name", "Father name", "BEE sessional", "BEE mid", "BEE final", "BEE total", "GP", "DS sessional", "DS mid", "DS final", "DS total", "GP", "C++ sessional", "C++ mid", "C++ final", "C++ total", "GP", "PHY2 sessional", "PHY2 mid", "PHY2 final", "PHY2 total", "GP", "MATH2 sessional", "MATH2 mid", "MATH2 final", "MATH2 total", "GP", "PE sessional", "PE mid", "PE final", "PE total", "GP", "BEE LAB final", "BEE LAB total", "GP", "DS LAB final", "DS LAB total", "GP", "C++ LAB total", "C++ LAB final", "GP", "PHY2 LAB final", "PHY2 LAB total", "GP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        resultTable2nd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(resultTable2nd);

        txtsearch2nd.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 15)); // NOI18N
        txtsearch2nd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearch2ndActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 16)); // NOI18N
        jLabel1.setText("Search by ID:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 3159, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtsearch2nd, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtsearch2nd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 3159, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtsearch2ndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearch2ndActionPerformed

        resultSecond search = new resultSecond();
        try {
            search.setStudentID2nd(txtsearch2nd.getText());
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
    }//GEN-LAST:event_txtsearch2ndActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable resultTable2nd;
    private javax.swing.JTextField txtsearch2nd;
    // End of variables declaration//GEN-END:variables
}
