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
public class Windows extends Laptop{
    public String fitur;

    public Windows() {
    }

    public Windows(String fitur, String jnsBatrei, String merk, String jnsProcessor, int kecProcessor, int sizeMemory) {
        super(jnsBatrei, merk, jnsProcessor, kecProcessor, sizeMemory);
        this.fitur = fitur;
    }
    
    public void tampilWindows(){
        System.out.println("=======================================");
        System.out.println("                WINDOWS ");
        System.out.println("=======================================");
        super.tampilLaptop();
        System.out.println("Feature             = " + fitur);
    }
}
