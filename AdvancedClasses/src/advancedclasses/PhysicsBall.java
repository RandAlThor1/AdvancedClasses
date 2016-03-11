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
        
        construct("void");
    }
    
    public PhysicsBall(String name) {
        System.out.println("advancedclasses.PhysicsBall.PhysicsBall(physicsBall);");
        
        construct(name);
    }

    private void construct(String name) {
        System.out.println("advancedclasses.PhysicsBall.construct();");
        this.setName(name);
        
        
    }
}
