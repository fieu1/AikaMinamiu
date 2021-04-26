/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import java.util.Scanner;
public class MainScore {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("Input total of student : ");
        int amount=input.nextInt(); //to declare length of array
        ScoreAlgSdt avg = new ScoreAlgSdt(amount); //instantiation array 
        double ave=0;
        double total[] = new double[amount];
        System.out.println("=====================================================");
        for(int i=0;i<amount;i++){
            //sdt[i] = new ScoreAlgSdt(); //to instantiation array of object
            System.out.print("Input "+(i+1)+" student name : "); 
            avg.nameSdt[i]=input2.nextLine(); //initialize object name
            System.out.print("Input "+(i+1)+" student assignment score : ");
            avg.scoreAssignment[i]=input.nextInt(); //initialize assignmnent score
            System.out.print("Input "+(i+1)+" student quiz score : ");
            avg.scoreQuiz[i]=input.nextInt(); //initialize quiz score
            System.out.print("Input "+(i+1)+" student midterm score : ");
            avg.scoreMid[i]=input.nextInt(); //initialize middle term score
            System.out.print("Input "+(i+1)+" student final exam score : ");
            avg.scoreFinal[i]=input.nextInt(); //initialize final exam score
            System.out.println("The average score student "+(i+1)+" is "
                    +avg.CalculateTotalScore(avg.scoreAssignment[i], avg.scoreQuiz[i], avg.scoreMid[i], avg.scoreFinal[i])); 
            total[i]=avg.CalculateTotalScore(avg.scoreAssignment[i], avg.scoreQuiz[i], avg.scoreMid[i], avg.scoreFinal[i]); //to calculate total
            System.out.println("=====================================================");
        }
       
        System.out.println("-------------------------------------");
        System.out.println("Brute Force"); //output
        System.out.println("Average score of the students is = " + avg.ScoreBF(total)); //output
        System.out.println("-------------------------------------");
        System.out.println("Divide Conquer"); //output
        System.out.println("Average score of the students is = " + avg.ScoreDC(total, 0, amount)); //output
        System.out.println("-------------------------------------");
    }
}
