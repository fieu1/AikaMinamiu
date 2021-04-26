/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PunyaAlwi;

/**
 *
 * @author MeiMei
 */
public class PremiereLeague {
    String name;
    int play;
    int goalDiff;
    int points;

    public PremiereLeague(String CN, int P, int GD, int PTS) { //constructor parameter for input value
        name = CN; //input value of name
        play = P; //input value of how many play
        goalDiff = GD; //input value of goal different
        points = PTS; //input value of points
    }

    public void Print(){ //method for printing
        System.out.println(name + " || " + play + " || " + goalDiff +" || "+ points ); //label output 
    }
}
