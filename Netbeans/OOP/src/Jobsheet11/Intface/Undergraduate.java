/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet11.Intface;

/**
 *
 * @author Aikacchii
 */
public class Undergraduate extends Student implements ICumlaude{
     public Undergraduate(String name) {
        super(name);
    }
     
    
    @Override
    public void graduate() {
        System.out.println("I've finished my thesis for undergraduate");
    }

    @Override
    public void getHighGPA() {
        System.out.println("My GPA is more than 3.51");
    }
}
