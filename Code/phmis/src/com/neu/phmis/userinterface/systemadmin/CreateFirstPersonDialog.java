/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.userinterface.systemadmin;

import com.alee.laf.optionpane.WebOptionPane;
import com.neu.phmis.business.Ecosystem;
import com.neu.phmis.business.role.SystemAdminRole;
import com.neu.phmis.business.user.Address;
import com.neu.phmis.business.user.Person;
import com.neu.phmis.business.user.UserAccount;
import com.neu.phmis.business.util.CommonUtil;
import com.neu.phmis.business.util.Constants;
import com.neu.phmis.business.util.EncryptionUtil;
import com.neu.phmis.business.util.MailUtil;
import com.neu.phmis.userinterface.InitialSetupPanel;

/**
 *
 * @author Vineet
 */
public class CreateFirstPersonDialog extends javax.swing.JDialog {

    private InitialSetupPanel initialSetupPanel;
    private Ecosystem ecosystem;

    /**
     * Creates new form CreatePersonDialog
     */
    public CreateFirstPersonDialog(java.awt.Frame parent, boolean modal,
            InitialSetupPanel initialSetupPanel, Ecosystem ecosystem) {

        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.initialSetupPanel = initialSetupPanel;
        this.ecosystem = ecosystem;

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
        webLabel2 = new com.alee.laf.label.WebLabel();
        firstNameText = new com.alee.laf.text.WebTextField();
        lastNameText = new com.alee.laf.text.WebTextField();
        webLabel4 = new com.alee.laf.label.WebLabel();
        emailText = new com.alee.laf.text.WebTextField();
        webLabel5 = new com.alee.laf.label.WebLabel();
        userNameText = new com.alee.laf.text.WebTextField();
        webLabel6 = new com.alee.laf.label.WebLabel();
        createPersonBtn = new com.alee.laf.button.WebButton();
        cancelBtn = new com.alee.laf.button.WebButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        webLabel1.setForeground(new java.awt.Color(0, 51, 255));
        webLabel1.setText("Add Person");
        webLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        webLabel2.setText("First Name:");
        webLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        webLabel4.setText("Last Name:");
        webLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        webLabel5.setText("Email ID:");
        webLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        webLabel6.setText("Username:");
        webLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(webLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(webLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(webLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(webLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(createPersonBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(webLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(webLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(webLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(webLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(webLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(webLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createPersonBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createPersonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPersonBtnActionPerformed

        try {
            String errors = validateForm();

            if (errors.isEmpty()) {

                Person person = ecosystem.getPersonDirectory().addPerson();
                person.setFirstName(firstNameText.getText().trim());
                person.setLastName(lastNameText.getText().trim());
                person.setEmailId(emailText.getText().trim());

                UserAccount userAccount = person.getUserAccount();
                userAccount.setUserName(userNameText.getText().trim());
                userAccount.setPassword(EncryptionUtil.encrypt(userNameText
                        .getText().trim()));
                userAccount.setRole(new SystemAdminRole());

                Address address = new Address(Address.CURRENT_ADDRESS);
                address.setStreet(Constants.ADDRESS_STREET);
                address.setApartment(Constants.ADDRESS_APARTMENT);
                address.setCity(Constants.ADDRESS_CITY);
                address.setState(Constants.ADDRESS_STATE);
                address.setZipCode(Constants.ADDRESS_ZIP);
                person.setCurrentAddress(address);

                person.setPermanentAddress(address);
                person.getPermanentAddress()
                        .setAddressType(Address.PERMANENT_ADDRESS);

                person.setWorkAddress(address);
                person.getWorkAddress().setAddressType(Address.WORK_ADDRESS);

                person.setPersonalPhone(Constants.CONTACT_PHONE);
                person.setWorkPhone(Constants.CONTACT_PHONE);
                

                ecosystem.getMasterPersonDirectory().getPersonList()
                        .add(person);

                this.setVisible(false);

                initialSetupPanel.getIntroLabel().setText("An email has been "
                        + "sent to you which contains an activation code. "
                        + "Please enter that code below to activate the "
                        + "account");
                initialSetupPanel.getProceedBtn().setVisible(false);

                initialSetupPanel.getActivationCodeText().setVisible(true);
                initialSetupPanel.getActivateBtn().setVisible(true);

                MailUtil mailUtil = new MailUtil(person.getEmailId());

                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("System Administrator account has been"
                        + " created. Please use the following code to activate"
                        + " the account.\n").append("ACTIVATION CODE : ")
                        .append(person.getUserAccount().getPassword());
                mailUtil.setEmailBody(stringBuffer.toString());
                mailUtil.setEmailSubject("Activation Code");
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
            java.util.logging.Logger.getLogger(CreateFirstPersonDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateFirstPersonDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateFirstPersonDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateFirstPersonDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CreateFirstPersonDialog dialog
                        = new CreateFirstPersonDialog(new javax.swing.JFrame(),
                                true, initialSetupPanel, ecosystem);
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
    private com.alee.laf.text.WebTextField userNameText;
    private com.alee.laf.label.WebLabel webLabel1;
    private com.alee.laf.label.WebLabel webLabel2;
    private com.alee.laf.label.WebLabel webLabel4;
    private com.alee.laf.label.WebLabel webLabel5;
    private com.alee.laf.label.WebLabel webLabel6;
    // End of variables declaration//GEN-END:variables
}
