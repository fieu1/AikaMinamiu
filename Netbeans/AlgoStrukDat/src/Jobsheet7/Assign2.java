/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet7;

/**
 *
 * @author MeiMei
 */
public class Assign2 {

    public void seqSearch(int[][] data, int search) {
        
        for(int i=0;i<data.length;i++){ //for  row
            for(int j=0;j<data[i].length;j++){ // for collumn
                if(data[i][j] == search){ //if array value same with search number
                    System.out.println("Number " + search + " found in " + i +" row and " + j + " collumn"); //print
                    break; //breaking loop
                }
            }
        }
        
    }
    
    
}
