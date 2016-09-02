/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.role;

import com.neu.phmis.business.organization.Organization;
import com.neu.phmis.business.user.Person;
import com.neu.phmis.userinterface.systemadmin.SystemAdminDashboardPanel;
import javax.swing.JPanel;

/**
 *
 * @author Vineet
 */
public class SystemAdminRole extends Role {

    public SystemAdminRole() {
        roleType = Role.SYSTEM_ADMIN_ROLE;
    }

    @Override
    public JPanel getDashboard(Person person) {
        return new SystemAdminDashboardPanel(person);
    }

}
