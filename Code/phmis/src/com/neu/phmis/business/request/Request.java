/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.request;

import com.neu.phmis.business.user.Person;
import java.util.Date;

/**
 *
 * @author Vineet
 */
public abstract class Request {

    public static final String SCHEDULE_REQUEST = "Surgery Request";
    public static final String DEVICE_REQUEST = "Device Request";
    public static final String ORDER_REQUEST = "Order Request";

    private static int requestCount = 0;

    private String requestId;
    private Person sentBy;
    private Person processedBy;
    private Date createdOn;
    private Date processedOn;
    private String status;
    protected String requestType;
    private String processComment;

    public Request() {

        requestId = "R" + String.valueOf(new Date().getTime())
                + String.valueOf(++requestCount);
        createdOn = new Date();
        status = "";
        this.requestType = requestType;
        processComment = "";

    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Person getSentBy() {
        return sentBy;
    }

    public void setSentBy(Person sentBy) {
        this.sentBy = sentBy;
    }

    public Person getProcessedBy() {
        return processedBy;
    }

    public void setProcessedBy(Person processedBy) {
        this.processedBy = processedBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getProcessedOn() {
        return processedOn;
    }

    public void setProcessedOn(Date processedOn) {
        this.processedOn = processedOn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getProcessComment() {
        return processComment;
    }

    public void setProcessComment(String processComment) {
        this.processComment = processComment;
    }

    @Override
    public String toString() {
        return requestId;
    }

}
