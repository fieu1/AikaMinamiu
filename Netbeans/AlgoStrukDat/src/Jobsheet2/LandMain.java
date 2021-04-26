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
public class LandMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Amount of land : "); //label input
        int number = sc.nextInt(); //input number 
        
        Land[] arr = new Land[number]; //instantiation
        
        for(int i = 0; i < number; i++){ //looping for input 
            System.out.println("Land " + (i+1)); //output land
            System.out.print("Length : "); //label input
            int length = sc.nextInt(); //input length
            System.out.print("Width : "); //label input
            int width = sc.nextInt(); //input width
            arr[i] = new Land(length, width); //instantiation
        }
        
        for(int j = 0; j<number;j++){ //looping for output
            System.out.println("Land Area " + j + " : " + arr[j].calculateArea()); //output
        }
    }
}
