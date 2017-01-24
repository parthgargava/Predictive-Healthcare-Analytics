/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue;

import business.useraccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Parth, Nikhil, Praneeth
 */
public abstract class WorkRequest {

    private UserAccount sender;
    private UserAccount receiver;
    private String message;
    private String status;
    private Date requestDate;
    private Date resolvedDate;

    public WorkRequest(UserAccount sender, UserAccount receiver, String message, String status) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        this.status = status;
        this.requestDate = new Date();
    }

    public UserAccount getSender() {
        return sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public Date getResolvedDate() {
        return resolvedDate;
    }

    @Override
    public String toString() {
        return this.message;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
