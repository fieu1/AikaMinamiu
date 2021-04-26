/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet13;

/**
 *
 * @author Aikacchii
 */
public class DoubleLinkedLists {

    int size;
    Node head;

    public DoubleLinkedLists() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() { //to check are the LL is empty
        return head == null; //LL head is null if empty
    }

    public void addFirst(String nm, int grd) {
        if (isEmpty()) { //when it's empty
            head = new Node(null, nm, grd, head); //initialize 
        } else { //when not empty
            Node newNode = new Node(null, nm, grd, head); //initialize
            head.prev = newNode; //move initialized node to previous head node
            head = newNode; //declare initialized node as head
        }
        size++; //increase size
    }

    public void addLast(String nm, int grd) {
        if (isEmpty()) { //when it's empty
            addFirst(nm, grd); //call method
        } else { //when it's not
            Node current = head; //initialize node
            while (current.next != null) { //loop
                current = current.next; //traverse
            }
            Node newNode = new Node(current, nm, grd, null); //instantialize
            current.next = newNode; //declare as instantialized node
            size++; //increase size
        }
    }

    public void add(String nm, int grd, int index) throws Exception {
        if (isEmpty()) { //if empty
            addFirst(nm, grd); //call method
        } else if (index < 0 || index > size) { //if less than 0 or more than size
            throw new Exception("Nilai index di luar batas"); //error message
        } else { //besides that
            Node current = head; //initialize
            int i = 0; //initialize
            while (i < index) { //loop
                current = current.next; //traverse
                i++; //increasing index
            }

            if (current.prev == null) { //when it's in first node
                Node newNode = new Node(null, nm, grd, current); //instantialize
                current.prev = newNode; //declare instantialized node
                head = newNode; //declare at head position
            } else {
                Node newNode = new Node(current.prev, nm, grd, current); //initialize
                newNode.prev = current.prev; //node before added value is before current node
                newNode.next = current; //put added value before current node
                current.prev.next = newNode; //put added value between current and current.prev
                current.prev = newNode; //put added value before current
            }
        }
        size++; //increase value
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                tmp.print();
                tmp = tmp.next;
            }
            System.out.println("======================================");
            System.out.println("\nFilling success");
        } else {
            System.out.println("Linked Lists is empty");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List still empty, cannot remove");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List still empty, cannot remove");
        } else if (head == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Index value out of range");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public void getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked Lists Empty");
        }
        head.print();
    }

    public void getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked LIsts Empty");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }

        tmp.print();
    }

    public void get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Index value out of range");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.print();
    }

    public int searchByKey(String name) throws Exception {
        if (isEmpty()) { //if empty
            throw new Exception("Node is empty"); //error message
        }
        int i = 1; //initialize
        Node current = head; //initialiaze
        while (current != null) { //loop
            if (current.name.equalsIgnoreCase(name)) {
                //if current data same with searched value
                break; //exit loop
            }
            current = current.next; //traverse 
            i++; //increase index
        }
        return i; //return index
    }

    void insertionSort() {
        Node current = head; //initialize
        while (current != null) { //loop
            Node sorted = current; //initialize
            Node next = current.next; //initialize
            while (next != null) { //loop
                if (sorted.grade < next.grade) { 
                //if sorted grade smaller than next grade
                    sorted = next; //swap
                }
                next = next.next; //traverse
            }
            int grd = current.grade; //change grade value for swap
            String nm = current.name; //change name value for swap
            current.grade = sorted.grade; //move grade value
            current.name = sorted.name; //move name value
            sorted.grade = grd; //swap grade value
            sorted.name = nm; //swap name value
            current = current.next; //traverse
            print(); //print method
        }
    }

}
