/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet3;

import java.util.Scanner;

/**
 *
 * @author MeiMei
 */
public class ScoreAlgSdtMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);
        System.out.print("Input amount of student : "); //label of input
        int stud = sc.nextInt(); //input amount of student
        ScoreAlgSdt std = new ScoreAlgSdt(stud); //instantiation for array of object
        double total[] = new double[stud]; //instantiation for array of object
        double avg = 0; //instantiation
        for (int i = 0; i < stud; i++) { //looping
            System.out.println("Input student-" + (i + 1) + " name : "); //input label
            std.nameStd[i] = scs.nextLine(); //input value
            System.out.println("Input student-" + (i + 1) + " Assignment score : "); //input label
            std.scoreAssgment[i] = sc.nextInt(); //input value
            System.out.println("Input student-" + (i + 1) + " Quiz score : "); //input label
            std.scoreQuiz[i] = sc.nextInt(); //input value
            System.out.println("Input student-" + (i + 1) + " Mid term score : "); //input label
            std.scoreMid[i] = sc.nextInt(); //input value
            System.out.println("Input student-" + (i + 1) + " Final term score : "); //input label
            std.scoreFinal[i] = sc.nextInt(); //input value
            total[i] = std.CalculateTotalScore(std.scoreAssgment[i], std.scoreQuiz[i], std.scoreMid[i], std.scoreFinal[i]);
            //call total calculating function 
            avg = avg + total[i]; //total value 
        }

        System.out.println("=====================================");
        System.out.println("Algorithm Brute Force"); //output
        System.out.println("Average score of the students for " + stud + " students with total " + avg + " is = " + std.ScoreBF(total)); //output
        System.out.println("=====================================");
        System.out.println("Algorithm Divide Conquer"); //output
        System.out.println("Average score of the students for " + stud + " students with total " + avg + " is = " + std.ScoreDC(total, 0, stud)); //output
        System.out.println("=====================================");
    }
}
