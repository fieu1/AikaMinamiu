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
public class CustLinkedList {
    CustNode head;
    int size;

    public CustLinkedList() { //constructor
        head = null;
        size = 0;
    }

    public boolean isEmpty() { //to check are linked list is empty
        return head == null; //head = null
    }

    public void addFirst(String name, String accNm) {
        //to add node in head position
        head = new CustNode(name, accNm, head); //instantiation head
        size++; //increase size
    }

    public void add(String name, String accNm, int index) throws Exception {
        //add node 
        if (index < 0 || index > size) { //if out of range
            throw new Exception("Nilai index di luar batas"); //message
        }
        if (isEmpty() || index == 0) { //if linked list empty
            addFirst(name, accNm); //call addfirst method
        } else { //if no
            CustNode tmp = head; //declaration new object to save value
            for (int i = 1; i < index; i++) {
                tmp = tmp.next; //move to next node until the index
            }
            CustNode next = (tmp == null) ? null : tmp.next; //selection
            tmp.next = new CustNode(name, accNm, next);
            //instantiation to add new node
        }
        size++; //increasing size value

    }

    public void addLast(String name, String accNm) {
        if (isEmpty()) { //if linked list is empty
            addFirst(name, accNm); //call addfirst method
        } else { //if no
            CustNode tmp = head; //declaration new object to save value
            while (tmp.next != null) { //looping until the last node
                tmp = tmp.next; //move to next node
            }
            tmp.next = new CustNode(name, accNm, null);
            //instantiation to add new node in back
        }
        size++; //increasing size value
    }

    public String getFirst() throws Exception {
        if (isEmpty()) { //if linked lists empty
            throw new Exception("LinkedLists kosong");
            //error message
        }
        return ("Account Number : " + head.accoutNum + ", name : "
                + head.name); //return value
    }

    public String getLast() throws Exception {
        if (isEmpty()) { //if linked lists empty
            throw new Exception("LinkedLists kosong");
            //error message
        }
        CustNode tmp = head; //declaration new object to save value
        while (tmp.next != null) { //looping until last node
            tmp = tmp.next; //move to next node
        }
        return ("Account Number : " + tmp.accoutNum + ", name : "
                + tmp.name); //return value
    }

    public String get(int index) throws Exception {
        if (isEmpty() || index >= size) { //if index out of range
            throw new Exception("Nilai index di luar batas");
            //error message
        }
        CustNode tmp = head; //declare new object to save value
        for (int i = 0; i < index; i++) { //looping until the index
            tmp = tmp.next; //move to next node
        }
        return ("Account Number : " + tmp.accoutNum + ", name : "
                + tmp.name); //return value
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) { //if index out of range
            throw new Exception("Nilai index di luar batas");
            //error message
        }
        if (isEmpty()) { //if linked list empty
            removeFirst(); //call method
        } else { //if no
            CustNode prev = head; //make new object
            CustNode cur = head.next; //make new object
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
            CustNode tmp = head; //declaring new object to save value
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

        CustNode prev = head; //declaring new object 
        for (int i = 1; i < idx; i++) { //loop to index
            prev = prev.next; //move to next node
        }
        prev.print(); //print node
    }

    public int searchByKey(String accNm) throws Exception {
        if (isEmpty()) { //if linked lists is empty
            throw new Exception("CustNode is empty");
        }
        int i = 1; //index value
        CustNode curr = head; //declaring new object to save value
        while (curr != null) { //looping until last node
            if (curr.accoutNum.equalsIgnoreCase(accNm)) { 
            //if same with searched student id
                break; //out from loop
            }
            curr = curr.next; //move to next node
            i++; //increasing index value
        }
        return i; //return index value
    }
}
