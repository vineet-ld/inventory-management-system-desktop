/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.sales;

import java.util.Date;

/**
 *
 * @author Vineet
 */
public class Cheque extends Payment {

    private String chequeNumber;
    private Date dateOnCheque;
    private String bankName;

    public Cheque() {

        paymentType = Payment.CHEQUE;
        chequeNumber = "";
        bankName = "";

    }

    public String getChequeNumber() {
        return chequeNumber;
    }

    public void setChequeNumber(String chequeNumber) {
        this.chequeNumber = chequeNumber;
    }

    public Date getDateOnCheque() {
        return dateOnCheque;
    }

    public void setDateOnCheque(Date dateOnCheque) {
        this.dateOnCheque = dateOnCheque;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

}
