/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet10;

/**
 *
 * @author MeiMei
 */
public class Queue {

    int max, size, front, rear;
    int[] Q;

    public Queue(int n) {
        max = n;
        Create();
    }

    public void Create() {
        Q = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Front element : " + Q[front]);
        } else {
            System.out.println("Queue is empty");
        }
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Rear element : " + Q[rear]);
        } else {
            System.out.println("Queue is empty");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue is empty");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(Q[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("Number of queue = " + size);
        }
    }

    public void Enqueue(int data) {
        if (IsFull()) {
            System.out.println("Queue is full");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            Q[rear] = data;
            size++;
        }
    }

    public int Dequeue() {
        int data = 0;
        if (IsEmpty()) {
            System.out.println("Queue is empty");
        } else {
            data = Q[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }

    public void peekPosition(int data) {
        if (!IsEmpty()) { //to check are the queue isn't empty
            int index = 0; //to save index value
            for (int j = 0; j < Q.length; j++) {
                if (Q[j] == data) { //if data in queue is same with data that searched
                    index = j; //save the value
                    System.out.println("Element that have "+ data +" value at : " + index); //display
                    break; //exit loop
                } else { //if no data that same with searched data
                    System.out.println("No data like that"); //display
                }
            }
        } else { //if queue is empty
            System.out.println("Queue is empty"); //display
        }
    }
    public void peekAt(int position) { 
        if (!IsEmpty()) { //to check are the queue isn't empty
            if(position < Q.length && position >= 0){ //if position is in queue range
                System.out.println("Element in "+ position +" is : " + Q[position]); //display
            } else { //if not in queue range
                System.out.println("There is no value in the element"); //display
            }
        } else { //if queue is empty
            System.out.println("Queue is empty"); //display
        }
    }
}
