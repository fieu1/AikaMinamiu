/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet3;

/**
 *
 * @author MeiMei
 */
public class ScoreAlgSdt {
    String nameStd[];
    int scoreAssgment[], scoreQuiz[], scoreMid[], scoreFinal[];
    public ScoreAlgSdt(int stud) { //constructor parameter
        nameStd = new String[stud]; //replace value of student name
        scoreAssgment = new int[stud]; //replace value of assignment
        scoreQuiz = new int[stud]; //replace value of quiz
        scoreMid = new int[stud]; //replace value of midterm test
        scoreFinal = new int[stud]; //replace value of final test
    }
    public double CalculateTotalScore(int scoreAssgment, int scoreQuiz, int scoreMid, int scoreFinal) { //method for calculating total
        double assg, quiz, mid, finals; //variable for calculate per part of test
        assg = scoreAssgment * 0.3; //assignment score
        quiz = scoreQuiz * 0.2; //quiz score
        mid = scoreMid * 0.2; //mid term score 
        finals = scoreFinal * 0.3; //final test score
        return assg + quiz + mid + finals; //return value of total
    }
    double ScoreBF(double arr[]){ //BruteForce function 
        double amount = arr.length, total=0, avg; //initialitation
        for(int i = 0; i<amount;i++){ //for loop
            total += arr[i]; //calculate total
        }
        avg = total/amount; //calculate average
        return avg; //return value 
    }
    double ScoreDC(double arr[],int n, int stud){ //Divide Conquer funtion
        double avg; //declare
        int amount = stud; //instantiation
    if(stud == 0){ //base case
        return 0; //return value
    } else{ //recursive case
        avg = arr[n] + ScoreDC(arr, n+1, stud-1); //recursive for calculate total 
        return avg/amount; //return average value
    }
}
}
