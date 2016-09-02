/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.util;

import com.alee.laf.optionpane.WebOptionPane;
import com.alee.laf.panel.WebPanel;
import com.neu.phmis.business.Ecosystem;
import com.neu.phmis.business.config.DB4OConfig;
import com.neu.phmis.business.user.Person;
import com.neu.phmis.business.user.PersonDirectory;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JPanel;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

/**
 *
 * @author Vineet
 */
public class CommonUtil {

    /* Inserts a new JPanel on top of another
    
     Parameters:
     1. container - The main JPanel which will hold all the JPanels in a Card 
     Layout 
     2. indexName - A String provided as index to the inserted JPanel
     3. insertPanel - The JPanel which has to be inserted
     4. removePanel - JPANEL current panel which is displayed
    
     Returns: NONE 
     */
    public static void insertNewPanel(JPanel container, String indexName,
            JPanel insertPanel, JPanel removePanel) {

        try {
            if (removePanel != null) {
                container.remove(removePanel);
            }
            container.add(indexName, insertPanel);
            CardLayout cardLayout = (CardLayout) container.getLayout();
            cardLayout.next(container);
        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }

    }

    /* Removes current JPanel and displays the previous one
    
     Parameters:
     1. container - The main JPanel which will hold all the JPanels in a Card 
     Layout 
     2. removePanel - The JPanel which has to be removed
    
     Returns: NONE 
     */
//    public static void getPreviousPanel(JPanel container, JPanel removePanel) {
//
//        try {
//            container.remove(removePanel);
//            CardLayout cardLayout = (CardLayout) container.getLayout();
//            cardLayout.previous(container);
//        } catch (Exception e) {
//            WebOptionPane.showMessageDialog(null,
//                    "Some Unexpected Error Occured", "Error",
//                    WebOptionPane.ERROR_MESSAGE);
//        }
//
//    }

