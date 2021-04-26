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
public class mainQuestion {

    public static void main(String[] args) {
        Employee masinis = new Employee("1234", "Spongebob Squarepants");
        Employee assistant = new Employee("4567", "Spongebob Roundpants");
        Train keretaApi = new Train("Gaya Baru", "Bisnis", masinis, assistant);

        System.out.println(keretaApi.info());

    }

}
