/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory;

/**
 *
 * @author Aikacchii
 */
public class MainBangunDatar {
    public static void main(String[] args) {
        PersegiPanjang p = new PersegiPanjang(6, 2);
        Segitiga s = new Segitiga(6,8);    
        Lingkaran l = new Lingkaran(14);
        
        System.out.println("Luas Persegi : " + p.Luas());
        System.out.println("Keliling Persegi : " + p.Keliling());
        System.out.println("Luas Segitiga : " + s.Luas());
        System.out.println("Keliling Segitiga : " + s.Keliling());
        System.out.println("Luas Lingkaran : " + l.Luas());
        System.out.println("Keliling Lingkaran : " + l.Keliling());
    }
}
