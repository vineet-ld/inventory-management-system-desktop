 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.request;

import com.neu.phmis.business.enterprise.HospitalEnterprise;
import java.util.ArrayList;

/**
 *
 * @author Vineet
 */
public class DeviceRequest extends Request {

    public static final String STATUS_PENDING = "Pending";
    public static final String STATUS_APPROVED = "Approved";
    public static final String STATUS_DISAPPROVED = "Disapproved";
    public static final String STATUS_CANCELLED = "Cancelled";
    public static final String STATUS_AVAILABLE = "Available";
    public static final String STATUS_HOLD = "On Hold";
    
    private ArrayList<String> deviceList;
    private String specialInstruction;
    private HospitalEnterprise hospitalEnterprise;

    public DeviceRequest() {

        deviceList = new ArrayList<>();
        specialInstruction = "";
        requestType = Request.DEVICE_REQUEST;

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

    public HospitalEnterprise getHospitalEnterprise() {
        return hospitalEnterprise;
    }

    public void setHospitalEnterprise(HospitalEnterprise hospitalEnterprise) {
        this.hospitalEnterprise = hospitalEnterprise;
    }

}
