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
public class StudentMain {
    public static void main(String[] args) {
        Scanner inputstring = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.print("Input student name : ");
        String name = inputstring.nextLine();
        System.out.print("Input student score : ");
        int score = input.nextInt();
        StudentData std = new StudentData(name, score);
        
        std.ShowData();
    }
}