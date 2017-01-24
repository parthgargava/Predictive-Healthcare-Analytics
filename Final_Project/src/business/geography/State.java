/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.geography;

import java.util.ArrayList;

/**
 *
 * @author Parth, Nikhil, Praneeth
 */
public class State {

    private String name;
    private ArrayList<City> cityList;

    public State(String name) {
        this.name = name;
        this.cityList = new ArrayList<City>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<City> getCityList() {
        return cityList;
    }
    
    public void createANewCity(String name){
        City city = new City(name);
    }
}
