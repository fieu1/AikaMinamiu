/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MeiMei
 */
public class Grade {

    String[] name;
    int[] score;
    int student;

    public Grade(String[] name, int[] score, int student) {
        this.name = name;
        this.score = score;
        this.student = student;
    }

    public void ShowData() {
        for (int i = 0; i < student; i++) {
            System.out.println("Student name : " + name[i]);
            System.out.println("Score : " + score[i]);
            if(score[i]>=0 && score[i]<=50){
                System.out.println("Grades : C");
            } else if(score[i]>=51 && score[i]<=80){
                System.out.println("Grades : B");
            } else if(score[i]>=81 && score[i]<=100){
                System.out.println("Grades : A");
            }
        }
    }
}
