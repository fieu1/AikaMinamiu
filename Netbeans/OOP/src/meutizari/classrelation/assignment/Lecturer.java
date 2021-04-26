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
public class Lecturer {
    private String lectName;
    private String lectId;

    public Lecturer() {
    }

    public Lecturer(String lectName, String lectId) {
        this.lectName = lectName;
        this.lectId = lectId;
    }

    public void setLectId(String lectId) {
        this.lectId = lectId;
    }

    public void setLectName(String lectName) {
        this.lectName = lectName;
    }

    public String getLectId() {
        return lectId;
    }

    public String getLectName() {
        return lectName;
    }
    
    public String info(){
        String info = "";
        info += "Lecturer ID : " + this.lectId + ", Name : " + this.lectId + "\n";
        return info;
    }        
}
