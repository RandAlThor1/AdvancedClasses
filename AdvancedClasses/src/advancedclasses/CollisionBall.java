package advancedclasses;

/**
* Author: Julian Kresz & Davin Holmberg
* Assignment: Advanced Classes Group Project
* Teacher: Mr. Wachs
* Course: Computer Science 40S
* Created on: March 13, 2016, 8:05 PM
*
* CollisionBall.Java: Ball with collision
*/
class CollisionBall extends Ball{

    public CollisionBall() {
        xSpeed = 0;//slower so it bounces off.
        ySpeed = 10;
    }

    public CollisionBall(String name) {
        super(name);
        xSpeed = 0;//slower so it bounces off.
        ySpeed = 10;
        
    }

    @Override
    public void move() {
        //System.out.println("advancedclasses.Ball.move();");
        checkCollision();
        
        
        xLoc = xLoc + (int)xSpeed;
        yLoc = yLoc + (int)ySpeed;
        if (this.xLoc <= 1)      { bounce(FRAMELEFT); }
        else if (this.yLoc <= 1) { bounce(FRAMETOP); }
        else if ((this.xLoc + this.getWidth()) >= (Main.displayGui.getWidth() - 1))   { bounce(FRAMERIGHT); }
        else if ((this.yLoc + this.getHeight()) >= (Main.displayGui.getHeight() - 1)) { bounce(FRAMEBOTTOM); }
        
        this.setLocation(xLoc, yLoc);
    }

    private void checkCollision() {
        
        if(this.getBounds().intersects(Main.ball.getBounds()))collide(Main.ball);
        if(this.getBounds().intersects(Main.physicsBall.getBounds()))collide(Main.physicsBall);
        if(this.getBounds().intersects(Main.gravityBall.getBounds())) collide(Main.gravityBall);
    }

    private void collide(Ball ball) {
        double netVelocityX = ball.xSpeed + this.xSpeed;
        double netVelocityY = ball.ySpeed + this.ySpeed;
        int netMass = ball.mass + this.mass;
        
        this.xSpeed = netVelocityX / netMass; 
        this.ySpeed = netVelocityY / netMass; 
    }

    
}
