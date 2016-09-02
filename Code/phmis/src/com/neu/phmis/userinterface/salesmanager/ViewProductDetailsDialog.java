/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.userinterface.salesmanager;

import com.alee.laf.optionpane.WebOptionPane;
import com.neu.phmis.business.Ecosystem;
import com.neu.phmis.business.inventory.Product;
import com.neu.phmis.business.util.CommonUtil;
import com.neu.phmis.userinterface.productmanager.ManageProductsPanel;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

/**
 *
 * @author Vineet
 */
public class ViewProductDetailsDialog extends javax.swing.JDialog {

    private Product product;
    private ManageSalesProductPanel manageSalesProductPanel;
    private ManageProductsPanel manageProductsPanel;

    /**
     * Creates new form ViewProductDetailsDialog
     */
    public ViewProductDetailsDialog(java.awt.Frame parent, boolean modal,
            Product product, ManageSalesProductPanel manageSalesProductPanel) {

        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);

        this.product = product;
        this.manageSalesProductPanel = manageSalesProductPanel;

        productNameLbl.setText(product.getProductName());
        productIdLbl.setText(product.getProductId());
        productCostLbl.setText("$ " + product.getProductCost());
        addedOnLbl.setText(CommonUtil.changeDateFormat(product
                .getCreationDate(), "dd MMM, yyyy"));
        if (product.getModifiedDate() != null) {
            modifiedDateLbl.setText(CommonUtil.changeDateFormat(product
                    .getModifiedDate(), "dd MMM, yyyy"));
        } else {
            modifiedDateTitleLbl.setVisible(false);
        }

