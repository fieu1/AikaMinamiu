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
public class Pc extends Komputer{
    public int ukuran;

    public Pc() {
    }

    public Pc(int ukuran, String merk, String jnsProcessor, int kecProcessor, int sizeMemory) {
        super(merk, jnsProcessor, kecProcessor, sizeMemory);
        this.ukuran = ukuran;
    }
    
    public void tampilPc(){
        System.out.println("=======================================");
        System.out.println("                PC ");
        System.out.println("=======================================");
        super.tampilData();
        System.out.println("Ukuran Layar        = " + ukuran + " Inch");
    }
}
