/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.inventory;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Vineet
 */
public class Product {

    private static int productCount = 0;

    private String productId;
    private String productName;
    private String productDescription;
    private BigDecimal productCost;
    private Date creationDate;
    private Date modifiedDate;

    public Product() {

        productId = "PR" + String.valueOf(new Date().getTime())
                + String.valueOf(++productCount);

        productName = "";
        productDescription = "";
        creationDate = new Date();

    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public BigDecimal getProductCost() {
        return productCost;
    }

    public void setProductCost(BigDecimal productCost) {
        this.productCost = productCost;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String toString() {
        return productName;
    }

}
