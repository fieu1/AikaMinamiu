/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet1;
import java.util.Scanner;
/**
 *
 * @author MeiMei
 */
public class Looping2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance, interest;
         
         System.out.print ("Input your balance : Rp ");
         balance = sc.nextInt();
         
         for(int i=0; i<12 ; i++){
             interest = balance * 0.02;
             balance = balance + interest;
         }
         
         System.out.printf("Your balance in 12 month is : Rp %.2f", balance);
         System.out.println();
    }
}
