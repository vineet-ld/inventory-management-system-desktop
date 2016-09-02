/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.user;

/**
 *
 * @author Vineet
 */
public class Address {
    
    public static final String WORK_ADDRESS = "Work Address";
    public static final String CURRENT_ADDRESS = "Current Address";
    public static final String PERMANENT_ADDRESS = "Permanent Address";
    
    private String street;
    private String apartment;
    private String city;
    private String state;
    private String zipCode;
    private String addressType;
    
    public Address(String addressType){
        
        this.addressType = addressType;
        street = "";
        apartment = "";
        city = "";
        state = "";
        zipCode = "";
               
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getAddressType() {
        return addressType;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
}
