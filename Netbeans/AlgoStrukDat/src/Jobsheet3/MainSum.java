/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet3;

import java.util.Scanner;

/**
 *
 * @author MeiMei
 */
public class MainSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("Program to Calculating Total Profits");
        System.out.println("=====================================");
        System.out.print("Input the Number of Companies : ");
        int comp = sc.nextInt();
        int j = 1;
        while (j <= comp) {
            System.out.println("=====================================");
            System.out.println("COMPANIES NO." + j);
            System.out.print("Input the Number of Months : ");
            int totElemen = sc.nextInt();
            Sum sm = new Sum(totElemen);
            sm.element = totElemen;
            System.out.println("=====================================");
            for (int i = 0; i < sm.element; i++) {
                System.out.println("Input the profit of the month to - " + (i + 1) + " = ");
                sm.profit[i] = sc.nextDouble();
            }
            System.out.println("=====================================");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total profits of the company for " + sm.element + " month is = " + sm.totalBF(sm.profit));
            System.out.println("=====================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total profits of the company for " + sm.element + " month is = " + sm.totalDC(sm.profit, 0, sm.element - 1));
            j++;
        }
    }
}
