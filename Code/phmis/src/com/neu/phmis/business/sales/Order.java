/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.sales;

import com.alee.laf.optionpane.WebOptionPane;
import com.neu.phmis.business.enterprise.SupplierEnterprise;
import com.neu.phmis.business.enterprise.WarehouseEnterprise;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Vineet
 */
public class Order {

    private static int orderCount = 0;

    private String orderId;
    private ArrayList<OrderItem> orderItemList;
    private WarehouseEnterprise warehouseEnterprise;
    private SupplierEnterprise supplierEnterprise;
    private Invoice invoice;
    private Date createdOn;
    private int isDelivered;

    public Order() {

        orderId = "O" + String.valueOf(new Date().getTime())
                + String.valueOf(++orderCount);
        orderItemList = new ArrayList<>();
        isDelivered = 0;

    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public WarehouseEnterprise getWarehouseEnterprise() {
        return warehouseEnterprise;
    }

    public void setWarehouseEnterprise(WarehouseEnterprise warehouseEnterprise) {
        this.warehouseEnterprise = warehouseEnterprise;
    }

    public SupplierEnterprise getSupplierEnterprise() {
        return supplierEnterprise;
    }

    public void setSupplierEnterprise(SupplierEnterprise supplierEnterprise) {
        this.supplierEnterprise = supplierEnterprise;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public int getIsDelivered() {
        return isDelivered;
    }

    public void setIsDelivered(int isDelivered) {
        this.isDelivered = isDelivered;
    }

    /* 
     Generates an invoice for the order
    
     Parameters: NONE
    
     Returns: NONE
     */
    public void generateInvoice() {

        try {

            Invoice invoice = new Invoice();
            this.invoice = invoice;

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }

    }

    /*
     Retrieves total order amount
    
     Parameters: NONE
    
     Returns:
     1. totalCost - BIGDECIMAL object
     */
    public BigDecimal getTotalCost() {

        BigDecimal totalCost = BigDecimal.valueOf(0.0);

        try {

            for (OrderItem orderItem : orderItemList) {
                totalCost = BigDecimal.valueOf(totalCost.doubleValue()
                        + orderItem.getAmount().doubleValue());
            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        } finally {
            return totalCost.setScale(2, RoundingMode.CEILING);
        }

    }

    @Override
    public String toString() {
        return orderId;
    }

}
