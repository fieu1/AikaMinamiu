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
public class CustQueue {

    int max, front, rear, size;
    Customer Q[] = null;

    public CustQueue(int n) {
        max = n; //to set max as input
        Create();
    }

    public void Create() {
        Q = new Customer[max]; //insantiation queue
        size = 0; //default size
        front = rear = -1; //default front and rear
    }

    public boolean IsEmpty() {
        if (size == 0) { //when size is 0
            return true; //queue is empty
        } else { //when size isn't 0
            return false; //queue isn't empty
        }
    }

    public boolean IsFull() {
        if (size == max) { //when size get max value
            return true; //queue is full
        } else { //if not
            return false; //queue isn't full
        }
    }

    public void peek() {
        if (!IsEmpty()) { //if queue not empty
            System.out.println("Front element (" + front + ") : "); //display
            Q[front].print();//print queue
        } else { //if queue empty
            System.out.println("Queue is empty"); //display
        }
    }

    public void peekRear() {
        if (!IsEmpty()) { //if queue not empty
            System.out.println("Rear element (" + rear + ") : "); //display
            Q[rear].print(); //print queue
        } else { //if queue is empty
            System.out.println("Queue is empty"); //display
        }
    }

    public void print() {
        if (IsEmpty()) { //if queue is empty
            System.out.println("Queue is empty"); //display
        } else { //if queue not empty
            int i = front; //for loop the queue
            while (i != rear) { //when i value isn't same with rear value
                Q[i].print(); //print queue
                System.out.println("-------------------"); //display
                i = (i + 1) % max; //when reached max
            }
            Q[i].print(); //print queue at index rear
            System.out.println("Number of queue = " + size); //size of queue
        }
    }

    public void Enqueue(String accNm, String name) {
        if (IsFull()) { //if queue is full
            System.out.println("Queue is full"); //display
        } else { //if not
            if (IsEmpty()) { //if queue is empty
                front = rear = 0; //front and rear value is in first index
            } else { //if not empty
                if (rear == max - 1) { //if rear in maximum index
                    rear = 0; //back to 0
                } else { //if not
                    rear++; //increase rear value
                }
            }
            Q[rear] = new Customer(); //instantiation 
            Q[rear].accountNum = accNm; //change account name value
            Q[rear].name = name; //change name value
            size++; //increase size
        }
    }

    public Customer Dequeue() {
        Customer cust = new Customer(); //instantiation object 
        if (IsEmpty()) { //if queue is empty
            System.out.println("Queue is empty"); //display
        } else { //if not
            cust = Q[front]; //save value
            size--; //decrease size
            if (IsEmpty()) { //if size is 0
                front = rear = -1; //default value of front and rear
            } else { //if not
                if (front == max - 1) { //if front is at max index
                    front = 0; //back to 0 index
                } else { //if not
                    front++; //increase front value
                }
            }
        }
        return cust; //return object
    }

    public void peekPosition(Customer S) {
        if (!IsEmpty()) { //to check are the queue isn't empty
            int index = -1; //to save index value
            for (int j = 0; j < Q.length; j++) {
                if (Q[j].name.equalsIgnoreCase(S.name) && Q[j].accountNum.equalsIgnoreCase(S.accountNum)) {
                    //if data in queue is same with data that searched
                    index = j; //save the value
                    System.out.println("Customer " + S.name + " is at : " + index); //display
                    break; //exit loop
                }
            }
            if (index == -1) {
                System.out.println("No data like that");
            }
        } else { //if queue is empty
            System.out.println("Queue is empty"); //display
        }
    }

    public void printCustomer(int position) {
        if (!IsEmpty()) { //to check are the queue isn't empty
            if (position < Q.length && position >= 0) { //if position is in queue range
                System.out.println("Element in " + position + " is : "); //display
                Q[position].print();
            } else { //if not in queue range
                System.out.println("There is no value in the element"); //display
            }
        } else { //if queue is empty
            System.out.println("Queue is empty"); //display
        }
    }
}
