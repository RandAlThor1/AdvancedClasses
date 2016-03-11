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
    
    int xLoc   = 250;
    int yLoc   = 250;
    int xSpeed = 3;
    int ySpeed = 3;
    
    //    int NOFRAME     = 0;
    final int FRAMELEFT   = 1;
    final int FRAMETOP    = 2;
    final int FRAMERIGHT  = 3;
    final int FRAMEBOTTOM = 4;
    
    public Ball() {
        System.out.println("advancedclasses.Ball.Ball(void);");
        
        construct("void");
        
        
    }
    
    public Ball(String name) {
        System.out.println("advancedclasses.Ball.Ball(Ball);");
        
        construct(name);
        
        
    }
    
    private void construct(String name) {
        System.out.println("advancedclasses.Ball.construct();");
        this.setName(name);
        
        this.setLayout(null);
        this.setSize(50, 50);
        this.setLocation(xLoc, yLoc);
        this.setOpaque(true);
        this.setBackground(Color.WHITE);
        this.setVisible(true);
        
        
    }
    
    public void update() {
        move();
    }
    
    public void move() {
        System.out.println("advancedclasses.Ball.move();");
        xLoc = xLoc + xSpeed;
        yLoc = yLoc + ySpeed;
        if (this.xLoc < 1)      { bounce(FRAMELEFT); }
        else if (this.yLoc < 1) { bounce(FRAMETOP); }
        else if ((this.xLoc + this.getWidth()) > (Main.displayGui.getWidth() - 1))   { bounce(FRAMERIGHT); }
        else if ((this.yLoc + this.getHeight()) > (Main.displayGui.getHeight() - 1)) { bounce(FRAMEBOTTOM); }
        else    {  }
        this.setLocation(xLoc, yLoc);
        
    }
    
    private void bounce(int whichBorder) {
        System.out.println("advancedclasses.Ball.bounce();");
        
        switch (whichBorder) {
            case FRAMELEFT:
                xSpeed = 0 - xSpeed;
                break;
            case FRAMETOP:
                ySpeed = 0 - ySpeed;
                break;
            case FRAMERIGHT:
                xSpeed = 0 - xSpeed;
                break;
            case FRAMEBOTTOM:
                ySpeed = 0 - ySpeed;
                break;
        }
        
    }
}
