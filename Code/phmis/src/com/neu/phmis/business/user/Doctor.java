/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.user;

import com.neu.phmis.business.request.RequestQueue;

/**
 *
 * @author Vineet
 */
public class Doctor extends Person {

    private RequestQueue surgeryRequestQueue;

    public Doctor() {
        surgeryRequestQueue = new RequestQueue();
    }

    public RequestQueue getSurgeryRequestQueue() {
        return surgeryRequestQueue;
    }

    public void setSurgeryRequestQueue(RequestQueue surgeryRequestQueue) {
        this.surgeryRequestQueue = surgeryRequestQueue;
    }

}
