/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet6;

/**
 *
 * @author Aikacchii
 */
public class ClassB extends ClassA{
    public int z;
    
    public void getNilaiZ(){
        System.out.println("Z value : " + z);
    }
    
    public void getJumlah(){
        System.out.println("Total : " + (super.x + super.y + z));
    }
    
}
