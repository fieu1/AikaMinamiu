/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet10.Task.Overloading;
import java.lang.*;
/**
 *
 * @author Aikacchii
 */
public class Segitiga {
    private int sudut;
    
    public int totalSudut(int sudutA){
        return 180 - sudutA; 
    }
    
    public int totalSudut(int sudutA, int sudutB){
        return 180 - (sudutA+sudutB); 
    }
    
    public int keliling(int sisiA, int sisiB, int sisiC){
        return sisiA + sisiB + sisiC;
    }
    
    public double keliling(double sisiA, double sisiB){
        double jumlah = Math.pow(sisiA, 2) + Math.pow(sisiB, 2);
        double sisiMiring = Math.sqrt(jumlah);
        return sisiMiring + sisiA + sisiB; 
    }
    
}
