/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PunyaAlwi;

public class Asgn3Main {
    public static void main(String[] args) {
        int[] arr = {12, 17, 2, 1, 70, 50, 2, 17, 90, 90};
        Assignment3 srt = new Assignment3();
        srt.MergeSort(arr);
        int amount = 0, idx=0;
        int count = srt.BSCount(arr, 90, 0, 9, amount);
        int[] arrIdx = new int[count];
        int[] arrayForIdx;
        arrayForIdx = srt.BSIndex(arr, 90, 0, 9, arrIdx, idx);
        System.out.println("---------------------------------------------------");
        System.out.println("Array that have been sorted : ");
        srt.printData(arr);
        System.out.println("---------------------------------------------------");
        System.out.println("There is " + count +" maximum number in array ");
        System.out.println("---------------------------------------------------");
        for(int i = 0; i<count;i++){
            System.out.println("The index of maximum value is : " + arrayForIdx[i]);
        }
        System.out.println("---------------------------------------------------");
    }
}
