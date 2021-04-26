/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet8;

import java.util.Scanner;

/**
 *
 * @author MeiMei
 */
public class StackMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amountStack;
        String data[];
        System.out.println("Input how many data do you want : ");
        amountStack = sc.nextInt();
        Stack tumpukan = new Stack(amountStack);
        data = new String[amountStack];
        for (int i = 0; i < amountStack; i++) {
            System.out.print("Input data -" + i + " : ");
            data[i] = sc.next();
            tumpukan.push(data[i]);
        }
        boolean repeat = false;
        do {
            System.out.println("============================");
            System.out.println("MENU : ");
            System.out.println("============================");
            System.out.println("1. push ");
            System.out.println("2. pop ");
            System.out.println("3. peek ");
            System.out.println("4. print ");
            System.out.println("5. clear ");
            System.out.println("6. Check full and empty");
            System.out.println("0. Exit");
            System.out.print("Your choice = ");
            int menuChoice = sc.nextInt();
            if (menuChoice == 1) {
                System.out.println("Input how many data do you want : ");
                int amountStack1 = sc.nextInt();

                for (int i = 0; i < amountStack1; i++) {
                    data = new String[amountStack1];
                    System.out.print("Input data -" + i + " : ");
                    data[i] = sc.nextLine();
                    tumpukan.push(data[i]);
                }
            } else if (menuChoice == 2) {
                tumpukan.pop();
            } else if (menuChoice == 3){
                tumpukan.peek();
            } else if (menuChoice == 4){
                tumpukan.print();
            } else if (menuChoice == 5){
                tumpukan.clear();
            } else if (menuChoice == 6){
                boolean empty, full;
                System.out.print("Empty : ");
                empty = tumpukan.IsEmpty();
                if(empty){
                    System.out.println("Y");
                } else if(!empty){
                    System.out.println("N");
                }
                System.out.print("Full : ");
                full = tumpukan.IsFull();
                if(full){
                    System.out.println("Y");
                } else if(!full){
                    System.out.println("N");
                }
            } else if(menuChoice == 0){
                System.out.println("Thankyou !");
                break;
            } else {
                System.out.println("Sorry, your input is wrong");
            }
            
            System.out.println("Repeat ? (1 = yes, 0 = no)");
            int repeatChoice = sc.nextInt();
            if(repeatChoice == 0 ){
                repeat = false;
                System.out.println("Thankyou!");
                break;
            } else if(repeatChoice == 1 ){
                repeat = true;
            }
        } while (repeat);
    }
}
