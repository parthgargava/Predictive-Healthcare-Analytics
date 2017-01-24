/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.useraccount;

import business.employee.Employee;
import business.role.Role;
import business.workqueue.WorkQueue;

/**
 *
 * @author Parth, Nikhil, Praneeth
 */
public class UserAccount {

    private String userName;
    private String password;
    private Role role;
    private WorkQueue workQueue;
    private Employee employee;
    private static int count;
    private int userID;

    public UserAccount(String userName, String password, Role role, Employee employee) {
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.workQueue = new WorkQueue();
        this.employee = employee;
        this.userID = ++count;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public Employee getEmployee() {
        return employee;
    }

    @Override
    public String toString() {
        return this.userName;
    }

    public int getUserID() {
        return userID;
    }
}
