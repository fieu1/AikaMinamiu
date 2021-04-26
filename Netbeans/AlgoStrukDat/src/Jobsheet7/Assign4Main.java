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
public class Assign4Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Amount of citizen : ");
        int ctz = sc.nextInt(); //input
        Assign4 cityz = new Assign4(ctz); //instantiation new object
        for(int i = 0; i<ctz; i++){  //input 
            System.out.println("Citizen " + (i+1));
            System.out.print("NIK : "  );
            cityz.nik[i] = sc.nextInt();
            System.out.print("Name : ");
            cityz.name[i] = sc.next();
            System.out.print("Adress : ");
            cityz.address[i] = sc.next();
            System.out.print("Gender : ");
            cityz.gender[i] = sc.next();
            System.out.println();
        }
        System.out.print("Input NIK to search : "); 
        int search = sc.nextInt(); //input NIK that want to search
        cityz.seqSearch(search); //calling a method
    }
}
