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
public class Student implements ICumlaude{
    protected String name;

    public Student(String name) {
        this.name = name;
    }
    
    public void studyInCampus(){
        System.out.println("I'm a student, my name is " + this.name);
        System.out.println("I study in home right now");
    }

    @Override
    public void graduate() {
        System.out.println("I've finished my thesis for undergraduate");
    }

    @Override
    public void getHighGPA() {
        System.out.println("My GPA is 3.1");
    }
}
