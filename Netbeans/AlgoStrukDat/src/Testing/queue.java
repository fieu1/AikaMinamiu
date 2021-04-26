/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

/**
 *
 * @author USER
 */
public class queue {
    int max;
    int front;
    int rear;
    int size;
    customer[] q;
    
    public queue(int max) {
        this.max = max;
        create();
    }

    public void create() {
        q = new customer[max];
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
    
    public void Enqueue(customer data) {
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
            q[rear] = data;
            size++;
        }
    }
    
    public customer Dequeue() {
        customer data = new customer();
        if (IsEmpty()) {
            System.out.println("Queue is empty");
        } else {
            data = q[front];
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
    
    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue is empty");
        } else {
            int i = front;
            for(int j=front;(j%max) != (rear+1)%max;j++){
                q[j].print();
                System.out.println();
            }
            System.out.println("Number of queue = " + size);
        }
    }
    
    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Front customer");
            q[front].print();
        } else {
            System.out.println("Queue is empty");
        }
    }
    
    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Last customer");
            q[rear].print();
        } else {
            System.out.println("Queue is empty");
        }
    }
    
    public void peekPosition(customer cus) {
        int pos = 0;
        int i;
        for(i=front;(i%max) != (rear+1)%max;i++){
            pos++;
            if(cus.accountNum.equalsIgnoreCase(q[i].accountNum) && cus.name.equalsIgnoreCase(q[i].name)){
                break;
            }
        }
        if(pos==0){
            System.out.println("Data not found");
        }else{
            System.out.println("Queue position data custumer : "+pos);
        }
    }
    
    public void peekCustomer(int position) {
        int found = 0;
        int pos = 0;
        int i;
        for(i=front;(i%max) != (rear+1)%max;i++){
            pos++;
            if(position==pos){
                found++;
                break;
            }
        }
        if(found==0){
            System.out.println("Data in this position not found");
        }else{
            System.out.println("Queue position "+position);
            q[position].print();
        }
    }
}
