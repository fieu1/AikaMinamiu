/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cost;
        double disc, total;
        System.out.println("Enter your total purchase");
        cost = sc.nextInt();
        
        if(cost>1000000){
            disc = cost * 0.1;
            total = cost - disc;
            System.out.println("You get a platinum member disqount of 10%");
            System.out.println("Your total purchase is : " + cost );
            System.out.println("Your total discount is :" + disc);
            System.out.println("The total you have to pay is : " + total);
        }
        else if(cost>500000){
            disc = cost * 0.05;
            total = cost - disc;
            System.out.println("You get a gold member disqount of 5%");
            System.out.println("Your total purchase is: " + cost );
            System.out.println("Your total discount is " + disc);
            System.out.println("The total you have to pay is " + total);
        }
        else if(cost>200000){
            disc = cost * 0.02;
            total = cost - disc;
            System.out.println("You get a silver member disqount of 2%");
            System.out.println("Your total purchase is: " + cost );
            System.out.println("Your total discount is " + disc);
            System.out.println("The total you have to pay is " + total);
        }
        else{
            System.out.println("Your total shopping is still not enough to get member discounts.");  
            System.out.println("Your total purchase " + cost);
            
        }
    }
}
