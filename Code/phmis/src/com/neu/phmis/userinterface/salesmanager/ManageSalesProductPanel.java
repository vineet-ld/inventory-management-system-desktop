/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.userinterface.salesmanager;

import com.alee.laf.optionpane.WebOptionPane;
import com.neu.phmis.business.enterprise.SupplierEnterprise;
import com.neu.phmis.business.inventory.Product;
import com.neu.phmis.business.organization.Organization;
import com.neu.phmis.business.organization.ProductOrganization;
import com.neu.phmis.business.user.SalesManager;
import com.neu.phmis.userinterface.MainFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vineet
 */
public class ManageSalesProductPanel extends javax.swing.JPanel {

    private SalesManager salesManager;
    private SupplierEnterprise supplierEnterprise;

    /**
     * Creates new form ManageSalesProductPanel
     */
    public ManageSalesProductPanel(SalesManager salesManager) {

        initComponents();

        this.salesManager = salesManager;
        this.supplierEnterprise = (SupplierEnterprise) salesManager
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

        jScrollPane1 = new javax.swing.JScrollPane();
        productTbl = new com.alee.laf.table.WebTable();
        viewDetailsBtn = new com.alee.laf.button.WebButton();

        productTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Name", "Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productTbl.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(productTbl);

        viewDetailsBtn.setForeground(new java.awt.Color(0, 0, 255));
        viewDetailsBtn.setText("View");
        viewDetailsBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(viewDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsBtnActionPerformed

        try {

            int selectedRow = productTbl.getSelectedRow();

            if (selectedRow >= 0) {

                Product product = (Product) productTbl.getValueAt(selectedRow,
                        1);
                ViewProductDetailsDialog viewProductDetailsDialog
                        = new ViewProductDetailsDialog(MainFrame.mainFrame,
                                true, product, this);
                viewProductDetailsDialog.setVisible(true);

            } else {
                WebOptionPane.showMessageDialog(null, "No product selected",
                        "Error", WebOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_viewDetailsBtnActionPerformed

    /* ---------------------------------------------------------------------- */
    /*
     Populates the table with product details
    
     Parameters: NONE
    
     Returns: NONE
     */
    public void populateTable() {

        try {

            ProductOrganization productOrganization
                    = (ProductOrganization) supplierEnterprise
                    .getOrganization(Organization.ORGANIZATION_PRODUCT);

            DefaultTableModel defaultTableModel
                    = (DefaultTableModel) productTbl.getModel();
            defaultTableModel.setRowCount(0);

            Object row[];
            for (Product product : productOrganization.getProductDirectory()
                    .getProductList()) {

                row = new Object[3];
                row[0] = product.getProductId();
                row[1] = product;
                row[2] = "$ " + product.getProductCost();
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
    private com.alee.laf.table.WebTable productTbl;
    private com.alee.laf.button.WebButton viewDetailsBtn;
    // End of variables declaration//GEN-END:variables
}
