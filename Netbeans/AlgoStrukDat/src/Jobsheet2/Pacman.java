/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet2;

/**
 *
 * @author MeiMei
 */
public class Pacman {
    int x, y, width, length;
    public void moveLeft(){ //if pacman move to left
        x = x + 1; //x value increase 1
    }
    public void moveRight(){ //if pacman move to right
        x = x - 1; //x value decrease 1
    }
    public void moveUp(){ //if pacman move to up
        y = y - 1; //y value increase 1
    }
    public void moveDown(){ //if pacman move to down
        y = y + 1; //y value decrease 1
    }
    public void PrintPosition(){
        System.out.println("The position of pacman is in : " + x +"," + y); //to print position of pacman
    }
}
