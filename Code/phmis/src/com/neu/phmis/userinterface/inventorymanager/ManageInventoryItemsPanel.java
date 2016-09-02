/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.userinterface.inventorymanager;

import com.alee.laf.optionpane.WebOptionPane;
import com.neu.phmis.business.Ecosystem;
import com.neu.phmis.business.enterprise.WarehouseEnterprise;
import com.neu.phmis.business.inventory.InventoryItem;
import com.neu.phmis.business.schedule.Schedule;
import com.neu.phmis.business.user.InventoryManager;
import com.neu.phmis.userinterface.MainFrame;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vineet
 */
public class ManageInventoryItemsPanel extends javax.swing.JPanel {

    private Ecosystem ecosystem;
    private InventoryManager inventoryManager;
    private WarehouseEnterprise warehouseEnterprise;
    private ArrayList<String> conditionList;

    /**
     * Creates new form ManageInventoryPanel
     */
    public ManageInventoryItemsPanel(InventoryManager inventoryManager) {

        initComponents();

        this.inventoryManager = inventoryManager;
        ecosystem = Ecosystem.getInstance();
        warehouseEnterprise = (WarehouseEnterprise) inventoryManager
                .getEnterprise();
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

        jScrollPane2 = new javax.swing.JScrollPane();
        inventoryTbl = new com.alee.laf.table.WebTable();
        changeConditionBtn = new com.alee.laf.button.WebButton();
        maintenanceBtn = new com.alee.laf.button.WebButton();
        viewDetails = new com.alee.laf.button.WebButton();

        inventoryTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial No.", "Device", "Condition", "Current Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        inventoryTbl.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        inventoryTbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(inventoryTbl);

        changeConditionBtn.setForeground(new java.awt.Color(0, 0, 255));
        changeConditionBtn.setText("Change Condition");
        changeConditionBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        changeConditionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeConditionBtnActionPerformed(evt);
            }
        });

        maintenanceBtn.setForeground(new java.awt.Color(0, 0, 255));
        maintenanceBtn.setText("Schedule Maintenance");
        maintenanceBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        maintenanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maintenanceBtnActionPerformed(evt);
            }
        });

        viewDetails.setForeground(new java.awt.Color(0, 0, 255));
        viewDetails.setText("View Details");
        viewDetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maintenanceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changeConditionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeConditionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maintenanceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void changeConditionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeConditionBtnActionPerformed

        try {

            int selectedRow = inventoryTbl.getSelectedRow();

            if (selectedRow >= 0) {

                ChangeConditionDialog changeConditionDialog
                        = new ChangeConditionDialog(MainFrame.mainFrame, true,
                                (InventoryItem) inventoryTbl
                                .getValueAt(selectedRow, 1), this);
                changeConditionDialog.setVisible(true);

            } else {
                WebOptionPane.showMessageDialog(null,
                        "Please select a request", "Error",
                        WebOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_changeConditionBtnActionPerformed

    private void maintenanceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maintenanceBtnActionPerformed

        try {

            int selectedRow = inventoryTbl.getSelectedRow();

            if (selectedRow >= 0) {

                ScheduleMaintenanceDialog scheduleMaintenanceDialog
                        = new ScheduleMaintenanceDialog(MainFrame.mainFrame,
                                true, (InventoryItem) inventoryTbl
                                .getValueAt(selectedRow, 1), this);
                scheduleMaintenanceDialog.setVisible(true);

            } else {
                WebOptionPane.showMessageDialog(null,
                        "No Item Selected", "Error",
                        WebOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_maintenanceBtnActionPerformed

    private void viewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsActionPerformed

        try {

            int selectedRow = inventoryTbl.getSelectedRow();

            if (selectedRow >= 0) {

                ViewItemDetails viewItemDetails
                        = new ViewItemDetails(MainFrame.mainFrame, true,
                                (InventoryItem) inventoryTbl
                                .getValueAt(selectedRow, 1),
                                (String) inventoryTbl.getValueAt(selectedRow,
                                        3), inventoryManager);
                viewItemDetails.setVisible(true);

            } else {
                WebOptionPane.showMessageDialog(null, "No device selected",
                        "Error", WebOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_viewDetailsActionPerformed

    /* ---------------------------------------------------------------------- */
    /*
     Populates the table with inventory items
    
     Parameters: NONE
    
     Returns: NONE
     */
    public void populateTable() {

        try {

            DefaultTableModel defaultTableModel
                    = (DefaultTableModel) inventoryTbl.getModel();
            defaultTableModel.setRowCount(0);

            Object row[];
            for (InventoryItem inventoryItem : warehouseEnterprise
                    .getInventory().getInventoryList()) {

//                int usage = inventoryItem.getUsage();
//
//                if (usage != 0 && usage % 10 == 0) {
//                    inventoryItem
//                            .setCondition(InventoryItem.CONDITION_MAINTENANCE);
//                }
                String status = "";
                Schedule schedule = inventoryItem.getSchedule(new Date());

                if (schedule == null) {
                    status = "Warehouse";
                } else if (schedule.getScheduleType()
                        .equals(Schedule.MAINTENANCE_SCHEDULE)) {
                    status = "Out for Maintenance";
                } else {
                    status = schedule.getHospitalEnterprise()
                            .getEnterpriseName();
                }

                row = new Object[4];
                row[0] = inventoryItem.getSerialNumber();
                row[1] = inventoryItem;
                row[2] = inventoryItem.getCondition();
                row[3] = status;
                defaultTableModel.addRow(row);

            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.alee.laf.button.WebButton changeConditionBtn;
    private com.alee.laf.table.WebTable inventoryTbl;
    private javax.swing.JScrollPane jScrollPane2;
    private com.alee.laf.button.WebButton maintenanceBtn;
    private com.alee.laf.button.WebButton viewDetails;
    // End of variables declaration//GEN-END:variables
}
