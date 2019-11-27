/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentRPSystem.ui;

import StudentRPSystem.db.resultFirst;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rasel
 */
public class Marksheet1st extends javax.swing.JPanel {

    public Marksheet1st() {
        initComponents();
        it();

    }

    public void findstudent() throws ClassNotFoundException, SQLException {

        resultFirst first = new resultFirst();
        first.setSearchID(this.txtsearch.getText());
        ArrayList<resultFirst> rst = first.tableSearch();
        String[][] str = new String[rst.size()][47];
        System.out.println(rst.size());
        int i = 0;
        for (resultFirst j : rst) {
            str[i][0] = j.getStudentID();
            str[i][1] = j.getStudentName();
            str[i][2] = j.getFatherName();
            str[i][3] = j.getSessCF();
            str[i][4] = j.getMidCF();
            str[i][5] = j.getFinalCF();
            str[i][6] = j.getTotalCF();
            str[i][7] = j.getCFGPA();
            str[i][8] = j.getSessC();
            str[i][9] = j.getMidC();
            str[i][10] = j.getFinalC();
            str[i][11] = j.getTotalC();
            str[i][12] = j.getCGPA();
            str[i][13] = j.getSessPhy();
            str[i][14] = j.getMidPhy();
            str[i][15] = j.getFinalPhy();
            str[i][16] = j.getTotalPhy();
            str[i][17] = j.getPhyGPA();
            str[i][18] = j.getSessMath1();
            str[i][19] = j.getMidMath1();
            str[i][20] = j.getFinalMath1();
            str[i][21] = j.getTotalMath1();
            str[i][22] = j.getMathGPA();
            str[i][23] = j.getSessEng();
            str[i][24] = j.getMidEng();
            str[i][25] = j.getFinalEng();
            str[i][26] = j.getTotalEng();
            str[i][27] = j.getEngGPA();
            str[i][28] = j.getSessAcc();
            str[i][29] = j.getMidAcc();
            str[i][30] = j.getFinalAcc();
            str[i][31] = j.getTotalAcc();
            str[i][32] = j.getAccGPA();
            str[i][33] = j.getSessBS();
            str[i][34] = j.getMidBS();
            str[i][35] = j.getFinalBS();
            str[i][36] = j.getTotalBS();
            str[i][37] = j.getBSGPA();
            str[i][38] = j.getCFLab();
            str[i][39] = j.getTotalCFLab();
            str[i][40] = j.getCFLabGPA();
            str[i][41] = j.getCLab();
            str[i][42] = j.getTotalCLab();
            str[i][43] = j.getCLabGPA();
            str[i][44] = j.getPhyLab();
            str[i][45] = j.getTotalPhyLab();
            str[i][46] = j.getPhyLabGPA();
            i++;
        }
        resultTable1st.setModel(new DefaultTableModel(
                str,
                new String[]{"Student ID", "Student name", "Father name", "CF(S)", "CF(M)", "CF(F)", "CF(T)", "GP", "C(S)", "C(M)", "C(F)", "C(T)", "GP", "PHY(S)", "PHY(M)", "PHY(F)", "PHY(T)", "GP", "MATH1(S)", "MATH1(M)", "MATH1(F)", "MATH1(T)", "GP", "ENG(S)", "ENG(M)", "ENG(F)", "ENG(T)", "GP", "ACC(S)", "ACC(M)", "ACC(F)", "ACC(T)", "GP", "BS(S)", "BS(M)", "BS(F)", "BS(T)", "GP", "CFLAB(F)", "CFLAB(T)", "GP", "CLAB(F)", "CLAB(T)", "GP", "PHYLAB(F)", "PHYLAB(T)", "GP"}));

    }

