/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.sales;

import com.alee.laf.optionpane.WebOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Vineet
 */
public class OrderDirectory {

    private ArrayList<Order> orderList;

    public OrderDirectory() {
        orderList = new ArrayList<>();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    /*
     Creates a new order
    
     Parameters: NONE
    
     Returns:
     1. order - ORDER object
     */
//    public Order createOrder() {
//
//        Order order = null;
//
//        try {
//
//            order = new Order();
//            orderList.add(order);
//
//        } catch (Exception e) {
//            WebOptionPane.showMessageDialog(null,
//                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
//                    WebOptionPane.ERROR_MESSAGE);
//        } finally {
//            return order;
//        }
//
//    }

}
