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
public class MainSquared {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.print("Input number of element do you want to count : ");
        int element = sc.nextInt();
        Squared[] png = new Squared[element];
        for (int i = 0; i < element; i++) {
            System.out.print("Input the value to be squared to-" + (i + 1) + " : ");
            int num = sc.nextInt();
            System.out.print("Input the squared to-" + (i + 1) + " : ");
            int squared = sc.nextInt();
            png[i] = new Squared(num, squared);
        }

        System.out.println("==================================================");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide Conquer");
        System.out.println("Choose method you want to calculate : ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("==================================================");
            System.out.println("Result with Brute Force Squared");
            for (int i = 0; i < element; i++) {
                System.out.println("Value " + png[i].num + " squared " + png[i].squared + " is : " + png[i].squaredBF(png[i].num, png[i].squared));
            }
            System.out.println("==================================================");
        } else if (choice == 2) {
            System.out.println("==================================================");
            System.out.println("Result with Divide Conquer Squared");
            for (int i = 0; i < element; i++) {
                System.out.println("Value " + png[i].num + " squared " + png[i].squared + " : " + png[i].squaredDC(png[i].num, png[i].squared));
            }
            System.out.println("==================================================");
        }

    }
}
