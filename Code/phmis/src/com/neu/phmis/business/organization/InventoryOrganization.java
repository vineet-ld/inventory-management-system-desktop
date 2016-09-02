/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.organization;

import com.neu.phmis.business.role.InventoryManagerRole;
import com.neu.phmis.business.role.Role;

/**
 *
 * @author Vineet
 */
public class InventoryOrganization extends Organization {

    public InventoryOrganization() {
        organizationName = ORGANIZATION_INVENTORY;
    }

    @Override
    public Role getSupportedRoles() {
        return new InventoryManagerRole();
    }

}
