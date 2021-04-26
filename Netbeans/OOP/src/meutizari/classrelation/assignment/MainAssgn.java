/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meutizari.classrelation.assignment;
import java.util.Scanner;
/**
 *
 * @author Aikacchii
 */
public class MainAssgn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sci = new Scanner(System.in);
        
        Lecture lecture = new Lecture();
        System.out.print("Course Code : ");
        String courseCode = sc.nextLine();
        System.out.print("Course Name : ");
        String courseName = sc.nextLine();
        lecture.setCourseCode(courseCode);
        lecture.setCourseName(courseName);
        
        Lecturer lecturer = new Lecturer();
        System.out.print("Lecturer ID : ");
        String lectID = sc.nextLine();
        System.out.print("Lecturer Name : ");
        String lectName = sc.nextLine();
        lecturer.setLectId(lectID);
        lecturer.setLectName(lectName);
        
        System.out.print("Class Code : ");
        String classCode = sc.nextLine();
        System.out.print("Class Name : ");
        String className = sc.nextLine();
        System.out.print("Class Member : ");
        int classAmt = sci.nextInt();
        Class classes = new Class(classCode, className, lecturer, lecture, classAmt);
        
        System.out.print("Student Name : ");
        char stdName = sc.next().charAt(0);
        System.out.print("Student ID : ");
        int stdID = sci.nextInt();
        
        classes.setStudent(stdName, stdID);
        System.out.println(classes.info());
    }
}
