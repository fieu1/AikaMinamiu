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
public class People {
    private String name;
    private Animal pet;

    public People(String name) {
        this.name = name;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }
    
    public void takePetToWalk(){
        System.out.println("My name is " + this.name);
        System.out.println("My pet move by ");
        this.pet.move();
        System.out.println("===================================");
    }
}
