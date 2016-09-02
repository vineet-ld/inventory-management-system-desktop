/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.request;

import java.util.ArrayList;

/**
 *
 * @author Vineet
 */
public class RequestQueue {

    private ArrayList<Request> requestList;

    public RequestQueue() {
        requestList = new ArrayList<>();
    }

    public ArrayList<Request> getRequestList() {
        return requestList;
    }

    public void setRequestList(ArrayList<Request> requestList) {
        this.requestList = requestList;
    }

}
