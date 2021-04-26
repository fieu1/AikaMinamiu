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
public class CuboidMain {
    public static void main(String[] args) {
        Cuboid[] blArray = new Cuboid[3];
        
        blArray[0] = new Cuboid(100, 30 ,12);
        blArray[1] = new Cuboid(120, 40 ,15);
        blArray[2] = new Cuboid(210, 50 ,25);
        
        for (int i = 0; i < 3; i++) {
             System.out.println("Cuboid volume to "+i + " : "+blArray[i].calculateVolume());
         }
        
    }
}
