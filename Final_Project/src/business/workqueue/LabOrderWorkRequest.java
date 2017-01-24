/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue;

import business.geography.City;
import business.geography.State;
import business.geography.Country;
import business.useraccount.UserAccount;

/**
 *
 * @author prane
 */
public class LabOrderWorkRequest extends WorkRequest {
    
    private static int count=1;
    private int requestID;
    private Country country;
    private State state;
    private City city;
    private String ordername;
    private int prioritylevel;
    private String requestdate;
    private String results;

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }
    
    public LabOrderWorkRequest()
    {
        super(null, null, "", "");
    }
     public LabOrderWorkRequest(Country country,State state, City city, String requestDate, int priorityLevel, String orderName, String actionTaken, UserAccount sender, UserAccount receiver, String message, String status, String results) 
    {
        super(sender, receiver, message, status);
        this.country = country;
        this.state = state;
        this.city = city;
        this.requestdate = requestDate;
        this.prioritylevel = priorityLevel;
        this.ordername = orderName;
        this.uniqueIdentificationNumber = uniqueIdentificationNumber;
        this.actionTaken = actionTaken;
        this.results = results;
        //count = count ++;
        requestID = count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        LabOrderWorkRequest.count = count;
    }

    public int getRequestID() {
        return requestID;
    }

    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }


    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername;
    }

    public int getPrioritylevel() {
        return prioritylevel;
    }

    public void setPrioritylevel(int prioritylevel) {
        this.prioritylevel = prioritylevel;
    }

    public String getRequestdate() {
        return requestdate;
    }

    public void setRequestdate(String requestdate) {
        this.requestdate = requestdate;
    }

    public String getUniqueIdentificationNumber() {
        return uniqueIdentificationNumber;
    }

    public void setUniqueIdentificationNumber(String uniqueIdentificationNumber) {
        this.uniqueIdentificationNumber = uniqueIdentificationNumber;
    }

    public String getActionTaken() {
        return actionTaken;
    }

    public void setActionTaken(String actionTaken) {
        this.actionTaken = actionTaken;
    }
    private String uniqueIdentificationNumber;
    private String actionTaken;
    
   

   
}
    

