/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet14;

/**
 *
 * @author Aikacchii
 */
public class BinaryTreeArray {

    int[] data;
    int idxLast, idx = 0;

    public BinaryTreeArray(int idx) {
        data = new int[idx]; //instantiation array
    }

    void addData(int value) {
        data[idx] = value; //input array value
        idx++; //increase index value
    }

    void populateData(int idxLast) {
        this.idxLast = idxLast; //delcare the last index
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) { //when index is below last index 
            traverseInOrder(2 * idxStart + 1); //for left node
            System.out.print(data[idxStart] + " "); //print data
            traverseInOrder(2 * idxStart + 2); //for right node
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " "); //print data
            traverseInOrder(2 * idxStart + 1); //for left node
            traverseInOrder(2 * idxStart + 2); //for right node
        }
    }

    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1); //for left node
            traverseInOrder(2 * idxStart + 2); //for right node
            System.out.print(data[idxStart] + " "); //print data
        }
    }
}
