/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package advancedclasses;

/**
* Author: Julian Kresz & Davin Holmberg
* Assignment: Advanced Classes Group Project
* Teacher: Mr. Wachs
* Course: Computer Science 40S
* Created on: March 10, 2016, 10:48 AM
*
* Main.Java: Main class for project
*/
public class Main {
    
    public static GUI displayGui;
    public static Ball ball;
    public static PhysicsBall physicsBall;
    public static GravityBall gravityBall;
    public static CollisionBall collisionBall;
    public static InitializedSettings initSettings;
    
    public static void main(String[] args) {
        System.out.println("advancedclasses.Main.main();");
        
        boolean isRunning = true;
        
        initSettings = new InitializedSettings();
        
        displayGui = new GUI();
        ball = new Ball("Ball");
        displayGui.add(ball);
        
        for (int b = 0; b < initSettings.dPhysBalls; b++) {
            physicsBall = new PhysicsBall("Physics Ball"); // TODO: HOW MANY PHYSICS BALLS WILL APPEAR
            displayGui.add(physicsBall);
        }
        //physicsBall = new PhysicsBall("Physics Ball");
        
        gravityBall = new GravityBall();
        displayGui.add(gravityBall);
        
        collisionBall = new CollisionBall();
        displayGui.add(collisionBall);
        
        while (isRunning) {
            ball.move();
            physicsBall.move();
            gravityBall.move();
            collisionBall.move();
            interval(initSettings.dTimeScale);
        }
    }

    private static void interval(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
        }
    }
}
