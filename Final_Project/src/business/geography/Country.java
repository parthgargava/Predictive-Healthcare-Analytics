/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.geography;

import business.enterprise.EnterpriseDirectory;
import java.util.ArrayList;

/**
 *
 * @author Parth, Nikhil, Praneeth
 */
public class Country {

    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private int countryID;
    private static int count=0;
    private ArrayList<State> stateList;

    public Country(String name) {
        this.name = name;
        this.enterpriseDirectory = new EnterpriseDirectory();
        count=count+1;
        this.countryID = count;
        this.stateList = new ArrayList<State>();
    }

    public String getName() {
        return name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    @Override
    public String toString() {
        return name;
    }

    public int getCountryID() {
        return countryID;
    }

    public ArrayList<State> getStateList() {
        return stateList;
    }
    
    public State createANewState(String name){
        State state = new State(name);
        return state;
    }
}
