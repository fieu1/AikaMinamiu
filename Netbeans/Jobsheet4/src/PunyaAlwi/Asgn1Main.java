/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PunyaAlwi;

import java.util.Scanner;

public class Asgn1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data[] = {30,20,40,10,10};
        System.out.println("Sorting with merge sort");
        
        Asgn1 mSort = new Asgn1();
        System.out.println("Data Array ");
        mSort.printArray(data);
        mSort.MergeSort(data);
        System.out.println("After Sorting...");
        mSort.printArray(data);
        System.out.println("Input number to search : ");
        int search = sc.nextInt();
        int index = mSort.FindBinarySearch(data, search, 0, 4);
        System.out.println(search + " is found in index " + index);
    }
}
