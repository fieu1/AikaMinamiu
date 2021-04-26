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
public class WideLandMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Amount of land : "); //label for input
        int number = sc.nextInt(); //input number
        Land[] arr = new Land[number]; //instantiation
        for (int i = 0; i < number; i++) { //looping as many of land
            System.out.println("Land " + (i + 1)); //output 
            System.out.print("Length : "); //input label
            int length = sc.nextInt(); //input length
            System.out.print("Width : "); //input label
            int width = sc.nextInt(); //input width
            arr[i] = new Land(length, width); //instantiation with parameter
        }
        for (int j = 0; j < number; j++) { //loop to output
            System.out.println("Land Area " + (j+1) + " : " + arr[j].calculateArea());//output
        }
        int big = 0, p = 0; //variable to calculate biggest value
        for (int j = 0; j < number; j++) { //loop for looking biggest value 
            if (arr[j].calculateArea() > big) { //condition when value of area is bigger than big
                big = arr[j].calculateArea(); //change big value
                p = j + 1; //to know position of biggest area
            }
        }
        System.out.println("The widest land is : Land " + p);//output
    }
}
