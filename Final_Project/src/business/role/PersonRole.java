/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.organization.PeopleOrganization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.personrole.PersonWorkAreaJPanel;

/**
 *
 * @author Parth, Nikhil, Praneeth
 */
public class PersonRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem ecoSystem) {
        return new PersonWorkAreaJPanel(userProcessContainer, ecoSystem);
    }

    @Override
    public String toString() {
        return RoleType.Person.getValue();
    }
    
}
