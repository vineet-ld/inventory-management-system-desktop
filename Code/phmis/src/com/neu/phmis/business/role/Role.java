/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.role;

import com.neu.phmis.business.Ecosystem;
import com.neu.phmis.business.organization.Organization;
import com.neu.phmis.business.user.Person;
import javax.swing.JPanel;

/**
 *
 * @author Vineet
 */
public abstract class Role {

    public static final String SYSTEM_ADMIN_ROLE = "System Administrator";
    public static final String HOSPITAL_ADMIN_ROLE = "Hospital Administrator";
    public static final String DOCTOR_ROLE = "Doctor";
    public static final String RESOURCE_MANAGER_ROLE = "Resource Manager";
    public static final String WAREHOUSE_ADMIN_ROLE = "Warehouse Administrator";
    public static final String INVENTORY_MANAGER_ROLE = "Inventory Manager";
    public static final String ACCOUNT_MANAGER_ROLE = "Account Manager";
    public static final String SUPPLIER_ADMIN_ROLE = "Supplier Administrator";
    public static final String PRODUCT_MANAGER_ROLE = "Product Manager";
    public static final String SALES_MANAGER_ROLE = "Sales Manager";

    protected String roleType;
    protected String personType;

    public String getRoleType() {
        return roleType;
    }

    public String getPersonType() {
        return personType;
    }

    @Override
    public String toString() {
        return roleType;
    }

    public abstract JPanel getDashboard(Person person);

}
