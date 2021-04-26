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
public class Triangle {
    public int base;
    public int heigth;
    Triangle(int b, int h){
        base = b;
        heigth = h;
    }
    public double CalculateArea(){
        return base*heigth*0.5;
    }
    public int CalculateCircumference(){
        return base*3;
    }
}
