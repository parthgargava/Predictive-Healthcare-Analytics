/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Parth, Nikhil, Praneeth
 */
public abstract class Role {

    public enum RoleType {
        Admin("Admin Role"), Volunteer("Volunteer Role"), Doctor("Doctor Role"), 
         Person("Person Role"), Patient("Patient Role"),  Lab("Lab Role");
        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer,
                                   UserAccount userAccount,
                                   Organization organization,
                                   Enterprise enterprise,
                                   EcoSystem ecoSystem);
    
    @Override
    public abstract String toString();
}
