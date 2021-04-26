/*
 * To change this license header, choose License Headers in Project Properties.
 * To change FDhis template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meutizari.classrelation.practicum3;

/**
 *
 * @author Aikacchii
 */
public class MainPracticum4 {
    public static void main(String[] args) {
        Passenger p = new Passenger("12345", "Mr. Crab");
        Car car = new Car("A", 10);
        car.setPass(p, 1);
        System.out.println(car.info());
    }
}
