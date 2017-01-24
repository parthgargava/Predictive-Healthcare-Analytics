/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.employee;

/**
 *
 * @author Parth, Nikhil, Praneeth
 */
public class Employee {

    private static int count;
    private String name;
    private int id;

    public Employee(String name) {
        this.name = name;
        this.id = ++count;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
}
