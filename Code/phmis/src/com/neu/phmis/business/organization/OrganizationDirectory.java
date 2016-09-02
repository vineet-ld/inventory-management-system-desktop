/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.organization;

import com.alee.laf.optionpane.WebOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Vineet
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }

    /* 
     Creates a new organization
    
     Parameters:
     organizationType - STRING
    
     Returns: NONE
     */
    public void createOrganization(String organizationType) {

        try {

            if (organizationType.equals(Organization.ORGANIZATION_DOCTOR)) {

                DoctorOrganization doctorOrganization
                        = new DoctorOrganization();
                organizationList.add(doctorOrganization);

            } else if (organizationType
                    .equals(Organization.ORGANIZATION_RESOURCE)) {

                ResourceOrganization resourceOrganization
                        = new ResourceOrganization();
                organizationList.add(resourceOrganization);

            } else if (organizationType
                    .equals(Organization.ORGANIZATION_INVENTORY)) {

                InventoryOrganization inventoryOrganization
                        = new InventoryOrganization();
                organizationList.add(inventoryOrganization);

            } else if (organizationType
                    .equals(Organization.ORGANIZATION_ACCOUNT)) {

                AccountOrganization accountOrganization
                        = new AccountOrganization();
                organizationList.add(accountOrganization);

            } else if (organizationType
                    .equals(Organization.ORGANIZATION_PRODUCT)) {

                ProductOrganization productOrganization
                        = new ProductOrganization();
                organizationList.add(productOrganization);

            } else if (organizationType
                    .equals(Organization.ORGANIZATION_SALES)) {

                SalesOrganization salesOrganization
                        = new SalesOrganization();
                organizationList.add(salesOrganization);

            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured", "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }

    }
}
