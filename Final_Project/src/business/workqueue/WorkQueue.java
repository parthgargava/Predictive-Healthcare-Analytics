/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue;

import java.util.ArrayList;

/**
 *
 * @author Parth, Nikhil, Praneeth
 */
public class WorkQueue {
    private ArrayList<WorkRequest> workQueue;

    public WorkQueue() {
        this.workQueue = new ArrayList<WorkRequest>();
    }

    public ArrayList<WorkRequest> getWorkQueue() {
        return workQueue;
    }
    
}
