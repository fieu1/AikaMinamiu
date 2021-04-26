/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet7;
import java.util.Scanner;
/**
 *
 * @author MeiMei
 */
public class SearchingMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input how much array you want to search : ");
        int amount = sc.nextInt();
        int data[] = new int [amount];
        for(int i=0;i<amount;i++){
            System.out.print("Input data -" + (i+1) + " : ");
            data[i] = sc.nextInt();
        }
        
        Searching sch = new Searching(data, amount);
        
        System.out.println("Array data : ");
        sch.printData();
        
        System.out.println("What number do you want to search ? ");
        int search = sc.nextInt();
        System.out.println("sequential search algorithm ");
        int position = sch.FindSeqSearch(search);
        
        sch.PrintPosition(search, position);
        System.out.println("===========================");
        System.out.println("Sorting with Merge sort");
        int[] newData;
        newData = sch.Sort(data, 0, amount-1);
        
        for(int k=0;k<amount;k++){
            System.out.print(newData[k] + " ");
        }
        System.out.println("");
        System.out.println("============================");
        System.out.println("Binary Search Algorithm ");
        position = sch.FindBinarySearch(newData, search, 0, amount-1);
        sch.PrintPosition(search, position);
    }
}
