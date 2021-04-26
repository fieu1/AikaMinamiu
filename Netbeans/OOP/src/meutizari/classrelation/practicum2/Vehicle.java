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
public class Vehicle {
    private String merk;
    private int cost;

    public Vehicle() {
    }
    
    public void setMerk(String newMerk){
        merk = newMerk;
    }
    
    public void setCost(int newCost){
        cost = newCost;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public int getCost(){
        return cost;
    }
    
    public int countcarCost(int day){
        return cost*day;
    }
}
