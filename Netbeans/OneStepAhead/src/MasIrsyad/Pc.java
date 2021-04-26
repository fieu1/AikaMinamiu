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
public class Pc extends Komputer{
    public int ukuranMonitor;

    public Pc() {
    }

    public Pc(String merk, int kecProsesor, int sizeMemory, String jnsProsesor,int ukuranMonitor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }
    
    public void tampilLPc(){
        System.out.println("Ukuran Monitor : " + this.ukuranMonitor);
        super.tampilData();
    }
}
