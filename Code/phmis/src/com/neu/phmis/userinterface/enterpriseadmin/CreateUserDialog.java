/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.userinterface.enterpriseadmin;

import com.alee.laf.optionpane.WebOptionPane;
import com.neu.phmis.business.Ecosystem;
import com.neu.phmis.business.enterprise.Enterprise;
import com.neu.phmis.business.organization.Organization;
import com.neu.phmis.business.role.Role;
import com.neu.phmis.business.user.Person;
import com.neu.phmis.business.user.UserAccount;
import com.neu.phmis.business.util.CommonUtil;
import com.neu.phmis.business.util.Constants;
import com.neu.phmis.business.util.EncryptionUtil;
import com.neu.phmis.business.util.MailUtil;
import com.neu.phmis.userinterface.enterpriseadmin.ManageUsersPanel;

/**
 *
 * @author Vineet
 */
public class CreateUserDialog extends javax.swing.JDialog {

    private Enterprise enterprise;
    private Ecosystem ecosystem;
    private ManageUsersPanel manageUsersPanel;

    /**
     * Creates new form CreateUserDialog
     */
    public CreateUserDialog(java.awt.Frame parent, boolean modal,
            Enterprise enterprise, ManageUsersPanel manageUsersPanel) {

        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);

        this.enterprise = enterprise;
        this.manageUsersPanel = manageUsersPanel;
        ecosystem = Ecosystem.getInstance();

