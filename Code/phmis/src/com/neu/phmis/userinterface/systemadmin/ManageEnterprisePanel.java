/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.userinterface.systemadmin;

import com.alee.laf.optionpane.WebOptionPane;
import com.neu.phmis.business.Ecosystem;
import com.neu.phmis.business.enterprise.Enterprise;
import com.neu.phmis.business.network.Network;
import com.neu.phmis.userinterface.MainFrame;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vineet
 */
public class ManageEnterprisePanel extends javax.swing.JPanel {

    private Ecosystem ecosystem;

    /**
     * Creates new form ManageEnterprisePanel
     */
    public ManageEnterprisePanel() {

        initComponents();

        ecosystem = Ecosystem.getInstance();

        populateTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        webPanel2 = new com.alee.laf.panel.WebPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseTbl = new com.alee.laf.table.WebTable();
        addEnterpriseBtn = new com.alee.laf.button.WebButton();

        setLayout(new java.awt.BorderLayout());

        enterpriseTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise ID", "Name", "Type", "Network"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        enterpriseTbl.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(enterpriseTbl);

        addEnterpriseBtn.setForeground(new java.awt.Color(0, 0, 255));
        addEnterpriseBtn.setText("Add New");
        addEnterpriseBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addEnterpriseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEnterpriseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout webPanel2Layout = new javax.swing.GroupLayout(webPanel2);
        webPanel2.setLayout(webPanel2Layout);
        webPanel2Layout.setHorizontalGroup(
            webPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(webPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(webPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addEnterpriseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        webPanel2Layout.setVerticalGroup(
            webPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(webPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addEnterpriseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        add(webPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void addEnterpriseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEnterpriseBtnActionPerformed

        try {

            CreateEnterpriseDialog createEnterpriseDialog
                    = new CreateEnterpriseDialog(MainFrame.mainFrame, true,
                            ecosystem, this);
            createEnterpriseDialog.setVisible(true);

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addEnterpriseBtnActionPerformed

    /* ---------------------------------------------------------------------- */
    /*
     Populates the table with enterprise details
    
     Parameters: NONE
    
     Returns: NONE
     */
    public void populateTable() {

        try {

            ArrayList<Network> networkList = ecosystem.getNetworkDirectory()
                    .getNetworkList();
            DefaultTableModel defaultTableModel
                    = (DefaultTableModel) enterpriseTbl.getModel();
            defaultTableModel.setRowCount(0);

            Object row[];
            for (Network network : networkList) {
                for (Enterprise enterprise : network
                        .getHospitalEnterpriseDirectory().getEnterpriseList()) {

                    row = new Object[4];
                    row[0] = enterprise.getEnterpriseId();
                    row[1] = enterprise;
                    row[2] = enterprise.getEnterpriseType();
                    row[3] = network;
                    defaultTableModel.addRow(row);

                }
                for (Enterprise enterprise : network
                        .getWarehouseEnterpriseDirectory()
                        .getEnterpriseList()) {

                    row = new Object[4];
                    row[0] = enterprise.getEnterpriseId();
                    row[1] = enterprise;
                    row[2] = enterprise.getEnterpriseType();
                    row[3] = network;
                    defaultTableModel.addRow(row);

                }
                for (Enterprise enterprise : network
                        .getSupplierEnterpriseDirectory().getEnterpriseList()) {

                    row = new Object[4];
                    row[0] = enterprise.getEnterpriseId();
                    row[1] = enterprise;
                    row[2] = enterprise.getEnterpriseType();
                    row[3] = network;
                    defaultTableModel.addRow(row);

                }
            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.alee.laf.button.WebButton addEnterpriseBtn;
    private com.alee.laf.table.WebTable enterpriseTbl;
    private javax.swing.JScrollPane jScrollPane1;
    private com.alee.laf.panel.WebPanel webPanel2;
    // End of variables declaration//GEN-END:variables
}