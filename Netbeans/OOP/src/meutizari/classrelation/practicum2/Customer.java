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
public class Customer {
    private String name;
    private Vehicle vehicle;
    private Driver driver;
    private int day;

    public Customer() {
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getDay() {
        return day;
    }

    public Driver getDriver() {
        return driver;
    }

    public String getName() {
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    
    public int countTotalCost(){
        return vehicle.countcarCost(day) + driver.countDriverCost(day);
    }
}
