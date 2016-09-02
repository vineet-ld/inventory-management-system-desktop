/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.organization;

import com.neu.phmis.business.role.Role;
import com.neu.phmis.business.role.SalesManagerRole;

/**
 *
 * @author Vineet
 */
public class SalesOrganization extends Organization {

    public SalesOrganization() {
        organizationName = ORGANIZATION_SALES;
    }

    @Override
    public Role getSupportedRoles() {
        return new SalesManagerRole();
    }

}
