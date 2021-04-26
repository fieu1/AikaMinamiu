/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet10;

import java.util.Scanner;

/**
 *
 * @author MeiMei
 */
public class CustMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the maximum number of customer : "); 
        int n = sc.nextInt(); //max value
        
        CustQueue Q = new CustQueue(n); //instantiation
        int select; //for select menu
        
        do{
            menu(); //show menu
            select = sc.nextInt(); //input
            switch(select){ //based on select value
                case 1 : //if 1
                    System.out.println("Enter new data : "); 
                    System.out.print("Account number : ");
                    String accname = sc.next(); //input acc number
                    System.out.print("Name : "); 
                    String name = sc.next(); //input name
                    Q.Enqueue(accname, name); //call enqueue method
                    break; //break the selection
                case 2 : //if 2
                    Customer dataRetrieve = Q.Dequeue(); //save value to display
                    dataRetrieve.print(); //call data print method
                    break; //break the selection
                case 3 : //if 3
                    Q.print(); //call print queue method
                    break; //break the selection
                case 4 : //if 4
                    Q.peek();//call peek front method
                    break; //break the selection
                case 5 : //if 5
                    Q.peekRear(); //call peek rear method
                    break; //break the selection
                case 6 : //if want to peek position of searched data
                    System.out.print("Input customer account number to search : "); //display
                    String sacc = sc.next(); //input variable
                    System.out.print("Input customer name to search : "); //display
                    String sname = sc.next(); //input variable
                    Customer S = new Customer(sacc, sname);
                    Q.peekPosition(S); //call peek position method
                    break; //break the selection
                case 7 : //if want to peek data at the position that inputted
                    System.out.print("Input position : "); //display
                    int pos = sc.nextInt(); //input variable 
                    Q.printCustomer(pos); //call print customer method
                    break; //break the selection
                default : // if not 1-7
                    System.out.println("Thankyou!"); //display
                    break; //break the selection
        }
        } while (select==1 || select== 2 || select== 3 || select== 4 || select== 5 || select== 6 || select== 7); 
        //if select is bigger than 0 and less or same with 7
    }
    
    public static void menu(){
        System.out.println("");
        System.out.println("Options Menu : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek Front");
        System.out.println("5. Peek Rear");
        System.out.println("6. Peek Position");
        System.out.println("7. Print Customer");
        System.out.println("Input another number to exit");
        System.out.println("--------------------------");
    }
}
