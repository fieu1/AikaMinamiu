/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Aikacchii
 */
public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);
        
        String checker[] = {"Scissors", "Paper", "Rock"};
        boolean repeat = false, wrongInput = false;
        
        do{
        System.out.println("Input Scissors/Paper/Rock");
        String use = scs.nextLine();
        
//        for(int i = 0; i<3; i++){
//            if(use.equalsIgnoreCase(checker[i])){
//                wrongInput = false;
//            } else {
//                wrongInput = true;
//            }
//        }
        
        wrongInput = Arrays.asList(checker).contains(use);
                
        if(!wrongInput){
            int randomEnemyUse = (int)(Math.random()*checker.length);
            String enemyUse = checker[randomEnemyUse];
            System.out.println("Enemy use " + enemyUse);
            check(use, enemyUse);
                
        } else {
                System.out.println("Your input is wrong!");
        }
        System.out.println("Play again? y/n");
        String again = sc.next();
        if(again.equalsIgnoreCase("Y")){
            repeat = true;
        } else {
            repeat = false;
            System.out.println("Thank you!");
        } 
        }while(repeat);
    }
    
    static void check(String use, String enemyUse){
        
        if(use.equalsIgnoreCase("Scissors")){
            switch(enemyUse){
                case "Scissors":
                    System.out.println("Tie!");
                    break;
                case "Paper":
                    System.out.println("User Win!");
                    break;
                case "Rock":
                    System.out.println("Enemy Win!");
                    break;
            }
        } else if(use.equalsIgnoreCase("Paper")){
            switch(enemyUse){
                case "Scissors":
                    System.out.println("Enemy Win!");
                    break;
                case "Paper":
                    System.out.println("Tie!");
                    break;
                case "Rock":
                    System.out.println("User Win!");
                    break;
            }
        } else if(use.equalsIgnoreCase("Rock")){
            switch(enemyUse){
                case "Scissors":
                    System.out.println("User Win!");
                    break;
                case "Paper":
                    System.out.println("Enemy Win!");
                    break;
                case "Rock":
                    System.out.println("Tie!");
                    break;
            }
        }
    }
}
