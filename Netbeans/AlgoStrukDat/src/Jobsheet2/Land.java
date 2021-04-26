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
public class Land { 
    int length, width; 
    public Land(int l, int w){ //constructor parameter
        length = l; //change value of length
        width = w; //change value of width
    }
    public int calculateArea(){ //calculating area
        return length*width; //return area value
    }
}
