/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet6;

/**
 *
 * @author MeiMei
 */
public class Student {

    String name;
    int yearEntry, age;
    double gpa;

    Student(String u, int i, int t, double n) {
        name = u;
        yearEntry = i;
        age = t;
        gpa = n;
    }

    void print() {
        System.out.println("Name = " + name);
        System.out.println("Year of Entry = " + yearEntry);
        System.out.println("Age = " + age);
        System.out.println("GPA = " + gpa);
    }
}
