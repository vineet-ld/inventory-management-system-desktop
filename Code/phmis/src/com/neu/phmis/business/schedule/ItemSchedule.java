/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.schedule;

import java.util.ArrayList;

/**
 *
 * @author Vineet
 */
public class ItemSchedule {
    
    private ArrayList<Schedule> scheduleList;
    
    public ItemSchedule(){
        scheduleList = new ArrayList<>();
    }

    public ArrayList<Schedule> getScheduleList() {
        return scheduleList;
    }

    public void setScheduleList(ArrayList<Schedule> scheduleList) {
        this.scheduleList = scheduleList;
    }
    
}