    public void it() {
        try {
            resultFirst first = new resultFirst();
            List<resultFirst> rst = first.FirstSemResult();
            String[][] str = new String[rst.size()][47];
            int i = 0;
            for (resultFirst j : rst) {
                str[i][0] = j.getStudentID();
                str[i][1] = j.getStudentName();
                str[i][2] = j.getFatherName();
                str[i][3] = j.getSessCF();
                str[i][4] = j.getMidCF();
                str[i][5] = j.getFinalCF();
                str[i][6] = j.getTotalCF();
                str[i][7] = j.getCFGPA();
                str[i][8] = j.getSessC();
                str[i][9] = j.getMidC();
                str[i][10] = j.getFinalC();
                str[i][11] = j.getTotalC();
                str[i][12] = j.getCGPA();
                str[i][13] = j.getSessPhy();
                str[i][14] = j.getMidPhy();
                str[i][15] = j.getFinalPhy();
                str[i][16] = j.getTotalPhy();
                str[i][17] = j.getPhyGPA();
                str[i][18] = j.getSessMath1();
                str[i][19] = j.getMidMath1();
                str[i][20] = j.getFinalMath1();
                str[i][21] = j.getTotalMath1();
                str[i][22] = j.getMathGPA();
                str[i][23] = j.getSessEng();
                str[i][24] = j.getMidEng();
                str[i][25] = j.getFinalEng();
                str[i][26] = j.getTotalEng();
                str[i][27] = j.getEngGPA();
                str[i][28] = j.getSessAcc();
                str[i][29] = j.getMidAcc();
                str[i][30] = j.getFinalAcc();
                str[i][31] = j.getTotalAcc();
                str[i][32] = j.getAccGPA();
                str[i][33] = j.getSessBS();
                str[i][34] = j.getMidBS();
                str[i][35] = j.getFinalBS();
                str[i][36] = j.getTotalBS();
                str[i][37] = j.getBSGPA();
                str[i][38] = j.getCFLab();
                str[i][39] = j.getTotalCFLab();
                str[i][40] = j.getCFLabGPA();
                str[i][41] = j.getCLab();
                str[i][42] = j.getTotalCLab();
                str[i][43] = j.getCLabGPA();
                str[i][44] = j.getPhyLab();
                str[i][45] = j.getTotalPhyLab();
                str[i][46] = j.getPhyLabGPA();

                i++;
            }
            resultTable1st.setModel(new DefaultTableModel(
                    str,
                    new String[]{"Student ID", "Student name", "Father name", "CF(S)", "CF(M)", "CF(F)", "CF(T)", "GP", "C(S)", "C(M)", "C(F)", "C(T)", "GP", "PHY(S)", "PHY(M)", "PHY(F)", "PHY(T)", "GP", "MATH1(S)", "MATH1(M)", "MATH1(F)", "MATH1(T)", "GP", "ENG(S)", "ENG(M)", "ENG(F)", "ENG(T)", "GP", "ACC(S)", "ACC(M)", "ACC(F)", "ACC(T)", "GP", "BS(S)", "BS(M)", "BS(F)", "BS(T)", "GP", "CFLAB(F)", "CFLAB(T)", "GP", "CLAB(F)", "CLAB(T)", "GP", "PHYLAB(F)", "PHYLAB(T)", "GP"}));

        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable1st = new javax.swing.JTable();
        txtsearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        resultTable1st.setAutoCreateRowSorter(true);
        resultTable1st.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        resultTable1st.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 16)); // NOI18N
        resultTable1st.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Student name", "Father name", "CF sessional", "CF mid", "CF final", "CF total", "GP", "C sessional", "C mid", "C final", "C total", "GP", "PHY1 sessional", "PHY1 mid", "PHY1 final", "PHY1 total", "GP", "MATH1 sessional", "MATH1 mid", "MATH1 final", "MATH1 total", "GP", "ENG sessional", "ENG mid", "ENG final", "ENG total", "GP", "ACC sessional", "ACC mid", "ACC final", "ACC total", "GP", "BS sessional", "BS mid", "BS final", "BS total", "GP", "CF LAB final", "CF LAB total", "GP", "C LAB final", "C LAB total", "GP", "PHY1 LAB final", "PHY1 LAB total", "GP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        resultTable1st.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(resultTable1st);

        txtsearch.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 15)); // NOI18N
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 16)); // NOI18N
        jLabel1.setText("Search by ID:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 2805, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable resultTable1st;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
