/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet7;

/**
 *
 * @author MeiMei
 */
public class Assign4 {

    public int[] nik;
    public String[] name, address, gender;
    public int ctz;
    public Assign4(int ctz) {
        this.ctz = ctz;
        nik = new int[ctz];
        name = new String[ctz];
        address = new String[ctz];
        gender = new String[ctz];
    }

    public void seqSearch(int search) {

        for (int i = 0; i < ctz; i++) { //for iteration
                if (nik[i] == search) { //if the array value same with search number
                    System.out.println("NIK " + search + " is belongs to " + name[i]); //output
                    break; //break the loop
                }
            }
        }   
}
