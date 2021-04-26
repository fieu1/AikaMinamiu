/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet2;

import java.util.Scanner;

/**
 *
 * @author MeiMei
 */
public class TaskItemMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);
        System.out.print("Input amount of customer : "); //label for amount of customer
        int amount = sc.nextInt(); //input amount
        TaskItem[] item = new TaskItem[amount]; //instantiation object
        for (int i = 0; i < amount; i++) { //loop as many of customer
            System.out.print("Input name of unit : "); //label of input
            String name = scs.nextLine(); //input name
            System.out.print("Input price of unit : ");//label of input
            int price = sc.nextInt(); //input price
            System.out.print("Input amount of unit : "); //label of input
            int total = sc.nextInt(); //input amount
            item[i] = new TaskItem(name, price, total); //instantiation with parameter
        }
        
        for(int i = 0; i<amount; i++){ //loop for output
            System.out.println("Total price for unit " + item[i].name +" as many " + item[i].total +" is " + item[i].pricePaid());
            //output
        }
    }
}
