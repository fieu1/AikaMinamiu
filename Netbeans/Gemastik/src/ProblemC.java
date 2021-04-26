/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Aikacchii
 */
public class ProblemC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int aa1 = sc.nextInt();
        int ab1 = sc.nextInt();
        int aa2 = sc.nextInt();
        int ab2 = sc.nextInt();
        int ba1 = sc.nextInt();
        int bb1 = sc.nextInt();
        int ba2 = sc.nextInt();
        int bb2 = sc.nextInt();
        
        int m1 = (ab2-ab1)/(aa2-aa1);
        int m2 = (bb2-bb1)/(ba2-ba1);
        int x,y;
        
        int c1 = m1*(-aa1)+ab1;
        int c2 = m2*(-ba1)+bb1;
        
        if(m1==m2){
            System.out.println("SEJAJAR");
        } else if(m1==1 && m2==1){
            System.out.println("GARIS SAMA");
        } else{
            
        }
    }
}
