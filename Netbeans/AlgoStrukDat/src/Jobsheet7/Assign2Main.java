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
public class Assign2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr2d[][] = new int [3][5]; //instantiation array
        Assign2 srch = new Assign2(); //instantiation object
        for(int i =0;i<arr2d.length;i++){ //loop for row
            for(int j=0;j<arr2d[i].length;j++){ //loop for collumn
                System.out.print("Input value for " + i + " row and " + j + " collumn : "); //print
                arr2d[i][j] = sc.nextInt(); //input
            }
        }
        System.out.println("What number do you want to search ? "); //print
        int search = sc.nextInt(); //input search
        srch.seqSearch(arr2d, search); //calling method
        
    }
}
