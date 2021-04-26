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
public class PostfixMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.println("Input mathematical expression : ");
        Q = sc.nextLine();
        Q = Q.trim();
        
        Q = Q + ")";
//        System.out.println(" " + Q);
        int total = Q.length();
        
        Postfix post = new Postfix(total);
        P = post.konversi(Q);
        System.out.println("Postfix = " + P);
    }
}
