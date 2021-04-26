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
public class Class {
    private String code;
    private String name;
    private Lecturer lecturer;
    private Lecture lecture;
    private Student[] arrStud;

    public Class() {
    }

    
    public void setCode(String code) {
        this.code = code;
    }

    public void setStudent(char studName, int stdcode) {
        this.initStudent(studName, stdcode);
    }

    public String getCode() {
        return code;
    }

    public Student[] getArrChair() {
        return arrStud;
    }

    private void initStudent(char studName, int code){
        for(int i=0;i<arrStud.length; i++){
            String codeTS = String.valueOf(code);
            this.arrStud[i] = new Student(studName, codeTS);
            studName++;
            code++;
        }  
    }

    public Class(String code, String name, Lecturer lecturer, Lecture lecture, int amount) {
        this.code = code;
        this.name = name;
        this.lecturer = lecturer;
        this.lecture = lecture;
        this.arrStud = new Student[amount];
    }
    
    
    public String info(){
        String info= "Class : \n";
        info += "Code : " + code + "\n";
        info += "Name : " + name + "\n";
        info += "Lecture : " + lecture.courseInfo() + "\n";
        info += "Lecturer : " + lecturer.info() + "\n";
        
        for(Student std : arrStud){
            info += std.info();
        }
        return info;
    }
}
