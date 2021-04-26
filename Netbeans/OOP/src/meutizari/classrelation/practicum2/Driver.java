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
public class Driver {
    private String name;
    private int cost;

    public Driver() {
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    public void setCost(int newCost){
        cost = newCost;
    }
    
    public String getName(){
        return name;
    }
    
    public int getCost(){
        return cost;
    }
    
    public int countDriverCost(int day){
        return cost*day;
    }
}
