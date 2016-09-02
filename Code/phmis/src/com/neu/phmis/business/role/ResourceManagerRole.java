/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.role;

import com.neu.phmis.business.user.Person;
import com.neu.phmis.business.user.ResourceManager;
import com.neu.phmis.userinterface.resourcemanager.ResourceManagerDashboardPanel;
import javax.swing.JPanel;

/**
 *
 * @author Vineet
 */
public class ResourceManagerRole extends Role {

    public ResourceManagerRole() {

        roleType = Role.RESOURCE_MANAGER_ROLE;
        personType = Person.RESOURCE_MANAGER;

    }

    @Override
    public JPanel getDashboard(Person person) {
        return new ResourceManagerDashboardPanel((ResourceManager) person);
    }

}
