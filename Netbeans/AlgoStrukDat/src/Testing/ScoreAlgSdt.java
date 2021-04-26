/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

/**
 *
 * @author MeiMei
 */
public class ScoreAlgSdt {
    String nameSdt[];
    public int[] scoreAssignment, scoreQuiz, scoreMid, scoreFinal;

    public ScoreAlgSdt(int amount) {
        nameSdt = new String[amount]; 
        scoreAssignment = new int[amount]; 
        scoreQuiz = new int[amount]; 
        scoreMid = new int[amount]; 
        scoreFinal = new int[amount]; 
    }

    public double CalculateTotalScore(int assign, int quiz, int mid, int finals) {
        double scoreAssignments, scorQuiz, scoreMiddle, scoreFinale; //declaring
        scoreAssignments = assign * 0.3; //to calculate assignment score
        scorQuiz = quiz * 0.2; //to calculate quiz score
        scoreMiddle = mid * 0.2; //to calculate midterm score
        scoreFinale = finals * 0.3; //to calculate final score
        return (scoreAssignments + scorQuiz + scoreMiddle + scoreFinale); //to calculate total per student
    }

    double ScoreBF(double arr[]) {
        double amount = arr.length, total = 0, avg;
        for (int i = 0; i < amount; i++) { //looping
            total += arr[i]; //to calculate total
        }
        avg = total / amount; //to calculate average
        return avg; //returning average value 
    }

    double ScoreDC(double arr[], int n, int amount) {
        double avg;
        int std = amount;
        if (std == 0) { //base case
            return 0; //return value of 0
        } else {
            avg = arr[n] + ScoreDC(arr, n + 1, std - 1); //to calculate total 
            return avg / amount; //returning average value
        }
    }
}
