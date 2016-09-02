/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.resource;

import com.alee.laf.optionpane.WebOptionPane;
import com.neu.phmis.business.enterprise.HospitalEnterprise;
import com.neu.phmis.business.inventory.InventoryItem;
import com.neu.phmis.business.schedule.ResourceSchedule;
import com.neu.phmis.business.schedule.Schedule;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Vineet
 */
public abstract class Resource {

    public static final String MEDICAL_STAFF = "Medical Staff";
    public static final String ROOM = "Room";

    private String resourceType;
    private ResourceSchedule resourceSchedule;

    public Resource(String resourceType) {

        this.resourceType = resourceType;
        resourceSchedule = new ResourceSchedule();

    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ResourceSchedule getResourceSchedule() {
        return resourceSchedule;
    }

    public void setResourceSchedule(ResourceSchedule resourceSchedule) {
        this.resourceSchedule = resourceSchedule;
    }

    /*
     Checks if the resource is available for reservation
    
     Paramters:
     1. date - DATE object for which availability has to be checked
    
     Returns:
     flag - BOOLEAN TRUE if resource is available
     flag - BOOLEAN FALSE if resource is unavailable
     */
    public boolean isAvailable(Date date) {

        boolean flag = true;

        try {

            for (Schedule schedule : resourceSchedule.getScheduleList()) {
                if (schedule.getScheduleDate().compareTo(date) == 0) {
                    flag = false;
                    break;
                }
            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        } finally {
            return flag;
        }

    }

    /*
     Reserves the resource for the surgery
    
     Parameters:
     1. reservationDate - DATE object
     2. hospitalEnterprise - HOSPITALENTERPRISE object which is reserving the 
     resource
    
     Returns: NONE
     */
    public void reserveResource(Date reservationDate,
            HospitalEnterprise hospitalEnterprise) {

        try {

            Schedule schedule = new Schedule(Schedule.SURGICAL_SCHEDULE);
            schedule.setHospitalEnterprise(hospitalEnterprise);
            schedule.setScheduleDate(reservationDate);
            resourceSchedule.getScheduleList().add(schedule);

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }

    }

}
