/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet1;
import java.util.Scanner;
/**
 *
 * @author MeiMei
 */
public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[4][5];
        
        for(int i=0; i<4; i++){
            for(int j=0;j<5;j++){
                System.out.print("Input array row-" + (i+1) + " collumn-" + (j+1) + " = ");
                arr[i][j]= sc.nextInt();
            }
        }
        int total = 0;
        for(int i=0; i<4; i++){
            for(int j=0;j<5;j++){
                total = total + arr[i][j];
            }
        }
        System.out.println("The total is " + total);
    }
}
