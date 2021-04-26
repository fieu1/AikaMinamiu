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
public class Hypo {
    int heigth;
    int base;
    int hypo;
    public Hypo(int h, int b, int p) { //constructor parameter
        heigth = h; //change value of heigth
        base = b; //change value of base
        hypo = p; //change value of hypotenuse
    }
    public int calculatedArea() { //calculate area method
        return base * heigth; //return area value
    }
    public int calculatedPerimeter() { //calculatea perimeter method
        int based = base * 2; //adding top and bottom base
        int hy = hypo * 2; //adding left and right hypotenuse
        return based + hy; //return perimeter value
    }
}