/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.sales;

import com.neu.phmis.business.enterprise.SupplierEnterprise;
import com.neu.phmis.business.inventory.Product;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Vineet
 */
public class OrderItem {

    private int quantity;
    private Product product;
    private BigDecimal amount;
    private SupplierEnterprise supplierEnterprise;

    public OrderItem() {
        quantity = 0;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        setAmount();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public SupplierEnterprise getSupplierEnterprise() {
        return supplierEnterprise;
    }

    public void setSupplierEnterprise(SupplierEnterprise supplierEnterprise) {
        this.supplierEnterprise = supplierEnterprise;
    }

    public void setAmount() {
        amount = BigDecimal.valueOf(product.getProductCost().doubleValue()
                * quantity);
        amount = amount.setScale(2, RoundingMode.CEILING);
    }

    @Override
    public String toString() {
        return product.getProductName();
    }

}
