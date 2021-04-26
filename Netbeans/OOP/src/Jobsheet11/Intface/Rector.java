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
public class Rector {

    public void giveCumlaudeCertificate(ICumlaude student, String name) {
        Student std = new Student(name);

        System.out.println("I'am Rector, give a cumlaude certif");
        System.out.println("Congratulation! Pls introduce urself");

        std.studyInCampus();
        student.graduate();
        student.getHighGPA();

        System.out.println("--------------------------------------------------");
    }
    
    public void giveCertificateOfTopStudent(IAchiever student){
        System.out.println("I am a Rector, give a Certificate of Top Student");
        System.out.println("Congratulations! How you can get achievement?");
        
        student.winTheCompetition();
        student.publishTheJournal();
        
        System.out.println("--------------------------------------------------");
    }
}
