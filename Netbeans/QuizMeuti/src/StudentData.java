/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MeiMei
 */
public class StudentData {
    String name;
    int score;
    

    public StudentData(String name, int score) {
        this.name = name;
        this.score = score;
    }
    
    void ShowData(){
        System.out.println("Student Name :" + name +", has score : "+ score);
    }
            
}
