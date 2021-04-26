package PunyaAlwi;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author MeiMei
 */
public class Main {
    public static void main(String[] args) {
        minMax[] ppArray = new minMax[5];
        ppArray[0] = new minMax();
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            ppArray[i] = new minMax();
            System.out.println("Index array value to-"+i);
            System.out.print("Input Value: ");
            ppArray[i].valueArray = sc.nextInt();
            arr[i] = ppArray[i].valueArray;
        }
        
        minMax hasilBruteForce = new minMax();
        hasilBruteForce.bruteForce(arr);
        System.out.println("Brute Force");
        System.out.println("Minimal value: " + hasilBruteForce.minimal);
        System.out.println("Maximal value: " + hasilBruteForce.maximal);        
        
        Result hasil = new Result();
        Result mM = new Result();
        mM.max_min(arr,0,4,hasil);
        System.out.println("Divide and Conquer");
        System.out.print("Minimum value : " + hasil.minimum + "\nMaximum value : " + hasil.maximum);
        System.out.print("\n");
    }
}
