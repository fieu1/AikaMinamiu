/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet6.trial2;

/**
 *
 * @author Aikacchii
 */
public class ClassB extends ClassA {
        public int z;

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public void setX(int x) {
        super.setX(x);
    }

    @Override
    public void setY(int y) {
        super.setY(y);
    }
    
    public void getNilaiZ(){
        System.out.println("Z value : " + z);
    }
    
    public void getJumlah(){
        System.out.println("Total : " + (super.getX() + super.getY() + z));
    }
}
