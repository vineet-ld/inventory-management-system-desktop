/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.sales;

import com.alee.laf.optionpane.WebOptionPane;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

/**
 *
 * @author Vineet
 */
public class PaymentHistory {

    private ArrayList<Payment> paymentList;

    public PaymentHistory() {
        paymentList = new ArrayList<>();
    }

    public ArrayList<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(ArrayList<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    /*
     Adds a new payment
    
     Paramter:
     1. paymentType - STRING
    
     Returns:
     1. payment - CASH object if payment type is cash
     2. payment - CHEQUE object if payment type is cheque
     3. payment - ETRANSFER object if payment type is etransfer
     */
    public Payment addPayment(String paymentType) {

        Payment payment = null;

        try {

            if (paymentType.equals(Payment.CASH)) {
                payment = new Cash();
            } else if (paymentType.equals(Payment.CHEQUE)) {
                payment = new Cheque();
            } else if (paymentType.equals(Payment.ETRANSFER)) {
                payment = new ETransfer();
            }

            paymentList.add(payment);

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        } finally {
            return payment;
        }

    }

    /*
     Calculates total payment for an order
    
     Paramters: NONE
    
     Returns:
     total - BIGDECIMAL object
     */
    public BigDecimal getTotalPayment() {

        BigDecimal total = BigDecimal.valueOf(0.0);

        try {

            for (Payment payment : paymentList) {
                total = BigDecimal.valueOf(total.doubleValue() + payment
                        .getAmount().doubleValue());
            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured\n" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        } finally {
            return total.setScale(2, RoundingMode.CEILING);
        }

    }

}
