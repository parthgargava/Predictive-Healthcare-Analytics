/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.geography.*;
import business.role.SystemAdminRole;

/**
 *
 * @author Parth, Nikhil, Praneeth
 */
public class ConfigureASystem {

    public static EcoSystem configure() {
        EcoSystem ecoSystem = EcoSystem.getInstance();
        Country country = ecoSystem.createCountry("USA");
        State state = country.createANewState("Massachusetts");
        state.createANewCity("Boston");
        ecoSystem.getUserAccountDirectory().addUserAccount("Admin", "admin", new SystemAdminRole(),  ecoSystem.getEmployeeDirectory().createAnEmployee("Nikhil"));
        return ecoSystem;
    }
}
