/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacetraining;

/**
 *
 * @author Aikacchii
 */
public class Postgraduated extends Student implements ICumlaude{

    public Postgraduated(String name) {
        super(name);
    }

   
    @Override
    public void graduate() {
        System.out.println("I've finished my thesis for postgraduate");
    }

    @Override
    public void getHighGPA() {
        System.out.println("My GPA is more than 3.71");
    }
    
    
}
