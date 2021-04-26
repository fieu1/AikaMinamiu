/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meutizari.classrelation.practicum2;

/**
 *
 * @author Aikacchii
 */
public class MainPracticum2 {
    public static void main(String[] args) {
        Vehicle m = new Vehicle();
        m.setMerk("Avanza");
        m.setCost(350000);
        Driver s = new Driver();
        s.setName("John Doe");
        s.setCost(200000);
        Customer p = new Customer();
        p.setName("Jane Doe");
        p.setVehicle(m);
        p.setDriver(s);
        p.setDay(2);
        System.out.println("Total Cost = " + p.countTotalCost());
        System.out.println(p.getVehicle().getMerk());
    }
}
