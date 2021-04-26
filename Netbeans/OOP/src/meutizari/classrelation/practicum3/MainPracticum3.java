/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meutizari.classrelation.practicum3;

/**
 *
 * @author Aikacchii
 */
public class MainPracticum3 {
    public static void main(String[] args) {
        Employee mac = new Employee("1234", "Spongebob Squarepants");
        Employee assist = new Employee("4567", "Patrick Star");
        Train train  =  new Train("Gaya Baru", "Bussiness", mac, assist);
        System.out.println(train.info());
    }
}
