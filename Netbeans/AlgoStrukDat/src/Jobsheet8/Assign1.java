/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet8;

import java.util.Scanner;

/**
 *
 * @author MeiMei
 */
public class Assign1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        int amountStack;
        String data[];
        System.out.print("Input sentence : ");
        amountStack = 2;
        Assg1 tumpukan = new Assg1(amountStack); //instantiation stack
        data = new String[amountStack]; //instantiation array
        for (int i = 0; i < amountStack; i++) { 
            data[i] = sc.next(); //input sentence
            tumpukan.push(data[i]); //push to stack
        }
        System.out.print("Reversed sentence : "); //output
        tumpukan.revPrint(); //print reversed version
        System.out.println(""); 
    }
}
