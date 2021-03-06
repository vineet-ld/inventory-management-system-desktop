/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.userinterface.productmanager;

import com.alee.laf.optionpane.WebOptionPane;
import com.neu.phmis.business.Ecosystem;
import com.neu.phmis.business.enterprise.SupplierEnterprise;
import com.neu.phmis.business.organization.ProductOrganization;
import com.neu.phmis.business.request.OrderRequest;
import com.neu.phmis.business.request.Request;
import com.neu.phmis.business.sales.Order;
import com.neu.phmis.business.user.Person;
import com.neu.phmis.business.user.ProductManager;
import com.neu.phmis.business.util.CommonUtil;
import com.neu.phmis.business.util.MailUtil;
import com.neu.phmis.userinterface.MainFrame;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vineet
 */
public class ManageOrdersPanel extends javax.swing.JPanel {

    private Ecosystem ecosystem;
    private ProductManager productManager;
    private SupplierEnterprise supplierEnterprise;
    private ProductOrganization productOrganization;

    /**
     * Creates new form ManageOrdersPanel
     */
    public ManageOrdersPanel(ProductManager productManager) {

        initComponents();
        ecosystem = Ecosystem.getInstance();

        this.productManager = productManager;
        supplierEnterprise = (SupplierEnterprise) productManager
                .getEnterprise();
        productOrganization = (ProductOrganization) productManager
                .getOrganization();

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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        webPanel1 = new com.alee.laf.panel.WebPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ordersTbl = new com.alee.laf.table.WebTable();
        deliveredBtn = new com.alee.laf.button.WebButton();
        viewOrderBtn = new com.alee.laf.button.WebButton();
        webPanel2 = new com.alee.laf.panel.WebPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderRequestTbl = new com.alee.laf.table.WebTable();
        viewRequestBtn = new com.alee.laf.button.WebButton();

        setLayout(new java.awt.BorderLayout());

        jTabbedPane1.setForeground(new java.awt.Color(51, 0, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        ordersTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Warehouse", "Created On", "Delivery Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ordersTbl);

        deliveredBtn.setForeground(new java.awt.Color(0, 0, 255));
        deliveredBtn.setText("Mark as Delivered");
        deliveredBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deliveredBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliveredBtnActionPerformed(evt);
            }
        });

        viewOrderBtn.setForeground(new java.awt.Color(0, 0, 255));
        viewOrderBtn.setText("View");
        viewOrderBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout webPanel1Layout = new javax.swing.GroupLayout(webPanel1);
        webPanel1.setLayout(webPanel1Layout);
        webPanel1Layout.setHorizontalGroup(
            webPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(webPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(webPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
                    .addGroup(webPanel1Layout.createSequentialGroup()
                        .addComponent(deliveredBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        webPanel1Layout.setVerticalGroup(
            webPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(webPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(webPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deliveredBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Orders", webPanel1);

        orderRequestTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request ID", "Warehouse", "Created On", "Status", "Processed By"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        orderRequestTbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(orderRequestTbl);

        viewRequestBtn.setForeground(new java.awt.Color(0, 0, 255));
        viewRequestBtn.setText("View");
        viewRequestBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout webPanel2Layout = new javax.swing.GroupLayout(webPanel2);
        webPanel2.setLayout(webPanel2Layout);
        webPanel2Layout.setHorizontalGroup(
            webPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(webPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(webPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
                    .addGroup(webPanel2Layout.createSequentialGroup()
                        .addComponent(viewRequestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        webPanel2Layout.setVerticalGroup(
            webPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(webPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewRequestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Requests", webPanel2);

        add(jTabbedPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void viewRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestBtnActionPerformed

        try {

            int selectedRow = orderRequestTbl.getSelectedRow();

            if (selectedRow >= 0) {

                ViewOrderDialog viewOrderDialog
                        = new ViewOrderDialog(MainFrame.mainFrame, true,
                                (OrderRequest) orderRequestTbl
                                .getValueAt(selectedRow, 0), productManager,
                                this);
                viewOrderDialog.setVisible(true);

            } else {
                WebOptionPane.showMessageDialog(null,
                        "No request selected", "Warning",
                        WebOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_viewRequestBtnActionPerformed

    private void deliveredBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveredBtnActionPerformed

        try {

            int selectedRow = ordersTbl.getSelectedRow();

            if (selectedRow >= 0) {

                if (WebOptionPane.showConfirmDialog(null, "Please confirm that "
                        + "you are marking this order request as delivered",
                        "Please Confirm", WebOptionPane.OK_CANCEL_OPTION)
                        == WebOptionPane.OK_OPTION) {

                    Order order = (Order) ordersTbl.getValueAt(selectedRow, 0);

                    if (order.getIsDelivered() != 1) {
                        OrderRequest orderRequest = null;
                        for (Request request : supplierEnterprise
                                .getOrderRequestQueue().getRequestList()) {

                            if (((OrderRequest) request).getOrder() == order) {
                                orderRequest = (OrderRequest) request;
                                break;
                            }

                        }

                        orderRequest.setStatus(OrderRequest.STATUS_DELIVERED);
                        orderRequest.setProcessedBy(productManager);
                        orderRequest.setProcessedOn(new Date());
                        order.setIsDelivered(1);

                        populateTable();
                        CommonUtil.saveChanges(ecosystem);

                        Person person = orderRequest.getSentBy();
                        MailUtil mailUtil = new MailUtil(person.getEmailId());
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append(person).append(",\nYour order with "
                                + "order ID ").append(orderRequest.getOrder())
                                .append(" has been marked as delivered. If you "
                                        + "have any questions, please contact ")
                                .append(supplierEnterprise);
                        mailUtil.setEmailBody(stringBuffer.toString());
                        mailUtil.setEmailSubject("Order Request Status Update");
                        mailUtil.sendEmail();
                        
                    } else {
                        WebOptionPane.showMessageDialog(null,
                                "Order is already marked as delivered",
                                "Warning", WebOptionPane.WARNING_MESSAGE);
                    }

                } else {
                    WebOptionPane.showMessageDialog(null,
                            "No Request Selected", "Warning",
                            WebOptionPane.WARNING_MESSAGE);
                }

            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_deliveredBtnActionPerformed

    private void viewOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderBtnActionPerformed

        try {

            int selectedRow = ordersTbl.getSelectedRow();

            if (selectedRow >= 0) {

                ViewOrderDetailDialog viewOrderDetailDialog
                        = new ViewOrderDetailDialog(MainFrame.mainFrame, true,
                                (Order) ordersTbl.getValueAt(selectedRow, 0));
                viewOrderDetailDialog.setVisible(true);

            } else {
                WebOptionPane.showMessageDialog(null, "No order selected",
                        "Error", WebOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_viewOrderBtnActionPerformed

    /* ---------------------------------------------------------------------- */
    /*
     Populates the table with order details
    
     Parameters: NONE
    
     Returns: NONE
     */
    public void populateTable() {

        try {

            DefaultTableModel defaultTableModel
                    = (DefaultTableModel) ordersTbl.getModel();
            defaultTableModel.setRowCount(0);

            Object row[];
            for (Order order : supplierEnterprise.getOrderDirectory()
                    .getOrderList()) {

                row = new Object[4];
                row[0] = order;
                row[1] = order.getWarehouseEnterprise();
                row[2] = CommonUtil.changeDateFormat(order.getCreatedOn(),
                        "dd MMM, yyyy");
                row[3] = order.getIsDelivered() == 0
                        ? OrderRequest.STATUS_PENDING
                        : OrderRequest.STATUS_DELIVERED;
                defaultTableModel.addRow(row);

            }

            defaultTableModel = (DefaultTableModel) orderRequestTbl.getModel();
            defaultTableModel.setRowCount(0);

            OrderRequest orderRequest = null;
            for (Request request : supplierEnterprise.getOrderRequestQueue()
                    .getRequestList()) {

                orderRequest = (OrderRequest) request;
                row = new Object[5];
                row[0] = orderRequest;
                row[1] = orderRequest.getWarehouseEnterprise();
                row[2] = CommonUtil.changeDateFormat(orderRequest
                        .getCreatedOn(), "dd MMM, yyyy");
                row[3] = orderRequest.getStatus();
                row[4] = orderRequest.getProcessedBy() != null ? orderRequest
                        .getProcessedBy() : "";
                defaultTableModel.addRow(row);

            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.alee.laf.button.WebButton deliveredBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.alee.laf.table.WebTable orderRequestTbl;
    private com.alee.laf.table.WebTable ordersTbl;
    private com.alee.laf.button.WebButton viewOrderBtn;
    private com.alee.laf.button.WebButton viewRequestBtn;
    private com.alee.laf.panel.WebPanel webPanel1;
    private com.alee.laf.panel.WebPanel webPanel2;
    // End of variables declaration//GEN-END:variables
}
