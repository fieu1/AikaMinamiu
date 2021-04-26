/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet11;

/**
 *
 * @author MeiMei
 */
public class StdLinkedList {

    StdNode head;
    int size;

    public StdLinkedList() { //constructor
        head = null;
        size = 0;
    }

    public boolean isEmpty() { //to check are linked list is empty
        return head == null; //head = null
    }

    public void addFirst(String name, String nim, String address) {
        //to add node in head position
        head = new StdNode(name, nim, address, head); //instantiation head
        size++; //increase size
    }

    public void add(String name, String nim, String address, int index) throws Exception {
        //add node 
        if (index < 0 || index > size) { //if out of range
            throw new Exception("Nilai index di luar batas"); //message
        }
        if (isEmpty() || index == 0) { //if linked list empty
            addFirst(name, nim, address); //call addfirst method
        } else { //if no
            StdNode tmp = head; //declaration new object to save value
            for (int i = 1; i < index; i++) {
                tmp = tmp.next; //move to next node until the index
            }
            StdNode next = (tmp == null) ? null : tmp.next; //selection
            tmp.next = new StdNode(name, nim, address, next);
            //instantiation to add new node
        }
        size++; //increasing size value

    }

    public void addLast(String name, String nim, String address) {
        if (isEmpty()) { //if linked list is empty
            addFirst(name, nim, address); //call addfirst method
        } else { //if no
            StdNode tmp = head; //declaration new object to save value
            while (tmp.next != null) { //looping until the last node
                tmp = tmp.next; //move to next node
            }
            tmp.next = new StdNode(name, nim, address, null);
            //instantiation to add new node in back
        }
        size++; //increasing size value
    }

    public String getFirst() throws Exception {
        if (isEmpty()) { //if linked lists empty
            throw new Exception("LinkedLists kosong");
            //error message
        }
        return ("Student ID : " + head.nim + ", name : "
                + head.name + ", address : " + head.address); //return value
    }

    public String getLast() throws Exception {
        if (isEmpty()) { //if linked lists empty
            throw new Exception("LinkedLists kosong");
            //error message
        }
        StdNode tmp = head; //declaration new object to save value
        while (tmp.next != null) { //looping until last node
            tmp = tmp.next; //move to next node
        }
        return ("Student ID : " + tmp.nim + ", name : "
                + tmp.name + ", address : " + tmp.address); //return value
    }

    public String get(int index) throws Exception {
        if (isEmpty() || index >= size) { //if index out of range
            throw new Exception("Nilai index di luar batas");
            //error message
        }
        StdNode tmp = head; //declare new object to save value
        for (int i = 0; i < index; i++) { //looping until the index
            tmp = tmp.next; //move to next node
        }
        return ("Student ID : " + tmp.nim + ", name : "
                + tmp.name + ", address : " + tmp.address); //return value
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) { //if index out of range
            throw new Exception("Nilai index di luar batas");
            //error message
        }
        if (isEmpty()) { //if linked list empty
            removeFirst(); //call method
        } else { //if no
            StdNode prev = head; //make new object
            StdNode cur = head.next; //make new object
            for (int i = 1; i < index; i++) { //looping until the index
                prev = cur;  //move to next index
                cur = prev.next; //move to next index
            } 
            prev.next = cur.next; //skip the index that want to removed
            size--; //decreasing size
        }
    }

    public void removeFirst() throws Exception {
        head = head.next; //move the head
        size--; //decreasing size
    }

    public void clear() {
        head = null; //remove head
        size = 0; //default size 
    }

    public void print() {
        if (!isEmpty()) { //if linked list not empty
            StdNode tmp = head; //declaring new object to save value
            while (tmp != null) { //looping until last node
                tmp.print(); //print node
                System.out.println("==================="); //border
                tmp = tmp.next;  //move to next node
            }
            System.out.println();
        } else { //if empty
            System.out.println("LinkedLists kosong");//show message
        }
    }

    public void searchByIndex(int idx) throws Exception {
        if (isEmpty() || idx > size) { //if index out of range
            throw new Exception("Nilai index di luar batas"); //error message
        }

        StdNode prev = head; //declaring new object 
        for (int i = 1; i < idx; i++) { //loop to index
            prev = prev.next; //move to next node
        }
        prev.print(); //print node
    }

    public int searchByKey(String nim) throws Exception {
        if (isEmpty()) { //if linked lists is empty
            throw new Exception("StdNode is empty");
        }
        int i = 1; //index value
        StdNode curr = head; //declaring new object to save value
        while (curr != null) { //looping until last node
            if (curr.nim.equalsIgnoreCase(nim)) { 
            //if same with searched student id
                break; //out from loop
            }
            curr = curr.next; //move to next node
            i++; //increasing index value
        }
        return i; //return index value
    }
}
