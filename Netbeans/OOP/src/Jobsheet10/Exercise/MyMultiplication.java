/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet10.Exercise;

/**
 *
 * @author Aikacchii
 */
public class MyMultiplication {
    void perkalian(int a, int b){
        System.out.println(a*b);
    }
 
    void perkalian(double a, double b){
        System.out.println(a*b);
    }
 
    
    void perkalian(int a, int b, int c){
        System.out.println(a*b*c);
    }
    
    public static void main(String[] args) {
        MyMultiplication obj = new MyMultiplication();
        
        obj.perkalian(25, 43);
        obj.perkalian(34.56, 23.7);
    }
}
