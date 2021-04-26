/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PunyaAlwi;


import java.util.Scanner;
public class assign2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [][]number=new int[3][5];
        for(int i=0;i<2;i++){
            for(int j=0;j<5;j++){
                System.out.print("Input value row "+i+" collumn "+j+" : ");
                number[i][j]=input.nextInt();
            }
        }
        System.out.print("Input number you want to search : ");
        int search=input.nextInt();
        sort2 number2=new sort2(number);
        number2.find(search);
        number2.print();
    }
}
