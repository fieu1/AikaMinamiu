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
public class Mac extends Laptop{
    public String security;

    public Mac() {
    }

    public Mac(String security, String jnsBatrei, String merk, String jnsProcessor, int kecProcessor, int sizeMemory) {
        super(jnsBatrei, merk, jnsProcessor, kecProcessor, sizeMemory);
        this.security = security;
    }
    
    public void tampilMac(){
        System.out.println("=======================================");
        System.out.println("                MAC ");
        System.out.println("=======================================");
        super.tampilLaptop();
        System.out.println("Security            = " + security);
    }
}
