/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.enterprise;

import com.alee.laf.optionpane.WebOptionPane;
import com.neu.phmis.business.organization.Organization;
import com.neu.phmis.business.organization.OrganizationDirectory;
import java.util.Date;

/**
 *
 * @author Vineet
 */
public abstract class Enterprise extends Organization {

    public static final String ENTERPRISE_HOSPITAL = "Hospital";
    public static final String ENTERPRISE_WAREHOUSE = "Warehouse";
    public static final String ENTERPRISE_SUPPLIER = "Supplier";

    public static int enterpriseCount = 0;

    private String enterpriseId;
    private String enterpriseName;
    private OrganizationDirectory organizationDirectory;
    private String enterpriseType;

    public Enterprise(String enterpriseType) {

        enterpriseName = "";
        organizationDirectory = new OrganizationDirectory();
        this.enterpriseType = enterpriseType;
        enterpriseId = "E" + String.valueOf(new Date().getTime())
                + String.valueOf(++enterpriseCount);

    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public abstract void setSupportedOrganizations();

    /* 
     Retrieves an organization from the enteprise
    
     Paramters:
     1. organizationType - STRING
    
     Returns:
     1. organization - ORGANIZATION object
     */
    public Organization getOrganization(String organizationType) {

        Organization organization = null;

        try {

            for (Organization o : organizationDirectory.getOrganizationList()) {
                if (o.getOrganizationName()
                        .equals(organizationType)) {
                    organization = o;
                }
            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        } finally {
            return organization;
        }

    }

    @Override
    public String toString() {
        return enterpriseName;
    }

}
