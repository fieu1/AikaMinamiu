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
public class Assign3 {
    public static void main(String[] args) {
        //scanner for string and char
        Scanner scs = new Scanner(System.in);
        //using char to one word value
        char arr[] = {'M','I','S','S','I','S','S','I','P','I'};
        //variable for check how many the word was
        int indM = 0, indI = 0, indS = 0, indP =0;
        for(int i=0;i<10;i++){
            //selection to check the amount of the word predetermined
            if(arr[i] == 'M'){
                indM++; //to increase value of "M"
            } else if(arr[i] == 'I'){
                indI++; //to increase value of "I"
            } else if(arr[i] == 'S'){
                indS++; //to increase value of "S"
            } else if(arr[i] == 'P'){
                indP++; //to increase value of "P"
            }
        }
        //result
        System.out.println("total of M is " + indM + ", S is " + indS + ", I is " + indI + ", P is " + indP);
    }
}
