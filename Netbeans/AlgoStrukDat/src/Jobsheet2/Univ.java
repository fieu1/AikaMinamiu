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
public class Univ {
    int value1, value2; 
    public Univ(int v1, int v2) {//parameter constructor
        value1 = v1; //change the value1
        value2 = v2; //change the value2
    }
    public int calculateHigher() { //mehthod to calculate value higher
        int big = 0; //for comparison
        if (value1 > big) { //check if the value1 bigger than big value
            big = value1; //change the value big to value1
            if (value2 > big) { //check if value2 bigger than value1 value
                big = value2; //change the value big to value2
            }
        }
        return big; //return big value
    }
}
