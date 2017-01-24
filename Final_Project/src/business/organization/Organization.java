/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.employee.EmployeeDirectory;
import business.role.Role;
import business.useraccount.UserAccountDirectory;
import business.workqueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Parth, Nikhil, Praneeth
 */
public abstract class Organization {

    private String name;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private WorkQueue workQueue;
    private int organizationID;
    private static int count=-2;

    public enum GovernmentOrganizationType {
//        Doctor("Doctor Organization"), Politician("Politician Organization"), Finance("Finance Organization"),
//        People("People Organization"), Police("Police Organization"), Teacher("Teacher Organization");
       People("People Organization");
        private String value;

        private GovernmentOrganizationType(String value) {
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
    
    

     public enum MedicalInstituteOrganizationType{
        Hospital("Hospital Organization"),Lab("Lab Organization"),Clinic("Clinic Organization");
        private String value;

        private MedicalInstituteOrganizationType(String value) {
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

    public Organization(String name) {
        this.name = name;
        this.employeeDirectory = new EmployeeDirectory();
        this.userAccountDirectory = new UserAccountDirectory();
        this.workQueue = new WorkQueue();
        this.organizationID = ++count;
    }

    public String getName() {
        return name;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public int getOrganizationID() {
        return organizationID;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    public abstract ArrayList<Role> getSupportedRole();

}
