/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.sales;

/**
 *
 * @author Vineet
 */
public class ETransfer extends Payment {

    private String transactionId;
    private String bankName;

    public ETransfer() {
        transactionId = "";
        bankName = "";
        paymentType = Payment.ETRANSFER;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

}
