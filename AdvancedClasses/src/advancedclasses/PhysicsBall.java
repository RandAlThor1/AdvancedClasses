/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedclasses;

import java.awt.Color;

/**
 *
 * @author j.kresz
 */
class PhysicsBall extends Ball{
    
    public PhysicsBall() {
        System.out.println("advancedclasses.PhysicsBall.PhysicsBall(void);");
        
        Construct("void");
    }
    
    public PhysicsBall(String name) {
        System.out.println("advancedclasses.PhysicsBall.PhysicsBall(physicsBall);");
        
        Construct(name);
    }

    private void Construct(String name) {
        System.out.println("advancedclasses.PhysicsBall.Construct();");
        this.setName(name);
        
        
    }
}
