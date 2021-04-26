/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MeiMei
 */
public class Average {

    String[] name;
    int[] score;
    int student, average, totalBF, totalDC, split, avg, left, rigth;

    public Average(String[] name, int[] score, int student) {
        this.name = name;
        this.score = score;
        this.student = student;
    }

    public void ShowData() {
        for (int i = 0; i < student; i++) {
            System.out.println("Student name : " + name[i]);
            System.out.println("Score : " + score[i]);
            
        }
    }
    public int AverageBF(int[] score){
        for(int i=0;i<student;i++){
            totalBF += score[i];
        }
        average = totalBF/student;
        return average;
    }
    
    public int AverageDC(int[] score, int n, int student){
        if(n == student){
            totalDC += score[n];
            return totalDC;
        } else if (n < student ){
            split = (n+student)/2;
            left = AverageDC(score, n, split-1);
            rigth = AverageDC(score, split+1, student);
            avg = left + rigth + score[split];
            return avg/student;
        } else if(student - n == 1 ){
            totalDC += score[n];
            totalDC += score[student];
            return totalDC;
        }
        return 0;
    }
}
