package advancedclasses;

import static advancedclasses.Main.ball;
import static advancedclasses.Main.initSettings;

/**
* Author: Julian Kresz & Davin Holmberg
* Assignment: Advanced Classes Group Project
* Teacher: Mr. Wachs
* Course: Computer Science 40S
* Created on: March 13, 2016, 6:45 PM
*
* GravityBall.Java: Ball with gravity
*/
public class GravityBall extends Ball{

    private static final double GRAVITY = -0.2;
    
    public GravityBall() {
        System.out.println("advancedclasses.GravityBall.GravityBall(void);");
    }
    
    public GravityBall(String name) {
        super(name);
        System.out.println("advancedclasses.GravityBall.GravityBall(GravityBall);");
    }

    @Override
    public void move() {
        //System.out.println("advancedclasses.GravityBall.move();");
        ySpeed = ySpeed - GRAVITY;
        
        xLoc = xLoc + (int)xSpeed;
        yLoc = yLoc + (int)ySpeed;
        if (this.xLoc < 1)      { bounce(FRAMELEFT); }
        else if (this.yLoc < 1) { bounce(FRAMETOP); }
        else if ((this.xLoc + this.getWidth()) > (Main.displayGui.getWidth() - 1))   { bounce(FRAMERIGHT); }
        else if ((this.yLoc + this.getHeight()) > (Main.displayGui.getHeight() - 1)) { bounce(FRAMEBOTTOM); }
        
        this.setLocation(xLoc, yLoc);
    }    

}