        descriptionTxt.setText(product.getProductDescription());

    }

    public ViewProductDetailsDialog(java.awt.Frame parent, boolean modal,
            Product product, ManageProductsPanel manageProductsPanel) {

        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);

        this.product = product;
        this.manageProductsPanel = manageProductsPanel;

        productNameLbl.setText(product.getProductName());
        productIdLbl.setText(product.getProductId());
        productCostLbl.setText("$ " + product.getProductCost());
        addedOnLbl.setText(CommonUtil.changeDateFormat(product
                .getCreationDate(), "dd MMM, yyyy"));
        if (product.getModifiedDate() != null) {

            modifiedDateLbl.setText(CommonUtil.changeDateFormat(product
                    .getModifiedDate(), "dd MMM, yyyy"));
        } else {
            modifiedDateLbl.setVisible(false);
            modifiedDateTitleLbl.setVisible(false);
        }

        descriptionTxt.setText(product.getProductDescription());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productNameLbl = new com.alee.laf.label.WebLabel();
        webLabel10 = new com.alee.laf.label.WebLabel();
        productIdLbl = new com.alee.laf.label.WebLabel();
        productCostLbl = new com.alee.laf.label.WebLabel();
        webLabel12 = new com.alee.laf.label.WebLabel();
        webLabel13 = new com.alee.laf.label.WebLabel();
        addedOnLbl = new com.alee.laf.label.WebLabel();
        webLabel14 = new com.alee.laf.label.WebLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTxt = new com.alee.laf.text.WebTextArea();
        cancelBtn = new com.alee.laf.button.WebButton();
        changeCostBtn = new com.alee.laf.button.WebButton();
        modifiedDateTitleLbl = new com.alee.laf.label.WebLabel();
        modifiedDateLbl = new com.alee.laf.label.WebLabel();
        changeDescriptionBtn = new com.alee.laf.button.WebButton();
        saveBtn = new com.alee.laf.button.WebButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        productNameLbl.setForeground(new java.awt.Color(0, 51, 255));
        productNameLbl.setText("Add Payment");
        productNameLbl.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        webLabel10.setText("Product ID:");
        webLabel10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        productIdLbl.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        productCostLbl.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        webLabel12.setText("Product Cost:");
        webLabel12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        webLabel13.setText("Added On:");
        webLabel13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        addedOnLbl.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        webLabel14.setText("Product Description:");
        webLabel14.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        descriptionTxt.setEditable(false);
        descriptionTxt.setColumns(20);
        descriptionTxt.setRows(5);
        jScrollPane1.setViewportView(descriptionTxt);

        cancelBtn.setForeground(new java.awt.Color(0, 0, 255));
        cancelBtn.setText("Close");
        cancelBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        changeCostBtn.setForeground(new java.awt.Color(0, 0, 255));
        changeCostBtn.setText("Change Cost");
        changeCostBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        changeCostBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeCostBtnActionPerformed(evt);
            }
        });

        modifiedDateTitleLbl.setText("Modified On:");
        modifiedDateTitleLbl.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        modifiedDateLbl.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        changeDescriptionBtn.setForeground(new java.awt.Color(0, 0, 255));
        changeDescriptionBtn.setText("Change Description");
        changeDescriptionBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        changeDescriptionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeDescriptionBtnActionPerformed(evt);
            }
        });

        saveBtn.setForeground(new java.awt.Color(0, 0, 255));
        saveBtn.setText("Save");
        saveBtn.setEnabled(false);
        saveBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(productNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(changeCostBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(changeDescriptionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 318, Short.MAX_VALUE)
                                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(webLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(addedOnLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(webLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(productCostLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(webLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(productIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(webLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(modifiedDateTitleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modifiedDateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(productNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(webLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(webLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productCostLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(webLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addedOnLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifiedDateTitleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifiedDateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(webLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeCostBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeDescriptionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void changeCostBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeCostBtnActionPerformed

        try {

            String input = WebOptionPane.showInputDialog(null,
                    "Enter New Cost");

            if (!input.isEmpty()) {

                if (CommonUtil.isNAN(input)) {
                    WebOptionPane.showMessageDialog(null, "Invalid Amount",
                            "Error", WebOptionPane.ERROR_MESSAGE);
                } else {

                    BigDecimal bigDecimal = BigDecimal.valueOf(Double
                            .parseDouble(input));
                    product.setProductCost(bigDecimal.setScale(2,
                            RoundingMode.CEILING));
                    productCostLbl.setText("$ " + product.getProductCost());
                    product.setModifiedDate(new Date());
                    modifiedDateLbl.setText(CommonUtil.changeDateFormat(product
                            .getModifiedDate(), "dd MMM, yyyy"));
                    modifiedDateLbl.setVisible(true);
                    modifiedDateTitleLbl.setVisible(true);
                    if (manageSalesProductPanel != null) {
                        manageSalesProductPanel.populateTable();
                    } else {
                        manageProductsPanel.populateTable();
                    }
                    CommonUtil.saveChanges(Ecosystem.getInstance());

                }

            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_changeCostBtnActionPerformed

    private void changeDescriptionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeDescriptionBtnActionPerformed

        descriptionTxt.setEditable(true);
        saveBtn.setEnabled(true);

    }//GEN-LAST:event_changeDescriptionBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed

        try {

            String description = descriptionTxt.getText().trim();

            if (description.isEmpty()) {
                WebOptionPane.showMessageDialog(null,
                        "Product Description cannot be left blank", "Error",
                        WebOptionPane.ERROR_MESSAGE);
            } else {

                product.setProductDescription(description);
                descriptionTxt.setEditable(false);
                saveBtn.setEnabled(false);
                descriptionTxt.setText(product.getProductDescription());
                product.setModifiedDate(new Date());
                modifiedDateLbl.setText(CommonUtil.changeDateFormat(product
                        .getModifiedDate(), "dd MMM, yyyy"));
                modifiedDateLbl.setVisible(true);
                modifiedDateTitleLbl.setVisible(true);
                if (manageSalesProductPanel != null) {
                    manageSalesProductPanel.populateTable();
                } else {
                    manageProductsPanel.populateTable();
                }
                CommonUtil.saveChanges(Ecosystem.getInstance());

            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_saveBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ViewProductDetailsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProductDetailsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProductDetailsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProductDetailsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewProductDetailsDialog dialog
                        = new ViewProductDetailsDialog(new javax.swing.JFrame(),
                                true, product, manageSalesProductPanel);
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
    private com.alee.laf.label.WebLabel addedOnLbl;
    private com.alee.laf.button.WebButton cancelBtn;
    private com.alee.laf.button.WebButton changeCostBtn;
    private com.alee.laf.button.WebButton changeDescriptionBtn;
    private com.alee.laf.text.WebTextArea descriptionTxt;
    private javax.swing.JScrollPane jScrollPane1;
    private com.alee.laf.label.WebLabel modifiedDateLbl;
    private com.alee.laf.label.WebLabel modifiedDateTitleLbl;
    private com.alee.laf.label.WebLabel productCostLbl;
    private com.alee.laf.label.WebLabel productIdLbl;
    private com.alee.laf.label.WebLabel productNameLbl;
    private com.alee.laf.button.WebButton saveBtn;
    private com.alee.laf.label.WebLabel webLabel10;
    private com.alee.laf.label.WebLabel webLabel12;
    private com.alee.laf.label.WebLabel webLabel13;
    private com.alee.laf.label.WebLabel webLabel14;
    // End of variables declaration//GEN-END:variables
}
