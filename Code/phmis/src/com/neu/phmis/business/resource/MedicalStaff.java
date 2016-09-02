/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.resource;

import java.util.Date;

/**
 *
 * @author Vineet
 */
public class MedicalStaff extends Resource {

    private static int staffCount = 0;

    private String staffId;
    private String staffName;
    private int isLeader;

    public MedicalStaff() {
        super(Resource.MEDICAL_STAFF);
        staffId = "R" + String.valueOf(new Date().getTime())
                + String.valueOf(++staffCount);
        staffName = "";
        isLeader = 0;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public int getIsLeader() {
        return isLeader;
    }

    public void setIsLeader(int isLeader) {
        this.isLeader = isLeader;
    }

    @Override
    public String toString() {
        return staffName;
    }

}
