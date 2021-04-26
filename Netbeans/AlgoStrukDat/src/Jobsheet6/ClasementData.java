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
public class ClasementData {

    Clasement list[] = new Clasement[20]; //make a array
    int idx=0;

    void add(Clasement m) { //for adding a value
        list[idx] = m; //input value
        idx++; //change index
    }

    void print() { //for make an output
        for (Clasement m : list) { //for each loop
            m.Print();          //call print method in clasement class
        }
    }

    void insertionSort() { // method to sort
        int i, j; // declaring i and j
        for (i = 1; i < list.length; i++) { //looping for check
            Clasement pts = list[i]; // initialize value of object pts
            j = i; // initialize value of j 
            while ((j > 0) && (list[j - 1].points > pts.points)) { // looping for moving position
                list[j] = list[j - 1]; // moving position
                j--; // decreasing value of j
            }
            list[j] = pts; // moving value
        }
    }
}
