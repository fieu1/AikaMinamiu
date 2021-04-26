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
public class Node {

    Node prev;
    String name;
    int grade;
    Node next;

    public Node(Node prev, String name, int grade, Node next) {
        this.prev = prev;
        this.name = name;
        this.grade = grade;
        this.next = next;
    }

    public void print() {
        System.out.println("======================================");
        System.out.println("Name : " + name);
        System.out.println("Grade : " + grade);
    }
}
