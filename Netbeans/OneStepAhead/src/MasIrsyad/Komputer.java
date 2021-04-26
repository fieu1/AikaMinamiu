/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasIrsyad;

/**
 *
 * @author Aikacchii
 */
public class Komputer {
    public String merk;
    public int kecProsesor;
    public int sizeMemory;
    public String jnsProsesor;

    public Komputer() {
    }

    public Komputer(String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }
    
    public void tampilData(){
        System.out.println("Merk : " + this.merk);
        System.out.println("Kecepatan : " + this.kecProsesor);
        System.out.println("Size Memory : " + this.sizeMemory);
        System.out.println("Jenis Prosesor : " + this.jnsProsesor);
    }
}
