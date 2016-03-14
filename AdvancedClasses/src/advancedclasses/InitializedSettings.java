/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package advancedclasses;

import javax.swing.JOptionPane;

/**
 * Author:       Julian Kresz
 * Assignment:   _
 * Teacher:      Mr. Wachs
 * Course:       CS30S
 * Created on:   M_/D_/Y___
 * 
 * _.Java: 
 */
public class InitializedSettings {

    int dWidth = 1920, dHeight = 1080;  // Width and height of window
    int dBall = 25;                // Size of Ball
    int dPhysBalls = 1;           // Amount of PhysicsBalls
    int dPhysBall = 25;            // Size of PhysicsBalls
    int dTimeScale = 10;           // Timescale
    boolean dSolidBorders = false; // Do PhysicsBalls collide with the border?
    
    public InitializedSettings() {
        
        int start = 1;
        
        while (start == 1) {            
            dWidth     = whatIs(dWidth,0);
            dHeight    = whatIs(dHeight,1);
            dBall      = whatIs(dBall,2);
//            dPhysBalls = whatIs(dPhysBalls,3); // TODO: HOW MANY PHYSICS BALLS WILL APPEAR
            dPhysBall  = whatIs(dPhysBall,4);
            dTimeScale = whatIs(dTimeScale,5);
            dSolidBorders = whatIs(dSolidBorders);

            start = confirm(start);
            System.out.println(start);
        }
    }

    private int confirm(int start) {
        int confirm = JOptionPane.showConfirmDialog(null, "Your settings are:"
                + "\n"
                + "\nWindow size: " + dWidth + "x" + dHeight
                + "\nBall size: " + dBall
//                + "\nPhysicsBalls: " + dPhysBalls // TODO: HOW MANY PHYSICS BALLS WILL APPEAR
                + "\nPhysicsBall size: " + dPhysBall
                + "\nTimescale: " + dTimeScale
                + "\nBorder collision: " + dSolidBorders
                + "\n"
                + "\nContinue?");
        System.out.println(confirm);
        if (confirm == 0) {
            start = 0;
        }
        else if (confirm == 1) {
            start = 1;
        }
        else {
            System.exit(0);
        }
        return start;
    }

    private int whatIs(int dAnswer, int qInt) {
        String qString = null;
        switch (qInt) {
            case 0:
                qString = "What is the window width?";
                break;
            case 1:
                qString = "What is the window height?";
                break;
            case 2:
                qString = "What is the ball width and height?";
                break;
            case 3:
                qString = "How many PhysicsBalls are there?";
                break;
            case 4:
                qString = "What are the PhyisicsBalls' sizes?";
                break;
            case 5:
                qString = "What is the timescale? (ms)";
                break;
            
            
        }
        try {
            dAnswer = Integer.parseInt(JOptionPane.showInputDialog(qString
                + "\nDefault: " + dAnswer));
        } catch (NumberFormatException e) {
            System.out.println("Question "+qString+": NumberFormatException.");
        }
        
        
        return dAnswer;
    }

    private boolean whatIs(boolean dAnswer) {
        dAnswer = Boolean.parseBoolean(JOptionPane.showInputDialog("Are borders solid? ('true' or 'false')"
                + "\nDefault: " + dAnswer));
        
        return dAnswer;
    }
}
