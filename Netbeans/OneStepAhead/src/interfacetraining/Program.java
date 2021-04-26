/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacetraining;

/**
 *
 * @author Aikacchii
 */
public class Program {
    public static void main(String[] args) {
        Rector mr = new Rector();
        
        Undergraduated ord = new Undergraduated("Charlie");
        Undergraduated udgc = new Undergraduated("Joe");
        Postgraduated pgdc = new Postgraduated("Ben");
        
        mr.giveCumlaudeCertificate(ord);
        mr.giveCumlaudeCertificate(udgc);
        mr.giveCumlaudeCertificate(pgdc);
    }
}
