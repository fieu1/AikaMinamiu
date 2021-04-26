/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PunyaAlwi;

/**
 *
 * @author MeiMei
 */
public class Ticketing {
    String airplane;
    String time;
    int price;

    public Ticketing(String airplane, String time, int price) { //constructor parameter for change value
        this.airplane = airplane; //change value of airplane
        this.time = time; //change value of time
        this.price = price; //change value of price
    }

    public void Print(){ //output method
        System.out.println("------------------------------------");  //separator
        System.out.println("Airplane     : " + airplane); //airplane name
        System.out.println("Time         : " + time); //airplane time
        System.out.println("Total Price  : " + price); //price of airplanea
        
    }
}
