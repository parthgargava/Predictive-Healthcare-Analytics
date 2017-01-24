/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author dsain
 */
public class MedicalInstitute extends Enterprise{
     
    public MedicalInstitute(String name) {
        super(name, EnterpriseType.Medical);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
