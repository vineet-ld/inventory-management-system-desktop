/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.userinterface.systemadmin;

import com.alee.laf.label.WebLabel;
import com.alee.laf.optionpane.WebOptionPane;
import com.alee.laf.table.WebTable;
import com.neu.phmis.business.Ecosystem;
import com.neu.phmis.business.config.DB4OConfig;
import com.neu.phmis.business.network.Network;
import com.neu.phmis.business.util.CommonUtil;
import com.neu.phmis.business.util.Constants;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vineet
 */
public class ManageNetworkPanel extends javax.swing.JPanel {

    private Ecosystem ecosystem;

    /**
     * Creates new form ManageNetworkPanel
     */
    public ManageNetworkPanel(Ecosystem ecosystem) {

        initComponents();

        this.ecosystem = ecosystem;

        populateTable();

        for (String county : Constants.county) {
            countyCombo.addItem(county);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        networkTbl = new com.alee.laf.table.WebTable();
        addNetworkBtn = new com.alee.laf.button.WebButton();
        countyCombo = new com.alee.laf.combobox.WebComboBox();

        networkTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Network ID", "County"
            }
        ));
        networkTbl.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(networkTbl);

        addNetworkBtn.setForeground(new java.awt.Color(0, 0, 255));
        addNetworkBtn.setText("Add New");
        addNetworkBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addNetworkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNetworkBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(countyCombo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addNetworkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addNetworkBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(countyCombo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(142, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addNetworkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNetworkBtnActionPerformed

        try {

            Network network = ecosystem.getNetworkDirectory()
                    .addNetwork((String) countyCombo.getSelectedItem());

            if (network != null) {

                populateTable();
                CommonUtil.saveChanges(ecosystem);

            } else {
                WebOptionPane.showMessageDialog(null,
                        "Network already exists. Cannot create multiple "
                        + "networks for a single county", "Error",
                        WebOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addNetworkBtnActionPerformed

    /* ---------------------------------------------------------------------- */
    /*
     Populate networks in the table
    
     Parameters: NONE
    
     Returns: NONE
     */
    public void populateTable() {

        try {

            ArrayList<Network> networkList = ecosystem.getNetworkDirectory()
                    .getNetworkList();
            DefaultTableModel defaultTableModel = (DefaultTableModel) networkTbl
                    .getModel();
            defaultTableModel.setRowCount(0);

            Object row[];
            for (Network network : networkList) {

                row = new Object[2];
                row[0] = network.getNetworkId();
                row[1] = network;
                defaultTableModel.addRow(row);

            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }

    }

    public WebTable getNetworkTbl() {
        return networkTbl;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.alee.laf.button.WebButton addNetworkBtn;
    private com.alee.laf.combobox.WebComboBox countyCombo;
    private javax.swing.JScrollPane jScrollPane1;
    private com.alee.laf.table.WebTable networkTbl;
    // End of variables declaration//GEN-END:variables
}
