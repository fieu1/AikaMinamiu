/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet2;
/**
 *
 * @author MeiMei
 */
public class Loan {
    String userName, gameName;
    int id, length, pricePerDay;
    Loan(String un, String gn, int i, int l, int pr) { //constructor parameter
        userName = un; //change value of username 
        gameName = gn; //change value of game name
        id = i; //change value of id
        length = l; //change value of length
        pricePerDay = pr; //change value of loaning price
    }
    public void print(){ //output method
        System.out.println("------------------------------------");//header output
        System.out.println("               DATA");                 //header output
        System.out.println("------------------------------------");//header output
        System.out.println("ID : " + id);//output
        System.out.println("Customer Name : " + userName);//output
        System.out.println("Game Name : " + gameName);//output
        System.out.println("Day of loan : " + length);//output
    }
    public int total(){ //calculate total method
        return pricePerDay*length; //return total
    }
}
