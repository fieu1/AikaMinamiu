/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PunyaAlwi;
import java.util.Scanner;
/**
 *
 * @author MeiMei
 */
public class PLMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //scanner for input
        PLList list = new PLList(); //instantiation an object
        String listName[] = {"Liverpool", "Manchester City", "Leichester", "Chelsea", "Wolverhampton Wanderers",
            "Sheffield United", "Manchester United", "Tottenham Hotspur", "Arsenal", "Burnley", "Crystal Palace",
            "Everton", "Newcastle United", "Southampton", "Brighton & Hove Albion", "WestHam United", "Watford", 
            "AFC Bournemouth", "Aston Villa", "Norwich City"}; //array for club name in premiere league
        int play[] = {29, 27, 28, 29, 29, 28, 28, 29, 28, 29, 29, 29, 29, 29, 29, 29, 29, 29, 27, 29}; //array for Play
        int goalDiff[] = {45, 39, 26, 9, 7, 5, 12, 7, 4, -6, -6, -6, -16, -17, -8, -15, -17, -18, -18, -27}; //array for Goal Different
        int points[] = {82, 57, 50, 48, 43, 43, 42, 41, 40, 39, 39, 37, 35, 34, 29, 27, 27, 27, 25, 21}; //array for Points
        for (int i = 0; i < listName.length; i++) { //for loop for inputing value
            PremiereLeague clasement = new PremiereLeague(listName[i], play[i], goalDiff[i], points[i]); //instantiation and inputting value 
            list.add(clasement); //adding a value to clasement array with add method in list object
        }
        System.out.println("Clasement list before insertion sorting"); //label output
        list.print(); //call print method for print the array in list object
        System.out.println("Clasement list after sorting with insertion sort based on points ="); //label output
        list.insertionSortAsc(); //call inseertion sort method in list object
        list.print(); //call print method for print the array in list object

    }
}
