/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet8;
/**
 *
 * @author MeiMei
 */
public class Assg1 {
    int size; 
    int top;
    String data[];

    public Assg1(int size) { //constructor parameter
        this.size = size; //change size new value
        data = new String[size]; //instantiation stack
        top = -1; //top of empty array
    }

    public boolean IsFull() { //checking are the stack is full
        if ((size - 1) == top) { 
        //when the size-1(last index) is same with top index
            return true; //return true
        } else { //when not
            return false; //return false
        }
    }

    public void push(String dt) { //input dt to stack
        if (!IsFull()) { //when the stack isn't full
            top++; //increase top index value
            data[top] = dt; // insert dt to stack
        } else { //other condition
            System.out.println("Isi stack penuh!"); //output
        }
    }
    
    public void revPrint(){ //print reversed
        for(int i=top; i>=0; i--){ //backward loop
            System.out.print(data[i] + " "); //print
        }
        
    }
    
}
