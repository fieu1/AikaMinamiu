/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int base, food, transport;
        double total, tax;
    Scanner sc = new Scanner(System.in);
        System.out.println("Your base salary is Rp ");
    base = sc.nextInt();
        System.out.println("Your food allowandce is Rp ");
    food = sc.nextInt();
        System.out.println("Your transport money is Rp ");
    transport = sc.nextInt();
    
    total = base + food + transport;
    if (total > 1000000) {
        tax = total * 0.1;
        total = total - tax;
        System.out.println("Your salary is " + total);
    }     
        else {
            System.out.println("Your salary is " + total);
        }
    }
    
}
