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
public class Cuboid {
    public int length, width, height;
    public Cuboid(int l, int w, int h){
        length = l;
        width = w;
        height = h;
    }
    public int calculateVolume(){
        return length*width*height;
    }
}
