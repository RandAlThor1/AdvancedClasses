/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedclasses;

import static advancedclasses.Main.ball;
import static advancedclasses.Main.initSettings;
import java.awt.Color;
import java.util.Random;

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
        System.out.println(Main.displayGui.WIDTH + " " + Main.displayGui.HEIGHT);
        
        System.out.println("advancedclasses.PhysicsBall.construct();");
        this.setName(name);
        
        this.setLayout(null);
        this.setSize(initSettings.dPhysBall, initSettings.dPhysBall);
        this.setLocation(xLoc, yLoc);
        this.setOpaque(true);
        this.setBackground(Color.WHITE);
        this.setVisible(true);
        
        
    }
    
    @Override
    public void move() {
        //System.out.println("advancedclasses.Ball.move();");
        xLoc = xLoc + (int)xSpeed;
        yLoc = yLoc + (int)ySpeed;
//        for (int i = 0; i < xSpeed; i++) {
//            xLoc = xLoc + i;
//        }
        
        
        if (xSpeed > 25) { // ACCELERATION LIMITER X-AXIS
            xSpeed = 25;
        }
        if (ySpeed > 25) { // ACCELERATION LIMITER Y-AXIS
            ySpeed = 25;
        }
        
        if (this.xLoc < ball.xLoc) { xSpeed = xSpeed + 1; }
        if (this.yLoc < ball.yLoc) { ySpeed = ySpeed + 1; }
        if (this.xLoc > ball.xLoc) { xSpeed = xSpeed - 1; }
        if (this.yLoc > ball.yLoc) { ySpeed = ySpeed - 1; }
        
        if (initSettings.dSolidBorders) {
            if (this.xLoc < 1)      { bounce(FRAMELEFT); }
            else if (this.yLoc < 1) { bounce(FRAMETOP); }
            else if ((this.xLoc + this.getWidth()) > (Main.displayGui.getWidth() - 1))   { bounce(FRAMERIGHT); }
            else if ((this.yLoc + this.getHeight()) > (Main.displayGui.getHeight() - 1)) { bounce(FRAMEBOTTOM); }
        }
        
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
