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
public class Renter {
    String name;
    int rentID;
    int amtRent;

    public Renter(String name, int rentID) {
        this.name = name;
        this.rentID = rentID;
        amtRent = 0;
    }
    
    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }
    
    public int rent(int amt){
        amtRent += amt;
        return amtRent;
    }
    public int returning(int amt){
        amtRent -= amt;
        return amtRent;
    }
}
