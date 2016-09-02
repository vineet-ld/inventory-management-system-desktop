/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.role;

import com.neu.phmis.business.organization.Organization;
import com.neu.phmis.business.user.InventoryManager;
import com.neu.phmis.business.user.Person;
import com.neu.phmis.userinterface.inventorymanager.InventoryManagerDashboardPanel;
import javax.swing.JPanel;

/**
 *
 * @author Vineet
 */
public class InventoryManagerRole extends Role {

    public InventoryManagerRole() {

        roleType = Role.INVENTORY_MANAGER_ROLE;
        personType = Person.INVENTORY_MANAGER;

    }

    @Override
    public JPanel getDashboard(Person person) {
        return new InventoryManagerDashboardPanel((InventoryManager) person);
    }

}
