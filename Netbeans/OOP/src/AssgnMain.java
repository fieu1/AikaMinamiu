/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aikacchii
 */
public class AssgnMain {
    public static void main(String[] args) {
        member mb = new member();
        book bk = new book();
        employee em = new employee();
        
        bk.inputBook("Opera", "Paganini", 1001, 5);
        mb.inputMember("Ryzen", "Malang", 5001);
        em.inputEmployee("Shifu", "Yokohama");
        em.borrowed(1);
        bk.borrowed(1);
        System.out.println("============================================");
        em.showStatus();
        System.out.println("Member : ");
        mb.showStatus();
        System.out.println("Book : ");
        bk.showStatus();
        System.out.println("============================================");
    }
}
