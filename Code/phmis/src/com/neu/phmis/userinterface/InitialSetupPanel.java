/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.userinterface;

import com.alee.extended.label.WebMultiLineLabel;
import com.alee.laf.button.WebButton;
import com.alee.laf.optionpane.WebOptionPane;
import com.alee.laf.text.WebTextField;
import com.neu.phmis.business.Ecosystem;
import com.neu.phmis.business.user.Person;
import com.neu.phmis.business.util.CommonUtil;
import com.neu.phmis.userinterface.account.SetPasswordDialog;
import com.neu.phmis.userinterface.systemadmin.CreateFirstPersonDialog;
import com.neu.phmis.userinterface.systemadmin.SystemAdminDashboardPanel;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Vineet
 */
public class InitialSetupPanel extends javax.swing.JPanel {

    private JPanel container;
    private JFrame mainFrame;
    private Ecosystem ecosystem;

    /**
     * Creates new form InitialSetupPnl
     */
    public InitialSetupPanel(JPanel container, JFrame mainFrame, Ecosystem ecosystem) {

        initComponents();

        this.container = container;
        this.mainFrame = mainFrame;
        this.ecosystem = ecosystem;

        activationCodeText.setVisible(false);
        activateBtn.setVisible(false);

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
        introLabel = new com.alee.extended.label.WebMultiLineLabel();
        proceedBtn = new com.alee.laf.button.WebButton();
        activationCodeText = new com.alee.laf.text.WebTextField();
        activateBtn = new com.alee.laf.button.WebButton();

        introLabel.setForeground(new java.awt.Color(0, 0, 255));
        introLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        introLabel.setText("Welcome !! The system requires you to setup an ADMINISTRATOR account in order proceed further. Please keep in mind that this user will be the master user who cannot be deleted later unless the application is uninstalled.");
        introLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        proceedBtn.setForeground(new java.awt.Color(0, 0, 255));
        proceedBtn.setText("Proceed >>");
        proceedBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        proceedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedBtnActionPerformed(evt);
            }
        });

        activationCodeText.setInputPrompt("Enter Activation Code");
        activationCodeText.setInputPromptPosition(0);

        activateBtn.setForeground(new java.awt.Color(0, 0, 255));
        activateBtn.setText("Activate");
        activateBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        activateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(introLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proceedBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(activationCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(activateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(introLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(proceedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(activationCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(activateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(369, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void proceedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedBtnActionPerformed

        try {

            CreateFirstPersonDialog createFirstPersonDialog
                    = new CreateFirstPersonDialog(mainFrame, true, this, ecosystem);
            createFirstPersonDialog.setVisible(true);

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured", "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_proceedBtnActionPerformed

    private void activateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activateBtnActionPerformed

        try {
            if (!activationCodeText.getText().trim().isEmpty()) {

                Person person = ecosystem.getMasterPersonDirectory().getPersonList()
                        .get(0);

                if (person.getUserAccount().getPassword().equals(activationCodeText
                        .getText().trim())) {

                    SystemAdminDashboardPanel systemAdminDashboardPanel
                            = new SystemAdminDashboardPanel(person);
                    CommonUtil.insertNewPanel(container, "System Admin Panel",
                            systemAdminDashboardPanel, this);

                    SetPasswordDialog setPasswordDialog
                            = new SetPasswordDialog(mainFrame, true, person,
                                    ecosystem, this);
                    setPasswordDialog.setVisible(true);

                } else {
                    WebOptionPane.showMessageDialog(null, "Activation code is "
                            + "invalid", "Warning", WebOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured", "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_activateBtnActionPerformed

    public WebButton getActivateBtn() {
        return activateBtn;
    }

    public WebTextField getActivationCodeText() {
        return activationCodeText;
    }

    public WebMultiLineLabel getIntroLabel() {
        return introLabel;
    }

    public WebButton getProceedBtn() {
        return proceedBtn;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.alee.laf.button.WebButton activateBtn;
    private com.alee.laf.text.WebTextField activationCodeText;
    private com.alee.extended.label.WebMultiLineLabel introLabel;
    private com.alee.laf.button.WebButton proceedBtn;
    private com.alee.laf.panel.WebPanel webPanel1;
    // End of variables declaration//GEN-END:variables
}