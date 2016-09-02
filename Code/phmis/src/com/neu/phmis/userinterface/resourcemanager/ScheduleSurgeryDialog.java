/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.userinterface.resourcemanager;

import com.neu.phmis.business.request.SurgeryRequest;
import com.neu.phmis.business.user.ResourceManager;
import com.neu.phmis.business.util.CommonUtil;

/**
 *
 * @author Vineet
 */
public class ScheduleSurgeryDialog extends javax.swing.JDialog {

    private SurgeryRequest surgeryRequest;
    private ResourceManager resourceManager;

    /**
     * Creates new form ScheduleSurgeryDialog
     */
    public ScheduleSurgeryDialog(java.awt.Frame parent, boolean modal,
            SurgeryRequest surgeryRequest, ResourceManager resourceManager) {

        super(parent, modal);
        initComponents();

        this.setSize(1000, 750);
        this.setLocationRelativeTo(null);

        this.surgeryRequest = surgeryRequest;
        this.resourceManager = resourceManager;

        SelectDevicesPanel selectDevicesPanel
                = new SelectDevicesPanel(surgeryRequest, resourceManager, this,
                        surgeryContainer);
        CommonUtil.insertNewPanel(surgeryContainer, "Select Devices Panel",
                selectDevicesPanel, null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        surgeryContainer = new com.alee.laf.panel.WebPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        surgeryContainer.setMinimumSize(new java.awt.Dimension(1000, 1000));
        surgeryContainer.setName(""); // NOI18N
        surgeryContainer.setLayout(new java.awt.CardLayout());
        getContentPane().add(surgeryContainer, java.awt.BorderLayout.CENTER);

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
            java.util.logging.Logger.getLogger(ScheduleSurgeryDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScheduleSurgeryDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScheduleSurgeryDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScheduleSurgeryDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ScheduleSurgeryDialog dialog
                        = new ScheduleSurgeryDialog(new javax.swing.JFrame(),
                                true, surgeryRequest, resourceManager);
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
    private com.alee.laf.panel.WebPanel surgeryContainer;
    // End of variables declaration//GEN-END:variables
}