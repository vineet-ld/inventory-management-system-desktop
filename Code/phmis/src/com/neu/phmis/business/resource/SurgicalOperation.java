/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.resource;

import com.neu.phmis.business.inventory.InventoryItem;
import com.neu.phmis.business.user.Doctor;
import com.neu.phmis.business.util.CommonUtil;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Vineet
 */
public class SurgicalOperation {
    
    public static int surgeryCount = 0;
    
    private String surgeryId;
    private String surgeryType;
    private Date scheduleDate;
    private Date scheduleTime;
    private String patientName;
    
    private Doctor doctor;
    private ArrayList<MedicalStaff> medicalTeam;
    private Room room;
    private ArrayList<InventoryItem> inventoryList;
    
    public SurgicalOperation() {
        
        surgeryId = "S" + String.valueOf(new Date().getTime())
                + String.valueOf(++surgeryCount);
        surgeryType = "";
        patientName = "";
        medicalTeam = new ArrayList<>();
        inventoryList = new ArrayList<>();
        
    }
    
    public String getSurgeryId() {
        return surgeryId;
    }
    
    public void setSurgeryId(String surgeryId) {
        this.surgeryId = surgeryId;
    }
    
    public String getSurgeryType() {
        return surgeryType;
    }
    
    public void setSurgeryType(String surgeryType) {
        this.surgeryType = surgeryType;
    }
    
    public Date getScheduleDate() {
        return scheduleDate;
    }
    
    public void setScheduleDate(Date scheduleDate) {
        this.scheduleDate = scheduleDate;
    }
    
    public Date getScheduleTime() {
        return scheduleTime;
    }
    
    public void setScheduleTime(Date scheduleTime) {
        this.scheduleTime = scheduleTime;
    }
    
    public String getPatientName() {
        return patientName;
    }
    
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    
    public Doctor getDoctor() {
        return doctor;
    }
    
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
    public ArrayList<MedicalStaff> getMedicalTeam() {
        return medicalTeam;
    }
    
    public void setMedicalTeam(ArrayList<MedicalStaff> medicalTeam) {
        this.medicalTeam = medicalTeam;
    }
    
    public Room getRoom() {
        return room;
    }
    
    public void setRoom(Room room) {
        this.room = room;
    }

    public ArrayList<InventoryItem> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(ArrayList<InventoryItem> inventoryList) {
        this.inventoryList = inventoryList;
    }
    
    @Override
    public String toString() {
        return CommonUtil.changeDateFormat(scheduleDate, "dd MMM, yyyy");
    }
    
}
