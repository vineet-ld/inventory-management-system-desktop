/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.userinterface.inventorymanager;

import com.alee.laf.optionpane.WebOptionPane;
import com.neu.phmis.business.Ecosystem;
import com.neu.phmis.business.enterprise.WarehouseEnterprise;
import com.neu.phmis.business.request.DeviceRequest;
import com.neu.phmis.business.user.InventoryManager;
import com.neu.phmis.business.user.Person;
import com.neu.phmis.business.util.CommonUtil;
import com.neu.phmis.business.util.MailUtil;
import com.neu.phmis.userinterface.MainFrame;
import java.util.Date;
import javax.swing.JPanel;

/**
 *
 * @author Vineet
 */
public class ProcessRequestDialog extends javax.swing.JDialog {

    private Ecosystem ecosystem;
    private DeviceRequest deviceRequest;
    private InventoryManager inventoryManager;
    private JPanel container;
    private WarehouseEnterprise warehouseEnterprise;
    private ViewDeviceRequestPanel viewDeviceRequestPanel;

    /**
     * Creates new form ProcessRequestDialog
     */
    public ProcessRequestDialog(java.awt.Frame parent, boolean modal,
            DeviceRequest deviceRequest, InventoryManager inventoryManager,
            JPanel container, WarehouseEnterprise warehouseEnterprise,
            ViewDeviceRequestPanel viewDeviceRequestPanel) {

        super(parent, modal);
        initComponents();

        ecosystem = Ecosystem.getInstance();
        this.deviceRequest = deviceRequest;
        this.inventoryManager = inventoryManager;
        this.container = container;
        this.warehouseEnterprise = warehouseEnterprise;
        this.viewDeviceRequestPanel = viewDeviceRequestPanel;

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

        buttonGroup1 = new javax.swing.ButtonGroup();
        approveRadio = new com.alee.laf.radiobutton.WebRadioButton();
        disapproveRadio = new com.alee.laf.radiobutton.WebRadioButton();
        holdRadio = new com.alee.laf.radiobutton.WebRadioButton();
        doneBtn = new com.alee.laf.button.WebButton();
        cancelBtn = new com.alee.laf.button.WebButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        commentsTxt = new com.alee.laf.text.WebTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonGroup1.add(approveRadio);
        approveRadio.setSelected(true);
        approveRadio.setText("Approve");
        approveRadio.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        buttonGroup1.add(disapproveRadio);
        disapproveRadio.setText("Disapprove");
        disapproveRadio.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        buttonGroup1.add(holdRadio);
        holdRadio.setText("Hold");
        holdRadio.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        doneBtn.setForeground(new java.awt.Color(0, 0, 255));
        doneBtn.setText("Done");
        doneBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        doneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneBtnActionPerformed(evt);
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

        commentsTxt.setColumns(20);
        commentsTxt.setRows(5);
        commentsTxt.setInputPrompt("Add Comments (Optional)");
        jScrollPane1.setViewportView(commentsTxt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(approveRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(disapproveRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(holdRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(doneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(approveRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(disapproveRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(holdRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneBtnActionPerformed

        try {

            if (WebOptionPane.showConfirmDialog(null, "Are you sure you want "
                    + "to process the request?", "Please confirm",
                    WebOptionPane.OK_CANCEL_OPTION)
                    == WebOptionPane.OK_OPTION) {

                if (!commentsTxt.getText().trim().isEmpty()) {
                    deviceRequest.setProcessComment(commentsTxt.getText()
                            .trim());
                }
                deviceRequest.setProcessedBy(inventoryManager);
                deviceRequest.setProcessedOn(new Date());

                if (approveRadio.isSelected()) {

                    this.dispose();                    

                    CreateOrderDialog createOrderDialog
                            = new CreateOrderDialog(MainFrame.mainFrame, true,
                                    deviceRequest, warehouseEnterprise,
                                    inventoryManager, container);
                    createOrderDialog.setVisible(true);

                } else if (disapproveRadio.isSelected()) {

                    deviceRequest.setStatus(DeviceRequest.STATUS_DISAPPROVED);
                    CommonUtil.saveChanges(ecosystem);
                    this.dispose();

                    Person person = deviceRequest.getSentBy();
                    MailUtil mailUtil = new MailUtil(person.getEmailId());
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(person).append(",\n Your order request "
                            + "with Request ID ").append(deviceRequest)
                            .append(" has been disapproved. No new orders will "
                                    + "be generated at this time. Please "
                                    + "contact ").append(warehouseEnterprise)
                            .append(" for more details.");
                    mailUtil.setEmailBody(stringBuffer.toString());
                    mailUtil.setEmailSubject("Device Request Status Update");
                    mailUtil.sendEmail();

                    ManageInventoryRequestsPanel manageInventoryRequestsPanel
                            = new ManageInventoryRequestsPanel(
                                    warehouseEnterprise, inventoryManager,
                                    container);
                    CommonUtil.insertNewPanel(container, "Manage Request Panel",
                            manageInventoryRequestsPanel,
                            viewDeviceRequestPanel);

                } else if (holdRadio.isSelected()) {

                    deviceRequest.setStatus(DeviceRequest.STATUS_HOLD);
                    CommonUtil.saveChanges(ecosystem);
                    this.dispose();

                    Person person = deviceRequest.getSentBy();
                    MailUtil mailUtil = new MailUtil(person.getEmailId());
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(person).append(",\n Your order request "
                            + "with Request ID ").append(deviceRequest)
                            .append(" has been put on hold. You will be "
                                    + "notified when further action is taken. "
                                    + "Please contact ")
                            .append(warehouseEnterprise)
                            .append(" for more details.");
                    mailUtil.setEmailBody(stringBuffer.toString());
                    mailUtil.setEmailSubject("Device Request Status Update");
                    mailUtil.sendEmail();

                    ManageInventoryRequestsPanel manageInventoryRequestsPanel
                            = new ManageInventoryRequestsPanel(
                                    warehouseEnterprise, inventoryManager,
                                    container);
                    CommonUtil.insertNewPanel(container, "Manage Request Panel",
                            manageInventoryRequestsPanel,
                            viewDeviceRequestPanel);

                }

            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_doneBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ProcessRequestDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProcessRequestDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProcessRequestDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProcessRequestDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProcessRequestDialog dialog
                        = new ProcessRequestDialog(new javax.swing.JFrame(),
                                true, deviceRequest, inventoryManager,
                                container, warehouseEnterprise,
                                viewDeviceRequestPanel);
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
    private com.alee.laf.radiobutton.WebRadioButton approveRadio;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.alee.laf.button.WebButton cancelBtn;
    private com.alee.laf.text.WebTextArea commentsTxt;
    private com.alee.laf.radiobutton.WebRadioButton disapproveRadio;
    private com.alee.laf.button.WebButton doneBtn;
    private com.alee.laf.radiobutton.WebRadioButton holdRadio;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
