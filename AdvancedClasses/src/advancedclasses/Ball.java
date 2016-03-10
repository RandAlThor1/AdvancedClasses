/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedclasses;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author j.kresz
 */
class Ball extends JLabel{
    
    public Ball() {
        System.out.println("advancedclasses.Ball.Ball(void);");
        
        Construct("void");
        
        
    }
    
    public Ball(String name) {
        System.out.println("advancedclasses.Ball.Ball(Ball);");
        
        Construct(name);
        
        
    }
    
    private void Construct(String name) {
        System.out.println("advancedclasses.Ball.Construct();");
        this.setName(name);
        
        this.setLayout(null);
        this.setSize(50, 50);
        this.setLocation(200, 120);
        this.setOpaque(true);
        this.setBackground(Color.WHITE);
        this.setVisible(true);
        
        
    }
}
