/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.request;

import com.neu.phmis.business.enterprise.WarehouseEnterprise;
import com.neu.phmis.business.sales.Order;

/**
 *
 * @author Vineet
 */
public class OrderRequest extends Request {

    public static final String STATUS_PENDING = "Pending";
    public static final String STATUS_CONFIRMED = "Confirmed";
    public static final String STATUS_CANCELLED = "Cancelled";
    public static final String STATUS_DELIVERED = "Delivered";
    
    private Order order;
    private WarehouseEnterprise warehouseEnterprise;
    private boolean addedToInventory;

    public OrderRequest() {
        requestType = Request.ORDER_REQUEST;
        addedToInventory = false;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public WarehouseEnterprise getWarehouseEnterprise() {
        return warehouseEnterprise;
    }

    public void setWarehouseEnterprise(WarehouseEnterprise warehouseEnterprise) {
        this.warehouseEnterprise = warehouseEnterprise;
    }

    public boolean isAddedToInventory() {
        return addedToInventory;
    }

    public void setAddedToInventory(boolean addedToInventory) {
        this.addedToInventory = addedToInventory;
    }

}
