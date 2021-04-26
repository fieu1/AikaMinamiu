/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory;
import java.lang.*;
/**
 *
 * @author Aikacchii
 */
public class Segitiga extends BangunDatar{
    public float alas;
    public float tinggi;

    
    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public float Luas() {
        return alas*tinggi/2; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float Keliling() {
        double jumlah = Math.pow(alas, 2) + Math.pow(tinggi, 2);
        double sisiMiring = Math.sqrt(jumlah);
        return (float)sisiMiring + alas + tinggi; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
