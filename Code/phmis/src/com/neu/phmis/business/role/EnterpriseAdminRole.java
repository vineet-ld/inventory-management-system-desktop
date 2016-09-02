/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.role;

import com.neu.phmis.business.enterprise.Enterprise;
import com.neu.phmis.business.organization.Organization;
import com.neu.phmis.business.user.Person;
import com.neu.phmis.userinterface.enterpriseadmin.EnterpriseAdminDashboardPanel;
import javax.swing.JPanel;

/**
 *
 * @author Vineet
 */
public class EnterpriseAdminRole extends Role {

    public EnterpriseAdminRole() {
        roleType = Role.SUPPLIER_ADMIN_ROLE;
    }

    @Override
    public JPanel getDashboard(Person person) {
        return new EnterpriseAdminDashboardPanel(person);
    }

}
