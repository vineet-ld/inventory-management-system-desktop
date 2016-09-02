/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.inventory;

import com.alee.laf.optionpane.WebOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Vineet
 */
public class ProductDirectory {

    private ArrayList<Product> productList;

    public ProductDirectory() {
        productList = new ArrayList<>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    /* 
     Creates a new product and saves in the list
    
     Parameters: NONE
    
     Returns:
     1. product = PRODUCT object 
     */
    public Product addProduct() {

        Product product = null;

        try {

            product = new Product();
            productList.add(product);

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        } finally {
            return product;
        }

    }

}
