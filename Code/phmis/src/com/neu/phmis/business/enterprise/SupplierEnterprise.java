/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.enterprise;

import com.neu.phmis.business.request.RequestQueue;
import com.neu.phmis.business.role.Role;
import com.neu.phmis.business.role.EnterpriseAdminRole;
import com.neu.phmis.business.sales.OrderDirectory;

/**
 *
 * @author Vineet
 */
public class SupplierEnterprise extends Enterprise {

    private OrderDirectory orderDirectory;
    private RequestQueue orderRequestQueue;
    
    public SupplierEnterprise() {
        super(ENTERPRISE_SUPPLIER);
        orderDirectory = new OrderDirectory();
        orderRequestQueue = new RequestQueue();
    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }

    public RequestQueue getOrderRequestQueue() {
        return orderRequestQueue;
    }

    public void setOrderRequestQueue(RequestQueue orderRequestQueue) {
        this.orderRequestQueue = orderRequestQueue;
    }

    @Override
    public void setSupportedOrganizations() {

        getOrganizationDirectory().createOrganization(ORGANIZATION_PRODUCT);
        getOrganizationDirectory().createOrganization(ORGANIZATION_SALES);

    }

    @Override
    public Role getSupportedRoles() {
        return new EnterpriseAdminRole();
    }

}
