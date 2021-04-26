/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MeiMei
 */
public class StudentData2 {
   String[] name;
   int[] score;
   int student;
    public StudentData2(String[] name, int[] score,int student) {
        this.name = name;
        this.score = score;
        this.student = student;
    }
   
    public void ShowData(){
        for(int i = 0; i<student;i++){
        System.out.println("Student name : " + name[i]);
        System.out.println("Score : " + score[i]);
        }
    }
   
}
