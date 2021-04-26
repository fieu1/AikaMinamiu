/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet6;
import java.util.Scanner;
/**
 *
 * @author MeiMei
 */
public class PlaneMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        DatabasePlane list = new DatabasePlane(); //make an object
        String listPln[] = {"Garuda Indonesia", "Lion Air", "Sriwijaya Air", "Japan Airlines", "Citilink"}; //array for plane list
        String arrDepTime[] = {"05.00-07.00", "09.00-12.00","14.00-16.00","18.00-20.00","22.00-00.00"}; //array for time table
        int price[] = {1190000,1250000,890000,110000,950000}; //array for price
        
        for(int i=0;i<listPln.length;i++){ //looping for input value of array to object
            String name = listPln[i]; //changing value
            String time = arrDepTime[i]; //changing value
            int plnPrice = price[i]; //changing value
            Plane ticket = new Plane(name, time, plnPrice); //instantiation new object with constructor parameter
            list.add(ticket); //call add method 
        }
        System.out.println("Plane list before sorting"); //output
        list.print(); //call print method 
        System.out.println("Plane list after sorting with Bubble Sort ="); //output
        list.bubbleSort(); //call bubble sort method to sorting
        list.print(); //call print method
        System.out.println("Plane list after sorting with Selection Sort ="); //output
        list.selectionSort(); //call selection sort method for sorting
        list.print(); //call print method
        
    }
}


