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
public class Program {
    public static void main(String[] args) {
        Fish shark = new Fish();
        Fish dolphin  = new Fish();
        
        People john = new People("John");
        People ben = new People("Ben");
        
        john.setPet(shark);
        ben.setPet(dolphin);
        
        john.takePetToWalk();
        ben.takePetToWalk();
    }    
}
