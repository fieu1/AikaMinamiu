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
public class TicketList {
    Ticketing list[] = new Ticketing[6]; //instantiation array of object
    int idx; //variable of index

    void add(Ticketing pl) { //method to adding the value of array
        if (idx < list.length) { //for check if there is a empty array 
            list[idx] = pl; //change array value with parameter
            idx++; //increasing index value for move to next index
        } else { //another condition
            System.out.println("Seat are full"); //output in else condition
        }
    }

    void print() { //output method 
        for (Ticketing pl : list) { //foreach loop for list array
            pl.Print(); //print array
        }
    }

    void bubbleSort() { //bubble sort method
        for (int i = 0; i < list.length - 1; i++) { //for checking per element
            for (int j = 1; j < list.length - i; j++) { //for loop used for selection
                if (list[j].price > list[j - 1].price) { //selection
                    Ticketing plane = list[j]; //save a value to new object
                    list[j] = list[j - 1]; //change j ticket value 
                    list[j - 1] = plane; //change j-1 ticket value 
                }
            }
        }
    }

    void selectionSort() { //selection sort method
        for (int i = 0; i < list.length - 1; i++) { //for loop for checking
            int idxMin = i; //initializing index min
            for (int j = i + 1; j < list.length; j++) { //for checking smallest value
                if (list[j].price < list[idxMin].price) { //selection condition
                    idxMin = j; //change the value of indexMin
                }
            }
            Ticketing plane = list[idxMin]; // save a value to new object
            list[idxMin] = list[i]; // change array value in idxMin index
            list[i] = plane; //change array value in i index
        }
    }
}
