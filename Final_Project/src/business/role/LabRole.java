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

import userinterface.labRole.LabpersonWorkAreaJPanel;

/**
 *
 * @author dsain
 */
public class LabRole extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem ecoSystem) {
         return new LabpersonWorkAreaJPanel(userProcessContainer,userAccount, enterprise);
        
    }

    @Override
    public String toString() {
        return Role.RoleType.Lab.getValue();
    }
}
