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
public class VoteMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vote voting = new Vote();
        int choice[] = new int[7];
        String cand = "";
        System.out.println("========================================");
        System.out.println("            BEM CHAIRMAN VOTING ");
        System.out.println("========================================");
        System.out.println("Candidates : ");
        System.out.println("1. Haris");
        System.out.println("2. Dian");
        System.out.println("3. Rani");
        System.out.println("4. Bisma");
        for (int i = 0; i < 7; i++) {
            System.out.print("Choose your candidate (input number):");
            choice[i] = sc.nextInt();
            if (choice[i] > 4 || choice[i] < 1) { //if the input more or less than it should be
                System.out.println("Your input invalid. Please try again"); //output
                System.out.print("Choose your candidate (input number):"); //input label
                choice[i] = sc.nextInt(); //input value
            }
        }
        int res = voting.VotingRec(choice, 0, 6); //calling function
        if (res == 1) { //if value that has returned is 1
            cand = "Haris"; //change value
        } else if (res == 2) { //if value that has returned is 2
            cand = "Dian"; //change value
        } else if (res == 3) { //if value that has returned is 3
            cand = "Rani"; //change value
        } else if (res == 4) { //if value that has returned is 4
            cand = "Bisma"; //change value
        } else if (res == 0) { //if value that has returned is 0
            cand = "No Result"; //change value
        }
        System.out.println("================================================="); //output
        System.out.println("Candidate that have the most polling is " + cand + " with number " + res); //output
        System.out.println("================================================="); //output

    }
}
