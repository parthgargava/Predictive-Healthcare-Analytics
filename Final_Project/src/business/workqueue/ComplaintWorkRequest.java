/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue;

import business.geography.City;
import business.geography.Country;
import business.geography.State;
import business.useraccount.UserAccount;

/**
 *
 * @author Parth, Nikhil, Praneeth
 */
public class ComplaintWorkRequest extends WorkRequest{
    private static int count;
    private int complaintID;
    private Country country;
    private State state;
    private City city;
    private String crimeType;
    private int severityLevel;
    private String senderStatus;
    private String uniqueIdentificationNumber;
    private String actionTaken;
    
    public ComplaintWorkRequest(Country country, State state, City city, String crimeType, int severityLevel, String senderStatus, String uniqueIdentificationNumber, String actionTaken, UserAccount sender, UserAccount receiver, String message, String status) {
        super(sender, receiver, message, status);
        this.country = country;
        this.state = state;
        this.city = city;
        this.crimeType = crimeType;
        this.severityLevel = severityLevel;
        this.senderStatus = senderStatus;
        this.uniqueIdentificationNumber = uniqueIdentificationNumber;
        this.actionTaken = actionTaken;
        complaintID = ++count;
    }

    public int getComplaintID() {
        return complaintID;
    }

    public String getActionTaken() {
        return actionTaken;
    }

    public Country getCountry() {
        return country;
    }

    public State getState() {
        return state;
    }

    public City getCity() {
        return city;
    }

    public String getCrimeType() {
        return crimeType;
    }

    public int getSeverityLevel() {
        return severityLevel;
    }

    public String getSenderStatus() {
        return senderStatus;
    }

    public String getUniqueIdentificationNumber() {
        return uniqueIdentificationNumber;
    }

    public void setActionTaken(String actionTaken) {
        this.actionTaken = actionTaken;
    }
    
}
