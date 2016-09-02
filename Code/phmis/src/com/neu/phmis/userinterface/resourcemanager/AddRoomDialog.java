/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.userinterface.resourcemanager;

import com.alee.laf.optionpane.WebOptionPane;
import com.neu.phmis.business.Ecosystem;
import com.neu.phmis.business.organization.ResourceOrganization;
import com.neu.phmis.business.resource.Resource;
import com.neu.phmis.business.resource.Room;
import com.neu.phmis.business.util.CommonUtil;

/**
 *
 * @author Vineet
 */
public class AddRoomDialog extends javax.swing.JDialog {

    private Ecosystem ecosystem;
    private ResourceOrganization resourceOrganization;
    private ManageResourcesPanel manageResourcesPanel;

    /**
     * Creates new form AddRoomDialog
     */
    public AddRoomDialog(java.awt.Frame parent, boolean modal,
            ResourceOrganization resourceOrganization,
            ManageResourcesPanel manageResourcesPanel) {
        super(parent, modal);
        initComponents();
        ecosystem = Ecosystem.getInstance();
        this.resourceOrganization = resourceOrganization;
        this.manageResourcesPanel = manageResourcesPanel;
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        webPanel1 = new com.alee.laf.panel.WebPanel();
        webLabel1 = new com.alee.laf.label.WebLabel();
        webLabel5 = new com.alee.laf.label.WebLabel();
        roomNoTxt = new com.alee.laf.text.WebTextField();
        webLabel6 = new com.alee.laf.label.WebLabel();
        locationTxt = new com.alee.laf.text.WebTextField();
        addRoomBtn = new com.alee.laf.button.WebButton();
        cancelBtn = new com.alee.laf.button.WebButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        webLabel1.setForeground(new java.awt.Color(0, 51, 255));
        webLabel1.setText("Add Room");
        webLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        webLabel5.setText("Room No:");
        webLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        webLabel6.setText("Location:");
        webLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        addRoomBtn.setForeground(new java.awt.Color(0, 0, 255));
        addRoomBtn.setText("Add");
        addRoomBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoomBtnActionPerformed(evt);
            }
        });

        cancelBtn.setForeground(new java.awt.Color(0, 0, 255));
        cancelBtn.setText("Cancel");
        cancelBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout webPanel1Layout = new javax.swing.GroupLayout(webPanel1);
        webPanel1.setLayout(webPanel1Layout);
        webPanel1Layout.setHorizontalGroup(
            webPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, webPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(webLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(webPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(webPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(webPanel1Layout.createSequentialGroup()
                        .addComponent(addRoomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(webPanel1Layout.createSequentialGroup()
                        .addGroup(webPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(webLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(webLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(webPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(locationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roomNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        webPanel1Layout.setVerticalGroup(
            webPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(webPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(webLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(webPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(webLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(webPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(webLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(webPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addRoomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        getContentPane().add(webPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoomBtnActionPerformed

        try {
            String errors = validateForm();

            if (errors.isEmpty()) {

                Room room = (Room) resourceOrganization.getResourceDirectory()
                        .addResource(Resource.ROOM);
                room.setRoomNo(roomNoTxt.getText().trim());
                room.setLocation(locationTxt.getText().trim());

                manageResourcesPanel.populateTables();
                this.setVisible(false);
                CommonUtil.saveChanges(ecosystem);

            } else {
                WebOptionPane.showMessageDialog(null, errors, "Errors",
                        WebOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addRoomBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelBtnActionPerformed

    /* ---------------------------------------------------------------------- */
    /* Validates form
    
     Parameters: NONE
    
     Returns:
     1. errorText - STRING errors if there are any
     2. errorText - STRING blank if there are no errors
     */
    private String validateForm() {

        String errorText = "";

        try {

            int errorCount = 1;

            String roomNo = roomNoTxt.getText().trim();
            String location = locationTxt.getText().trim();

            if (roomNo.equals("")) {
                errorText += errorCount + ". Please enter the Room Number\n";
                errorCount++;
            }

            if (location.equals("")) {
                errorText += errorCount + ". Please enter the Room Location\n";
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
            java.util.logging.Logger.getLogger(AddRoomDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRoomDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRoomDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRoomDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddRoomDialog dialog
                        = new AddRoomDialog(new javax.swing.JFrame(), true,
                                resourceOrganization, manageResourcesPanel);
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
    private com.alee.laf.button.WebButton addRoomBtn;
    private com.alee.laf.button.WebButton cancelBtn;
    private com.alee.laf.text.WebTextField locationTxt;
    private com.alee.laf.text.WebTextField roomNoTxt;
    private com.alee.laf.label.WebLabel webLabel1;
    private com.alee.laf.label.WebLabel webLabel5;
    private com.alee.laf.label.WebLabel webLabel6;
    private com.alee.laf.panel.WebPanel webPanel1;
    // End of variables declaration//GEN-END:variables
}
