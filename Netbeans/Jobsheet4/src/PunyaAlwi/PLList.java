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
public class PLList {
    PremiereLeague list[] = new PremiereLeague[20]; //instantiation array of object
    int idx=0; //variable of index

    void add(PremiereLeague m) { //method to adding the value of array
        list[idx] = m; //change value of list in idx index
        idx++; //increase index for move to next index
    }

    void print() { //method to print
        for (PremiereLeague m : list) { //for each loop for list array
            m.Print();          //call print method in PremiereLeague class
        }
    }

    void insertionSortAsc() { // insertion sort method
        int i, j; // declaring i and j variable
        for (i = 1; i < list.length; i++) { //looping for checking value per index
            PremiereLeague point = list[i]; // initializing value of object point
            j = i; // initialize value of variable j 
            while ((j > 0) && (list[j - 1].points > point.points)) { // looping for move to next position
                list[j] = list[j - 1]; // change position
                j--; // decreasing value of variable j
            }
            list[j] = point; // moving value
        }
    }
}
