/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int finalterm, midterm, quiz, assignment;
        double finalscore, midscore, quizscore, assignscore, total;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input final exam score : ");
        finalterm = sc.nextInt();
        finalscore = finalterm * 0.4 ;
        System.out.print("Input midterm score : ");
        midterm = sc.nextInt();
        midscore = midterm * 0.3;
        System.out.print("Input quiz score : ");
        quiz = sc.nextInt();
        quizscore =  quiz * 0.1;
        System.out.print("Input assignment score : ");
        assignment = sc.nextInt();
        assignscore =  assignment * 0.1;
        total = finalscore + midscore + quizscore + assignscore;
        System.out.println("your total score is " + total);
        if(total>=65)
            System.out.println("Not get remedial");
        else
            System.out.println("Go get some remedial");
    }
    
}
