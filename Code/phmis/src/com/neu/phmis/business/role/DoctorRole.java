/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.role;

import com.neu.phmis.business.organization.DoctorOrganization;
import com.neu.phmis.business.organization.Organization;
import com.neu.phmis.business.user.Doctor;
import com.neu.phmis.business.user.Person;
import com.neu.phmis.userinterface.doctor.DoctorDashboardPanel;
import javax.swing.JPanel;

/**
 *
 * @author Vineet
 */
public class DoctorRole extends Role {

    public DoctorRole() {

        roleType = Role.DOCTOR_ROLE;
        personType = Person.DOCTOR;

    }

    @Override
    public JPanel getDashboard(Person person) {
        return new DoctorDashboardPanel((Doctor) person);
    }

}
