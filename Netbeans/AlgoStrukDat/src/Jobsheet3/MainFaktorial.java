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
public class MainFaktorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.print("Input the number of element do you want to count : ");
        int element = sc.nextInt();
        Faktorial[] fk = new Faktorial[element];
        for (int i = 0; i < element; i++) {
            fk[i] = new Faktorial();
            System.out.print("input the data value to-" + (i + 1) + " : ");
            fk[i].num = sc.nextInt();
        }

        System.out.println("====================================================");
        System.out.println("Factorial Results with Brute Force");
        for (int i = 0; i < element; i++) {
            System.out.println("Factorial of value " + fk[i].num + " is " + fk[i].faktorialBF(fk[i].num));
        }
        System.out.println("====================================================");
        System.out.println("Factorial Results with Divide Conquer");
        for (int i = 0; i < element; i++) {
            System.out.println("Factorial of value " + fk[i].num + " is " + fk[i].faktorialDC(fk[i].num));
        }
        System.out.println("====================================================");
    }
}
