/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet6;

import java.util.Scanner;

/**
 *
 * @author MeiMei
 */
public class ClasementMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClasementData list = new ClasementData(); //make an object
        String listName[] = {"Liverpool", "Manchester City", "Leichester", "Chelsea", "Wolverhampton Wanderers",
            "Sheffield United", "Manchester United", "Tottenham Hotspur", "Arsenal", "Burnley", "Crystal Palace",
            "Everton", "Newcastle United", "Southampton", "Brighton & Hove Albion", "WestHam United", "Watford", 
            "AFC Bournemouth", "Aston Villa", "Norwich City"}; //array for club name
        int play[] = {29, 27, 28, 29, 29, 28, 28, 29, 28, 29, 29, 29, 29, 29, 29, 29, 29, 29, 27, 29}; //array for P
        int goalDif[] = {45, 39, 26, 9, 7, 5, 12, 7, 4, -6, -6, -6, -16, -17, -8, -15, -17, -18, -18, -27}; //array for GD
        int points[] = {82, 57, 50, 48, 43, 43, 42, 41, 40, 39, 39, 37, 35, 34, 29, 27, 27, 27, 25, 21}; //array for PTS
        for (int i = 0; i < listName.length; i++) {
            Clasement clsm = new Clasement(listName[i], play[i], goalDif[i], points[i]); //input a value 
            list.add(clsm); //adding a value to clsm array
        }
        System.out.println("Plane list before insertion sorting"); //output
        list.print(); //print the array
        System.out.println(); //separating array before and after
        System.out.println("Plane list after sorting with insertion sort based on points ="); //output
        list.insertionSort(); //call inseertion sort method
        list.print(); //print the array

    }
}
