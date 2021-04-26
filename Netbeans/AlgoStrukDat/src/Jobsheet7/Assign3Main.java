/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet7;

/**
 *
 * @author MeiMei
 */
public class Assign3Main {

    public static void main(String[] args) {
        int[] arr = {12, 17, 2, 1, 70, 50, 2, 17, 90, 90}; //array
        Assign3 obj = new Assign3(); //instantiation object
        int[] newArr = obj.bubbleSort(arr); //new array that have been sorted
        System.out.println("=================================");
        System.out.println("Array :");
        System.out.println("=================================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("=================================");
        System.out.println("Sorted :");
        System.out.println("=================================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        
        System.out.println("");
        System.out.println("=================================");
        System.out.println("Searching....");
        int biggest = newArr[newArr.length - 1]; //biggest value
        int amnt = 0; //amount of biggest value
        int amount = obj.FindAmountBinarySearch(newArr, biggest, 0, 9, amnt); //calling a method and save the value 
        System.out.println("Array has " + amount + " biggest value ");
        int[] idx = new int[amount]; //instantiation new array for index
        int[] indx; //array for call method
        int indexforIdx =0 ; //index for array idx
        indx = obj.FindIndexBinarySearch(newArr, biggest, 0, 9, idx, indexforIdx); //call method and save the array
        for(int j=0; j<amount;j++){
            System.out.println("The index that has value 90 is : " + indx[j]);
        }
        System.out.println("=================================");

    }

}
