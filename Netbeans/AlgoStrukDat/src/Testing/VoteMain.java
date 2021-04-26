/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import java.util.Scanner;
public class VoteMain {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vote Voting = new Vote();
        int voting[] = new int[7];
        String candidate = "";
        System.out.println("Candidate : ");
        System.out.println("1. Haris");
        System.out.println("2. Dian");
        System.out.println("3. Rani");
        System.out.println("4. Bisma");
        for (int i = 0; i < 7; i++) { //looping for input
            System.out.print("Choose your candidate (number):"); 
            voting[i] = sc.nextInt();
            if (voting[i] < 1 ||voting[i] > 4) { //if the input more or less than it should be
                System.out.println("Your input invalid. Input again"); //output
                System.out.print("Choose your candidate (number):"); //input label
                voting[i] = sc.nextInt(); //input value
            }
        }
        int result = Voting.VotingRec(voting, 0, 6); //calling function
        if (result == 1) { //if value that has returned is 1
            candidate = "Haris"; //change value
        } else if (result == 2) { //if value that has returned is 2
            candidate = "Dian"; //change value
        } else if (result == 3) { //if value that has returned is 3
            candidate = "Rani"; //change value
        } else if (result == 4) { //if value that has returned is 4
            candidate = "Bisma"; //change value
        } else if (result == 5) { //if value that has returned is 0
            candidate = "No Result"; //change value
        }
        System.out.println("================================================="); 
        System.out.println("The candidate that was choosen is " + candidate); 
        System.out.println("================================================="); 

    }
}
