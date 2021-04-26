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
public class Komputer {
    public String merk, jnsProcessor;
    public int kecProcessor, sizeMemory;

    public Komputer() {
    }

    public Komputer(String merk, String jnsProcessor, int kecProcessor, int sizeMemory) {
        this.merk = merk;
        this.jnsProcessor = jnsProcessor;
        this.kecProcessor = kecProcessor;
        this.sizeMemory = sizeMemory;
    }
    
    public void tampilData(){
        System.out.println("Merk                = " + merk);
        System.out.println("Jenis Processor     = " + jnsProcessor);
        System.out.println("Kecepatan Processor = " + kecProcessor);
        System.out.println("Size Memory         = " + sizeMemory);
    }
}
