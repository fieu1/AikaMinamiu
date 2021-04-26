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
public class WideLand {
     int length, width;
    public WideLand(int l, int w){ //parameter constructor
        length = l; //change value of length
        width = w; //change value of width
    }
    public int calculateArea(){ //calculate area method
        return length*width; //return value
    }
    
}
