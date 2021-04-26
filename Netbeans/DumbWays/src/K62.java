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
public class K62 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input loop : ");
        int loop = sc.nextInt();
        for (int l = 0; l < loop; l++) {
            if (l == 0 || l == (loop - 1)) {
                for (int i = 0; i < loop; i++) {
                    System.out.print("*  ");
                }
            } else if(l == (loop / 2)){
                for (int i = 0; i < loop; i++) {
                    System.out.print("*  ");
                }
            }else {
                for (int i = 0; i < loop; i++) {
                    if (i == 0 || i == (loop - 1)) {
                        System.out.print("*  ");
                    } else {
                        System.out.print("=  ");
                    }
                }
            }
        System.out.println();
    }
}
}
