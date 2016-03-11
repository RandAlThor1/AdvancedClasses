/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedclasses;

import static advancedclasses.Main.ball;
import java.awt.Color;
import java.util.Random;

/**
 *
 * @author j.kresz
 */
class PhysicsBall extends Ball{
    
    Random r = new Random();
    
    int xLoc = 100;
    int yLoc = 100;
    //int xLoc   = r.nextInt(Main.displayGui.getWidth());   ONCE FINALIZED WE'LL HAVE INITIAL POSITION RANDOM
    //int yLoc   = r.nextInt(Main.displayGui.getHeight());
    int xSpeed = 0;
    int ySpeed = 0;
    
    //    int NOFRAME     = 0;
    final int FRAMELEFT   = 1;
    final int FRAMETOP    = 2;
    final int FRAMERIGHT  = 3;
    final int FRAMEBOTTOM = 4;
    
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
        this.setSize(50, 50);
        this.setLocation(xLoc, yLoc);
        this.setOpaque(true);
        this.setBackground(Color.WHITE);
        this.setVisible(true);
        
        
    }
    
    @Override
    public void move() {
        //System.out.println("advancedclasses.Ball.move();");
        xLoc = xLoc + xSpeed;
        yLoc = yLoc + ySpeed;
        
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
        
        if (this.xLoc < 1)      { bounce(FRAMELEFT); }
        else if (this.yLoc < 1) { bounce(FRAMETOP); }
        else if ((this.xLoc + this.getWidth()) > (Main.displayGui.getWidth() - 1))   { bounce(FRAMERIGHT); }
        else if ((this.yLoc + this.getHeight()) > (Main.displayGui.getHeight() - 1)) { bounce(FRAMEBOTTOM); }
        else    {  }
        this.setLocation(xLoc, yLoc);
        
    }
    
    public void bounce(int whichBorder) {
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
