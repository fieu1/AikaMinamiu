/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aikacchii
 */
public class BinaryTreeArray {

    int[] data;
    int idxLast;
    int i = 0;

    public BinaryTreeArray() {

    }

    void addIdx(int idx) {
        data = new int[idx];
    }
//    void populateData(int data[], int idxLast) {
//        this.data = data;
//        this.idxLast = idxLast;
//    }

    void add(int value) {

        if (data[0] == 0) {
            data[0] = value;
        } else {
            while (true) {
                if (value < data[i]) {
                    if (data[2 * i + 1] != 0) {
                        data[i] = data[2 * i + 1];
                    } else {
                        data[2 * i + 1] = value;
                        
                        break;
                    }
                } else if (value > data[i]) {
                    if (data[2 * i + 2] != 0) {
                        data[i] = data[2 * i + 2];
                    } else {
                        data[2 * i + 2] = value;
                        break;
                    }
                } else {
                    break;
                }
                i++;
            }
        }
    }

    void print() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.println("idx " + idxStart);
            System.out.println("data " + data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }
}
