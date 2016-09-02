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
public class AccountManagerRole extends Role {

    public AccountManagerRole() {

        roleType = Role.ACCOUNT_MANAGER_ROLE;
        personType = Person.ACCOUNT_MANAGER;

    }

    @Override
    public JPanel getDashboard(Person person) {
        return null;
    }

}
