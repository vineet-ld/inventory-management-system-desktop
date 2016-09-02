/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.config;

import com.alee.laf.optionpane.WebOptionPane;
import com.neu.phmis.business.util.Constants;
import java.util.ArrayList;

/**
 *
 * @author Vineet
 */
public class InitialConfig {

    public InitialConfig() {
        configureConstants();
    }

    private void configureConstants() {

        try {

            // Populating counties of Massachusetts
            ArrayList<String> counties = Constants.county;
            counties.add("Barnstable County");
            counties.add("Berkshire County");
            counties.add("Bristol County");
            counties.add("Dukes County");
            counties.add("Essex County");
            counties.add("Franklin County");
            counties.add("Hampden County");
            counties.add("Hampshire County");
            counties.add("Middlesex County");
            counties.add("Nantucket County");
            counties.add("Norfolk County");
            counties.add("Plymouth County");
            counties.add("Suffolk County");
            counties.add("Worchester County");

        } catch (Exception e) {
            WebOptionPane.showMessageDialog(null,
                    "Some Unexpected Error Occured", "Error",
                    WebOptionPane.ERROR_MESSAGE);
        }

    }

}
