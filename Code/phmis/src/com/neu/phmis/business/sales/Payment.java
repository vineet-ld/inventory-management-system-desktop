/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.sales;

import com.neu.phmis.business.util.CommonUtil;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Vineet
 */
public abstract class Payment {

    public static final String CHEQUE = "Cheque Payment";
    public static final String CASH = "Cash Payment";
    public static final String ETRANSFER = "E-Transfer Payment";

    private String paymentNumber;
    private Date paymentDate;
    protected String paymentType;
    private BigDecimal amount;

    public Payment() {
        paymentNumber = String.valueOf(new Date().getTime());
    }

    public String getPaymentNumber() {
        return paymentNumber;
    }

    public void setPaymentNumber(String paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return CommonUtil.changeDateFormat(paymentDate, "dd MMM, yyyy");
    }

}
