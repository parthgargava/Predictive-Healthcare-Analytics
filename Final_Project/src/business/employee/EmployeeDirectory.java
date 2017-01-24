/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.employee;

import java.util.ArrayList;

/**
 *
 * @author Parth, Nikhil, Praneeth
 */
public class EmployeeDirectory {

    private ArrayList<Employee> employeeDirectory;

    public EmployeeDirectory() {
        this.employeeDirectory = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployeeDirectory() {
        return employeeDirectory;
    }

    public Employee createAnEmployee(String name) {
        Employee employee = new Employee(name);
        employeeDirectory.add(employee);
        return employee;
    }

}
