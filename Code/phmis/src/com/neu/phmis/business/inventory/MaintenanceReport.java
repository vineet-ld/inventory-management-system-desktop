/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.inventory;

import com.neu.phmis.business.util.CommonUtil;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Vineet
 */
public class MaintenanceReport {

    private static int count = 0;

    private String reportID;
    private Date maintenanceDate;
    private Date reportCreationDate;
    private String report;
    private BigDecimal cost;

    public MaintenanceReport() {

        reportID = "R" + new Date().getTime() + (++count);
        reportCreationDate = new Date();
        report = "";

    }

    public String getReportID() {
        return reportID;
    }

    public void setReportID(String reportID) {
        this.reportID = reportID;
    }

    public Date getMaintenanceDate() {
        return maintenanceDate;
    }

    public void setMaintenanceDate(Date maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }

    public Date getReportCreationDate() {
        return reportCreationDate;
    }

    public void setReportCreationDate(Date reportCreationDate) {
        this.reportCreationDate = reportCreationDate;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return CommonUtil.changeDateFormat(maintenanceDate, "dd MMM, yyyy");
    }

}
