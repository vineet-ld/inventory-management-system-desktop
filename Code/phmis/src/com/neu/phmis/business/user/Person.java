/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.user;

import com.neu.phmis.business.enterprise.Enterprise;
import com.neu.phmis.business.network.Network;
import com.neu.phmis.business.organization.Organization;
import java.util.Date;

/**
 *
 * @author Vineet
 */
public class Person {

    public static final String PRODUCT_MANAGER = "Product Manager";
    public static final String SALES_MANAGER = "Sales Manager";
    public static final String INVENTORY_MANAGER = "Inventory Manager";
    public static final String ACCOUNT_MANAGER = "Account Manager";
    public static final String RESOURCE_MANAGER = "Resource Manager";
    public static final String DOCTOR = "Doctor";

    private static int personCount = 0;

    private String firstName;
    private String lastName;
    private String personId;
    private String emailId;
    private Date dob;
    private String personalPhone;
    private String workPhone;

    private Address workAddress;
    private Address currentAddress;
    private Address permanentAddress;

    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
    private Network network;

    public Person() {

        firstName = "";
        lastName = "";
        personId = "";
        emailId = "";
        userAccount = new UserAccount();
        personId = "P" + String.valueOf(new Date().getTime())
                + String.valueOf(++personCount);
        workAddress = new Address(Address.WORK_ADDRESS);
        permanentAddress = new Address(Address.PERMANENT_ADDRESS);
        currentAddress = new Address(Address.CURRENT_ADDRESS);
        organization = null;
        network = null;

    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public String getPersonalPhone() {
        return personalPhone;
    }

    public void setPersonalPhone(String personalPhone) {
        this.personalPhone = personalPhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPersonId() {
        return personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public Address getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(Address currentAddress) {
        this.currentAddress = currentAddress;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    @Override
    public String toString() {
        return getFullName();
    }

}
