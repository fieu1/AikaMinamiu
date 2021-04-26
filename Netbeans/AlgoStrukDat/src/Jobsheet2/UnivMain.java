/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet2;
import java.util.Scanner;
/**
 *
 * @author MeiMei
 */
public class UnivMain {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total Student : "); 
        int student = sc.nextInt();
        Univ[] arr = new Univ[student]; //instantiation array of object
        for(int i = 0; i<student; i++){ //loop as many of student
            System.out.println("Student " + (i+1)); //output  
            System.out.print("Score 1 : "); //for label to input score 1
            int val1 = sc.nextInt(); //input for value 1
            System.out.print("Score 2 : "); //for label to input score 2
            int val2 = sc.nextInt(); //input for value 2
            arr[i] = new Univ(val1, val2); //instantiation object
        }
        for(int i=0; i <student; i++){ //loop to output
            System.out.println("The best Score Student " + (i+1) + " : " + arr[i].calculateHigher());//output
        }
    }
}
