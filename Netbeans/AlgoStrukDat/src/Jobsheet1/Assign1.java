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
public class Assign1 {
    //declaring input scanner and global variable to easy access in any function
    //scanner for interger 
    static Scanner sc = new Scanner(System.in);
    //scanner for string
    static Scanner scs = new Scanner(System.in);
    static int price;
    static int totalprice = 0;

    //main function used to call menu function and looping whenever user want to order again
    public static void main(String[] args) {
        menu();
        //infinite looping for infinite order until the user finish their order
        for (int i = 1; i > 0; i++) {
            System.out.println("Do you want to order again? (y/n)");
            String choice = scs.nextLine();
            if (choice.equalsIgnoreCase("y")) { //when user input "Y" or "y"
                menu(); //return to menu function
            } else if (choice.equalsIgnoreCase("n")) { //when user input "N" or "n"
                System.out.println("Total purchase is : " + totalprice); //output
                //break to exit the program
                break;
            }
        }
    }
    
    //menu function used to choose the package 
    //based on input number as the package that written in the option
    static void menu() {
        System.out.println("Menu Package :");
        System.out.println("1. Chicken Package");
        System.out.println("2. Oke Package");
        System.out.print("Choose the Menu Package :");
        int menu1 = sc.nextInt();
        if (menu1 == 1) { //when user input "1"
            ChickPack(); //go to chicken package function
        } else if (menu1 == 2) { //when user input "2"
            OkPack(); //go to oke package function
        } else { //when user input beside 1 and 2
            System.out.println("Your input is wrong, try again"); //output
            menu(); //return to menu function again
        }
    }
    
   
    static int ChickPack() {
        System.out.println("Menu Package :");
        System.out.println("1. Chicken A  @Rp 12.000");
        System.out.println("2. Chicken B  @Rp 15.000");
        System.out.println("3. Chicken C  @Rp 20.000");
        System.out.print("Choose the Menu Package :");
        int menu2 = sc.nextInt();
        System.out.println("How many you want to buy? ");
        int amount = sc.nextInt(); //how much user want to buy
        if (menu2 == 1) { //conditon when user input "1"
            price = 12000; //price of package
            price *= amount; //calculate price as many as the user want to buy
            totalprice += price; //final result how many transaction the user want
        } else if (menu2 == 2) { //conditon when user input "2"
            price = 15000; //price of package
            price *= amount; //calculate price as many as the user want to buy
            totalprice += price; //final result how many transaction the user want
        } else if (menu2 == 3) { //conditon when user input "3"
            price = 20000; //price of package
            price *= amount; //calculate price as many as the user want to buy
            totalprice += price; //final result how many transaction the user want
        } else { //when user input beside 1 and 2
            System.out.println("Your input is wrong, try again"); //output
            menu(); //return to menu function again
        }
        return totalprice; //give return value totalprice
    }

    static int OkPack() {
        System.out.println("Menu Package :");
        System.out.println("1. OKE A  @Rp 10.000");
        System.out.println("2. OKE B  @Rp 12.000");
        System.out.println("3. OKE C  @Rp 15.000");
        System.out.print("Choose the Menu Package :");
        int menu3 = sc.nextInt();
        System.out.println("How many you want to buy? ");
        int amount = sc.nextInt();  //how much user want to buy
        if (menu3 == 1) { //conditon when user input "1"
            price = 10000; //price of package
            price *= amount; //calculate price as many as the user want to buy
            totalprice += price; //final result how many transaction the user want
        } else if (menu3 == 2) { //conditon when user input "2"
            price = 12000; //price of package
            price *= amount; //calculate price as many as the user want to buy
            totalprice += price; //final result how many transaction the user want
        } else if (menu3 == 3) { //conditon when user input "3"
            price = 15000; //price of package
            price *= amount; //calculate price as many as the user want to buy
            totalprice += price;//final result how many transaction the user want
        } else { //when user input beside 1 and 2
            System.out.println("Your input is wrong, try again"); //output
            menu(); //return to menu function again
        }
        return totalprice; //give return value total price
    }
}
