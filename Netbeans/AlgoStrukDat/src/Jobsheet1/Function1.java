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
public class Function1 {

    public static void main(String[] args) {
        int numb1 = 0;
        int numb2 = 1;
        int numb3;
        System.out.print(numb1 + " " + numb2);
        for (int i = 0; i < 7; i++) {
            numb3 = numb1 + numb2;
            System.out.print(" " + numb3);
            numb1 = numb2;
            numb2 = numb3;
        }
        System.out.println();
    }

}
