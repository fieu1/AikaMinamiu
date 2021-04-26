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
public class LinkedList {

    Node head;
    int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        head = new Node(item, head);
        size++;
    }

    public void add(int item, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        }
        if (isEmpty() || index == 0) {
            addFirst(item);
        } else {
            Node tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            Node next = (tmp == null) ? null : tmp.next;
            tmp.next = new Node(item, next);
        }
        size++;

    }

    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(item, null);
        }
        size++;
    }

    public void addByValue(int serValue, int inValue) {
        Node curr = head;

        while (curr != null) {
            if (curr.data == serValue) {
                Node next = (curr == null) ? null : curr.next;
                Node n = new Node(inValue, next);
                n.next = curr.next;
                curr.next = n;
                break;
            }
            curr = curr.next;                      
        }
    }

    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        if (isEmpty()) {
            removeFirst();
        } else {
            Node prev = head;
            Node cur = head.next;
            for (int i = 1; i < index; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
        }
    }

    public void removeFirst() throws Exception {
        head = head.next;
        size--;
    }

    public void removeByValue(int remValue) {
        Node currs = head.next;
        Node remov = head;

        while (currs.data != remValue) {
            remov = currs;
            currs = remov.next;
        }
        remov.next = currs.next;
        size--;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("LinkedLists kosong");
        }
    }
    
    public int searchByIndex(int idx) throws Exception{
        if (isEmpty() || idx >= size) {
            throw new Exception("Nilai index di luar batas");
        }
         
            Node prev = head;
            for (int i = 1; i < idx; i++) {
                prev = prev.next;
            }
            return prev.data;
    }
    public int searchByKey(int key) throws Exception{
        if (isEmpty()) {
            throw new Exception("Node is empty");
        }
            int i = 1;
            Node curr = head;
            while (curr != null) {
            if (curr.data == key) {
                break;
            }
            curr = curr.next;                      
            i++;
        }
            return i;
    }
}
