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
public class Unit {
    String type;
    String colour;
    int amount;

    public Unit(String type, String colour, int amount) {
        this.type = type;
        this.colour = colour;
        this.amount = amount;
    }
    
    public void setType(String newType){
        type = newType;
    }
    
    public String getType(){
        return type;
    }
    
    public int getFps(){
        int fps = 0;
        switch(type){
            case "Handgun":
                fps = 140;
                break;
            case "Rifle":
                fps = 280;
                break;
            case "Sniper":
                fps = 400;
                break;
            default:
                System.out.println("No type");
                break;
        }
        return fps;
    }
    
    public void rented(int amt, String type){
        if(amount >0){
            amount -= amt;
            System.out.println("Rent successfull");
        } else {
            System.out.println("No stock available");
        }
    }
    public void renturned(int amt){
            amount += amt;
            System.out.println("Returned successfully");
    }
}
