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
public class CircleMain {
    public static void main(String[] args) {
        
        Circle cr = new Circle(21); //instantiation with parameter
        System.out.println("Area of circle " + cr.calculateArea() + " and the circumference is " + cr.calculateCircumference());//output
    }
}
