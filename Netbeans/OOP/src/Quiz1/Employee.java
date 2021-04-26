/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1;

/**
 *
 * @author Aikacchii
 */
public class Employee {
    String name;
    int employeeID;
    Renter renter;
    Unit unit;
    public Employee(String name, int employeeID, Renter renter, Unit unit) {
        this.name = name;
        this.employeeID = employeeID;
        this.renter = renter;
        this.unit = unit;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void renting(int amt){
        String rentName = renter.name;

        System.out.println("Cust : " + rentName);
        System.out.println("Unit type : " + unit.type);
        renter.rent(amt);
        unit.rented(amt, unit.type);
    }
    public void returning(int amt){
        String rentName = renter.name;

        System.out.println("Cust : " + rentName);
        System.out.println("Unit type : " + unit.type);
        renter.returning(amt);
        unit.renturned(amt);
    }
    
    public void checkAvailability(){
        int amt = unit.amount;
        System.out.println("Amount :  " + amt);
    }
}
