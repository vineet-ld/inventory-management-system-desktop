/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.user;

import com.alee.laf.optionpane.WebOptionPane;
import com.neu.phmis.business.Ecosystem;
import com.neu.phmis.business.enterprise.Enterprise;
import com.neu.phmis.business.enterprise.HospitalEnterprise;
import com.neu.phmis.business.enterprise.WarehouseEnterprise;
import com.neu.phmis.business.network.Network;
import com.neu.phmis.business.request.RequestQueue;

/**
 *
 * @author Vineet
 */
public class ResourceManager extends Person {

    private RequestQueue deviceRequestQueue;

    public ResourceManager() {
        deviceRequestQueue = new RequestQueue();
    }

    public RequestQueue getDeviceRequestQueue() {
        return deviceRequestQueue;
    }

    public void setDeviceRequestQueue(RequestQueue deviceRequestQueue) {
        this.deviceRequestQueue = deviceRequestQueue;
    }

    /*
     Retrieves the network in which the resource manager is present
    
     Parameters: NONE
    
     Returns:
     1. network - NETWORK object
     */
    public Network retrieveNetwork() {

        Network network = null;

        try {

            if (this.getNetwork() != null) {
                network = this.getNetwork();
            } else {

                for (Network n : Ecosystem.getInstance().getNetworkDirectory()
                        .getNetworkList()) {
                    for (Enterprise enterprise : n
                            .getHospitalEnterpriseDirectory()
                            .getEnterpriseList()) {
                        if ((HospitalEnterprise) enterprise
                                == this.getEnterprise()) {
                            network = n;
                            this.setNetwork(network);
                        }
                    }
                }

            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        } finally {
            return network;
        }

    }

}
