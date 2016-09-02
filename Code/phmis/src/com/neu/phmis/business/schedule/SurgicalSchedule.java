/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.schedule;

import com.neu.phmis.business.resource.SurgicalOperation;
import java.util.ArrayList;

/**
 *
 * @author Vineet
 */
public class SurgicalSchedule {

    private ArrayList<SurgicalOperation> operationList;

    public SurgicalSchedule() {
        operationList = new ArrayList<>();
    }

    public ArrayList<SurgicalOperation> getOperationList() {
        return operationList;
    }

    public void setOperationList(ArrayList<SurgicalOperation> operationList) {
        this.operationList = operationList;
    }

}
