/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business;

import com.neu.phmis.business.network.NetworkDirectory;
import com.neu.phmis.business.organization.Organization;
import com.neu.phmis.business.role.Role;
import com.neu.phmis.business.role.SystemAdminRole;
import com.neu.phmis.business.user.PersonDirectory;
import javax.swing.JOptionPane;

/**
 *
 * @author Vineet
 */
public class Ecosystem extends Organization {

    private static Ecosystem ecosystem;
    private NetworkDirectory networkDirectory;
    private PersonDirectory masterPersonDirectory;

    private Ecosystem() {

        organizationName = Organization.ORGANIZATION_ECOSYSTEM;
        networkDirectory = new NetworkDirectory();
        masterPersonDirectory = new PersonDirectory();

    }

    public NetworkDirectory getNetworkDirectory() {
        return networkDirectory;
    }

    public void setNetworkDirectory(NetworkDirectory networkDirectory) {
        this.networkDirectory = networkDirectory;
    }

    public PersonDirectory getMasterPersonDirectory() {
        return masterPersonDirectory;
    }

    public void setMasterPersonDirectory(PersonDirectory masterPersonDirectory) {
        this.masterPersonDirectory = masterPersonDirectory;
    }

    public static void setEcosystem(Ecosystem ecosystem) {
        Ecosystem.ecosystem = ecosystem;
    }

    /* Gets an instance of Ecosystem if exists or creates a new instance
    
     Parameters: NONE
    
     Returns:
     1. ecosystem -  ECOSYSTEM
     */
    public static Ecosystem getInstance() {

        try {

            if (ecosystem == null) {
                ecosystem = new Ecosystem();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            return ecosystem;
        }
    }

    @Override
    public Role getSupportedRoles() {
        return new SystemAdminRole();
    }

}
