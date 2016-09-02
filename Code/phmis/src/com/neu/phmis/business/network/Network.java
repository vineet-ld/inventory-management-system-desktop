/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.network;

import com.neu.phmis.business.enterprise.EnterpriseDirectory;
import java.util.Date;

/**
 *
 * @author Vineet
 */
public class Network {

    private static int networkCount = 0;

    private String networkId;
    private String countyName;
    private Date creationDate;
    private EnterpriseDirectory hospitalEnterpriseDirectory;
    private EnterpriseDirectory supplierEnterpriseDirectory;
    private EnterpriseDirectory warehouseEnterpriseDirectory;

    public Network(String countyName) {

        this.countyName = countyName;
        creationDate = new Date();

        networkId = "N" + String.valueOf(new Date().getTime())
                + String.valueOf(++networkCount);

        hospitalEnterpriseDirectory = new EnterpriseDirectory();
        supplierEnterpriseDirectory = new EnterpriseDirectory();
        warehouseEnterpriseDirectory = new EnterpriseDirectory();

    }

    public String getNetworkId() {
        return networkId;
    }

    public String getCountyName() {
        return countyName;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public EnterpriseDirectory getHospitalEnterpriseDirectory() {
        return hospitalEnterpriseDirectory;
    }

    public void setHospitalEnterpriseDirectory(EnterpriseDirectory hospitalEnterpriseDirectory) {
        this.hospitalEnterpriseDirectory = hospitalEnterpriseDirectory;
    }

    public EnterpriseDirectory getSupplierEnterpriseDirectory() {
        return supplierEnterpriseDirectory;
    }

    public void setSupplierEnterpriseDirectory(EnterpriseDirectory supplierEnterpriseDirectory) {
        this.supplierEnterpriseDirectory = supplierEnterpriseDirectory;
    }

    public EnterpriseDirectory getWarehouseEnterpriseDirectory() {
        return warehouseEnterpriseDirectory;
    }

    public void setWarehouseEnterpriseDirectory(EnterpriseDirectory warehouseEnterpriseDirectory) {
        this.warehouseEnterpriseDirectory = warehouseEnterpriseDirectory;
    }

    @Override
    public String toString() {
        return countyName;
    }

}
