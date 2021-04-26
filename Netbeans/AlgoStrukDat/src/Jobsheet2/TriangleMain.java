/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet2;

/**
 *
 * @author MeiMei
 */
public class TriangleMain {
    public static void main(String[] args) {
        Triangle[] sgArray = new Triangle[4];
        sgArray[0] = new Triangle(10,4);
        sgArray[1] = new Triangle(20,10);
        sgArray[2] = new Triangle(15,6);
        sgArray[3] = new Triangle(25,10);
        
        for(int i = 0; i<4;i++){
            System.out.print("Area of triangle-" + i + " is : " + sgArray[i].CalculateArea());
            System.out.print(", and the circumference is : " + sgArray[i].CalculateCircumference());
            System.out.println();
        }
        
    }
}
