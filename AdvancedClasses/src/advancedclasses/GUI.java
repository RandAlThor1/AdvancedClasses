/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedclasses;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author j.kresz
 */
class GUI extends JFrame implements KeyListener{
    
    public GUI() {
        System.out.println("advancedclasses.GUI.GUI();");
        
        this.setLayout(null);
        this.setSize(1280, 720);
        this.setLocation(200, 120);
        this.getContentPane().setBackground(Color.BLACK);
        this.setUndecorated(true);//why?
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//undecorated make this less useful
        
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //System.out.println("advancedclasses.GUI.keyTyped(" + e.getKeyCode() + ");");
        
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("advancedclasses.GUI.keyPressed(" + e.getKeyCode() + ");");
        
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //System.out.println("advancedclasses.GUI.keyReleased(" + e.getKeyCode() + ");");
        
        
    }
}
