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
public class Experiment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter your age : ");
        age = sc.nextInt();
        if (age>60)
            System.out.println("Elderly");
        else if (age>45)
            System.out.println("Old");
        else if(age>17)
            System.out.println("Adult");
        else if(age>5)
            System.out.println("Children");
        else if(age<=0)
            System.out.println("Sorry, the age you entered is incorrect");
        else
            System.out.println("toddler");;
            
            
            
    }
    
}
