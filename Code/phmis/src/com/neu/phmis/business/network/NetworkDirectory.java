/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.network;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Vineet
 */
public class NetworkDirectory {

    private ArrayList<Network> networkList;

    public NetworkDirectory() {
        networkList = new ArrayList<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    /* Creates a new network and adds to the list
    
     Parameters:
     1. network - NETWORK object
     */
    public Network addNetwork(String countyName) {

        Network network = null;

        try {

            boolean flag = true;
            for (Network n : networkList) {
                if (n.getCountyName().equals(countyName)) {
                    flag = false;
                }
            }

            if (flag) {
                network = new Network(countyName);
                networkList.add(network);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            return network;
        }

    }

}
