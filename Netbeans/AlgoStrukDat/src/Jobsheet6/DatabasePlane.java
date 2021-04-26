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
public class DatabasePlane {
    Plane listPln[] = new Plane[5]; //array for plane list
    int idx; //index

    void add(Plane m) { //method to add the value of array
        if (idx < listPln.length) { //check are the array is available or not
            listPln[idx] = m; //change value with parameter
            idx++; //moving to next index
        } else { //if condition was false
            System.out.println("No available seat!"); //output
        }
    }

    void print() { //method for print
        for (Plane m : listPln) { //foreach loop
            m.Print(); //call print method in Plane class
        }
    }

    void bubbleSort() { //bubble sort method
        for (int i = 0; i < listPln.length - 1; i++) { //for checking
            for (int j = 1; j < listPln.length - i; j++) { //for selection
                if (listPln[j].price > listPln[j - 1].price) { 
                    Plane pln = listPln[j]; //save a value of j ticket
                    listPln[j] = listPln[j - 1]; //change a value of j ticket
                    listPln[j - 1] = pln; //change a value of j-1 ticket
                }
            }
        }
    }

    void selectionSort() { //selection sort method
        for (int i = 0; i < listPln.length - 1; i++) { //for checking
            int idxMin = i; //initialize index min
            for (int j = i + 1; j < listPln.length; j++) { //for check the smallest value
                if (listPln[j].price < listPln[idxMin].price) { //selection for check
                    idxMin = j; //change the value of indexMin
                }
            }
            Plane pln = listPln[idxMin]; // saving value pln
            listPln[idxMin] = listPln[i]; // change the value of array in index idxMin
            listPln[i] = pln; //change the value of array in index i
        }
    }
}
