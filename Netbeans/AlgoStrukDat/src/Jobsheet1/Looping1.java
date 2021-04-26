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
public class Looping1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        
        System.out.println("Input a : ");
        a = sc.nextInt();
        
        for(int i=0; i<5; i++){
            a-=3;
        }
        System.out.println("A after decreasing 5 times is : " + a);
        if(a%2 == 0){
            System.out.println("The result is even number");
        } else if(a%2 == 1){
            System.out.println("The result is odd number");
        }
    }
}
