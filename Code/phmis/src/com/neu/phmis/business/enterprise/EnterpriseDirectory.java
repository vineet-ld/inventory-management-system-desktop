/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.enterprise;

import com.alee.laf.optionpane.WebOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Vineet
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    /*
     Creates new enterprise
    
     Parameters:
     1. enterpriseType - STRING
    
     Returns:
     1. hospitalEnterprise - HOSPITALENTERPRISE object
     2. warehouseEnterprise - WAREHOUSEENTERPRISE object
     3. supplierEnterprise = SUPPLIERENTERPRISE object
     */
    public Enterprise createEnterprise(String enterpriseType) {

        Enterprise enterprise = null;

        try {

            if (enterpriseType.equals(Enterprise.ENTERPRISE_HOSPITAL)) {

                enterprise = new HospitalEnterprise();
                enterpriseList.add(enterprise);

            } else if (enterpriseType.equals(Enterprise.ENTERPRISE_WAREHOUSE)) {

                enterprise = new WarehouseEnterprise();
                enterpriseList.add(enterprise);

            } else if (enterpriseType.equals(Enterprise.ENTERPRISE_SUPPLIER)) {

                enterprise = new SupplierEnterprise();
                enterpriseList.add(enterprise);

            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured", "Error",
                    WebOptionPane.ERROR_MESSAGE);
        } finally {
            return enterprise;
        }

    }

}
