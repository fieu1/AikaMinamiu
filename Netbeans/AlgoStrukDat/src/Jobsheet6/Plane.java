/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet6;

/**
 *
 * @author MeiMei
 */
public class Plane {
    String namePlane;
    String time;
    int price;

    public Plane(String namePlane, String time, int price) { //constructor parameter
        this.namePlane = namePlane;
        this.time = time;
        this.price = price;
    }

    public void Print(){ //method to make an output
        System.out.println("+================================+"); 
        System.out.println("Ticket for : " + namePlane);
        System.out.println("In         : " + time);
        System.out.println("With Price : " + price);
        
    }
}
