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
public class Array1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int indEven = 0, indOdd = 0;
        int arrMain[] = new int[15];
        
        for (int i = 0; i < 15; i++) {
            System.out.print("Input the array main -"+ (i+1)+ " : ");
            arrMain[i] = sc.nextInt();
        }
        for (int i = 0; i < 15; i++) {
            if(arrMain[i] % 2 == 0){
                indEven++;
            } else if(arrMain[i]%2 == 1 ){
                indOdd++;
            }
        }
        int arrEven[] = new int[indEven];
        int arrOdd[] = new int[indOdd];
        int ev = 0, od = 0;
        for (int i = 0; i < 15; i++) {
            if(arrMain[i] % 2 == 0){
                arrEven[ev] = arrMain[i];
                ev++;
            } else if(arrMain[i]%2 == 1 ){
                arrOdd[od] = arrMain[i];
                od++;
            }
        }
        System.out.println("EVEN NUMBER IS : ");
        for(int i = 0; i<indEven; i++){
            System.out.print(arrEven[i] + " ");
        }
        System.out.println();
        System.out.println("ODD NUMBER IS : ");
        for(int i = 0; i<indOdd; i++){
            System.out.print(arrOdd[i] + " ");
        }
        System.out.println("");
    }
}
