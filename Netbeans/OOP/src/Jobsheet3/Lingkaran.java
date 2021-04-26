/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet3;

/**
 *
 * @author Aikacchii
 */
public class Lingkaran {
    public double phi;
    public double r;
    
    public double hitungLuas(){
        double luas = phi*r*r;
        return luas;
    }
    
    public double hitungKeliling(){
        double keliling = phi*2*r;
        return keliling;
    }
    
     public static void main(String[] args) {
        Lingkaran lk = new Lingkaran();
        lk.phi = 3.14;
        lk.r =10;
         System.out.println("Luas " + lk.hitungLuas());
         System.out.println("Keliling " + lk.hitungKeliling());
    }
}
