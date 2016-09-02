/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.request;

import com.neu.phmis.business.resource.SurgicalOperation;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Vineet
 */
public class SurgeryRequest extends Request {

    public static final String STATUS_PENDING = "Pending";
    public static final String STATUS_SCHEDULED = "Scheduled";
    public static final String STATUS_FAILED = "Not Scheduled";

    private SurgicalOperation surgicalOperation;
    private Date startDate;
    private Date endDate;
    private ArrayList<String> deviceList;
    private String specialInstruction = "";
    private int noOfStaff;

    public SurgeryRequest() {

        surgicalOperation = new SurgicalOperation();
        deviceList = new ArrayList<>();
        requestType = Request.SCHEDULE_REQUEST;
        noOfStaff = 0;

    }

    public SurgicalOperation getSurgicalOperation() {
        return surgicalOperation;
    }

    public void setSurgicalOperation(SurgicalOperation surgicalOperation) {
        this.surgicalOperation = surgicalOperation;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public ArrayList<String> getDeviceList() {
        return deviceList;
    }

    public void setDeviceList(ArrayList<String> deviceList) {
        this.deviceList = deviceList;
    }

    public String getSpecialInstruction() {
        return specialInstruction;
    }

    public void setSpecialInstruction(String specialInstruction) {
        this.specialInstruction = specialInstruction;
    }

    public int getNoOfStaff() {
        return noOfStaff;
    }

    public void setNoOfStaff(int noOfStaff) {
        this.noOfStaff = noOfStaff;
    }

}
