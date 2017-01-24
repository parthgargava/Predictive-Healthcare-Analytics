/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.enterprise.Enterprise;
import business.geography.Country;
import business.organization.Organization;
import business.role.Role;
import business.role.SystemAdminRole;
import business.useraccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Parth, Nikhil, Praneeth
 */
public class EcoSystem extends Organization {

    private static EcoSystem ecoSystem;
    private ArrayList<Country> countryList;

    public static EcoSystem getInstance() {
        if (ecoSystem == null) {
            ecoSystem = new EcoSystem();
        }
        return ecoSystem;
    }

    private EcoSystem() {
        super(null);
        countryList = new ArrayList<Country>();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> supportedRoles = new ArrayList<Role>();
        supportedRoles.add(new SystemAdminRole());
        return supportedRoles;
    }

    public ArrayList<Country> getCountryList() {
        return countryList;
    }

    public Country createCountry(String name) {
        Country country = new Country(name);
        countryList.add(country);
        return country;
    }

    public boolean checkIfUserNameIsUnique(String userName) {

        for (Country country : countryList) {
            for (Enterprise enterprise : country.getEnterpriseDirectory().getEnterpriseDirectory()) {
                if (enterprise.getUserAccountDirectory().checkIfUserNameIsUnique(userName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkIfEnterpriseIsUnique(String enterpriseName) {

        for (Country country : countryList) {
            for (Enterprise enterprise : country.getEnterpriseDirectory().getEnterpriseDirectory()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getGovernmentOrganizationDirectory()) {
                    if (organization.getName().equalsIgnoreCase(enterpriseName)) {
                        return true;
                    }
                }
                for (Organization organization : enterprise.getOrganizationDirectory().getHospitalOrganizationDirectory()) {
                    if (organization.getName().equalsIgnoreCase(enterpriseName)) {
                        return true;
                    }
                }
                for (Organization organization : enterprise.getOrganizationDirectory().getLabOrganizationDirectory()) {
                    if (organization.getName().equalsIgnoreCase(enterpriseName)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
