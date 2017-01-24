/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.PersonRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Parth, Nikhil, Praneeth
 */
public class PeopleOrganization extends Organization{

    public PeopleOrganization() {
        super(GovernmentOrganizationType.People.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> supportedRoles = new ArrayList<Role>();
        supportedRoles.add(new PersonRole());
        return supportedRoles;
    }
    
}
