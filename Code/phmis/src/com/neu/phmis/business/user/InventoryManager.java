/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.user;

import com.neu.phmis.business.request.RequestQueue;

/**
 *
 * @author Vineet
 */
public class InventoryManager extends Person {

    private RequestQueue orderRequestQueue;

    public InventoryManager() {
        orderRequestQueue = new RequestQueue();
    }

    public RequestQueue getOrderRequestQueue() {
        return orderRequestQueue;
    }

    public void setOrderRequestQueue(RequestQueue orderRequestQueue) {
        this.orderRequestQueue = orderRequestQueue;
    }

}
