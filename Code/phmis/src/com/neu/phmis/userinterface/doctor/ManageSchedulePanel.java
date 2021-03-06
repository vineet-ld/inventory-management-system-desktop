/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.userinterface.doctor;

import com.alee.laf.optionpane.WebOptionPane;
import com.neu.phmis.business.Ecosystem;
import com.neu.phmis.business.enterprise.HospitalEnterprise;
import com.neu.phmis.business.organization.DoctorOrganization;
import com.neu.phmis.business.organization.Organization;
import com.neu.phmis.business.request.Request;
import com.neu.phmis.business.request.SurgeryRequest;
import com.neu.phmis.business.resource.SurgicalOperation;
import com.neu.phmis.business.user.Doctor;
import com.neu.phmis.business.user.Person;
import com.neu.phmis.business.util.CommonUtil;
import com.neu.phmis.userinterface.MainFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vineet
 */
public class ManageSchedulePanel extends javax.swing.JPanel {

    private Ecosystem ecosystem;
    private HospitalEnterprise hospitalEnterprise;
    private Doctor doctor;

    /**
     * Creates new form ManageSchedulePanel
     */
    public ManageSchedulePanel(HospitalEnterprise hospitalEnterprise,
            Doctor doctor) {
        initComponents();
        ecosystem = Ecosystem.getInstance();
        this.hospitalEnterprise = hospitalEnterprise;
        this.doctor = doctor;
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
        webPanel2 = new com.alee.laf.panel.WebPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        scheduleTbl = new com.alee.laf.table.WebTable();
        scheduleSurgeryBtn = new com.alee.laf.button.WebButton();
        viewBtn = new com.alee.laf.button.WebButton();
        webPanel1 = new com.alee.laf.panel.WebPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        requestTbl = new com.alee.laf.table.WebTable();

        setLayout(new java.awt.BorderLayout());

        jTabbedPane1.setForeground(new java.awt.Color(51, 0, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        scheduleTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Surgery Type", "Patient Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scheduleTbl.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(scheduleTbl);

        scheduleSurgeryBtn.setForeground(new java.awt.Color(0, 0, 255));
        scheduleSurgeryBtn.setText("Schedule Surgery");
        scheduleSurgeryBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        scheduleSurgeryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleSurgeryBtnActionPerformed(evt);
            }
        });

        viewBtn.setForeground(new java.awt.Color(0, 0, 255));
        viewBtn.setText("View");
        viewBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout webPanel2Layout = new javax.swing.GroupLayout(webPanel2);
        webPanel2.setLayout(webPanel2Layout);
        webPanel2Layout.setHorizontalGroup(
            webPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(webPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(webPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
                    .addGroup(webPanel2Layout.createSequentialGroup()
                        .addComponent(scheduleSurgeryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        webPanel2Layout.setVerticalGroup(
            webPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(webPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(webPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scheduleSurgeryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(172, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("My Schedule", webPanel2);

        requestTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request ID", "Created On", "Surgery", "Status", "Processed On"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        requestTbl.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jScrollPane2.setViewportView(requestTbl);

        webPanel1.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("My Request", webPanel1);

        add(jTabbedPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void scheduleSurgeryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleSurgeryBtnActionPerformed

        try {

            CreateScheduleRequestDialog createScheduleRequestDialog
                    = new CreateScheduleRequestDialog(MainFrame.mainFrame, true,
                            doctor, hospitalEnterprise, this);
            createScheduleRequestDialog.setVisible(true);

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_scheduleSurgeryBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed

        try {

            int selectedRow = scheduleTbl.getSelectedRow();

            if (selectedRow >= 0) {
                ViewScheduleDialog viewScheduleDialog
                        = new ViewScheduleDialog(MainFrame.mainFrame, true,
                                (SurgicalOperation) scheduleTbl
                                .getValueAt(selectedRow, 0));
                viewScheduleDialog.setVisible(true);
            } else {
                WebOptionPane.showMessageDialog(null, "No schedule selected", 
                        "Error", WebOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_viewBtnActionPerformed

    /* ---------------------------------------------------------------------- */
    /*
     Populate schedule in the table
    
     Parameters: NONE
    
     Returns: NONE
     */
    public void populateTables() {

        try {

            DefaultTableModel defaultTableModel
                    = (DefaultTableModel) scheduleTbl.getModel();
            defaultTableModel.setRowCount(0);

            DoctorOrganization doctorOrganization
                    = (DoctorOrganization) hospitalEnterprise
                    .getOrganization(Organization.ORGANIZATION_DOCTOR);

            Object row[];
            for (SurgicalOperation surgicalOperation : doctorOrganization
                    .getSurgicalSchedule().getOperationList()) {
                if (surgicalOperation.getDoctor() == doctor) {
                    row = new Object[3];
                    row[0] = surgicalOperation;
                    row[1] = surgicalOperation.getSurgeryType();
                    row[2] = surgicalOperation.getPatientName();
                    defaultTableModel.addRow(row);
                }
            }

            defaultTableModel = (DefaultTableModel) requestTbl.getModel();
            defaultTableModel.setRowCount(0);

            for (Request request : doctor.getSurgeryRequestQueue()
                    .getRequestList()) {
                SurgeryRequest surgeryRequest = (SurgeryRequest) request;
                row = new Object[5];
                row[0] = surgeryRequest;
                row[1] = CommonUtil.changeDateFormat(surgeryRequest
                        .getCreatedOn(), "dd MMM, yyy");
                row[2] = surgeryRequest.getSurgicalOperation()
                        .getSurgeryType() + " - " + surgeryRequest
                        .getSurgicalOperation().getPatientName();
                row[3] = surgeryRequest.getStatus();
                row[4] = surgeryRequest.getProcessedOn() == null ? ""
                        : CommonUtil.changeDateFormat(surgeryRequest
                                .getProcessedOn(), "dd MMM, yyyy");
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
    private com.alee.laf.table.WebTable requestTbl;
    private com.alee.laf.button.WebButton scheduleSurgeryBtn;
    private com.alee.laf.table.WebTable scheduleTbl;
    private com.alee.laf.button.WebButton viewBtn;
    private com.alee.laf.panel.WebPanel webPanel1;
    private com.alee.laf.panel.WebPanel webPanel2;
    // End of variables declaration//GEN-END:variables
}
