/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.enterprise.Enterprise.EnterpriseType;
import java.util.ArrayList;

/**
 *
 * @author Parth, Nikhil, Praneeth
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseDirectory;

    public EnterpriseDirectory() {
        this.enterpriseDirectory = new ArrayList<Enterprise>();
    }

    public ArrayList<Enterprise> getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    public Enterprise createAnEnterprise(String name, EnterpriseType type){
        Enterprise enterprise = null;
        if (type.getValue().equals(EnterpriseType.Government.getValue())) {
            enterprise = new GovernmentEnterprise(name);
            enterpriseDirectory.add(enterprise);
        }
        if (type.getValue().equals(EnterpriseType.Medical.getValue())) {
            enterprise = new MedicalInstitute(name);
            enterpriseDirectory.add(enterprise);
        }
        
        return enterprise;
    }
    
}
