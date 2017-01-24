/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.useraccount;

import business.employee.Employee;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Parth, Nikhil, Praneeth
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountDirectory;

    public UserAccountDirectory() {
        this.userAccountDirectory = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
    public UserAccount authenticateUser(String userName, String password){
        for (UserAccount userAccount : userAccountDirectory) {
            if (userAccount.getUserName().equals(userName) && userAccount.getPassword().equals(password)) {
                return userAccount;
            }
        }
        return null;
    }
    
    public boolean checkIfUserNameIsUnique(String userName){
        for (UserAccount userAccount : userAccountDirectory) {
            if (userAccount.getUserName().equalsIgnoreCase(userName)) {
                return false;
            }
        }
        return true;
    }
    
    public UserAccount addUserAccount(String userName, String password, Role role, Employee employee){
        UserAccount userAccount = new UserAccount(userName, password, role, employee);
        userAccountDirectory.add(userAccount);
        return userAccount;
    }
    
}
