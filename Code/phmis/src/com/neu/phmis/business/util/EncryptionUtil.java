/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.util;

import com.alee.laf.optionpane.WebOptionPane;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Vineet
 */
public class EncryptionUtil {

    /* Encrpyts the string using MD5 encryption
    
     Parameters:
     1. input - STRING to be encryped
    
     Returns:
     1. hashtext - STRING which is encrypted
    
     Credits:
     1. http://www.asjava.com/core-java/java-md5-example/
     */
    public static String encrypt(String input) {

        String hashtext = "";

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            hashtext = number.toString(16);
            // Now we need to zero pad it if you actually want the full 32 chars.
//            while (hashtext.length() < 32) {
//                hashtext = "0" + hashtext;
//            }

        } catch (NoSuchAlgorithmException e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured", "Error",
                    WebOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured", "Error",
                    WebOptionPane.ERROR_MESSAGE);
        } finally {
            return hashtext;
        }

    }

}
