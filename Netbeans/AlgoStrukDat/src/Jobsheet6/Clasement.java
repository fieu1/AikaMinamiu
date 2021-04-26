/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet6;

/**
 *
 * @author MeiMei
 */
public class Clasement {
    String clubName;
    int play;
    int goalDifferent;
    int points;

    public Clasement(String CN, int P, int GD, int PTS) { //constructor parameter
        clubName = CN;
        play = P;
        goalDifferent = GD;
        points = PTS;
    }

    public void Print(){
        System.out.println(clubName + " " + play + " " + goalDifferent +" "+ points ); //make an output
    }
}
