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
public class Selection1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double finale, assgn, mid, fin;
        int assign, midterm, finterm;

        System.out.print("INPUT YOUR ASSIGNMENT SCORE : ");
        assign = sc.nextInt();
        if (assign >= 0 && assign <= 100) {
            assgn = assign * 0.2;
            System.out.print("INPUT YOUR MIDTERM SCORE : ");
            midterm = sc.nextInt();
            if (midterm >= 0 && midterm <= 100) {
                mid = midterm * 0.35;
                System.out.print("INPUT YOUR FINAL TERM SCORE : ");
                finterm = sc.nextInt();
                if (finterm >= 0 && finterm <= 100) {
                    fin = finterm * 0.45;
                    finale = fin + mid + assgn;
                    System.out.println("Your final grade is = " + finale); 
                            
                } else {
                    System.out.println("YOUR INPUT IS WRONG");
                }
            } else {
                System.out.println("YOUR INPUT IS WRONG");
            }

        } else {
            System.out.println("YOUR INPUT IS WRONG");
        }

    }
}
