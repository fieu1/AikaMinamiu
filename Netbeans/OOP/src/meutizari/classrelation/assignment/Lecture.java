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
public class Lecture {
    private String courseName;
    private String courseCode;

    public Lecture(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public Lecture() {
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }
    
    public String courseInfo(){
        String info = "";
        info += "Course code : " + this.courseCode + " Course Name : " + this.courseName + "\n";
        return info;
    }
    
}
