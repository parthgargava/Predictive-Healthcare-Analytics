/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue;

import java.util.ArrayList;

/**
 *
 * @author prane
 */
public class LabOrderWorkList {
    private ArrayList<LabOrderWorkRequest> labworklist;

    public ArrayList<LabOrderWorkRequest> getLabworklist() {
        return labworklist;
    }

    public void setLabworklist(ArrayList<LabOrderWorkRequest> labworklist) {
        this.labworklist = labworklist;
    }

    public LabOrderWorkList() {
       this.labworklist=new ArrayList <LabOrderWorkRequest> ();
    }
    
     public void addRequest(LabOrderWorkRequest request)
    {
        LabOrderWorkRequest labreq = request;
        labworklist.add(labreq);
      
    }
}
