/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import java.util.Scanner;

/**
 *
 * @author MeiMei
 */
public class DivConMain {

    public static void main(String[] args) {
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, poll = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input c1 :");
        c1 = sc.nextInt();
        System.out.println("Input c2 :");
        c2 = sc.nextInt();
        System.out.println("Input c3 :");
        c3 = sc.nextInt();
        System.out.println("Input c4 :");
        c4 = sc.nextInt();
        if (c1 > poll) {
            poll = c1;
        }
        if (c2 > poll) {
            poll = c2;
        }
        if (c3 > poll) {
            poll = c3;
        }
        if (c4 > poll) {
            poll = c4;
        }
        System.out.println("The biggest is " + poll);
    }
}
