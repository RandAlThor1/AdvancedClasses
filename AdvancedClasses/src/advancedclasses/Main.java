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
 Course: Computer Science 40S
 Created on: March 10, 2016, 10:48 AM

 Main.Java:
*/
public class Main {
    
    public static GUI displayGui;
    public static Ball ball;
    public static PhysicsBall physicsBall;
    
    public static void main(String[] args) {
        System.out.println("advancedclasses.Main.main();");
        
        displayGui = new GUI();
        ball = new Ball("Ball");
        physicsBall = new PhysicsBall("Physics Ball");
        
        displayGui.add(ball);
        displayGui.add(physicsBall);
        
        
    }
}