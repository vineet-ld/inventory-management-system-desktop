/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.userinterface.resourcemanager;

import com.neu.phmis.business.organization.DoctorOrganization;
import com.neu.phmis.business.organization.Organization;
import com.neu.phmis.business.resource.Resource;
import com.neu.phmis.business.resource.SurgicalOperation;
import com.neu.phmis.business.schedule.Schedule;
import com.neu.phmis.business.user.Doctor;
import com.neu.phmis.business.util.CommonUtil;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vineet
 */
public class ViewResourceDialog extends javax.swing.JDialog {

    private Resource resource;

    /**
     * Creates new form ViewResourceDialog
     */
    public ViewResourceDialog(java.awt.Frame parent, boolean modal,
            Resource resource) {

        super(parent, modal);
        initComponents();
        this.resource = resource;
        this.setLocationRelativeTo(null);

        DefaultTableModel defaultTableModel
                = (DefaultTableModel) resourceScheduleTbl.getModel();

        Object row[];
        Doctor doctor = null;
        for (Schedule schedule : resource.getResourceSchedule()
                .getScheduleList()) {

            for (SurgicalOperation surgicalOperation
                    : ((DoctorOrganization) schedule.getHospitalEnterprise()
                    .getOrganization(Organization.ORGANIZATION_DOCTOR))
                    .getSurgicalSchedule().getOperationList()) {

                if (CommonUtil.getZeroTimeDate(surgicalOperation
                        .getScheduleDate()).equals(CommonUtil
                                .getZeroTimeDate(schedule.getScheduleDate()))) {
                    doctor = surgicalOperation.getDoctor();
                }

            }

            row = new Object[2];
            row[0] = schedule;
            row[1] = doctor;
            defaultTableModel.addRow(row);

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

        webLabel1 = new com.alee.laf.label.WebLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resourceScheduleTbl = new com.alee.laf.table.WebTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        webLabel1.setForeground(new java.awt.Color(0, 51, 255));
        webLabel1.setText("Resource Schedule");
        webLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        resourceScheduleTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Reserved By"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        resourceScheduleTbl.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(resourceScheduleTbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 291, Short.MAX_VALUE)
                        .addComponent(webLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 317, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(webLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                .addContainerGap())
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
            java.util.logging.Logger.getLogger(ViewResourceDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewResourceDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewResourceDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewResourceDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewResourceDialog dialog
                        = new ViewResourceDialog(new javax.swing.JFrame(), true,
                                resource);
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
    private javax.swing.JScrollPane jScrollPane1;
    private com.alee.laf.table.WebTable resourceScheduleTbl;
    private com.alee.laf.label.WebLabel webLabel1;
    // End of variables declaration//GEN-END:variables
}