/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedclasses;

import static advancedclasses.Main.initSettings;
import java.awt.Color;
import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author j.kresz
 */
class Ball extends JLabel{
    
    Random r = new Random();
    
//    int xLoc = 250;
//    int yLoc = 250;
    int xLoc   = r.nextInt(Main.displayGui.getWidth() - this.getWidth());
    int yLoc   = r.nextInt(Main.displayGui.getHeight() - this.getHeight());
    double xSpeed = 5;
    double ySpeed = 5;
    
    int mass = 1;
    
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
        this.setSize(initSettings.dBall, initSettings.dBall);
        this.setLocation(xLoc, yLoc);
        this.setOpaque(true);
        this.setBackground(Color.WHITE);
        this.setVisible(true);
        
        
    }
    
    public void move() {
        //System.out.println("advancedclasses.Ball.move();");
        xLoc = xLoc + (int)xSpeed;
        yLoc = yLoc + (int)ySpeed;
        if (this.xLoc <= 1)      { bounce(FRAMELEFT); }
        else if (this.yLoc <= 1) { bounce(FRAMETOP); }
        else if ((this.xLoc + this.getWidth()) >= (Main.displayGui.getWidth() - 1))   { bounce(FRAMERIGHT); }
        else if ((this.yLoc + this.getHeight()) >= (Main.displayGui.getHeight() - 1)) { bounce(FRAMEBOTTOM); }
        
        this.setLocation(xLoc, yLoc);
        
    }
    
    public void bounce(int whichBorder) {
        //System.out.println("advancedclasses.Ball.bounce();");
        
        switch (whichBorder) {
            case FRAMELEFT:
                if (xSpeed < 0) {
                    xSpeed = 0 - xSpeed;
                }
                
                break;
            case FRAMETOP:
                if (ySpeed < 0) {
                    ySpeed = 0 - ySpeed;
                }
                break;
            case FRAMERIGHT:
                if (xSpeed > 0) {
                    xSpeed = 0 - xSpeed;
                }
                break;
            case FRAMEBOTTOM:
                if (ySpeed > 0) {
                    ySpeed = 0 - ySpeed;
                }
                break;
        }
        
    }
}
