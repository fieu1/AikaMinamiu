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
public class K64 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] upCase = new char[26];
        char increas = 'A';
        int amount = 0;
        for (int i = 0; i < 26; i++) {
            upCase[i] = increas;
            increas++;
        }

        System.out.println("Input sentence : ");
        String sentence = sc.next();

        for (int j = 0; j < sentence.length(); j++) {
            for (int k = 0; k < upCase.length; k++) {
                if(sentence.charAt(j)==upCase[k]){
                    amount++;
                } 
            }
        }
        System.out.println("Amount : " + amount );
    }
}
