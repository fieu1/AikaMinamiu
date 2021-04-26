/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Meuti Zari Annisa, Code A
import java.util.Scanner;
/**
 *
 * @author MeiMei
 */
public class StudentDataMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        
        System.out.println("Input the number of student : ");
        int student = input.nextInt();
        
        //StudentData2 StudentArr[] = new StudentData2[student];
        String name[] = new String[student];
        int score[] = new int[student];
        
        
        for(int i=0;i<student;i++){
            System.out.print("Input student " + (i+1) + " name : " );
            name[i] = inputString.nextLine();
            System.out.print("Input student " + (i+1) + " score : " );
            score[i] = input.nextInt();
        }
        StudentData2 std = new StudentData2(name,score, student);
        std.ShowData();
        
    }
}
