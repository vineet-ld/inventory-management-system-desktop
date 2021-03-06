/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.userinterface.inventorymanager;

import com.alee.laf.optionpane.WebOptionPane;
import com.neu.phmis.business.Ecosystem;
import com.neu.phmis.business.inventory.InventoryItem;
import com.neu.phmis.business.inventory.MaintenanceReport;
import com.neu.phmis.business.schedule.Schedule;
import com.neu.phmis.business.util.CommonUtil;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Vineet
 */
public class CreateMaintenanceReport extends javax.swing.JDialog {

    private InventoryItem inventoryItem;
    private Schedule schedule;
    private MaintenanceReport maintenanceReport;
    private ViewItemDetails viewItemDetails;

    /**
     * Creates new form CreateMaintenanceReport
     */
    public CreateMaintenanceReport(java.awt.Frame parent, boolean modal,
            InventoryItem inventoryItem, Schedule schedule,
            ViewItemDetails viewItemDetails) {

        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.inventoryItem = inventoryItem;
        this.schedule = schedule;
        this.viewItemDetails = viewItemDetails;

        maintenanceReport = inventoryItem.getMaintenanceHistory()
                .createNewReport(schedule.getScheduleDate());
        if (maintenanceReport == null) {
            WebOptionPane.showMessageDialog(null,
                    "Report already generated for this maintenance",
                    "Error", WebOptionPane.ERROR_MESSAGE);
            this.dispose();
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

        webLabel5 = new com.alee.laf.label.WebLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reportTxt = new com.alee.laf.text.WebTextArea();
        webLabel6 = new com.alee.laf.label.WebLabel();
        costTxt = new com.alee.laf.text.WebTextField();
        cancelBtn1 = new com.alee.laf.button.WebButton();
        createReportBtn = new com.alee.laf.button.WebButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        webLabel5.setText("Report:");
        webLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        reportTxt.setColumns(20);
        reportTxt.setRows(5);
        jScrollPane1.setViewportView(reportTxt);

        webLabel6.setText("Maintenance Cost:");
        webLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        cancelBtn1.setForeground(new java.awt.Color(0, 0, 255));
        cancelBtn1.setText("Cancel");
        cancelBtn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancelBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtn1ActionPerformed(evt);
            }
        });

        createReportBtn.setForeground(new java.awt.Color(0, 0, 255));
        createReportBtn.setText("Create");
        createReportBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        createReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createReportBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(webLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(webLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(costTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 569, Short.MAX_VALUE)
                        .addComponent(createReportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(webLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(webLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createReportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtn1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelBtn1ActionPerformed

    private void createReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createReportBtnActionPerformed

        try {

            String errors = validateForm();

            if (errors.isEmpty()) {

                maintenanceReport.setReport(reportTxt.getText().trim());
                BigDecimal bigDecimal = BigDecimal.valueOf(Double
                        .parseDouble(costTxt.getText().trim()));
                maintenanceReport.setCost(bigDecimal.setScale(2,
                        RoundingMode.CEILING));

            } else {
                WebOptionPane.showMessageDialog(null, errors, "Error",
                        WebOptionPane.ERROR_MESSAGE);
            }

            viewItemDetails.populateReports();
            CommonUtil.saveChanges(Ecosystem.getInstance());
            this.dispose();

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_createReportBtnActionPerformed

    private String validateForm() {

        String errorText = "";

        try {

            int errorCount = 1;

            String report = reportTxt.getText().trim();
            String cost = costTxt.getText().trim();

            if (report.equals("")) {
                errorText += errorCount + ". Report details are not entered\n";
                errorCount++;
            }

            if (cost.equals("")) {
                errorText += errorCount + ". Please enter the maintenance "
                        + "Cost\n";
                errorCount++;
            } else if (CommonUtil.isNAN(cost)) {
                errorText += errorCount + ". Invalid Maintenance Cost\n";
                errorCount++;
            } else if (Double.parseDouble(cost) <= 0.0) {
                errorText += errorCount + ". Invalid Maintenance Cost\n";
                errorCount++;
            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        } finally {
            return errorText;
        }

    }

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
            java.util.logging.Logger.getLogger(CreateMaintenanceReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateMaintenanceReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateMaintenanceReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateMaintenanceReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CreateMaintenanceReport dialog
                        = new CreateMaintenanceReport(new javax.swing.JFrame(),
                                true, inventoryItem, schedule, viewItemDetails);
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
    private com.alee.laf.button.WebButton cancelBtn1;
    private com.alee.laf.text.WebTextField costTxt;
    private com.alee.laf.button.WebButton createReportBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private com.alee.laf.text.WebTextArea reportTxt;
    private com.alee.laf.label.WebLabel webLabel5;
    private com.alee.laf.label.WebLabel webLabel6;
    // End of variables declaration//GEN-END:variables
}
