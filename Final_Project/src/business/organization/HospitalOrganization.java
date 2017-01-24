/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;


import business.role.DoctorRole;
import business.role.PatientRole;
import business.role.Role;

import java.util.ArrayList;

/**
 *
 * @author dsain
 */
public class HospitalOrganization extends Organization{
     public HospitalOrganization() {
        super(MedicalInstituteOrganizationType.Hospital.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> supportedRoles = new ArrayList<Role>();
        
        supportedRoles.add(new DoctorRole());
        supportedRoles.add(new PatientRole());
        return supportedRoles;
    }
    
}
