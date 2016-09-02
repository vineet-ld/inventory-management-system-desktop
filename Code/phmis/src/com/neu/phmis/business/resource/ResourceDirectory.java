/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.resource;

import com.alee.laf.optionpane.WebOptionPane;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Vineet
 */
public class ResourceDirectory {

    private ArrayList<Resource> roomList;
    private ArrayList<Resource> medicalStaffList;

    public ResourceDirectory() {
        roomList = new ArrayList<>();
        medicalStaffList = new ArrayList<>();
    }

    public ArrayList<Resource> getRoomList() {
        return roomList;
    }

    public void setRoomList(ArrayList<Resource> roomList) {
        this.roomList = roomList;
    }

    public ArrayList<Resource> getMedicalStaffList() {
        return medicalStaffList;
    }

    public void setMedicalStaffList(ArrayList<Resource> medicalStaffList) {
        this.medicalStaffList = medicalStaffList;
    }

    /*
     Creates a new resource and adds to the list
    
     Parameters:
     1. resourceType - STRING
    
     Returns:
     1. resource - ROOM object if resourceType is room
     2. resource - MEDICIALSTAFF object if resourceType is medical staff
     */
    public Resource addResource(String resourceType) {

        Resource resource = null;

        try {

            if (resourceType.equals(Resource.ROOM)) {
                resource = new Room();
                roomList.add(resource);
            } else if (resourceType.equals(Resource.MEDICAL_STAFF)) {
                resource = new MedicalStaff();
                medicalStaffList.add(resource);
            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        } finally {
            return resource;
        }

    }

    /*
     Retrieves all available resource
    
     Parameters:
     1. date - DATE object on which the resource are to be retrieved
    
     Returns:
     1. resourceList - ARRAYLIST of RESOURCE object
     */
    public ArrayList<Resource> getAvailableResource(Date date,
            String resourceType) {

        ArrayList<Resource> resourceList = new ArrayList<>();

        try {

            if (resourceType.equals(Resource.ROOM)) {
                for (Resource resource : roomList) {
                    if (resource.isAvailable(date)) {
                        resourceList.add(resource);
                    }
                }
            } else if (resourceType.equals(Resource.MEDICAL_STAFF)) {
                for (Resource resource : medicalStaffList) {
                    if (resource.isAvailable(date)) {
                        resourceList.add(resource);
                    }
                }
            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        } finally {
            return resourceList;
        }

    }

}
