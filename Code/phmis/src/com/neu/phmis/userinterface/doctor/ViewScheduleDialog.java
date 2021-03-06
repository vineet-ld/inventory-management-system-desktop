/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.userinterface.doctor;

import com.neu.phmis.business.resource.MedicalStaff;
import com.neu.phmis.business.resource.Resource;
import com.neu.phmis.business.resource.SurgicalOperation;
import com.neu.phmis.business.util.CommonUtil;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vineet
 */
public class ViewScheduleDialog extends javax.swing.JDialog {

    private SurgicalOperation surgicalOperation;

    /**
     * Creates new form ViewScheduleDialog
     */
    public ViewScheduleDialog(java.awt.Frame parent, boolean modal,
            SurgicalOperation surgicalOperation) {

        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.surgicalOperation = surgicalOperation;

        dateLbl.setText(CommonUtil.changeDateFormat(surgicalOperation
                .getScheduleDate(), "dd MMM, yyyy"));
        surgeryLbl.setText(surgicalOperation.getSurgeryType());
        patientLbl.setText(surgicalOperation.getPatientName());
        roomLbl.setText(surgicalOperation.getRoom().getRoomNo() + " "
                + surgicalOperation.getRoom().getLocation());

        DefaultTableModel defaultTableModel
                = (DefaultTableModel) teamTbl.getModel();

        Object row[];
        for (Resource resource : surgicalOperation.getMedicalTeam()) {

            row = new Object[1];
            row[0] = (MedicalStaff) resource;
            defaultTableModel.addRow(row);

            if (((MedicalStaff) resource).getIsLeader() == 1) {
                leaderLbl.setText(((MedicalStaff) resource).getStaffName());
            }

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        surgeryLbl = new com.alee.laf.label.WebLabel();
        webLabel1 = new com.alee.laf.label.WebLabel();
        webLabel5 = new com.alee.laf.label.WebLabel();
        patientLbl = new com.alee.laf.label.WebLabel();
        webLabel8 = new com.alee.laf.label.WebLabel();
        dateLbl = new com.alee.laf.label.WebLabel();
        webLabel9 = new com.alee.laf.label.WebLabel();
        roomLbl = new com.alee.laf.label.WebLabel();
        webLabel10 = new com.alee.laf.label.WebLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        teamTbl = new com.alee.laf.table.WebTable();
        webLabel11 = new com.alee.laf.label.WebLabel();
        webLabel12 = new com.alee.laf.label.WebLabel();
        leaderLbl = new com.alee.laf.label.WebLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        surgeryLbl.setText("<Creation Date>");
        surgeryLbl.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        webLabel1.setForeground(new java.awt.Color(0, 51, 255));
        webLabel1.setText("Surgery Schedule");
        webLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        webLabel5.setText("Date:");
        webLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        patientLbl.setText("<Status>");
        patientLbl.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        webLabel8.setText("Surgery Type:");
        webLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        dateLbl.setText("<Request ID>");
        dateLbl.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        webLabel9.setText("Patient Name:");
        webLabel9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        roomLbl.setText("<Status>");
        roomLbl.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        webLabel10.setText("Alloted Room:");
        webLabel10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        teamTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Members"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(teamTbl);

        webLabel11.setText("Medical Team:");
        webLabel11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        webLabel12.setText("Team Leader:");
        webLabel12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        leaderLbl.setText("<Status>");
        leaderLbl.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(webLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(webLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roomLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(webLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(patientLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(webLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(surgeryLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(webLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(webLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(leaderLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(256, 256, 256))
            .addGroup(layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(webLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(276, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(webLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(webLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(webLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surgeryLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(webLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(webLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(webLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(leaderLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(webLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewScheduleDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewScheduleDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewScheduleDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewScheduleDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewScheduleDialog dialog
                        = new ViewScheduleDialog(new javax.swing.JFrame(), true,
                                surgicalOperation);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.alee.laf.label.WebLabel dateLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private com.alee.laf.label.WebLabel leaderLbl;
    private com.alee.laf.label.WebLabel patientLbl;
    private com.alee.laf.label.WebLabel roomLbl;
    private com.alee.laf.label.WebLabel surgeryLbl;
    private com.alee.laf.table.WebTable teamTbl;
    private com.alee.laf.label.WebLabel webLabel1;
    private com.alee.laf.label.WebLabel webLabel10;
    private com.alee.laf.label.WebLabel webLabel11;
    private com.alee.laf.label.WebLabel webLabel12;
    private com.alee.laf.label.WebLabel webLabel5;
    private com.alee.laf.label.WebLabel webLabel8;
    private com.alee.laf.label.WebLabel webLabel9;
    // End of variables declaration//GEN-END:variables
}