    /* Checks if email is valid or no
    
     Parameters:
     1. emailId - STRING email ID to be checked
    
     Returns:
     1. flag - BOOLEAN true if valid
     2. flag = BOOLEAN false if invalid
    
     Credits:
     1. http://stackoverflow.com/questions/16295329/email-address-validation-fails-when-domain-name-has-a-hyphen
     */
    public static boolean isEmailValid(String emailId) {

        boolean flag = false;

        try {
            String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)"
                    + "*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
            flag = emailId.matches(emailreg);
        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        } finally {
            return flag;
        }

    }

    /* Checks if username is valid or no
    
     Parameters:
     1. userName - STRING username to be checked
    
     Returns:
     1. flag - BOOLEAN true if valid
     2. flag = BOOLEAN false if invalid
    
     Credits:
     1. http://www.mkyong.com/regular-expressions/how-to-validate-username-with-regular-expression/
     */
    public static boolean isUsernameValid(String userName) {

        boolean flag = false;

        try {
            String userNameReg = "^[a-z0-9_-]{5,15}$";
            flag = userName.matches(userNameReg);
        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured" + e.getMessage(), "Error",
                    WebOptionPane.ERROR_MESSAGE);
        } finally {
            return flag;
        }

    }

    /* Checks if the email ID or username already exists or no
    
     Parameters:
     1. text - STRING to be checked
     2. checkType - STRING check for email ID or username
     3. personDirectory - PERSONDIRECTORY object 
    
     Returns:
     1. flag - BOOLEAN true if exists
     2. flag - BOOLEAN false if not exists
     */
    public static boolean exists(String text, String checkType,
            PersonDirectory personDirectory) {

        boolean flag = false;

        try {

            if (checkType.equals(Constants.EXISTS_EMAIL)) {
//                for (Person person : personDirectory.getPersonList()) {
//                    if (person.getEmailId().equals(text)) {
//                        flag = true;
//                    }
//                }
            } else if (checkType.equals(Constants.EXISTS_USERNAME)) {
                for (Person person : personDirectory.getPersonList()) {
                    if (person.getUserAccount().getUserName().equals(text)) {
                        flag = true;
                    }
                }
            }

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured", "Error",
                    WebOptionPane.ERROR_MESSAGE);
        } finally {
            return flag;
        }
    }

    /* Saves the changes to the data file
    
     Parameters:
     1. ecosystem - ECOSYSTEM object to be saved
    
     Returns: NONE
     */
    public static void saveChanges(Ecosystem ecosystem) {

        try {

            DB4OConfig dB4OConfig = new DB4OConfig();
            dB4OConfig.storeSystem(ecosystem);

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured", "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }

    }

    /* 
     Checks whether the String is a number or not
       
     Parameters:
     1. number - The String which is to be checked if its an Integer or not 
    
     Returns:
     1. true - BOOLEAN true if the string is not a number
     2. false - BOOLEAN false if the string is a number  
     */
    public static boolean isNAN(String number) {

        try {
            Double converted = Double.parseDouble(number);
            return false;
        } catch (NumberFormatException e) {
            return true;
        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured", "Error",
                    WebOptionPane.ERROR_MESSAGE);
            return true;
        }

    }

    /* Creates a new Date picker field
    
     Parameters:
     1. panel - WEBPANEL inside which the datepicker has to be created 
    
     Returns:
     1. Object - JDATEPICKER object which is the actual Date Picker Object */
    public static JDatePickerImpl createDatePicker(JPanel panel) {

        UtilDateModel utilDateModel = new UtilDateModel();
        JDatePanelImpl jDatePanelImpl = new JDatePanelImpl(utilDateModel);
        JDatePickerImpl jDatePickerImpl = new JDatePickerImpl(jDatePanelImpl);
        panel.add(jDatePickerImpl);

        utilDateModel.setSelected(true);

        return jDatePickerImpl;

    }

    /* Creates a new Date picker field
    
     Parameters:
     1. panel - WEBPANEL inside which the datepicker has to be created 
     2. date - STRING containing date which is to be set as default on the datepicker
    
     Returns:
     1. Object - JDATEPICKER object which is the actual Date Picker Object
     2. NULL - If there is exception during date conversion */
    public static JDatePickerImpl createDatePicker(WebPanel panel, String date) {

        try {

            Date defaultDate = new SimpleDateFormat("dd MMM, yyyy").parse(date);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(defaultDate);
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            int month = calendar.get(Calendar.MONTH);
            int year = calendar.get(Calendar.YEAR);

            UtilDateModel utilDateModel = new UtilDateModel();
            JDatePanelImpl jDatePanelImpl = new JDatePanelImpl(utilDateModel);
            JDatePickerImpl jDatePickerImpl
                    = new JDatePickerImpl(jDatePanelImpl);
            panel.add(jDatePickerImpl);

            utilDateModel.setDate(year, month, day);
            utilDateModel.setSelected(true);

            return jDatePickerImpl;

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured", "Error",
                    WebOptionPane.ERROR_MESSAGE);
            return null;
        }

    }

    /* Checks if the inserted date is a past date or not
    
     Parameters:
     1. date - DATE Object which is the inserted date that has to be checked
    
     Returns:
     1. true - If the inserted date is a past date
     2. false - If the inserted date is not a past date */
    public static boolean isPastDate(Date date) {

        boolean flag = false;

        try {
            Date currentDate = new Date();
            if (date.before(currentDate) || date.equals(currentDate)) {
                flag = true;
            } else {
                return false;
            }
        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured", "Error",
                    WebOptionPane.ERROR_MESSAGE);
        } finally {
            return flag;
        }
    }

    /* Changes the date format of the passed date
    
     Parameters:
     1. date - The date whose format has to be changed, as Date Object
     2. format - String representing the format in which the date has to be converted 
    
     Returns:
     1. Formatted date - String containing date in the new format
     2. NULL - If there is some error during conversion */
    public static String changeDateFormat(Date date, String format) {

        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
            return simpleDateFormat.format(date);
        } catch (Exception e) {
            return null;
        }

    }

    /* 
     Increments date by one day
    
     Parameters:
     1. originalDate - DATE object to be incremented
    
     Returns:
     1. date - DATE object the incremented date
     */
    public static Date getNextDate(Date originalDate) {

        Date date = null;

        try {

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(originalDate);
            calendar.add(Calendar.DATE, 1);
            date = calendar.getTime();

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured", "Error",
                    WebOptionPane.ERROR_MESSAGE);
        } finally {
            return date;
        }

    }

    /*
     Sets the time for the date object to zero
    
     Parameters:
     1. dateToBeConverted - DATE object
    
     Returns:
     date - DATE object the converted date
    
     Credits:
     1. http://stackoverflow.com/questions/7784067/compare-date-without-time
     */
    public static Date getZeroTimeDate(Date dateToBeConverted) {

        Date date = null;

        try {

            Calendar calendar = Calendar.getInstance();

            calendar.setTime(dateToBeConverted);
            calendar.set(Calendar.HOUR_OF_DAY, 0);
            calendar.set(Calendar.MINUTE, 0);
            calendar.set(Calendar.SECOND, 0);
            calendar.set(Calendar.MILLISECOND, 0);

            date = calendar.getTime();

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured", "Error",
                    WebOptionPane.ERROR_MESSAGE);
        } finally {
            return date;
        }

    }

}
