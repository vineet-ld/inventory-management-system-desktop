/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.inventory;

import com.alee.laf.optionpane.WebOptionPane;
import com.neu.phmis.business.util.CommonUtil;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Vineet
 */
public class MaintenanceHistory {

    private ArrayList<MaintenanceReport> reportList;

    public MaintenanceHistory() {
        reportList = new ArrayList<>();
    }

    public ArrayList<MaintenanceReport> getReportList() {
        return reportList;
    }

    public void setReportList(ArrayList<MaintenanceReport> reportList) {
        this.reportList = reportList;
    }

    /* 
     Creates a new maintenance report
    
     Parameters:
     1. maintenanceDate - DATE object for which the report is generated
    
     Returns:
     maintenanceReport - MAINTENANCEREPORT object
     */
    public MaintenanceReport createNewReport(Date maintenanceDate) {

        MaintenanceReport maintenanceReport = null;

        try {

            boolean flag = true;
            for (MaintenanceReport mr : reportList) {
                if (CommonUtil.getZeroTimeDate(mr.getMaintenanceDate())
                        .equals(CommonUtil.getZeroTimeDate(maintenanceDate))) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                maintenanceReport = new MaintenanceReport();
                maintenanceReport.setMaintenanceDate(maintenanceDate);
                reportList.add(maintenanceReport);
            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        } finally {
            return maintenanceReport;
        }

    }

}
