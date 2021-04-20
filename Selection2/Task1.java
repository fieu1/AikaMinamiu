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
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side1, side2, side3;
        
        System.out.println("Enter side 1: ");
        side1 = sc.nextInt();
        System.out.println("Enter side 2: ");
        side2 = sc.nextInt();
        System.out.println("Enter side 3: ");
        side3 = sc.nextInt();
        
        if(side1==side2){
            if (side2==side3)
                System.out.println("Is equilateral");
            else 
                System.out.println("is isosceles");
        } else if(side1 == side3){
            if (side2==side3)
                System.out.println("Is equilateral");
            else 
                System.out.println("is isosceles");
        } else
            System.out.println("is just any");
    }
    
}
