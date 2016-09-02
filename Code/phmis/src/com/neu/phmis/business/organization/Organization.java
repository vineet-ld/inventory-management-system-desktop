/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.organization;

import com.neu.phmis.business.role.Role;
import com.neu.phmis.business.user.PersonDirectory;
import java.util.Date;

/**
 *
 * @author Vineet
 */
public abstract class Organization {

    public static final String ORGANIZATION_ECOSYSTEM = "Partner's Healthcare, "
            + "Inc.";
    public static final String ORGANIZATION_DOCTOR = "Doctor Organization";
    public static final String ORGANIZATION_RESOURCE = "Resource Organization";
    public static final String ORGANIZATION_INVENTORY = "Inventory "
            + "Organization";
    public static final String ORGANIZATION_ACCOUNT = "Finance Organization";
    public static final String ORGANIZATION_PRODUCT = "Product Organization";
    public static final String ORGANIZATION_SALES = "Sales Organization";

    private static int organizationCount = 0;

    protected String organizationName;
    private String organizationId;
    private PersonDirectory personDirectory;

    public Organization() {

        organizationId = "O" + String.valueOf(new Date().getTime())
                + String.valueOf(++organizationCount);
        personDirectory = new PersonDirectory();

    }

    public String getOrganizationName() {
        return organizationName;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public abstract Role getSupportedRoles();

    @Override
    public String toString() {
        return organizationName;
    }

}
