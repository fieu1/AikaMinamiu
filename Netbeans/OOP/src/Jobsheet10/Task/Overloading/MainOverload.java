/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet10.Task.Overloading;

/**
 *
 * @author Aikacchii
 */
public class MainOverload {
    public static void main(String[] args) {
        Segitiga stg = new Segitiga();
        
        System.out.println("Total satu sudut (60) : " + stg.totalSudut(60));
        System.out.println("Total dua sudut (60,45) : " + stg.totalSudut(60, 45));
        System.out.println("Keliling (5,4,12) : " + stg.keliling(4, 5, 12));
        System.out.println("Keliling (3,4) : " + stg.keliling(3, 4));
    }
}
