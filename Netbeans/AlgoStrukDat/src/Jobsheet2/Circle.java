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
public class Circle {
    double phi = 22/7; //default value of phi
    double r; //radius
    
    Circle(double er){ //constructor parameter
        r = er; //change value of r
    }
    public double calculateArea(){ //calculating area
        return  phi*r*r; //return area value
    }
    public double calculateCircumference(){ //calculating circumference
        return 2*phi*r; //return circumference value
    }
}
