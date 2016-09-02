/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.organization;

import com.neu.phmis.business.role.AccountManagerRole;
import com.neu.phmis.business.role.Role;

/**
 *
 * @author Vineet
 */
public class AccountOrganization extends Organization {

    public AccountOrganization() {
        organizationName = ORGANIZATION_ACCOUNT;
    }

    @Override
    public Role getSupportedRoles() {
        return new AccountManagerRole();
    }

}
