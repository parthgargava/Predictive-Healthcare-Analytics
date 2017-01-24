/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;


import business.role.LabRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author dsain
 */
public class LabOrganization extends Organization{
     public LabOrganization() {
        super(MedicalInstituteOrganizationType.Lab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> supportedRoles = new ArrayList<Role>();
        
        supportedRoles.add(new LabRole());
        return supportedRoles;
    }
}
