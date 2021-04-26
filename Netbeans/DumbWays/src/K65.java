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
public class K65 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Amount of numbers : ");
        int amount = sc.nextInt();
        int[] arrayToReverse = new int[amount];
        System.out.println("Input array (separate with space)");
        for (int i = 0; i < amount; i++) {
            System.out.print("Array-"+i+" : ");
            arrayToReverse[i] = sc.nextInt();
        }
        System.out.println("Reversed : ");

        for (int i = amount-1; i >= 0; i--) {
            System.out.print(arrayToReverse[i] + " ");
        }
    }
}
