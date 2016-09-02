/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.organization;

import com.neu.phmis.business.role.DoctorRole;
import com.neu.phmis.business.role.Role;
import com.neu.phmis.business.schedule.SurgicalSchedule;

/**
 *
 * @author Vineet
 */
public class DoctorOrganization extends Organization {

    private SurgicalSchedule surgicalSchedule;
    
    public DoctorOrganization() {
        organizationName = Organization.ORGANIZATION_DOCTOR;
        surgicalSchedule = new SurgicalSchedule();
    }

    public SurgicalSchedule getSurgicalSchedule() {
        return surgicalSchedule;
    }

    public void setSurgicalSchedule(SurgicalSchedule surgicalSchedule) {
        this.surgicalSchedule = surgicalSchedule;
    }

    @Override
    public Role getSupportedRoles() {
        return new DoctorRole();
    }

}
