/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet11.Intface;

/**
 *
 * @author Aikacchii
 */
public class Program {

    public static void main(String[] args) {
        Rector mr = new Rector();

//        Student  ord = new Student("Charlie");
        Postgraduated udgc = new Postgraduated("Joe");
        Postgraduated pgdc = new Postgraduated("Ben");
//                mr.giveCumlaudeCertificate(ord, "Charlie");
//                mr.giveCumlaudeCertificate(udgc, "Joe");
//                mr.giveCumlaudeCertificate(pgdc, "Ben");

        mr.giveCertificateOfTopStudent(udgc);
        mr.giveCertificateOfTopStudent(pgdc);
    }
}
