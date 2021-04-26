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
public class PrefixMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.print("Input mathematical expression : ");
        Q = sc.nextLine(); //input mathematical operation
        Q = Q.trim(); //get rid of space after and before expression
        Q = "(" + Q; //when get reversed, it will become ")" and will used for add the operator to string
        int total = Q.length(); //calculate length of string
        
        Prefix post = new Prefix(total); //instantiation 
        P = post.preConverter(Q); //call prefix converter function
        System.out.println("Prefix = " + P); 
    }
}
