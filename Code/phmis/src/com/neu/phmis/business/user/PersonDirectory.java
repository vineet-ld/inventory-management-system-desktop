/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.user;

import com.alee.laf.optionpane.WebOptionPane;
import com.neu.phmis.business.util.EncryptionUtil;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Vineet
 */
public class PersonDirectory {
    
    private ArrayList<Person> personList;
    
    public PersonDirectory() {
        personList = new ArrayList<>();
    }
    
    public ArrayList<Person> getPersonList() {
        return personList;
    }
    
    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    /* 
     Creates a new Person and adds to the list
    
     Parameters: NONE
    
     Returns: 
     1. person - PERSON object
     */
    public Person addPerson() {
        
        Person person = null;
        
        try {
            
            person = new Person();
            personList.add(person);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            return person;
        }
        
    }

    /* 
     Creates a new Person and adds to the list
    
     Parameters:
     1. personType - STRING type of person to be added
    
     Returns: 
     1. person - PERSON object
     */
    public Person addPerson(String personType) {
        
        Person person = null;
        
        try {
            
            if (personType.equals(Person.PRODUCT_MANAGER)) {
                person = new ProductManager();
            } else if (personType.equals(Person.SALES_MANAGER)) {
                person = new SalesManager();
            } else if (personType.equals(Person.INVENTORY_MANAGER)) {
                person = new InventoryManager();
            } else if (personType.equals(Person.ACCOUNT_MANAGER)) {
                person = new AccountManager();
            } else if (personType.equals(Person.DOCTOR)) {
                person = new Doctor();
            } else if (personType.equals(Person.RESOURCE_MANAGER)) {
                person = new ResourceManager();
            }
            personList.add(person);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            return person;
        }
        
    }

    /* 
     Authenticates user while signing in
    
     Parameters:
     1. userName - STRING 
     2. password - STRING MD5 encryted
    
     Returns:
     1. person - PERSON object if authenticated
     2. person - NULL if authentication fails
     */
    public Person authenticate(String userName, String password) {
        
        Person person = null;
        
        try {
            
            for (Person p : personList) {
                
                UserAccount userAccount = p.getUserAccount();
                
                if (userAccount.getUserName().equals(userName) && userAccount.getStatus() == 1) {
                    if (userAccount.getPassword().equals(EncryptionUtil.encrypt(password))) {
                        person = p;
                        break;
                    }
                } else if (userAccount.getUserName().equals(userName) && userAccount.getStatus() == 0) {
                    if (userAccount.getPassword().equals(password)) {
                        person = p;
                        break;
                    }
                }
                
                if (userAccount.getUserName().equals(userName)
                        && userAccount.getPassword().equals(password)
                        && userAccount.getStatus() == 1) {
                    person = p;
                    break;
                }
                
            }
            
        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured", "Error",
                    WebOptionPane.ERROR_MESSAGE);
        } finally {
            return person;
        }
        
    }
    
}
