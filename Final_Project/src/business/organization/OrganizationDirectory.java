/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.organization.Organization.GovernmentOrganizationType;

import business.organization.Organization.MedicalInstituteOrganizationType;
import java.util.ArrayList;

/**
 *
 * @author Parth, Nikhil, Praneeth
 */
public class OrganizationDirectory {

    private ArrayList<Organization> governmentOrganizationDirectory;
    
    private ArrayList<HospitalOrganization> hospitalOrganizationDirectory;
    private ArrayList<LabOrganization> labOrganizationDirectory;

    public OrganizationDirectory() {
        this.governmentOrganizationDirectory = new ArrayList<Organization>();
        
        this.hospitalOrganizationDirectory= new ArrayList<HospitalOrganization>();
        this.labOrganizationDirectory= new ArrayList<LabOrganization>();
    }

    public ArrayList<Organization> getGovernmentOrganizationDirectory() {
        return governmentOrganizationDirectory;
    }

   
     public ArrayList<HospitalOrganization> getHospitalOrganizationDirectory() {
        return hospitalOrganizationDirectory;
    }
     public ArrayList<LabOrganization> getLabOrganizationDirectory() {
        return labOrganizationDirectory;
    }

    public Organization createAGovernmentOrganization(GovernmentOrganizationType type) {
        Organization organization = null;
        

        if (type.getValue().equals(GovernmentOrganizationType.People.getValue())) {
            organization = new PeopleOrganization();
            governmentOrganizationDirectory.add(organization);
        }
       
        return organization;
    }
    
   
    public Organization createAnHospitalOrganization(MedicalInstituteOrganizationType type){
        Organization organization = null;
        if (type.getValue().equals(MedicalInstituteOrganizationType.Hospital.getValue())) {
            organization = new HospitalOrganization();
            hospitalOrganizationDirectory.add((HospitalOrganization) organization);
        }
        return organization;
    }

     public Organization createAnLabOrganization(MedicalInstituteOrganizationType type){
        Organization organization = null;
        if (type.getValue().equals(MedicalInstituteOrganizationType.Lab.getValue())) {
            organization = new LabOrganization();
            //labOrganizationDirectory= new ArrayList<LabOrganization>();
            labOrganizationDirectory.add((LabOrganization) organization);
            
        }
     return organization;
     }
}
