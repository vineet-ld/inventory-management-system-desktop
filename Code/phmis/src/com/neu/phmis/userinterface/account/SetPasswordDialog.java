/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.userinterface.account;

import com.alee.laf.optionpane.WebOptionPane;
import com.neu.phmis.business.Ecosystem;
import com.neu.phmis.business.role.SystemAdminRole;
import com.neu.phmis.business.user.Person;
import com.neu.phmis.business.util.CommonUtil;
import com.neu.phmis.business.util.EncryptionUtil;
import com.neu.phmis.userinterface.InitialSetupPanel;
import com.neu.phmis.userinterface.LoginPanel;
import com.neu.phmis.userinterface.MainFrame;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Vineet
 */
public class SetPasswordDialog extends javax.swing.JDialog {

    private Person person;
    private Ecosystem ecosystem;
    private JPanel jPanel;

    /**
     * Creates new form SetPasswordDialog
     */
    public SetPasswordDialog(java.awt.Frame parent, boolean modal,
            Person person, Ecosystem ecosystem, JPanel jPanel) {

        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);

        this.person = person;
        this.ecosystem = ecosystem;
        this.jPanel = jPanel;

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
        webLabel2 = new com.alee.laf.label.WebLabel();
        webLabel3 = new com.alee.laf.label.WebLabel();
        passwordText = new com.alee.laf.text.WebPasswordField();
        RetypePasswordText = new com.alee.laf.text.WebPasswordField();
        resetPasswordBtn = new com.alee.laf.button.WebButton();
        cancelBtn = new com.alee.laf.button.WebButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        webLabel1.setForeground(new java.awt.Color(0, 51, 255));
        webLabel1.setText("Set Password");
        webLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        webLabel2.setText("Password:");
        webLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        webLabel3.setText("Retype Password:");
        webLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        passwordText.setInputPrompt("");

        resetPasswordBtn.setForeground(new java.awt.Color(0, 0, 255));
        resetPasswordBtn.setText("Confirm");
        resetPasswordBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resetPasswordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetPasswordBtnActionPerformed(evt);
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
                .addGap(256, 256, 256)
                .addComponent(resetPasswordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, webPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(webLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(webPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(webPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(webLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(webLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(webPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RetypePasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        webPanel1Layout.setVerticalGroup(
            webPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(webPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(webLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(webPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(webLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(webPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(webPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(webLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(webPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(RetypePasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(webPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetPasswordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(webPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetPasswordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetPasswordBtnActionPerformed

        try {
            String errors = validateForm();

            if (errors.isEmpty()) {

                person.getUserAccount().setPassword(EncryptionUtil
                        .encrypt(String.valueOf(passwordText.getPassword())));
                person.getUserAccount().setStatus(1);
                this.setVisible(false);

                CommonUtil.saveChanges(ecosystem);

            } else {
                WebOptionPane.showMessageDialog(null, errors, "Errors",
                        WebOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured", "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_resetPasswordBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed

        try {

            MainFrame mainFrame = MainFrame.mainFrame;

            if (person.getUserAccount().getRole() instanceof SystemAdminRole) {

                InitialSetupPanel initialSetupPanel
                        = new InitialSetupPanel(mainFrame.getContainer(),
                                mainFrame, ecosystem);
                CommonUtil.insertNewPanel(mainFrame.getContainer(),
                        "Initial Panel", initialSetupPanel, jPanel);
                this.setVisible(false);

                initialSetupPanel.getIntroLabel().setText("An administrator "
                        + "user exists in the system, but is still not "
                        + "activated. Please use the activation code sent to "
                        + "the inbox to activate the account.");
                initialSetupPanel.getProceedBtn().setVisible(false);
                initialSetupPanel.getActivationCodeText().setVisible(true);
                initialSetupPanel.getActivateBtn().setVisible(true);

            } else {

                LoginPanel loginPanel = new LoginPanel(mainFrame.getContainer(),
                        ecosystem);
                CommonUtil.insertNewPanel(mainFrame.getContainer(),
                        "Initial Panel", loginPanel, jPanel);
                this.setVisible(false);

            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured", "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }

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

            String password = String.valueOf(passwordText.getPassword()).trim();
            String reTypePass = String.valueOf(RetypePasswordText.getPassword())
                    .trim();

            if (password.isEmpty()) {
                errorText += errorCount + ". Please enter the Password\n";
                errorCount++;
            } else if (password.length() < 5 || password.length() > 15) {
                errorText += errorCount + ". Password should be between 5 to "
                        + "15 characters long\n";
                errorCount++;
            }

            if (reTypePass.isEmpty()) {
                errorText += errorCount + ". Please retype the Password\n";
                errorCount++;
            } else if (!password.equals(reTypePass)) {
                errorText += errorCount + ". Password does not match in both "
                        + "fields\n";
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
            java.util.logging.Logger.getLogger(SetPasswordDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetPasswordDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetPasswordDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetPasswordDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SetPasswordDialog dialog
                        = new SetPasswordDialog(new javax.swing.JFrame(),
                                true, person, ecosystem, jPanel);
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
    private com.alee.laf.text.WebPasswordField RetypePasswordText;
    private com.alee.laf.button.WebButton cancelBtn;
    private com.alee.laf.text.WebPasswordField passwordText;
    private com.alee.laf.button.WebButton resetPasswordBtn;
    private com.alee.laf.label.WebLabel webLabel1;
    private com.alee.laf.label.WebLabel webLabel2;
    private com.alee.laf.label.WebLabel webLabel3;
    private com.alee.laf.panel.WebPanel webPanel1;
    // End of variables declaration//GEN-END:variables
}