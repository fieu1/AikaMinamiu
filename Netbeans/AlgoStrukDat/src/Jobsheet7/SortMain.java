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
public class SortMain {
    public static void main(String[] args) {
        int data[] = {30,20,40,10,10};
        System.out.println("Sorting with merge sort");
        
        MergeSort mSort = new MergeSort();
        System.out.println("Data Array ");
        mSort.printArray(data);
        mSort.MergeSort(data);
        System.out.println("After Sorting...");
        mSort.printArray(data);
    }
}
