/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Aika
 */
public class Selection1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int number;
        System.out.println("Enter your number: ");
        number = sc.nextInt();
        String output = (number%2==0) ? "Even number" : "Odd number";
        System.out.println(output);
        if (number%2==0)
            System.out.println("Even number");
        
        else 
            System.out.println("Odd number");
        
    }
    
}
