/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet2;
import java.util.Scanner;
/**
 *
 * @author MeiMei
 */
public class PacmanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int midl=0, midw=0;
        Pacman pac = new Pacman();
        System.out.print("Input width of level : "); //as a limit of pacman area width
        pac.width = sc.nextInt(); //area width
        System.out.print("Input length of level : "); //as a limit of pacman area length
        pac.length = sc.nextInt(); //area length
         //to calculate the center of area as a default position
        if(pac.width % 2 == 0){  //condition when width is even
            midw = pac.width / 2; //center x position
            pac.x = midw; //change value of x
        }else if(pac.width % 2 == 1){ //condition when width is odd
            midw = (pac.width / 2)+1; //center x position
            pac.x = midw; //change value of x
        }
        if(pac.length % 2 == 0){ //condition when length is even
            midl = pac.length / 2; //center y position
            pac.y = midl; //change value of y
        }else if(pac.length % 2 == 1){ //condition when length is odd
            midl = (pac.length / 2) + 1; //center y position
            pac.y = midl; //change value of y
        }
        System.out.println("Center position is " + midw + "," + midl); //output of center position
        for(int i = 1; i>0; i++){ //infinite loop for pacman moving
        System.out.println("1. Move up");
        System.out.println("2. Move down");
        System.out.println("3. Move left");
        System.out.println("4. Move rigth");
        System.out.print("Choose where the pacman go : ");
        int move = sc.nextInt();
        if(move==1){ //input for move up
            pac.moveUp(); //call move up method
        } else if(move==2){ //input for move down
            pac.moveDown(); //call move down method
        } else if(move==3){ //input for move left
            pac.moveLeft(); //call move left method
        } else if(move==4){ //input for move rigth
            pac.moveRight(); //call move rigth method
        }
        if(pac.x<0 || pac.x > pac.width){ //if it's already get outside of horizontal area 
            System.out.println("Oops, it's already the limit of x"); //output
            break; //to stop program
        } else if(pac.y<0 || pac.y > pac.length){ //if it's already get outside of vertical area
            System.out.println("Oops, it's already the limit of y"); //output
            break; //to stop program
        }  
        pac.PrintPosition(); //call print positon method
        }
    }
}
