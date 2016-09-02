/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.enterprise;

import com.neu.phmis.business.request.RequestQueue;
import com.neu.phmis.business.resource.SurgicalOperation;
import com.neu.phmis.business.role.EnterpriseAdminRole;
import com.neu.phmis.business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Vineet
 */
public class HospitalEnterprise extends Enterprise {

    private RequestQueue surgeryRequestQueue;
    private ArrayList<SurgicalOperation> surgeryList;

    public HospitalEnterprise() {

        super(ENTERPRISE_HOSPITAL);
        surgeryRequestQueue = new RequestQueue();
        surgeryList = new ArrayList<>();

    }

    public RequestQueue getSurgeryRequestQueue() {
        return surgeryRequestQueue;
    }

    public void setSurgeryRequestQueue(RequestQueue surgeryRequestQueue) {
        this.surgeryRequestQueue = surgeryRequestQueue;
    }

    public ArrayList<SurgicalOperation> getSurgeryList() {
        return surgeryList;
    }

    public void setSurgeryList(ArrayList<SurgicalOperation> surgeryList) {
        this.surgeryList = surgeryList;
    }

    @Override
    public Role getSupportedRoles() {
        return new EnterpriseAdminRole();
    }

    @Override
    public void setSupportedOrganizations() {

        getOrganizationDirectory().createOrganization(ORGANIZATION_DOCTOR);
        getOrganizationDirectory().createOrganization(ORGANIZATION_RESOURCE);

    }

}
