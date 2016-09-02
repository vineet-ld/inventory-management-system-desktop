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
public class Room extends Resource {

    private String roomNo;
    private String location;
    private Date creationDate;

    public Room() {
        super(Resource.ROOM);
        roomNo = "";
        location = "";
        creationDate = new Date();
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return roomNo;
    }

}
