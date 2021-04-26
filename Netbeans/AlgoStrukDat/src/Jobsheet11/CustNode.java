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
public class CustNode {

    String name, accoutNum;
    CustNode next;

    public CustNode(String name, String accoutNum, CustNode next) {
        this.name = name;
        this.accoutNum = accoutNum;
        this.next = next;
    }
    
    public void print() { //print method
        System.out.println("Account Number : " + accoutNum);
        System.out.println("Name : " + name);
    }
}
