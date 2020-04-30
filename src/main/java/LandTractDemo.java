
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tidal
 */
public class LandTractDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please Enter the Length of the First LandTract");
        double length1 = keyboard.nextDouble();
        System.out.println("Please Enter the Width of the First LandTract");
        double width1 = keyboard.nextDouble();
        LandTract landTract1 = new LandTract(length1, width1);
        
        System.out.println("Please Enter the Length of the Second LandTract");
        double length2 = keyboard.nextDouble();
        System.out.println("Please Enter the Width of the Second LandTract");
        double width2 = keyboard.nextDouble();
        LandTract landTract2 = new LandTract(length2, width2);
                
        System.out.println("The Area of The First Landtract is " + landTract1.Area(length1, width1));       
        System.out.println("The Area of The Second Landtract is " + landTract2.Area(length2, width2));
        System.out.println("Are the Tracts the Same Size:" + landTract1.equals(landTract2));
    }
}
