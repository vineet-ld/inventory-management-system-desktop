/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.inventory;

import com.alee.laf.optionpane.WebOptionPane;
import com.neu.phmis.business.enterprise.HospitalEnterprise;
import com.neu.phmis.business.schedule.ItemSchedule;
import com.neu.phmis.business.schedule.Schedule;
import com.neu.phmis.business.util.CommonUtil;
import java.util.Date;

/**
 *
 * @author Vineet
 */
public class InventoryItem {

    public static final String CONDITION_NEW = "New";
    public static final String CONDITION_GOOD = "Good";
    public static final String CONDITION_WORKING = "Working";
    public static final String CONDITION_DAMAGED = "Damaged";
    public static final String CONDITION_MAINTENANCE = "Due For Maintenance";

    private static int itemCount = 0;

    private String serialNumber;
    private ItemSchedule itemSchedule;
    private Product product;
    private String condition;
    private Date addedOn;
    private MaintenanceHistory maintenanceHistory;

    public InventoryItem() {

        serialNumber = "I" + String.valueOf(new Date().getTime())
                + String.valueOf(++itemCount);
        itemSchedule = new ItemSchedule();
        product = new Product();
        condition = InventoryItem.CONDITION_NEW;
        addedOn = new Date();
        maintenanceHistory = new MaintenanceHistory();

    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public ItemSchedule getItemSchedule() {
        return itemSchedule;
    }

    public void setItemSchedule(ItemSchedule itemSchedule) {
        this.itemSchedule = itemSchedule;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Date getAddedOn() {
        return addedOn;
    }

    public void setAddedOn(Date addedOn) {
        this.addedOn = addedOn;
    }

    public MaintenanceHistory getMaintenanceHistory() {
        return maintenanceHistory;
    }

    public void setMaintenanceHistory(MaintenanceHistory maintenanceHistory) {
        this.maintenanceHistory = maintenanceHistory;
    }

    @Override
    public String toString() {
        return product.getProductName();
    }

    /*
     Checks if the inventory item is available for reservation
    
     Paramters:
     1. date - DATE object for which availability has to be checked
    
     Returns:
     flag - BOOLEAN TRUE if device is available
     flag - BOOLEAN FALSE if device is unavailable
     */
    public boolean isAvailable(Date date) {

        boolean flag = true;

        try {

            for (Schedule schedule : itemSchedule.getScheduleList()) {
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
     Reserves the device for the surgery
    
     Parameters:
     1. reservationDate - DATE object
     2. hospitalEnterprise - HOSPITALENTERPRISE object which is reserving the 
     device
    
     Returns: NONE
     */
    public void reserveDevice(Date reservationDate,
            HospitalEnterprise hospitalEnterprise, String scheduleType) {

        try {

            Schedule schedule = new Schedule(scheduleType);
            schedule.setHospitalEnterprise(hospitalEnterprise);
            schedule.setScheduleDate(reservationDate);
            itemSchedule.getScheduleList().add(schedule);

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }

    }

    /* 
     Calculates the total usage of the item 
    
     Paramters: NONE
    
     Returns:
     1. counter - INT number of times the device is used
     */
    public int getUsage() {

        int counter = 0;

        try {

            for (Schedule schedule : itemSchedule.getScheduleList()) {
                if (schedule.getScheduleDate().before(new Date())) {
                    counter++;
                }
            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        } finally {
            return counter;
        }

    }

    /* 
     Retrieves the maintenance schedule of the device
    
     Paramters: NONE
    
     Returns:
     1. schedule - SCHEDULE object
     */
    public Schedule getMaintenanceSchedule() {

        Schedule schedule = null;

        try {

            for (Schedule s : itemSchedule.getScheduleList()) {
                if (s.getScheduleType().equals(Schedule.MAINTENANCE_SCHEDULE)) {
                    schedule = s;
                    break;
                }
            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        } finally {
            return schedule;
        }

    }

    /*
     Gets the schedule of the device for a particular date
    
     Paramters:
     1. date - DATE object at which schedule has to be retrieved
    
     Returns:
     1. schedule - SCHEDULE object
     */
    public Schedule getSchedule(Date date) {

        Schedule schedule = null;

        try {

            for (Schedule s : itemSchedule.getScheduleList()) {
                if (CommonUtil.getZeroTimeDate(s.getScheduleDate())
                        .equals(CommonUtil.getZeroTimeDate(date))) {
                    schedule = s;
                    break;
                }
            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        } finally {
            return schedule;
        }

    }

}
