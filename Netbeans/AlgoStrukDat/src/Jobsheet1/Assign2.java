/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet1;

/**
 *
 * @author MeiMei
 */
public class Assign2 {

    public static void main(String[] args) {
        //using double because of decimal number in interest
        double balance = 1000000;
        double interest;
        //started from month 0 because interest is added the next month
        int month = 0;
        for (int i = 1; i > 0; i++) {
            //to check are the balance is already Rp 1.500.000 or under that 
            if (balance <= 1500000) { 
                interest = balance * 0.02; //interest formula
                balance = balance + interest; //to get new value of balance plus interest
                //to calculate how many month until balance reach Rp 1.500.000
                month++;
            }else {
                System.out.println("Balance : " + balance); //output
                System.out.println("You need " + month + " month to get Rp 1.500.000"); //result
                break; //to exit the program
            }

        }
    }
}
