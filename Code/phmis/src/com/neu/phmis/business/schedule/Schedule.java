/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.schedule;

import com.neu.phmis.business.enterprise.HospitalEnterprise;
import com.neu.phmis.business.util.CommonUtil;
import java.util.Date;

/**
 *
 * @author Vineet
 */
public class Schedule {

    public static final String MAINTENANCE_SCHEDULE = "Maintenance Schedule";
    public static final String SURGICAL_SCHEDULE = "Surgical Schedule";

    private Date scheduleDate;
    private String scheduleType;
    private HospitalEnterprise hospitalEnterprise;

    public Schedule(String scheduleType) {
        this.scheduleType = scheduleType;
    }

    public Date getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(Date scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public String getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
    }

    public HospitalEnterprise getHospitalEnterprise() {
        return hospitalEnterprise;
    }

    public void setHospitalEnterprise(HospitalEnterprise hospitalEnterprise) {
        this.hospitalEnterprise = hospitalEnterprise;
    }

    @Override
    public String toString() {
        return CommonUtil.changeDateFormat(scheduleDate, "dd MMM, yyyy");
    }

}
