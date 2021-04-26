/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet10.Task.Overriding;

/**
 *
 * @author Aikacchii
 */
public class Dosen extends Manusia{
    public void makan(){
        System.out.println("Dosenpun makan");
    }
    
    public void lembur(){
        System.out.println("Karena dosen lembur, beliau tidak boleh terlambat makan");
    }
}
