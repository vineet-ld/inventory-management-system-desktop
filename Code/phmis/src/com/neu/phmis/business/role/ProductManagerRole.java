/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.role;

import com.neu.phmis.business.organization.Organization;
import com.neu.phmis.business.organization.ProductOrganization;
import com.neu.phmis.business.user.Person;
import com.neu.phmis.business.user.ProductManager;
import com.neu.phmis.userinterface.productmanager.ProductManagerDashboardPanel;
import javax.swing.JPanel;

/**
 *
 * @author Vineet
 */
public class ProductManagerRole extends Role {

    public ProductManagerRole() {

        roleType = Role.PRODUCT_MANAGER_ROLE;
        personType = Person.PRODUCT_MANAGER;

    }

    @Override
    public JPanel getDashboard(Person person) {
        return new ProductManagerDashboardPanel((ProductManager) person);
    }

}
