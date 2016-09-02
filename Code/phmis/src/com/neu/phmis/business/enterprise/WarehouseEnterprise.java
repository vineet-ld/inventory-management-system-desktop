/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.enterprise;

import com.neu.phmis.business.inventory.Inventory;
import com.neu.phmis.business.request.RequestQueue;
import com.neu.phmis.business.role.EnterpriseAdminRole;
import com.neu.phmis.business.role.Role;

/**
 *
 * @author Vineet
 */
public class WarehouseEnterprise extends Enterprise {

    private RequestQueue deviceRequestQueue;
    private Inventory inventory;

    public WarehouseEnterprise() {
        super(ENTERPRISE_WAREHOUSE);
        deviceRequestQueue = new RequestQueue();
        inventory = new Inventory();
    }

    public RequestQueue getDeviceRequestQueue() {
        return deviceRequestQueue;
    }

    public void setDeviceRequestQueue(RequestQueue deviceRequestQueue) {
        this.deviceRequestQueue = deviceRequestQueue;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public void setSupportedOrganizations() {

        getOrganizationDirectory().createOrganization(ORGANIZATION_INVENTORY);
        getOrganizationDirectory().createOrganization(ORGANIZATION_ACCOUNT);

    }

    @Override
    public Role getSupportedRoles() {
        return new EnterpriseAdminRole();
    }

}
