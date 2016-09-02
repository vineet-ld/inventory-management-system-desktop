/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.inventory;

import com.alee.laf.optionpane.WebOptionPane;
import com.neu.phmis.business.sales.Order;
import com.neu.phmis.business.sales.OrderItem;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Vineet
 */
public class Inventory {

    private ArrayList<InventoryItem> inventoryList;

    public Inventory() {
        inventoryList = new ArrayList<>();
    }

    public ArrayList<InventoryItem> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(ArrayList<InventoryItem> inventoryList) {
        this.inventoryList = inventoryList;
    }

    /*
     Adds items to the inventory
    
     Parameters:
     1. order - ORDER object which contains devices to be added
    
     Returns: NONE
     */
    public void addItemsToInventory(Order order) {

        try {

            for (OrderItem orderItem : order.getOrderItemList()) {
                for (int i = 0; i < orderItem.getQuantity(); i++) {
                    InventoryItem inventoryItem = new InventoryItem();
                    inventoryItem.setProduct(orderItem.getProduct());
                    inventoryList.add(inventoryItem);
                }
            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }

    }

    /*
     Retrieves the types of devices present in the inventory
    
     Parameters: NONE
    
     Returns:
     1. productList - ARRAYLIST object containing PRODUCT object
     */
    public ArrayList<Product> getDevices() {

        ArrayList<Product> productList = null;

        try {

            productList = new ArrayList<>();

            for (InventoryItem inventoryItem : inventoryList) {

                Product product = inventoryItem.getProduct();
                if (!productList.contains(product)) {
                    productList.add(product);
                }

            }
        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        } finally {
            return productList;
        }
    }

    /*
     Retrieves all available items from the inventory
    
     Parameters:
     1. date - DATE object on which the items are to be retrieved
    
     Returns:
     1. itemList - ARRAYLIST of INVENTORYITEM
     */
    public ArrayList<InventoryItem> getAvailableItems(Date date) {

        ArrayList<InventoryItem> itemList = new ArrayList<>();

        try {

            for (InventoryItem inventoryItem : inventoryList) {
                if (inventoryItem.isAvailable(date)) {
                    itemList.add(inventoryItem);
                }
            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        } finally {
            return itemList;
        }

    }

}
