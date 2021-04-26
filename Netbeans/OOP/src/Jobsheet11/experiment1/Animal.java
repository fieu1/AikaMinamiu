/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet11.experiment1;

/**
 *
 * @author Aikacchii
 */
public abstract class Animal {
    private int age;
    
    protected Animal(){
        this.age = 0;
    }
    
    public void ageIncreased(){
        this.age+=1;
    }
    
    public abstract void move();
}
