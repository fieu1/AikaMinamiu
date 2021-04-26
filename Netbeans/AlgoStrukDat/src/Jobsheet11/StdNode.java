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
public class StdNode {
    String name, nim, address;
    StdNode next;

    public StdNode(String name, String nim, String address, StdNode next) {
        //constructor parameter
        this.name = name;
        this.nim = nim;
        this.address = address;
        this.next = next;
    }
    
    public void print(){ //print method
        System.out.println("NIM : " + nim);
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
    }
}
