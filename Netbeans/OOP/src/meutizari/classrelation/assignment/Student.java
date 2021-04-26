/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meutizari.classrelation.assignment;

/**
 *
 * @author Aikacchii
 */
public class Student {
    private char studName;
    private String studId;

    public Student() {
    }

    public Student(char studName, String studId) {
        this.studName = studName;
        this.studId = studId;
    }

    public void setStudId(String studId) {
        this.studId = studId;
    }

    public void setStudName(char studName) {
        this.studName = studName;
    }

    public String getStudId() {
        return studId;
    }
    
    public char getStudName() {
        return studName;
    }

    public String info(){
        String info = "";
        info += "Student ID : " + this.studId + ", Student Name : " + this.studName + "\n";
        return info;
    }
}
