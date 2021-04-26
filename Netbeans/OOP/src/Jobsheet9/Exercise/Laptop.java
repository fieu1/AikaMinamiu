/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet9.Exercise;

/**
 *
 * @author Aikacchii
 */
public class Laptop extends Komputer{
    public String jnsBatrei;

    public Laptop() {
    }

    public Laptop(String jnsBatrei, String merk, String jnsProcessor, int kecProcessor, int sizeMemory) {
        super(merk, jnsProcessor, kecProcessor, sizeMemory);
        this.jnsBatrei = jnsBatrei;
    }
    
    public void tampilLaptop(){
        super.tampilData();
        System.out.println("Jenis Baterai       = "+ jnsBatrei);
    }
}
