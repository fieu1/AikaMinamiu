/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aikacchii
 */
public class Node {
    Node prev;
    String title, publisher;
    int stock, code, broken;
    Node next;

    public Node(Node prev, String title, int code, String publisher, int stock, Node next) {
        this.prev = prev;
        this.title = title;
        this.code = code;
        this.publisher = publisher;
        this.stock = stock;
        this.next = next;
    }

    public void addBroken(int broken){
        this.broken = broken;
    }
    
    public void print() {
        System.out.println("======================================");
        System.out.println("Title : " + title);
        System.out.println("Book Code : " + code);
        System.out.println("Publisher : " + publisher);
        System.out.println("Stock amount : " + stock);
        System.out.println("Broken amount : " + broken);
    }
}
