/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.userinterface.enterpriseadmin;

import com.neu.phmis.userinterface.resourcemanager.*;
import com.alee.laf.optionpane.WebOptionPane;
import com.neu.phmis.business.Ecosystem;
import com.neu.phmis.business.enterprise.HospitalEnterprise;
import com.neu.phmis.business.organization.Organization;
import com.neu.phmis.business.organization.ResourceOrganization;
import com.neu.phmis.business.resource.MedicalStaff;
import com.neu.phmis.business.resource.Resource;
import com.neu.phmis.business.resource.Room;
import com.neu.phmis.business.user.ResourceManager;
import com.neu.phmis.userinterface.MainFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vineet
 */
public class ViewResourcesPanel extends javax.swing.JPanel {

    private Ecosystem ecosystem;
    private HospitalEnterprise hospitalEnterprise;

    /**
     * Creates new form ManageResourcesPanel
     */
    public ViewResourcesPanel(HospitalEnterprise hospitalEnterprise) {
        initComponents();
        this.hospitalEnterprise = hospitalEnterprise;
        ecosystem = Ecosystem.getInstance();
        populateTables();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        webPanel1 = new com.alee.laf.panel.WebPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomsTbl = new com.alee.laf.table.WebTable();
        viewRoomScheduleBtn = new com.alee.laf.button.WebButton();
        webPanel2 = new com.alee.laf.panel.WebPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        medicalStaffTbl = new com.alee.laf.table.WebTable();
        viewStaffScheduleBtn = new com.alee.laf.button.WebButton();

        setLayout(new java.awt.BorderLayout());

        jTabbedPane1.setForeground(new java.awt.Color(102, 51, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        roomsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room No", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        roomsTbl.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(roomsTbl);

        viewRoomScheduleBtn.setForeground(new java.awt.Color(0, 0, 255));
        viewRoomScheduleBtn.setText("View Schedule");
        viewRoomScheduleBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewRoomScheduleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRoomScheduleBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout webPanel1Layout = new javax.swing.GroupLayout(webPanel1);
        webPanel1.setLayout(webPanel1Layout);
        webPanel1Layout.setHorizontalGroup(
            webPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(webPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(webPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                    .addGroup(webPanel1Layout.createSequentialGroup()
                        .addComponent(viewRoomScheduleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        webPanel1Layout.setVerticalGroup(
            webPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(webPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewRoomScheduleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Operating Rooms", webPanel1);

        medicalStaffTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Staff ID", "Name", "Is Leader"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        medicalStaffTbl.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jScrollPane2.setViewportView(medicalStaffTbl);

        viewStaffScheduleBtn.setForeground(new java.awt.Color(0, 0, 255));
        viewStaffScheduleBtn.setText("View Schedule");
        viewStaffScheduleBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewStaffScheduleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStaffScheduleBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout webPanel2Layout = new javax.swing.GroupLayout(webPanel2);
        webPanel2.setLayout(webPanel2Layout);
        webPanel2Layout.setHorizontalGroup(
            webPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(webPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(webPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                    .addGroup(webPanel2Layout.createSequentialGroup()
                        .addComponent(viewStaffScheduleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        webPanel2Layout.setVerticalGroup(
            webPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(webPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewStaffScheduleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Medical Staff", webPanel2);

        add(jTabbedPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void viewRoomScheduleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRoomScheduleBtnActionPerformed

        try {

            int selectedRow = roomsTbl.getSelectedRow();

            if (selectedRow >= 0) {

                ViewResourceDialog viewResourceDialog
                        = new ViewResourceDialog(MainFrame.mainFrame, true,
                                (Room) roomsTbl.getValueAt(selectedRow, 0));
                viewResourceDialog.setVisible(true);

            } else {
                WebOptionPane.showMessageDialog(null, "No resource selected",
                        "Error", WebOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_viewRoomScheduleBtnActionPerformed

    private void viewStaffScheduleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStaffScheduleBtnActionPerformed

        try {

            int selectedRow = medicalStaffTbl.getSelectedRow();

            if (selectedRow >= 0) {

                ViewResourceDialog viewResourceDialog
                        = new ViewResourceDialog(MainFrame.mainFrame, true,
                                (MedicalStaff) medicalStaffTbl
                                .getValueAt(selectedRow, 1));
                viewResourceDialog.setVisible(true);

            } else {
                WebOptionPane.showMessageDialog(null, "No resource selected",
                        "Error", WebOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_viewStaffScheduleBtnActionPerformed

    /* ---------------------------------------------------------------------- */
    /*
     Populate resources in the tables
    
     Parameters: NONE
    
     Returns: NONE
     */
    public void populateTables() {

        try {

            DefaultTableModel defaultTableModel
                    = (DefaultTableModel) roomsTbl.getModel();
            defaultTableModel.setRowCount(0);

            ResourceOrganization resourceOrganization
                    = (ResourceOrganization) hospitalEnterprise
                    .getOrganization(Organization.ORGANIZATION_RESOURCE);

            Room room = null;
            Object row[];
            for (Resource resource : resourceOrganization
                    .getResourceDirectory().getRoomList()) {

                room = (Room) resource;
                row = new Object[2];
                row[0] = room;
                row[1] = room.getLocation();
                defaultTableModel.addRow(row);

            }

            defaultTableModel = (DefaultTableModel) medicalStaffTbl.getModel();
            defaultTableModel.setRowCount(0);

            MedicalStaff medicalStaff = null;
            for (Resource resource : resourceOrganization
                    .getResourceDirectory().getMedicalStaffList()) {

                medicalStaff = (MedicalStaff) resource;
                row = new Object[3];
                row[0] = medicalStaff.getStaffId();
                row[1] = medicalStaff;
                row[2] = medicalStaff.getIsLeader() == 1 ? "Yes" : "No";
                defaultTableModel.addRow(row);

            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.alee.laf.table.WebTable medicalStaffTbl;
    private com.alee.laf.table.WebTable roomsTbl;
    private com.alee.laf.button.WebButton viewRoomScheduleBtn;
    private com.alee.laf.button.WebButton viewStaffScheduleBtn;
    private com.alee.laf.panel.WebPanel webPanel1;
    private com.alee.laf.panel.WebPanel webPanel2;
    // End of variables declaration//GEN-END:variables
}