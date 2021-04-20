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
public class Experiment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score;
        System.out.println("Enter the value: ");
        score=sc.nextInt();
        
        
        if (score>=100)
           score+=10;
        else
            score-=10;
        
        System.out.println("Your final score is " + score);
                    
        
    }
    
}
