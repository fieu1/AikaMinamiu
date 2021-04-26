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
public class Function2 {
    public static void main(String[] args) {
        int numb1 = 0;
        int numb2 = 1;
        int numb3 = 0;
        
        System.out.print(numb1 + " " + numb2);
        Fibonacci(numb1, numb2, numb3);
    }
    static void Fibonacci(int numb1, int numb2, int numb3){
        numb3 = numb1 + numb2;
        if(numb3 > 21){
            System.out.println();
        } else {
            System.out.print(" " + numb3);
            numb1 = numb2;
            numb2 = numb3;
            
            Fibonacci(numb1, numb2, numb3);
        }
    }
}