        organizationCombo.removeAllItems();
        for (Organization organization : enterprise.getOrganizationDirectory()
                .getOrganizationList()) {
            organizationCombo.addItem(organization);
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

        webLabel2 = new com.alee.laf.label.WebLabel();
        firstNameText = new com.alee.laf.text.WebTextField();
        webLabel1 = new com.alee.laf.label.WebLabel();
        createPersonBtn = new com.alee.laf.button.WebButton();
        cancelBtn = new com.alee.laf.button.WebButton();
        lastNameText = new com.alee.laf.text.WebTextField();
        webLabel3 = new com.alee.laf.label.WebLabel();
        emailText = new com.alee.laf.text.WebTextField();
        webLabel9 = new com.alee.laf.label.WebLabel();
        userNameText = new com.alee.laf.text.WebTextField();
        webLabel10 = new com.alee.laf.label.WebLabel();
        webLabel11 = new com.alee.laf.label.WebLabel();
        webLabel12 = new com.alee.laf.label.WebLabel();
        organizationCombo = new com.alee.laf.combobox.WebComboBox();
        roleCombo = new com.alee.laf.combobox.WebComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        webLabel2.setText("First Name:");
        webLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        webLabel1.setForeground(new java.awt.Color(0, 51, 255));
        webLabel1.setText("Add Person");
        webLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        createPersonBtn.setForeground(new java.awt.Color(0, 0, 255));
        createPersonBtn.setText("Create");
        createPersonBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        createPersonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPersonBtnActionPerformed(evt);
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

        webLabel3.setText("Last Name:");
        webLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        webLabel9.setText("Email ID:");
        webLabel9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        webLabel10.setText("User Name:");
        webLabel10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        webLabel11.setText("Organizaton:");
        webLabel11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        webLabel12.setText("Role:");
        webLabel12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        organizationCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(webLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(createPersonBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(webLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(webLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(webLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(webLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(webLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(roleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(webLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(organizationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(webLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(webLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(webLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(webLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(webLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(webLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(organizationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(roleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createPersonBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(webLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createPersonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPersonBtnActionPerformed

        try {
            String errors = validateForm();

            if (errors.isEmpty()) {

                Role role = (Role) roleCombo.getSelectedItem();
                Organization organization = (Organization) organizationCombo
                        .getSelectedItem();

                Person person = organization.getPersonDirectory()
                        .addPerson(role.getPersonType());
                person.setFirstName(firstNameText.getText().trim());
                person.setLastName(lastNameText.getText().trim());
                person.setEmailId(emailText.getText().trim());
                person.setOrganization(organization);
                person.setEnterprise(enterprise);

                UserAccount userAccount = person.getUserAccount();
                userAccount.setUserName(userNameText.getText().trim());
                userAccount.setPassword(EncryptionUtil.encrypt(userNameText
                        .getText().trim()));
                userAccount.setRole(role);

                ecosystem.getMasterPersonDirectory().getPersonList()
                        .add(person);

                this.setVisible(false);
                manageUsersPanel.populateTable();

                MailUtil mailUtil = new MailUtil(person.getEmailId());

                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Hi ").append(person).append(", you have "
                        + "been successfully registered in the PHMIS. The "
                        + "access credentials for accessing your account are "
                        + "as follows:\n").append("Username - ")
                        .append(userAccount.getUserName())
                        .append("\nPassword - ")
                        .append(userAccount.getPassword())
                        .append("\n\nPlease note that this is a temporary "
                                + "password and you will have to reset the "
                                + "password once you sign in with this "
                                + "credentials.");
                mailUtil.setEmailBody(stringBuffer.toString());
                mailUtil.setEmailSubject("Registration Status");
                mailUtil.sendEmail();

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
    }//GEN-LAST:event_createPersonBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void organizationComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationComboActionPerformed

        if (organizationCombo.getSelectedItem() != null) {

            roleCombo.removeAllItems();
            Organization organization = (Organization) organizationCombo
                    .getSelectedItem();
            roleCombo.addItem(organization.getSupportedRoles());

        }

    }//GEN-LAST:event_organizationComboActionPerformed

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

            String firstName = firstNameText.getText().trim();
            String lastName = lastNameText.getText().trim();
            String email = emailText.getText().trim();
            String userName = userNameText.getText().trim();

            if (firstName.equals("")) {
                errorText += errorCount + ". Please enter the First Name\n";
                errorCount++;
            }

            if (lastName.equals("")) {
                errorText += errorCount + ". Please enter the Last Name\n";
                errorCount++;
            }

            if (email.equals("")) {
                errorText += errorCount + ". Please enter the email ID\n";
                errorCount++;
            } else if (!CommonUtil.isEmailValid(email)) {
                errorText += errorCount + ". Invalid email ID\n";
                errorCount++;
            } else if (CommonUtil.exists(email, Constants.EXISTS_EMAIL,
                    ecosystem.getMasterPersonDirectory())) {
                errorText += errorCount + ". A user is already registered with "
                        + "this email ID\n";
                errorCount++;
            }

            if (userName.equals("")) {
                errorText += errorCount + ". Please enter the username\n";
                errorCount++;
            } else if (!CommonUtil.isUsernameValid(userName)) {
                errorText += errorCount + ". Invalid username. Make sure your "
                        + "username has 5-15 characters and only contain _, - "
                        + "or . as special characters\n";
                errorCount++;
            } else if (CommonUtil.exists(userName, Constants.EXISTS_USERNAME,
                    ecosystem.getMasterPersonDirectory())) {
                errorText += errorCount + ". username is already used.";
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
            java.util.logging.Logger.getLogger(CreateUserDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateUserDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateUserDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateUserDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CreateUserDialog dialog
                        = new CreateUserDialog(new javax.swing.JFrame(),
                                true, enterprise, manageUsersPanel);
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
    private com.alee.laf.button.WebButton cancelBtn;
    private com.alee.laf.button.WebButton createPersonBtn;
    private com.alee.laf.text.WebTextField emailText;
    private com.alee.laf.text.WebTextField firstNameText;
    private com.alee.laf.text.WebTextField lastNameText;
    private com.alee.laf.combobox.WebComboBox organizationCombo;
    private com.alee.laf.combobox.WebComboBox roleCombo;
    private com.alee.laf.text.WebTextField userNameText;
    private com.alee.laf.label.WebLabel webLabel1;
    private com.alee.laf.label.WebLabel webLabel10;
    private com.alee.laf.label.WebLabel webLabel11;
    private com.alee.laf.label.WebLabel webLabel12;
    private com.alee.laf.label.WebLabel webLabel2;
    private com.alee.laf.label.WebLabel webLabel3;
    private com.alee.laf.label.WebLabel webLabel9;
    // End of variables declaration//GEN-END:variables
}