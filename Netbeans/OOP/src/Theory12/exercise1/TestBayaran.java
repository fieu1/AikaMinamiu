/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory12.exercise1;

/**
 *
 * @author Aikacchii
 */
public class TestBayaran {
    public static void main(String[] args) {
        Manajer man = new Manajer(50, "Agus", 800);
        Programmer prog = new Programmer(30, "Budi", 600);
        Bayaran hr = new Bayaran();
        
        System.out.println("Bayaran manajer : " + hr.hitungBayaran(man));
        System.out.println("Bayaran programmer : " + hr.hitungBayaran(prog));
    }
}
