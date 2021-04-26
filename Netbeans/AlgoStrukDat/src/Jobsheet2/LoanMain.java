/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet2;
import java.util.Scanner;
/**
 * @author MeiMei
 */
public class LoanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);
        String name, game;
        int id, day, price;
        System.out.print("Input amount of customer : "); //input label
        int amount = sc.nextInt(); //input amount 
        Loan[] user = new Loan[amount]; //instantiation array of object
        for (int i = 0; i < amount; i++) { //looping for input
            System.out.print("Input Customer name : "); //label input
            name = scs.nextLine(); //input name
            System.out.print("Input Game name : "); //label input
            game = scs.nextLine(); //input game name
            System.out.print("Input ID : "); //label input
            id = sc.nextInt(); //input id
            System.out.print("How much the day of loan : "); //label input
            day = sc.nextInt(); //input day
            System.out.print("Price per day : "); //label input
            price = sc.nextInt(); //input price
            user[i] = new Loan(name, game, id, day, price); //instantiation   
        }
        for (int i = 0; i < amount; i++) { //looping for total
            user[i].print(); //call print method
            System.out.println("TOTAL : " + user[i].total()); //output    
        }
    }
}
