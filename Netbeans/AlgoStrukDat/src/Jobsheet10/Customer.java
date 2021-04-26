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
public class Customer {

    String accountNum, name;

    public Customer(String accNm, String nm) {
        accountNum = accNm; //change account num value
        name = nm; //change name value
    }

    public Customer() {
    }

    public void print() { //display
        System.out.println("Account number : " + accountNum);
        System.out.println("Name : " + name);
    }

}
