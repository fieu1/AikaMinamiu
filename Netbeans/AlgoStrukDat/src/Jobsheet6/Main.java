/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet6;

import java.util.Scanner;

/**
 *
 * @author MeiMei
 */
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ListAchievementStudents data = new ListAchievementStudents();
        int totalSdt = 5;
        boolean ascending;
        for (int i = 0; i < totalSdt; i++) {
            System.out.print("Name : ");
            String name = s.next();
            System.out.print("Year of entry : ");
            int year = s.nextInt();
            System.out.print("Age : ");
            int age = s.nextInt();
            System.out.print("GPA : ");
            double gpa = s.nextDouble();

            Student m = new Student(name, year, age, gpa);
            data.add(m);

        }

        System.out.println("Student data before sorting");
        data.print();
        System.out.println("Student data after sorting with Bubble Sort based on GPA =");
        data.bubbleSort();
        data.print();
        System.out.println("Student data after sorting with Selection Sort based on GPA =");
        data.selectionSort();
        data.print();
        System.out.println("Sort by ascending?");
        String ans = s.next();
        if (ans.equalsIgnoreCase("y")) {
            ascending = true;
            System.out.println("Student data after sorting with Inserting Sort based on GPA =");
            data.insertingSort(ascending);
        } else if (ans.equalsIgnoreCase("n")) {
            ascending = false;
            System.out.println("Student data after sorting with Inserting Sort based on GPA =");
            data.insertingSort(ascending);
        }

        data.print();
    }
}
