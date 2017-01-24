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
 * @author dsain
 */
public class VitalSignsWorkRequest extends WorkRequest{
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
    public VitalSignsWorkRequest(UserAccount sender, UserAccount receiver, String message, String status) {
        super(sender, receiver, message, status);
    }
    
}
