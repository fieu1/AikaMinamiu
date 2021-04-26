/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet3;

/**
 *
 * @author Aikacchii
 */
public class renter {
    public int id;
    public String memberName;
    public String gameName;
    public int priceToPay;
    
    public void paying(int price, int duration){
        priceToPay = price*duration;
    }
    
    public void showData(){
        System.out.println("ID : " + id);
        System.out.println("Member Name : " + memberName);
        System.out.println("Game Name : " + gameName);
        System.out.println("Paying : " + priceToPay);
    }
}
