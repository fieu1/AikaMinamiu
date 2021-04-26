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
public class Stack {

    int size;
    int top;
    String data[];

    public Stack(int size) {
        this.size = size;
        data = new String[size];
        top = -1;
    }

    public boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if ((size - 1) == top) {
            return true;
        } else {
            return false;
        }
    }

    public void push(String dt) {
        if (!IsFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }
    
    public void pop(){
        if(!IsEmpty()){
            String x = data[top];
            top--;
            System.out.println("Pop Data : " + x);
        } else {
            System.out.println("Stack is empty");
        }
    }
    
    public void peek(){
        System.out.println("Top Element : " + data[top]);
    }
    
    public void print(){
        System.out.println("Data Stack is : ");
        for(int i=top; i>=0; i--){
            System.out.println(data[i] + " ");
        }
        System.out.println("");
    }
    public void revPrint(){
        for(int i=top; i>=0; i--){
            System.out.print(data[i] + " ");
        }
        
    }
    public void clear(){
        if(!IsEmpty()){
            for(int i=top; i>=0; i--){
            top--;
            }
            System.out.println("The stack has been emptied");
        } else {
            System.out.println("Failed! The stack is still empty");
        }
    }
}
