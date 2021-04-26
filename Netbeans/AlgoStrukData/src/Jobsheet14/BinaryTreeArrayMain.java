/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet14;

import java.util.Scanner;

/**
 *
 * @author Aikacchii
 */
public class BinaryTreeArrayMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many value you want to add? ");
        System.out.print("> ");
        int max = sc.nextInt(); //input max data
        BinaryTreeArray bta = new BinaryTreeArray(max); //instantiation bta
        for (int i = 0; i < max; i++) { //loop
            System.out.print("Input : "); 
            int value = sc.nextInt(); //input value
            bta.addData(value); //add to array
        }
        bta.populateData(max-1); //value of last index
        System.out.println("InOrder"); 
        bta.traverseInOrder(0); //traverse inorder
        System.out.println("");
        System.out.println("PostOrder");
        bta.traversePostOrder(0); //traverse postorder
        System.out.println("");
        System.out.println("PreOrder");
        bta.traversePreOrder(0); //traverse preorder
        System.out.println("");
    }
}
